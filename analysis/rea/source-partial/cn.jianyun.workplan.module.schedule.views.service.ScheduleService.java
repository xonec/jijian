package cn.jianyun.workplan.module.schedule.views.service;

import cn.jianyun.workplan.api.ApiResult;
import cn.jianyun.workplan.api.FestivalData;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.main.base.model.BasicCloudData;
import cn.jianyun.workplan.main.base.model.NotifyInfo;
import cn.jianyun.workplan.main.base.service.BaseService;
import cn.jianyun.workplan.model.CloudFile;
import cn.jianyun.workplan.model.MonthDateInfo;
import cn.jianyun.workplan.module.base.dto.BaseBackupData;
import cn.jianyun.workplan.module.base.model.WebDAVUser;
import cn.jianyun.workplan.module.schedule.dao.ScheduleAlarmDao;
import cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao;
import cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao;
import cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao;
import cn.jianyun.workplan.module.schedule.dao.ScheduleProjectDao;
import cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao;
import cn.jianyun.workplan.module.schedule.model.ScheduleAlarm;
import cn.jianyun.workplan.module.schedule.model.ScheduleBackupData;
import cn.jianyun.workplan.module.schedule.model.ScheduleConfig;
import cn.jianyun.workplan.module.schedule.model.ScheduleDuty;
import cn.jianyun.workplan.module.schedule.model.SchedulePlan;
import cn.jianyun.workplan.module.schedule.model.ScheduleProject;
import cn.jianyun.workplan.module.schedule.model.ScheduleWork;
import cn.jianyun.workplan.ui.component.model.kt.RangeDate;
import cn.jianyun.workplan.util.CommonDateToolKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.MyDateTool;
import cn.jianyun.workplan.widget.WidgetConfig;
import cn.jianyun.workplan.widget.WidgetDataModel;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.apache.poi.hssf.record.UnknownRecord;
import org.apache.poi.ss.util.IEEEDouble;

/* JADX INFO: compiled from: ScheduleService.kt */
/* JADX INFO: loaded from: classes2.dex */
@Singleton
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0011\u0010\u001f\u001a\u00020 H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010&J\b\u0010'\u001a\u00020(H\u0016J\u0011\u0010)\u001a\u00020*H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010!J\b\u0010+\u001a\u00020\u0003H\u0016J#\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020(2\b\b\u0002\u0010/\u001a\u000200H\u0086@ø\u0001\u0000¢\u0006\u0002\u00101J!\u00102\u001a\u00020#2\u0006\u00103\u001a\u0002042\u0006\u0010$\u001a\u00020%H\u0086@ø\u0001\u0000¢\u0006\u0002\u00105J\u0011\u00106\u001a\u000207H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0019\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020(H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010:J\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020?0<H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020A0<H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020=0<H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010!J8\u0010C\u001a\b\u0012\u0004\u0012\u00020D0<2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020=0<2\u0006\u00109\u001a\u00020(2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020A0<2\u0006\u0010G\u001a\u00020(J8\u0010H\u001a\b\u0012\u0004\u0012\u00020=0<2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020=0<2\u0006\u00109\u001a\u00020(2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020A0<2\u0006\u0010G\u001a\u00020(J\u0011\u0010I\u001a\u00020#H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0011\u0010J\u001a\u00020#H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0011\u0010K\u001a\u00020 H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0011\u0010L\u001a\u00020#H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0011\u0010M\u001a\u00020#H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0019\u0010N\u001a\u00020#2\u0006\u00103\u001a\u00020OH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010PJ!\u0010Q\u001a\u00020#2\u0006\u00103\u001a\u0002042\u0006\u0010$\u001a\u00020%H\u0086@ø\u0001\u0000¢\u0006\u0002\u00105R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006R"}, d2 = {"Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;", "Lcn/jianyun/workplan/main/base/service/BaseService;", "baseRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "scheduleProjectDao", "Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;", "scheduleDutyDao", "Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;", "scheduleWorkDao", "Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;", "schedulePlanDao", "Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;", "alarmDao", "Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;", "configDao", "Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;", "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;)V", "getAlarmDao", "()Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;", "getBaseRepository", "()Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "getConfigDao", "()Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;", "getScheduleDutyDao", "()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;", "getSchedulePlanDao", "()Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;", "getScheduleProjectDao", "()Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;", "getScheduleWorkDao", "()Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;", "clearAll", "Lcn/jianyun/workplan/model/CloudFile;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteByProject", "", "project", "Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;", "(Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBizName", "", "getConfig", "Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;", "getRepository", "getWidgetDataModel", "Lcn/jianyun/workplan/widget/WidgetDataModel;", "curDate", "adjustMonth", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "increaseByProject", "backupData", "Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;", "(Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isEmpty", "", "isWorkUsed", "workUuid", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listCurrentAlarmData", "", "Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;", "listCurrentPlanData", "Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;", "listCurrentWorkData", "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;", "loadCurrentAlarmDataWithNextTime", "makeAlarm", "Lcn/jianyun/workplan/main/base/model/NotifyInfo;", "alarms", "works", "day", "makeNextAlarm", "makeNotify", "notifyWidget", "prepareBackupData", "tryInitProject", "tryNotify", "writeAll", "Lcn/jianyun/workplan/module/base/dto/BaseBackupData;", "(Lcn/jianyun/workplan/module/base/dto/BaseBackupData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeByProject", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ScheduleService implements BaseService {
    public static final int $stable = 8;
    private final ScheduleAlarmDao alarmDao;
    private final BaseRepository baseRepository;
    private final ScheduleConfigDao configDao;
    private final ScheduleDutyDao scheduleDutyDao;
    private final SchedulePlanDao schedulePlanDao;
    private final ScheduleProjectDao scheduleProjectDao;
    private final ScheduleWorkDao scheduleWorkDao;

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.views.service.ScheduleService$clearAll$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService", f = "ScheduleService.kt", i = {0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6}, l = {200, 201, 202, 203, 204, MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_ID, 206}, m = "clearAll", n = {"this", "this", "currentBackupData", "this", "currentBackupData", "this", "currentBackupData", "this", "currentBackupData", "this", "currentBackupData", "currentBackupData"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScheduleService.this.clearAll(this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.views.service.ScheduleService$deleteByProject$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService", f = "ScheduleService.kt", i = {0, 0, 1, 1, 2, 2, 3, 3}, l = {256, 257, 258, MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_RANGE_TIME, MediaPlayer.MEDIA_PLAYER_OPTION_AUDIO_RANGE_TIME}, m = "deleteByProject", n = {"this", "projectUuid", "this", "projectUuid", "this", "projectUuid", "this", "projectUuid"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScheduleService.this.deleteByProject(null, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.views.service.ScheduleService$getWidgetDataModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService", f = "ScheduleService.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_ALWAYS_DO_AV_SYNC, 350, 357, MediaPlayer.MEDIA_PLAYER_OPTION_LAST_VIDEO_DEMUX_TIME, MediaPlayer.MEDIA_PLAYER_OPTION_LAST_AUDIO_DECODE_TIME, MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_PTS_SYNCED_SEI_NOTIFICATION}, m = "getWidgetDataModel", n = {"this", "currentDate", "widgetData", "this", "currentDate", "widgetData", "holidayMap", "this", "currentDate", "widgetData", "config", "this", "currentDate", "widgetData", "this", "widgetData", "projectId", "widgetData", "periodDutys"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScheduleService.this.getWidgetDataModel(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.views.service.ScheduleService$increaseByProject$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService", f = "ScheduleService.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_GET_CUR_UI_FPS, MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_VSYNC_HELPER, MediaPlayer.MEDIA_PLAYER_OPTION_FRC_LEVEL, MediaPlayer.MEDIA_PLAYER_OPTION_PREPARE_CACHE_MS, 290, MediaPlayer.MEDIA_PLAYER_OPTION_SECURE_BUFFER_THRESHOLD, 300, MediaPlayer.MEDIA_PLAYER_OPTION_AUDIO_EFFECT_RATIO}, m = "increaseByProject", n = {"this", "backupData", "projectUuid", "this", "backupData", "projectUuid", "localWorkList", "this", "backupData", "projectUuid", "localWorkList", "localPlanList", "this", "backupData", "projectUuid", "localWorkList", "localPlanList", "localDutyList", "this", "backupData", "projectUuid", "localWorkList", "localPlanList", "localDutyList", "localAlarmList", "this", "backupData", "projectUuid", "localPlanList", "localDutyList", "localAlarmList", "this", "backupData", "projectUuid", "localDutyList", "localAlarmList", "this", "localAlarmList"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScheduleService.this.increaseByProject(null, null, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.views.service.ScheduleService$isEmpty$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService", f = "ScheduleService.kt", i = {}, l = {238}, m = "isEmpty", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScheduleService.this.isEmpty(this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.views.service.ScheduleService$isWorkUsed$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService", f = "ScheduleService.kt", i = {0, 0, 1, 1}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_FRAG_RANGE, MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_RENDER_ERROR, MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_SEEK_INTERRUPT}, m = "isWorkUsed", n = {"this", "workUuid", "this", "workUuid"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScheduleService.this.isWorkUsed(null, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.views.service.ScheduleService$listCurrentAlarmData$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService", f = "ScheduleService.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_SET_AVPH_VIDEO_MAXDURATION, MediaPlayer.MEDIA_PLAYER_OPTION_SET_AVPH_VIDEO_MAXDURATION}, m = "listCurrentAlarmData", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScheduleService.this.listCurrentAlarmData(this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.views.service.ScheduleService$listCurrentPlanData$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService", f = "ScheduleService.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_RENDER_STALL, MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_RENDER_STALL}, m = "listCurrentPlanData", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScheduleService.this.listCurrentPlanData(this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.views.service.ScheduleService$listCurrentWorkData$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService", f = "ScheduleService.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_LAST_AUDIO_RENDER_TIME, MediaPlayer.MEDIA_PLAYER_OPTION_LAST_AUDIO_RENDER_TIME}, m = "listCurrentWorkData", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScheduleService.this.listCurrentWorkData(this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.views.service.ScheduleService$loadCurrentAlarmDataWithNextTime$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService", f = "ScheduleService.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 3, 3, 3}, l = {132, 139, 139, 143}, m = "loadCurrentAlarmDataWithNextTime", n = {"this", "beginDay", "endDay", "alarms", "this", "beginDay", "endDay", "alarms", "this", "alarms", "this", "alarms", "dutys"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScheduleService.this.loadCurrentAlarmDataWithNextTime(this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.views.service.ScheduleService$makeNotify$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService", f = "ScheduleService.kt", i = {0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4}, l = {76, 85, 88, 89, 91}, m = "makeNotify", n = {"this", "this", "beginDay", "endDay", "notifyInfos", "this", "beginDay", "endDay", "notifyInfos", "project", "this", "beginDay", "endDay", "notifyInfos", "project", "works", "this", "beginDay", "endDay", "notifyInfos", "works", "alarmInfos"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$5", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScheduleService.this.makeNotify(this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.views.service.ScheduleService$prepareBackupData$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService", f = "ScheduleService.kt", i = {0, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5}, l = {183, 184, 185, 186, 187, 188}, m = "prepareBackupData", n = {"this", "this", "projectList", "this", "projectList", "workList", "this", "projectList", "workList", "planList", "this", "projectList", "workList", "planList", "datalist", "this", "projectList", "workList", "planList", "datalist", "alarmList"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScheduleService.this.prepareBackupData(this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.views.service.ScheduleService$tryInitProject$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService", f = "ScheduleService.kt", i = {0, 1}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_START_DIRECTLLY_AFTER_PREPARED, MediaPlayer.MEDIA_PLAYER_OPTION_ADVANCE_CHECK_BUFFERING_END, MediaPlayer.MEDIA_PLAYER_OPTION_WAIT_TIME_AFTER_FIRST_FRAME}, m = "tryInitProject", n = {"this", "this"}, s = {"L$0", "L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScheduleService.this.tryInitProject(this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.views.service.ScheduleService$tryNotify$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService", f = "ScheduleService.kt", i = {0, 1}, l = {64, 68, 69}, m = "tryNotify", n = {"this", "this"}, s = {"L$0", "L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScheduleService.this.tryNotify(this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.views.service.ScheduleService$writeAll$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService", f = "ScheduleService.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4}, l = {214, 218, MediaPlayer.MEDIA_PLAYER_OPTION_AUDIO_DECODER_ERROR, 226, MediaPlayer.MEDIA_PLAYER_OPTION_NETWORK_TRY_COUNT, UnknownRecord.BITMAP_00E9}, m = "writeAll", n = {"this", "scheduleData", "this", "scheduleData", "this", "scheduleData", "this", "scheduleData", "this", "scheduleData"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScheduleService.this.writeAll(null, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.views.service.ScheduleService$writeByProject$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService", f = "ScheduleService.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_TRAN_CONNECT_TIME, MediaPlayer.MEDIA_PLAYER_OPTION_AUDIO_SAVED_HOST_TIME, MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_SWITCH_CACHE_TIME, MediaPlayer.MEDIA_PLAYER_OPTION_AUDIO_HTTP_REQ_FINSIH_TIME, MediaPlayer.MEDIA_PLAYER_OPTION_POST_PREPARE}, m = "writeByProject", n = {"this", "backupData", "projectUuid", "this", "backupData", "projectUuid", "this", "backupData", "projectUuid", "this", "backupData", "projectUuid", "this"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScheduleService.this.writeByProject(null, null, this);
        }
    }

    @Override // cn.jianyun.workplan.main.base.service.BaseService
    public String getBizName() {
        return "Schedule";
    }

    @Inject
    public ScheduleService(BaseRepository baseRepository, ScheduleProjectDao scheduleProjectDao, ScheduleDutyDao scheduleDutyDao, ScheduleWorkDao scheduleWorkDao, SchedulePlanDao schedulePlanDao, ScheduleAlarmDao alarmDao, ScheduleConfigDao configDao) {
        Intrinsics.checkNotNullParameter(baseRepository, "baseRepository");
        Intrinsics.checkNotNullParameter(scheduleProjectDao, "scheduleProjectDao");
        Intrinsics.checkNotNullParameter(scheduleDutyDao, "scheduleDutyDao");
        Intrinsics.checkNotNullParameter(scheduleWorkDao, "scheduleWorkDao");
        Intrinsics.checkNotNullParameter(schedulePlanDao, "schedulePlanDao");
        Intrinsics.checkNotNullParameter(alarmDao, "alarmDao");
        Intrinsics.checkNotNullParameter(configDao, "configDao");
        this.baseRepository = baseRepository;
        this.scheduleProjectDao = scheduleProjectDao;
        this.scheduleDutyDao = scheduleDutyDao;
        this.scheduleWorkDao = scheduleWorkDao;
        this.schedulePlanDao = schedulePlanDao;
        this.alarmDao = alarmDao;
        this.configDao = configDao;
    }

    @Override // cn.jianyun.workplan.main.base.service.BaseService
    public List<BasicCloudData> changeFileFormat(List<String> list, String str) {
        return BaseService.DefaultImpls.changeFileFormat(this, list, str);
    }

    @Override // cn.jianyun.workplan.main.base.service.BaseService
    public Object cleanLocalData(Continuation<? super Unit> continuation) {
        return BaseService.DefaultImpls.cleanLocalData(this, continuation);
    }

    @Override // cn.jianyun.workplan.main.base.service.BaseService
    public Object cleanWebdavCloud(WebDAVUser webDAVUser, Continuation<? super Unit> continuation) {
        return BaseService.DefaultImpls.cleanWebdavCloud(this, webDAVUser, continuation);
    }

    @Override // cn.jianyun.workplan.main.base.service.BaseService
    public Object deleteLocalFile(String str, Continuation<? super Unit> continuation) {
        return BaseService.DefaultImpls.deleteLocalFile(this, str, continuation);
    }

    @Override // cn.jianyun.workplan.main.base.service.BaseService
    public Object deleteWebdavFile(WebDAVUser webDAVUser, String str, Continuation<? super Unit> continuation) {
        return BaseService.DefaultImpls.deleteWebdavFile(this, webDAVUser, str, continuation);
    }

    @Override // cn.jianyun.workplan.main.base.service.BaseService
    public String getNotifyBizName() {
        return BaseService.DefaultImpls.getNotifyBizName(this);
    }

    @Override // cn.jianyun.workplan.main.base.service.BaseService
    public Object getProjectId(Continuation<? super String> continuation) {
        return BaseService.DefaultImpls.getProjectId(this, continuation);
    }

    @Override // cn.jianyun.workplan.main.base.service.BaseService
    public String getWorkSpace() {
        return BaseService.DefaultImpls.getWorkSpace(this);
    }

    @Override // cn.jianyun.workplan.main.base.service.BaseService
    public Object isCloudOk(Continuation<? super Boolean> continuation) {
        return BaseService.DefaultImpls.isCloudOk(this, continuation);
    }

    @Override // cn.jianyun.workplan.main.base.service.BaseService
    public Object loadCloudData(WebDAVUser webDAVUser, BasicCloudData basicCloudData, Continuation<? super ApiResult<Object>> continuation) {
        return BaseService.DefaultImpls.loadCloudData(this, webDAVUser, basicCloudData, continuation);
    }

    @Override // cn.jianyun.workplan.main.base.service.BaseService
    public Object loadLocalBackupData(Continuation<? super List<BasicCloudData>> continuation) {
        return BaseService.DefaultImpls.loadLocalBackupData(this, continuation);
    }

    @Override // cn.jianyun.workplan.main.base.service.BaseService
    public Object loadLocalData(BasicCloudData basicCloudData, Continuation<? super ApiResult<Object>> continuation) {
        return BaseService.DefaultImpls.loadLocalData(this, basicCloudData, continuation);
    }

    @Override // cn.jianyun.workplan.main.base.service.BaseService
    public Object loadWebDavCloudFiles(WebDAVUser webDAVUser, Continuation<? super List<BasicCloudData>> continuation) {
        return BaseService.DefaultImpls.loadWebDavCloudFiles(this, webDAVUser, continuation);
    }

    @Override // cn.jianyun.workplan.main.base.service.BaseService
    public Object makeLocalBackup(boolean z, Continuation<? super Unit> continuation) {
        return BaseService.DefaultImpls.makeLocalBackup(this, z, continuation);
    }

    @Override // cn.jianyun.workplan.main.base.service.BaseService
    public Object makeWebDavCloudBackup(WebDAVUser webDAVUser, Continuation<? super Unit> continuation) {
        return BaseService.DefaultImpls.makeWebDavCloudBackup(this, webDAVUser, continuation);
    }

    @Override // cn.jianyun.workplan.main.base.service.BaseService
    public Object setProjectId(String str, Continuation<? super Unit> continuation) {
        return BaseService.DefaultImpls.setProjectId(this, str, continuation);
    }

    public final BaseRepository getBaseRepository() {
        return this.baseRepository;
    }

    public final ScheduleProjectDao getScheduleProjectDao() {
        return this.scheduleProjectDao;
    }

    public final ScheduleDutyDao getScheduleDutyDao() {
        return this.scheduleDutyDao;
    }

    public final ScheduleWorkDao getScheduleWorkDao() {
        return this.scheduleWorkDao;
    }

    public final SchedulePlanDao getSchedulePlanDao() {
        return this.schedulePlanDao;
    }

    public final ScheduleAlarmDao getAlarmDao() {
        return this.alarmDao;
    }

    public final ScheduleConfigDao getConfigDao() {
        return this.configDao;
    }

    @Override // cn.jianyun.workplan.main.base.service.BaseService
    public BaseRepository getRepository() {
        return this.baseRepository;
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.views.service.ScheduleService$notifyWidget$2, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleService.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService$notifyWidget$2", f = "ScheduleService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleService.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ScheduleService.this.getBaseRepository().reloadWidget();
            return Unit.INSTANCE;
        }
    }

    @Override // cn.jianyun.workplan.main.base.service.BaseService
    public Object notifyWidget(Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object tryNotify(Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        ScheduleService scheduleService;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object cacheHour = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(cacheHour);
            BaseRepository baseRepository = this.baseRepository;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            cacheHour = baseRepository.getCacheHour("notifyT", anonymousClass1);
            if (cacheHour == coroutine_suspended) {
                return coroutine_suspended;
            }
            scheduleService = this;
        } else {
            if (i == 1) {
                scheduleService = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(cacheHour);
            } else if (i == 2) {
                scheduleService = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(cacheHour);
                anonymousClass1.L$0 = null;
                anonymousClass1.label = 3;
                if (scheduleService.makeNotify(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(cacheHour);
            }
            return Unit.INSTANCE;
        }
        if (((Number) cacheHour).intValue() < 1) {
            return Unit.INSTANCE;
        }
        BaseRepository baseRepository2 = scheduleService.baseRepository;
        anonymousClass1.L$0 = scheduleService;
        anonymousClass1.label = 2;
        if (baseRepository2.cacheNow("notifyT", anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 3;
        if (scheduleService.makeNotify(anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0134 A[Catch: Exception -> 0x02c7, TryCatch #0 {Exception -> 0x02c7, blocks: (B:16:0x0054, B:69:0x01db, B:71:0x01e7, B:72:0x01ed, B:74:0x01f3, B:76:0x0203, B:77:0x0218, B:79:0x0222, B:46:0x012e, B:48:0x0134, B:52:0x015e, B:56:0x0184, B:57:0x0191, B:59:0x0197, B:61:0x01a5, B:63:0x01aa, B:65:0x01b7, B:82:0x0246, B:83:0x0264, B:85:0x026a, B:90:0x0285, B:91:0x0289, B:92:0x029e, B:94:0x02a4, B:95:0x02c1, B:21:0x007e, B:24:0x009b, B:28:0x00b5, B:45:0x0121, B:31:0x00bd, B:38:0x00d9, B:40:0x00e1, B:42:0x00e4, B:34:0x00c5), top: B:101:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0157 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x0158  */
    /* JADX WARN: Code duplicated, block: B:54:0x017c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x017d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0197 A[Catch: Exception -> 0x02c7, TryCatch #0 {Exception -> 0x02c7, blocks: (B:16:0x0054, B:69:0x01db, B:71:0x01e7, B:72:0x01ed, B:74:0x01f3, B:76:0x0203, B:77:0x0218, B:79:0x0222, B:46:0x012e, B:48:0x0134, B:52:0x015e, B:56:0x0184, B:57:0x0191, B:59:0x0197, B:61:0x01a5, B:63:0x01aa, B:65:0x01b7, B:82:0x0246, B:83:0x0264, B:85:0x026a, B:90:0x0285, B:91:0x0289, B:92:0x029e, B:94:0x02a4, B:95:0x02c1, B:21:0x007e, B:24:0x009b, B:28:0x00b5, B:45:0x0121, B:31:0x00bd, B:38:0x00d9, B:40:0x00e1, B:42:0x00e4, B:34:0x00c5), top: B:101:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01a5 A[Catch: Exception -> 0x02c7, TryCatch #0 {Exception -> 0x02c7, blocks: (B:16:0x0054, B:69:0x01db, B:71:0x01e7, B:72:0x01ed, B:74:0x01f3, B:76:0x0203, B:77:0x0218, B:79:0x0222, B:46:0x012e, B:48:0x0134, B:52:0x015e, B:56:0x0184, B:57:0x0191, B:59:0x0197, B:61:0x01a5, B:63:0x01aa, B:65:0x01b7, B:82:0x0246, B:83:0x0264, B:85:0x026a, B:90:0x0285, B:91:0x0289, B:92:0x029e, B:94:0x02a4, B:95:0x02c1, B:21:0x007e, B:24:0x009b, B:28:0x00b5, B:45:0x0121, B:31:0x00bd, B:38:0x00d9, B:40:0x00e1, B:42:0x00e4, B:34:0x00c5), top: B:101:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01b7 A[Catch: Exception -> 0x02c7, TryCatch #0 {Exception -> 0x02c7, blocks: (B:16:0x0054, B:69:0x01db, B:71:0x01e7, B:72:0x01ed, B:74:0x01f3, B:76:0x0203, B:77:0x0218, B:79:0x0222, B:46:0x012e, B:48:0x0134, B:52:0x015e, B:56:0x0184, B:57:0x0191, B:59:0x0197, B:61:0x01a5, B:63:0x01aa, B:65:0x01b7, B:82:0x0246, B:83:0x0264, B:85:0x026a, B:90:0x0285, B:91:0x0289, B:92:0x029e, B:94:0x02a4, B:95:0x02c1, B:21:0x007e, B:24:0x009b, B:28:0x00b5, B:45:0x0121, B:31:0x00bd, B:38:0x00d9, B:40:0x00e1, B:42:0x00e4, B:34:0x00c5), top: B:101:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01b5 -> B:81:0x023b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x01d5 -> B:69:0x01db). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // cn.jianyun.workplan.main.base.service.BaseService
    public java.lang.Object makeNotify(kotlin.coroutines.Continuation<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instruction units count: 724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.jianyun.workplan.module.schedule.views.service.ScheduleService.makeNotify(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final List<NotifyInfo> makeAlarm(List<ScheduleAlarm> alarms, String workUuid, List<ScheduleWork> works, String day) {
        Object next;
        Intrinsics.checkNotNullParameter(alarms, "alarms");
        Intrinsics.checkNotNullParameter(workUuid, "workUuid");
        Intrinsics.checkNotNullParameter(works, "works");
        Intrinsics.checkNotNullParameter(day, "day");
        ArrayList arrayList = new ArrayList();
        ArrayList<ScheduleAlarm> arrayList2 = new ArrayList();
        for (Object obj : alarms) {
            if (Intrinsics.areEqual(((ScheduleAlarm) obj).getWorkUuid(), workUuid)) {
                arrayList2.add(obj);
            }
        }
        for (ScheduleAlarm scheduleAlarm : arrayList2) {
            int intData = CommonToolKt.toIntData(scheduleAlarm.getBeforeDay());
            String notifyTime = scheduleAlarm.getNotifyTime();
            Iterator<T> it = works.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((ScheduleWork) next).getUuid(), workUuid));
            ScheduleWork scheduleWork = (ScheduleWork) next;
            String name = scheduleWork != null ? scheduleWork.getName() : null;
            if (day.length() == 10 && name != null) {
                arrayList.add(new NotifyInfo(null, scheduleAlarm.beforeInfo2() + name, scheduleAlarm.realRemark(), CommonDateToolKt.dateStr(CommonDateToolKt.gapDay(CommonDateToolKt.parseDate(day), intData)) + " " + notifyTime, scheduleAlarm.getAlarm(), 0, 33, null));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0120 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0121  */
    /* JADX WARN: Code duplicated, block: B:42:0x012b  */
    /* JADX WARN: Code duplicated, block: B:44:0x012e  */
    /* JADX WARN: Code duplicated, block: B:46:0x013c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x013d  */
    /* JADX WARN: Code duplicated, block: B:51:0x014e  */
    /* JADX WARN: Code duplicated, block: B:53:0x015e  */
    /* JADX WARN: Code duplicated, block: B:60:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v11, types: [T, java.util.List] */
    public final Object loadCurrentAlarmDataWithNextTime(Continuation<? super List<ScheduleAlarm>> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        ScheduleService scheduleService;
        String str;
        Ref.ObjectRef objectRef;
        String str2;
        Ref.ObjectRef objectRef2;
        ScheduleDutyDao scheduleDutyDao;
        Ref.ObjectRef objectRef3;
        String str3;
        String str4;
        ScheduleService scheduleService2;
        Ref.ObjectRef objectRef4;
        ScheduleService scheduleService3;
        List list;
        Object objListCurrentWorkData;
        List<ScheduleDuty> list2;
        ScheduleService scheduleService4;
        List<ScheduleWork> list3;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object projectId = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i != 0) {
            if (i == 1) {
                objectRef = (Ref.ObjectRef) anonymousClass1.L$4;
                objectRef2 = (Ref.ObjectRef) anonymousClass1.L$3;
                str2 = (String) anonymousClass1.L$2;
                str = (String) anonymousClass1.L$1;
                scheduleService = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(projectId);
            } else if (i == 2) {
                scheduleDutyDao = (ScheduleDutyDao) anonymousClass1.L$4;
                objectRef3 = (Ref.ObjectRef) anonymousClass1.L$3;
                str3 = (String) anonymousClass1.L$2;
                str4 = (String) anonymousClass1.L$1;
                scheduleService2 = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(projectId);
                anonymousClass1.L$0 = scheduleService2;
                anonymousClass1.L$1 = objectRef3;
                anonymousClass1.L$2 = null;
                anonymousClass1.L$3 = null;
                anonymousClass1.L$4 = null;
                anonymousClass1.label = 3;
                projectId = scheduleDutyDao.listByPeriod((String) projectId, str4, str3, anonymousClass1);
                if (projectId == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef4 = objectRef3;
                scheduleService3 = scheduleService2;
                list = (List) projectId;
                if (list.isEmpty()) {
                    return objectRef4.element;
                }
                anonymousClass1.L$0 = scheduleService3;
                anonymousClass1.L$1 = objectRef4;
                anonymousClass1.L$2 = list;
                anonymousClass1.label = 4;
                objListCurrentWorkData = scheduleService3.listCurrentWorkData(anonymousClass1);
                if (objListCurrentWorkData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list2 = list;
                projectId = objListCurrentWorkData;
                scheduleService4 = scheduleService3;
            } else if (i == 3) {
                objectRef4 = (Ref.ObjectRef) anonymousClass1.L$1;
                scheduleService3 = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(projectId);
                list = (List) projectId;
                if (list.isEmpty()) {
                    return objectRef4.element;
                }
                anonymousClass1.L$0 = scheduleService3;
                anonymousClass1.L$1 = objectRef4;
                anonymousClass1.L$2 = list;
                anonymousClass1.label = 4;
                objListCurrentWorkData = scheduleService3.listCurrentWorkData(anonymousClass1);
                if (objListCurrentWorkData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list2 = list;
                projectId = objListCurrentWorkData;
                scheduleService4 = scheduleService3;
            } else {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) anonymousClass1.L$2;
                objectRef4 = (Ref.ObjectRef) anonymousClass1.L$1;
                scheduleService4 = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(projectId);
            }
            list3 = (List) projectId;
            for (ScheduleDuty scheduleDuty : list2) {
                if (!Intrinsics.areEqual(scheduleDuty.getWorkUuid(), "")) {
                    objectRef4.element = scheduleService4.makeNextAlarm((List) objectRef4.element, scheduleDuty.getWorkUuid(), list3, scheduleDuty.getDay());
                }
                if (!Intrinsics.areEqual(scheduleDuty.getSecondWorkUuid(), "")) {
                    objectRef4.element = scheduleService4.makeNextAlarm((List) objectRef4.element, scheduleDuty.getSecondWorkUuid(), list3, scheduleDuty.getDay());
                }
            }
            return objectRef4.element;
        }
        ResultKt.throwOnFailure(projectId);
        Date date = new Date();
        String strDateStr = CommonDateToolKt.dateStr(date);
        String strDateStr2 = CommonDateToolKt.dateStr(CommonDateToolKt.gapDay(date, 7));
        Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = strDateStr;
        anonymousClass1.L$2 = strDateStr2;
        anonymousClass1.L$3 = objectRef5;
        anonymousClass1.L$4 = objectRef5;
        anonymousClass1.label = 1;
        Object objListCurrentAlarmData = listCurrentAlarmData(anonymousClass1);
        if (objListCurrentAlarmData == coroutine_suspended) {
            return coroutine_suspended;
        }
        scheduleService = this;
        str = strDateStr;
        objectRef = objectRef5;
        str2 = strDateStr2;
        projectId = objListCurrentAlarmData;
        objectRef2 = objectRef;
        Iterable<ScheduleAlarm> iterable = (Iterable) projectId;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (ScheduleAlarm scheduleAlarm : iterable) {
            scheduleAlarm.setNextTime("");
            arrayList.add(scheduleAlarm);
        }
        objectRef.element = arrayList;
        if (((List) objectRef2.element).isEmpty()) {
            return objectRef2.element;
        }
        scheduleDutyDao = scheduleService.scheduleDutyDao;
        anonymousClass1.L$0 = scheduleService;
        anonymousClass1.L$1 = str;
        anonymousClass1.L$2 = str2;
        anonymousClass1.L$3 = objectRef2;
        anonymousClass1.L$4 = scheduleDutyDao;
        anonymousClass1.label = 2;
        projectId = scheduleService.getProjectId(anonymousClass1);
        if (projectId == coroutine_suspended) {
            return coroutine_suspended;
        }
        objectRef3 = objectRef2;
        str3 = str2;
        str4 = str;
        scheduleService2 = scheduleService;
        anonymousClass1.L$0 = scheduleService2;
        anonymousClass1.L$1 = objectRef3;
        anonymousClass1.L$2 = null;
        anonymousClass1.L$3 = null;
        anonymousClass1.L$4 = null;
        anonymousClass1.label = 3;
        projectId = scheduleDutyDao.listByPeriod((String) projectId, str4, str3, anonymousClass1);
        if (projectId == coroutine_suspended) {
            return coroutine_suspended;
        }
        objectRef4 = objectRef3;
        scheduleService3 = scheduleService2;
        list = (List) projectId;
        if (list.isEmpty()) {
            return objectRef4.element;
        }
        anonymousClass1.L$0 = scheduleService3;
        anonymousClass1.L$1 = objectRef4;
        anonymousClass1.L$2 = list;
        anonymousClass1.label = 4;
        objListCurrentWorkData = scheduleService3.listCurrentWorkData(anonymousClass1);
        if (objListCurrentWorkData == coroutine_suspended) {
            return coroutine_suspended;
        }
        list2 = list;
        projectId = objListCurrentWorkData;
        scheduleService4 = scheduleService3;
        list3 = (List) projectId;
        while (r1.hasNext()) {
            if (!Intrinsics.areEqual(scheduleDuty.getWorkUuid(), "")) {
                objectRef4.element = scheduleService4.makeNextAlarm((List) objectRef4.element, scheduleDuty.getWorkUuid(), list3, scheduleDuty.getDay());
            }
            if (!Intrinsics.areEqual(scheduleDuty.getSecondWorkUuid(), "")) {
                objectRef4.element = scheduleService4.makeNextAlarm((List) objectRef4.element, scheduleDuty.getSecondWorkUuid(), list3, scheduleDuty.getDay());
            }
        }
        return objectRef4.element;
    }

    public final List<ScheduleAlarm> makeNextAlarm(List<ScheduleAlarm> alarms, String workUuid, List<ScheduleWork> works, String day) {
        Object next;
        Intrinsics.checkNotNullParameter(alarms, "alarms");
        Intrinsics.checkNotNullParameter(workUuid, "workUuid");
        Intrinsics.checkNotNullParameter(works, "works");
        Intrinsics.checkNotNullParameter(day, "day");
        ArrayList arrayList = new ArrayList();
        for (ScheduleAlarm scheduleAlarm : alarms) {
            if (Intrinsics.areEqual(scheduleAlarm.getWorkUuid(), workUuid)) {
                int intData = CommonToolKt.toIntData(scheduleAlarm.getBeforeDay());
                String notifyTime = scheduleAlarm.getNotifyTime();
                Iterator<T> it = works.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((ScheduleWork) next).getUuid(), workUuid));
                ScheduleWork scheduleWork = (ScheduleWork) next;
                String name = scheduleWork != null ? scheduleWork.getName() : null;
                if (day.length() == 10 && name != null) {
                    Date dateGapDay = CommonDateToolKt.gapDay(CommonDateToolKt.parseDate(day), intData);
                    String str = CommonDateToolKt.dateStr(dateGapDay) + " " + notifyTime;
                    String nowTime = MyDateTool.toDateTimeString(new Date());
                    CommonToolKt.mlog("notify info:{}, {},{},{},{}", scheduleAlarm.getBeforeDay(), Integer.valueOf(intData), str, nowTime, scheduleAlarm.getNextTime(), MyDateTool.getDayInfo(dateGapDay) + " " + notifyTime);
                    Intrinsics.checkNotNullExpressionValue(nowTime, "nowTime");
                    if (str.compareTo(nowTime) > 0 && Intrinsics.areEqual(scheduleAlarm.getNextTime(), "")) {
                        scheduleAlarm.setNextTime(MyDateTool.getDayInfo(dateGapDay) + " " + notifyTime);
                        scheduleAlarm.setNextAlertTime(MyDateTool.toDateString(dateGapDay) + " " + notifyTime);
                    }
                }
            }
            arrayList.add(scheduleAlarm);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00df  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0111 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0112  */
    /* JADX WARN: Code duplicated, block: B:38:0x0131 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0132  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // cn.jianyun.workplan.main.base.service.BaseService
    public Object prepareBackupData(Continuation<? super CloudFile> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        ScheduleService scheduleService;
        List list;
        List list2;
        Object list3;
        ScheduleService scheduleService2;
        List list4;
        List list5;
        List list6;
        List list7;
        Object list8;
        List list9;
        List list10;
        List list11;
        List list12;
        List list13;
        Object obj;
        List list14;
        List list15;
        ScheduleService scheduleService3;
        List list16;
        List list17;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object list18 = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = 1;
        switch (anonymousClass1.label) {
            case 0:
                ResultKt.throwOnFailure(list18);
                ScheduleProjectDao scheduleProjectDao = this.scheduleProjectDao;
                anonymousClass1.L$0 = this;
                anonymousClass1.label = 1;
                list18 = scheduleProjectDao.list(anonymousClass1);
                if (list18 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleService = this;
                list = (List) list18;
                ScheduleWorkDao scheduleWorkDao = scheduleService.scheduleWorkDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = list;
                anonymousClass1.label = 2;
                list18 = scheduleWorkDao.list(anonymousClass1);
                if (list18 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list2 = (List) list18;
                SchedulePlanDao schedulePlanDao = scheduleService.schedulePlanDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = list;
                anonymousClass1.L$2 = list2;
                anonymousClass1.label = 3;
                list3 = schedulePlanDao.list(anonymousClass1);
                if (list3 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleService2 = scheduleService;
                list4 = list2;
                list18 = list3;
                list5 = list;
                list6 = (List) list18;
                ScheduleDutyDao scheduleDutyDao = scheduleService2.scheduleDutyDao;
                anonymousClass1.L$0 = scheduleService2;
                anonymousClass1.L$1 = list5;
                anonymousClass1.L$2 = list4;
                anonymousClass1.L$3 = list6;
                anonymousClass1.label = 4;
                list18 = scheduleDutyDao.list(anonymousClass1);
                if (list18 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list7 = (List) list18;
                ScheduleAlarmDao scheduleAlarmDao = scheduleService2.alarmDao;
                anonymousClass1.L$0 = scheduleService2;
                anonymousClass1.L$1 = list5;
                anonymousClass1.L$2 = list4;
                anonymousClass1.L$3 = list6;
                anonymousClass1.L$4 = list7;
                anonymousClass1.label = 5;
                list8 = scheduleAlarmDao.list(anonymousClass1);
                if (list8 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                List list19 = list6;
                list9 = list7;
                list18 = list8;
                list10 = list5;
                list11 = list4;
                list12 = list19;
                list13 = (List) list18;
                ScheduleConfigDao scheduleConfigDao = scheduleService2.configDao;
                anonymousClass1.L$0 = scheduleService2;
                anonymousClass1.L$1 = list10;
                anonymousClass1.L$2 = list11;
                anonymousClass1.L$3 = list12;
                anonymousClass1.L$4 = list9;
                anonymousClass1.L$5 = list13;
                anonymousClass1.label = 6;
                obj = scheduleConfigDao.get(anonymousClass1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list14 = list13;
                list18 = obj;
                list15 = list12;
                scheduleService3 = scheduleService2;
                List list20 = list10;
                list16 = list11;
                list17 = list20;
                CloudFile cloudFile = new CloudFile(null, new ScheduleBackupData(list17, list9, list16, list15, list14, (ScheduleConfig) list18).encryptData(), i, 0 == true ? 1 : 0);
                int size = list9.size();
                String strFileSize = cloudFile.fileSize();
                long jCurrentTimeMillis = System.currentTimeMillis();
                String lowerCase = scheduleService3.getBizName().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                return CloudFile.copy$default(cloudFile, size + "_" + strFileSize + "_" + jCurrentTimeMillis + ".workplan." + lowerCase, null, 2, null);
            case 1:
                ScheduleService scheduleService4 = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(list18);
                scheduleService = scheduleService4;
                list = (List) list18;
                ScheduleWorkDao scheduleWorkDao2 = scheduleService.scheduleWorkDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = list;
                anonymousClass1.label = 2;
                list18 = scheduleWorkDao2.list(anonymousClass1);
                if (list18 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list2 = (List) list18;
                SchedulePlanDao schedulePlanDao2 = scheduleService.schedulePlanDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = list;
                anonymousClass1.L$2 = list2;
                anonymousClass1.label = 3;
                list3 = schedulePlanDao2.list(anonymousClass1);
                if (list3 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleService2 = scheduleService;
                list4 = list2;
                list18 = list3;
                list5 = list;
                list6 = (List) list18;
                ScheduleDutyDao scheduleDutyDao2 = scheduleService2.scheduleDutyDao;
                anonymousClass1.L$0 = scheduleService2;
                anonymousClass1.L$1 = list5;
                anonymousClass1.L$2 = list4;
                anonymousClass1.L$3 = list6;
                anonymousClass1.label = 4;
                list18 = scheduleDutyDao2.list(anonymousClass1);
                if (list18 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list7 = (List) list18;
                ScheduleAlarmDao scheduleAlarmDao2 = scheduleService2.alarmDao;
                anonymousClass1.L$0 = scheduleService2;
                anonymousClass1.L$1 = list5;
                anonymousClass1.L$2 = list4;
                anonymousClass1.L$3 = list6;
                anonymousClass1.L$4 = list7;
                anonymousClass1.label = 5;
                list8 = scheduleAlarmDao2.list(anonymousClass1);
                if (list8 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                List list110 = list6;
                list9 = list7;
                list18 = list8;
                list10 = list5;
                list11 = list4;
                list12 = list110;
                list13 = (List) list18;
                ScheduleConfigDao scheduleConfigDao2 = scheduleService2.configDao;
                anonymousClass1.L$0 = scheduleService2;
                anonymousClass1.L$1 = list10;
                anonymousClass1.L$2 = list11;
                anonymousClass1.L$3 = list12;
                anonymousClass1.L$4 = list9;
                anonymousClass1.L$5 = list13;
                anonymousClass1.label = 6;
                obj = scheduleConfigDao2.get(anonymousClass1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list14 = list13;
                list18 = obj;
                list15 = list12;
                scheduleService3 = scheduleService2;
                List list21 = list10;
                list16 = list11;
                list17 = list21;
                CloudFile cloudFile2 = new CloudFile(null, new ScheduleBackupData(list17, list9, list16, list15, list14, (ScheduleConfig) list18).encryptData(), i, 0 == true ? 1 : 0);
                int size2 = list9.size();
                String strFileSize2 = cloudFile2.fileSize();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                String lowerCase2 = scheduleService3.getBizName().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                return CloudFile.copy$default(cloudFile2, size2 + "_" + strFileSize2 + "_" + jCurrentTimeMillis2 + ".workplan." + lowerCase2, null, 2, null);
            case 2:
                list = (List) anonymousClass1.L$1;
                scheduleService = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(list18);
                list2 = (List) list18;
                SchedulePlanDao schedulePlanDao3 = scheduleService.schedulePlanDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = list;
                anonymousClass1.L$2 = list2;
                anonymousClass1.label = 3;
                list3 = schedulePlanDao3.list(anonymousClass1);
                if (list3 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleService2 = scheduleService;
                list4 = list2;
                list18 = list3;
                list5 = list;
                list6 = (List) list18;
                ScheduleDutyDao scheduleDutyDao3 = scheduleService2.scheduleDutyDao;
                anonymousClass1.L$0 = scheduleService2;
                anonymousClass1.L$1 = list5;
                anonymousClass1.L$2 = list4;
                anonymousClass1.L$3 = list6;
                anonymousClass1.label = 4;
                list18 = scheduleDutyDao3.list(anonymousClass1);
                if (list18 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list7 = (List) list18;
                ScheduleAlarmDao scheduleAlarmDao3 = scheduleService2.alarmDao;
                anonymousClass1.L$0 = scheduleService2;
                anonymousClass1.L$1 = list5;
                anonymousClass1.L$2 = list4;
                anonymousClass1.L$3 = list6;
                anonymousClass1.L$4 = list7;
                anonymousClass1.label = 5;
                list8 = scheduleAlarmDao3.list(anonymousClass1);
                if (list8 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                List list111 = list6;
                list9 = list7;
                list18 = list8;
                list10 = list5;
                list11 = list4;
                list12 = list111;
                list13 = (List) list18;
                ScheduleConfigDao scheduleConfigDao3 = scheduleService2.configDao;
                anonymousClass1.L$0 = scheduleService2;
                anonymousClass1.L$1 = list10;
                anonymousClass1.L$2 = list11;
                anonymousClass1.L$3 = list12;
                anonymousClass1.L$4 = list9;
                anonymousClass1.L$5 = list13;
                anonymousClass1.label = 6;
                obj = scheduleConfigDao3.get(anonymousClass1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list14 = list13;
                list18 = obj;
                list15 = list12;
                scheduleService3 = scheduleService2;
                List list22 = list10;
                list16 = list11;
                list17 = list22;
                CloudFile cloudFile3 = new CloudFile(null, new ScheduleBackupData(list17, list9, list16, list15, list14, (ScheduleConfig) list18).encryptData(), i, 0 == true ? 1 : 0);
                int size3 = list9.size();
                String strFileSize3 = cloudFile3.fileSize();
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                String lowerCase3 = scheduleService3.getBizName().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                return CloudFile.copy$default(cloudFile3, size3 + "_" + strFileSize3 + "_" + jCurrentTimeMillis3 + ".workplan." + lowerCase3, null, 2, null);
            case 3:
                List list23 = (List) anonymousClass1.L$2;
                List list24 = (List) anonymousClass1.L$1;
                ScheduleService scheduleService5 = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(list18);
                scheduleService2 = scheduleService5;
                list5 = list24;
                list4 = list23;
                list6 = (List) list18;
                ScheduleDutyDao scheduleDutyDao4 = scheduleService2.scheduleDutyDao;
                anonymousClass1.L$0 = scheduleService2;
                anonymousClass1.L$1 = list5;
                anonymousClass1.L$2 = list4;
                anonymousClass1.L$3 = list6;
                anonymousClass1.label = 4;
                list18 = scheduleDutyDao4.list(anonymousClass1);
                if (list18 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list7 = (List) list18;
                ScheduleAlarmDao scheduleAlarmDao4 = scheduleService2.alarmDao;
                anonymousClass1.L$0 = scheduleService2;
                anonymousClass1.L$1 = list5;
                anonymousClass1.L$2 = list4;
                anonymousClass1.L$3 = list6;
                anonymousClass1.L$4 = list7;
                anonymousClass1.label = 5;
                list8 = scheduleAlarmDao4.list(anonymousClass1);
                if (list8 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                List list112 = list6;
                list9 = list7;
                list18 = list8;
                list10 = list5;
                list11 = list4;
                list12 = list112;
                list13 = (List) list18;
                ScheduleConfigDao scheduleConfigDao4 = scheduleService2.configDao;
                anonymousClass1.L$0 = scheduleService2;
                anonymousClass1.L$1 = list10;
                anonymousClass1.L$2 = list11;
                anonymousClass1.L$3 = list12;
                anonymousClass1.L$4 = list9;
                anonymousClass1.L$5 = list13;
                anonymousClass1.label = 6;
                obj = scheduleConfigDao4.get(anonymousClass1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list14 = list13;
                list18 = obj;
                list15 = list12;
                scheduleService3 = scheduleService2;
                List list25 = list10;
                list16 = list11;
                list17 = list25;
                CloudFile cloudFile4 = new CloudFile(null, new ScheduleBackupData(list17, list9, list16, list15, list14, (ScheduleConfig) list18).encryptData(), i, 0 == true ? 1 : 0);
                int size4 = list9.size();
                String strFileSize4 = cloudFile4.fileSize();
                long jCurrentTimeMillis4 = System.currentTimeMillis();
                String lowerCase4 = scheduleService3.getBizName().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
                return CloudFile.copy$default(cloudFile4, size4 + "_" + strFileSize4 + "_" + jCurrentTimeMillis4 + ".workplan." + lowerCase4, null, 2, null);
            case 4:
                list6 = (List) anonymousClass1.L$3;
                list4 = (List) anonymousClass1.L$2;
                list5 = (List) anonymousClass1.L$1;
                scheduleService2 = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(list18);
                list7 = (List) list18;
                ScheduleAlarmDao scheduleAlarmDao5 = scheduleService2.alarmDao;
                anonymousClass1.L$0 = scheduleService2;
                anonymousClass1.L$1 = list5;
                anonymousClass1.L$2 = list4;
                anonymousClass1.L$3 = list6;
                anonymousClass1.L$4 = list7;
                anonymousClass1.label = 5;
                list8 = scheduleAlarmDao5.list(anonymousClass1);
                if (list8 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                List list113 = list6;
                list9 = list7;
                list18 = list8;
                list10 = list5;
                list11 = list4;
                list12 = list113;
                list13 = (List) list18;
                ScheduleConfigDao scheduleConfigDao5 = scheduleService2.configDao;
                anonymousClass1.L$0 = scheduleService2;
                anonymousClass1.L$1 = list10;
                anonymousClass1.L$2 = list11;
                anonymousClass1.L$3 = list12;
                anonymousClass1.L$4 = list9;
                anonymousClass1.L$5 = list13;
                anonymousClass1.label = 6;
                obj = scheduleConfigDao5.get(anonymousClass1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list14 = list13;
                list18 = obj;
                list15 = list12;
                scheduleService3 = scheduleService2;
                List list26 = list10;
                list16 = list11;
                list17 = list26;
                CloudFile cloudFile5 = new CloudFile(null, new ScheduleBackupData(list17, list9, list16, list15, list14, (ScheduleConfig) list18).encryptData(), i, 0 == true ? 1 : 0);
                int size5 = list9.size();
                String strFileSize5 = cloudFile5.fileSize();
                long jCurrentTimeMillis5 = System.currentTimeMillis();
                String lowerCase5 = scheduleService3.getBizName().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase5, "toLowerCase(...)");
                return CloudFile.copy$default(cloudFile5, size5 + "_" + strFileSize5 + "_" + jCurrentTimeMillis5 + ".workplan." + lowerCase5, null, 2, null);
            case 5:
                list9 = (List) anonymousClass1.L$4;
                list12 = (List) anonymousClass1.L$3;
                list11 = (List) anonymousClass1.L$2;
                List list27 = (List) anonymousClass1.L$1;
                ScheduleService scheduleService6 = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(list18);
                list10 = list27;
                scheduleService2 = scheduleService6;
                list13 = (List) list18;
                ScheduleConfigDao scheduleConfigDao6 = scheduleService2.configDao;
                anonymousClass1.L$0 = scheduleService2;
                anonymousClass1.L$1 = list10;
                anonymousClass1.L$2 = list11;
                anonymousClass1.L$3 = list12;
                anonymousClass1.L$4 = list9;
                anonymousClass1.L$5 = list13;
                anonymousClass1.label = 6;
                obj = scheduleConfigDao6.get(anonymousClass1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list14 = list13;
                list18 = obj;
                list15 = list12;
                scheduleService3 = scheduleService2;
                List list28 = list10;
                list16 = list11;
                list17 = list28;
                CloudFile cloudFile6 = new CloudFile(null, new ScheduleBackupData(list17, list9, list16, list15, list14, (ScheduleConfig) list18).encryptData(), i, 0 == true ? 1 : 0);
                int size6 = list9.size();
                String strFileSize6 = cloudFile6.fileSize();
                long jCurrentTimeMillis6 = System.currentTimeMillis();
                String lowerCase6 = scheduleService3.getBizName().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase6, "toLowerCase(...)");
                return CloudFile.copy$default(cloudFile6, size6 + "_" + strFileSize6 + "_" + jCurrentTimeMillis6 + ".workplan." + lowerCase6, null, 2, null);
            case 6:
                List list29 = (List) anonymousClass1.L$5;
                list9 = (List) anonymousClass1.L$4;
                List list30 = (List) anonymousClass1.L$3;
                List list31 = (List) anonymousClass1.L$2;
                List list32 = (List) anonymousClass1.L$1;
                scheduleService3 = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(list18);
                list14 = list29;
                list15 = list30;
                list16 = list31;
                list17 = list32;
                CloudFile cloudFile7 = new CloudFile(null, new ScheduleBackupData(list17, list9, list16, list15, list14, (ScheduleConfig) list18).encryptData(), i, 0 == true ? 1 : 0);
                int size7 = list9.size();
                String strFileSize7 = cloudFile7.fileSize();
                long jCurrentTimeMillis7 = System.currentTimeMillis();
                String lowerCase7 = scheduleService3.getBizName().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase7, "toLowerCase(...)");
                return CloudFile.copy$default(cloudFile7, size7 + "_" + strFileSize7 + "_" + jCurrentTimeMillis7 + ".workplan." + lowerCase7, null, 2, null);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // cn.jianyun.workplan.main.base.service.BaseService
    public Object clearAll(Continuation<? super CloudFile> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        ScheduleService scheduleService;
        CloudFile cloudFile;
        ScheduleProjectDao scheduleProjectDao;
        CloudFile cloudFile2;
        ScheduleWorkDao scheduleWorkDao;
        SchedulePlanDao schedulePlanDao;
        ScheduleDutyDao scheduleDutyDao;
        ScheduleAlarmDao scheduleAlarmDao;
        ScheduleConfigDao scheduleConfigDao;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objPrepareBackupData = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (anonymousClass1.label) {
            case 0:
                ResultKt.throwOnFailure(objPrepareBackupData);
                anonymousClass1.L$0 = this;
                anonymousClass1.label = 1;
                objPrepareBackupData = prepareBackupData(anonymousClass1);
                if (objPrepareBackupData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleService = this;
                cloudFile = (CloudFile) objPrepareBackupData;
                scheduleProjectDao = scheduleService.scheduleProjectDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = cloudFile;
                anonymousClass1.label = 2;
                if (scheduleProjectDao.clearAll(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cloudFile2 = cloudFile;
                scheduleWorkDao = scheduleService.scheduleWorkDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = cloudFile2;
                anonymousClass1.label = 3;
                if (scheduleWorkDao.clearAll(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                schedulePlanDao = scheduleService.schedulePlanDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = cloudFile2;
                anonymousClass1.label = 4;
                if (schedulePlanDao.clearAll(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleDutyDao = scheduleService.scheduleDutyDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = cloudFile2;
                anonymousClass1.label = 5;
                if (scheduleDutyDao.clearAll(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleAlarmDao = scheduleService.alarmDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = cloudFile2;
                anonymousClass1.label = 6;
                if (scheduleAlarmDao.clearAll(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleConfigDao = scheduleService.configDao;
                anonymousClass1.L$0 = cloudFile2;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 7;
                if (scheduleConfigDao.clearAll(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return cloudFile2;
            case 1:
                ScheduleService scheduleService2 = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objPrepareBackupData);
                scheduleService = scheduleService2;
                cloudFile = (CloudFile) objPrepareBackupData;
                scheduleProjectDao = scheduleService.scheduleProjectDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = cloudFile;
                anonymousClass1.label = 2;
                if (scheduleProjectDao.clearAll(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cloudFile2 = cloudFile;
                scheduleWorkDao = scheduleService.scheduleWorkDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = cloudFile2;
                anonymousClass1.label = 3;
                if (scheduleWorkDao.clearAll(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                schedulePlanDao = scheduleService.schedulePlanDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = cloudFile2;
                anonymousClass1.label = 4;
                if (schedulePlanDao.clearAll(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleDutyDao = scheduleService.scheduleDutyDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = cloudFile2;
                anonymousClass1.label = 5;
                if (scheduleDutyDao.clearAll(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleAlarmDao = scheduleService.alarmDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = cloudFile2;
                anonymousClass1.label = 6;
                if (scheduleAlarmDao.clearAll(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleConfigDao = scheduleService.configDao;
                anonymousClass1.L$0 = cloudFile2;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 7;
                if (scheduleConfigDao.clearAll(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return cloudFile2;
            case 2:
                cloudFile2 = (CloudFile) anonymousClass1.L$1;
                scheduleService = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objPrepareBackupData);
                scheduleWorkDao = scheduleService.scheduleWorkDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = cloudFile2;
                anonymousClass1.label = 3;
                if (scheduleWorkDao.clearAll(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                schedulePlanDao = scheduleService.schedulePlanDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = cloudFile2;
                anonymousClass1.label = 4;
                if (schedulePlanDao.clearAll(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleDutyDao = scheduleService.scheduleDutyDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = cloudFile2;
                anonymousClass1.label = 5;
                if (scheduleDutyDao.clearAll(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleAlarmDao = scheduleService.alarmDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = cloudFile2;
                anonymousClass1.label = 6;
                if (scheduleAlarmDao.clearAll(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleConfigDao = scheduleService.configDao;
                anonymousClass1.L$0 = cloudFile2;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 7;
                if (scheduleConfigDao.clearAll(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return cloudFile2;
            case 3:
                cloudFile2 = (CloudFile) anonymousClass1.L$1;
                scheduleService = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objPrepareBackupData);
                schedulePlanDao = scheduleService.schedulePlanDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = cloudFile2;
                anonymousClass1.label = 4;
                if (schedulePlanDao.clearAll(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleDutyDao = scheduleService.scheduleDutyDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = cloudFile2;
                anonymousClass1.label = 5;
                if (scheduleDutyDao.clearAll(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleAlarmDao = scheduleService.alarmDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = cloudFile2;
                anonymousClass1.label = 6;
                if (scheduleAlarmDao.clearAll(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleConfigDao = scheduleService.configDao;
                anonymousClass1.L$0 = cloudFile2;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 7;
                if (scheduleConfigDao.clearAll(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return cloudFile2;
            case 4:
                cloudFile2 = (CloudFile) anonymousClass1.L$1;
                scheduleService = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objPrepareBackupData);
                scheduleDutyDao = scheduleService.scheduleDutyDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = cloudFile2;
                anonymousClass1.label = 5;
                if (scheduleDutyDao.clearAll(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleAlarmDao = scheduleService.alarmDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = cloudFile2;
                anonymousClass1.label = 6;
                if (scheduleAlarmDao.clearAll(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleConfigDao = scheduleService.configDao;
                anonymousClass1.L$0 = cloudFile2;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 7;
                if (scheduleConfigDao.clearAll(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return cloudFile2;
            case 5:
                cloudFile2 = (CloudFile) anonymousClass1.L$1;
                scheduleService = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objPrepareBackupData);
                scheduleAlarmDao = scheduleService.alarmDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = cloudFile2;
                anonymousClass1.label = 6;
                if (scheduleAlarmDao.clearAll(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleConfigDao = scheduleService.configDao;
                anonymousClass1.L$0 = cloudFile2;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 7;
                if (scheduleConfigDao.clearAll(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return cloudFile2;
            case 6:
                cloudFile2 = (CloudFile) anonymousClass1.L$1;
                scheduleService = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objPrepareBackupData);
                scheduleConfigDao = scheduleService.configDao;
                anonymousClass1.L$0 = cloudFile2;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 7;
                if (scheduleConfigDao.clearAll(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return cloudFile2;
            case 7:
                CloudFile cloudFile3 = (CloudFile) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objPrepareBackupData);
                return cloudFile3;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:39:0x0119  */
    /* JADX WARN: Code duplicated, block: B:45:0x0141  */
    /* JADX WARN: Code duplicated, block: B:50:0x016f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[LOOP:0: B:43:0x013b->B:56:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[LOOP:1: B:37:0x0113->B:60:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[LOOP:2: B:31:0x00eb->B:64:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[LOOP:3: B:25:0x00c3->B:68:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[LOOP:4: B:19:0x009b->B:72:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // cn.jianyun.workplan.main.base.service.BaseService
    public Object writeAll(BaseBackupData baseBackupData, Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        ScheduleService scheduleService;
        ScheduleBackupData scheduleBackupData;
        Iterator it;
        Iterator it2;
        ScheduleProject scheduleProject;
        ScheduleProjectDao scheduleProjectDao;
        Iterator it3;
        ScheduleDuty scheduleDuty;
        ScheduleDutyDao scheduleDutyDao;
        Iterator it4;
        ScheduleAlarm scheduleAlarm;
        ScheduleAlarmDao scheduleAlarmDao;
        Iterator it5;
        SchedulePlan schedulePlan;
        SchedulePlanDao schedulePlanDao;
        ScheduleConfigDao scheduleConfigDao;
        ScheduleConfig appConfig;
        ScheduleWork scheduleWork;
        ScheduleWorkDao scheduleWorkDao;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (anonymousClass1.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                Intrinsics.checkNotNull(baseBackupData, "null cannot be cast to non-null type cn.jianyun.workplan.module.schedule.model.ScheduleBackupData");
                ScheduleBackupData scheduleBackupData2 = (ScheduleBackupData) baseBackupData;
                scheduleService = this;
                scheduleBackupData = scheduleBackupData2;
                it = scheduleBackupData2.getProjectList().iterator();
                while (it.hasNext()) {
                    scheduleProject = (ScheduleProject) it.next();
                    scheduleProjectDao = scheduleService.scheduleProjectDao;
                    anonymousClass1.L$0 = scheduleService;
                    anonymousClass1.L$1 = scheduleBackupData;
                    anonymousClass1.L$2 = it;
                    anonymousClass1.label = 1;
                    if (scheduleProjectDao.insert(scheduleProject, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                it2 = scheduleBackupData.getDutyList().iterator();
                while (it2.hasNext()) {
                    scheduleDuty = (ScheduleDuty) it2.next();
                    scheduleDutyDao = scheduleService.scheduleDutyDao;
                    anonymousClass1.L$0 = scheduleService;
                    anonymousClass1.L$1 = scheduleBackupData;
                    anonymousClass1.L$2 = it2;
                    anonymousClass1.label = 2;
                    if (scheduleDutyDao.insert(scheduleDuty, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                it3 = scheduleBackupData.getAlarmList().iterator();
                while (it3.hasNext()) {
                    scheduleAlarm = (ScheduleAlarm) it3.next();
                    scheduleAlarmDao = scheduleService.alarmDao;
                    anonymousClass1.L$0 = scheduleService;
                    anonymousClass1.L$1 = scheduleBackupData;
                    anonymousClass1.L$2 = it3;
                    anonymousClass1.label = 3;
                    if (scheduleAlarmDao.insert(scheduleAlarm, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                it4 = scheduleBackupData.getPlanList().iterator();
                while (it4.hasNext()) {
                    schedulePlan = (SchedulePlan) it4.next();
                    schedulePlanDao = scheduleService.schedulePlanDao;
                    anonymousClass1.L$0 = scheduleService;
                    anonymousClass1.L$1 = scheduleBackupData;
                    anonymousClass1.L$2 = it4;
                    anonymousClass1.label = 4;
                    if (schedulePlanDao.insert(schedulePlan, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                it5 = scheduleBackupData.getWorkList().iterator();
                while (it5.hasNext()) {
                    scheduleWork = (ScheduleWork) it5.next();
                    scheduleWorkDao = scheduleService.scheduleWorkDao;
                    anonymousClass1.L$0 = scheduleService;
                    anonymousClass1.L$1 = scheduleBackupData;
                    anonymousClass1.L$2 = it5;
                    anonymousClass1.label = 5;
                    if (scheduleWorkDao.insert(scheduleWork, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                scheduleConfigDao = scheduleService.configDao;
                appConfig = scheduleBackupData.getAppConfig();
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 6;
                if (scheduleConfigDao.set(appConfig, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 1:
                it = (Iterator) anonymousClass1.L$2;
                scheduleBackupData = (ScheduleBackupData) anonymousClass1.L$1;
                scheduleService = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                while (it.hasNext()) {
                    scheduleProject = (ScheduleProject) it.next();
                    scheduleProjectDao = scheduleService.scheduleProjectDao;
                    anonymousClass1.L$0 = scheduleService;
                    anonymousClass1.L$1 = scheduleBackupData;
                    anonymousClass1.L$2 = it;
                    anonymousClass1.label = 1;
                    if (scheduleProjectDao.insert(scheduleProject, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                it2 = scheduleBackupData.getDutyList().iterator();
                while (it2.hasNext()) {
                    scheduleDuty = (ScheduleDuty) it2.next();
                    scheduleDutyDao = scheduleService.scheduleDutyDao;
                    anonymousClass1.L$0 = scheduleService;
                    anonymousClass1.L$1 = scheduleBackupData;
                    anonymousClass1.L$2 = it2;
                    anonymousClass1.label = 2;
                    if (scheduleDutyDao.insert(scheduleDuty, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                it3 = scheduleBackupData.getAlarmList().iterator();
                while (it3.hasNext()) {
                    scheduleAlarm = (ScheduleAlarm) it3.next();
                    scheduleAlarmDao = scheduleService.alarmDao;
                    anonymousClass1.L$0 = scheduleService;
                    anonymousClass1.L$1 = scheduleBackupData;
                    anonymousClass1.L$2 = it3;
                    anonymousClass1.label = 3;
                    if (scheduleAlarmDao.insert(scheduleAlarm, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                it4 = scheduleBackupData.getPlanList().iterator();
                while (it4.hasNext()) {
                    schedulePlan = (SchedulePlan) it4.next();
                    schedulePlanDao = scheduleService.schedulePlanDao;
                    anonymousClass1.L$0 = scheduleService;
                    anonymousClass1.L$1 = scheduleBackupData;
                    anonymousClass1.L$2 = it4;
                    anonymousClass1.label = 4;
                    if (schedulePlanDao.insert(schedulePlan, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                it5 = scheduleBackupData.getWorkList().iterator();
                while (it5.hasNext()) {
                    scheduleWork = (ScheduleWork) it5.next();
                    scheduleWorkDao = scheduleService.scheduleWorkDao;
                    anonymousClass1.L$0 = scheduleService;
                    anonymousClass1.L$1 = scheduleBackupData;
                    anonymousClass1.L$2 = it5;
                    anonymousClass1.label = 5;
                    if (scheduleWorkDao.insert(scheduleWork, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                scheduleConfigDao = scheduleService.configDao;
                appConfig = scheduleBackupData.getAppConfig();
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 6;
                if (scheduleConfigDao.set(appConfig, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 2:
                it2 = (Iterator) anonymousClass1.L$2;
                scheduleBackupData = (ScheduleBackupData) anonymousClass1.L$1;
                scheduleService = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                while (it2.hasNext()) {
                    scheduleDuty = (ScheduleDuty) it2.next();
                    scheduleDutyDao = scheduleService.scheduleDutyDao;
                    anonymousClass1.L$0 = scheduleService;
                    anonymousClass1.L$1 = scheduleBackupData;
                    anonymousClass1.L$2 = it2;
                    anonymousClass1.label = 2;
                    if (scheduleDutyDao.insert(scheduleDuty, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                it3 = scheduleBackupData.getAlarmList().iterator();
                while (it3.hasNext()) {
                    scheduleAlarm = (ScheduleAlarm) it3.next();
                    scheduleAlarmDao = scheduleService.alarmDao;
                    anonymousClass1.L$0 = scheduleService;
                    anonymousClass1.L$1 = scheduleBackupData;
                    anonymousClass1.L$2 = it3;
                    anonymousClass1.label = 3;
                    if (scheduleAlarmDao.insert(scheduleAlarm, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                it4 = scheduleBackupData.getPlanList().iterator();
                while (it4.hasNext()) {
                    schedulePlan = (SchedulePlan) it4.next();
                    schedulePlanDao = scheduleService.schedulePlanDao;
                    anonymousClass1.L$0 = scheduleService;
                    anonymousClass1.L$1 = scheduleBackupData;
                    anonymousClass1.L$2 = it4;
                    anonymousClass1.label = 4;
                    if (schedulePlanDao.insert(schedulePlan, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                it5 = scheduleBackupData.getWorkList().iterator();
                while (it5.hasNext()) {
                    scheduleWork = (ScheduleWork) it5.next();
                    scheduleWorkDao = scheduleService.scheduleWorkDao;
                    anonymousClass1.L$0 = scheduleService;
                    anonymousClass1.L$1 = scheduleBackupData;
                    anonymousClass1.L$2 = it5;
                    anonymousClass1.label = 5;
                    if (scheduleWorkDao.insert(scheduleWork, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                scheduleConfigDao = scheduleService.configDao;
                appConfig = scheduleBackupData.getAppConfig();
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 6;
                if (scheduleConfigDao.set(appConfig, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 3:
                it3 = (Iterator) anonymousClass1.L$2;
                scheduleBackupData = (ScheduleBackupData) anonymousClass1.L$1;
                scheduleService = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                while (it3.hasNext()) {
                    scheduleAlarm = (ScheduleAlarm) it3.next();
                    scheduleAlarmDao = scheduleService.alarmDao;
                    anonymousClass1.L$0 = scheduleService;
                    anonymousClass1.L$1 = scheduleBackupData;
                    anonymousClass1.L$2 = it3;
                    anonymousClass1.label = 3;
                    if (scheduleAlarmDao.insert(scheduleAlarm, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                it4 = scheduleBackupData.getPlanList().iterator();
                while (it4.hasNext()) {
                    schedulePlan = (SchedulePlan) it4.next();
                    schedulePlanDao = scheduleService.schedulePlanDao;
                    anonymousClass1.L$0 = scheduleService;
                    anonymousClass1.L$1 = scheduleBackupData;
                    anonymousClass1.L$2 = it4;
                    anonymousClass1.label = 4;
                    if (schedulePlanDao.insert(schedulePlan, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                it5 = scheduleBackupData.getWorkList().iterator();
                while (it5.hasNext()) {
                    scheduleWork = (ScheduleWork) it5.next();
                    scheduleWorkDao = scheduleService.scheduleWorkDao;
                    anonymousClass1.L$0 = scheduleService;
                    anonymousClass1.L$1 = scheduleBackupData;
                    anonymousClass1.L$2 = it5;
                    anonymousClass1.label = 5;
                    if (scheduleWorkDao.insert(scheduleWork, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                scheduleConfigDao = scheduleService.configDao;
                appConfig = scheduleBackupData.getAppConfig();
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 6;
                if (scheduleConfigDao.set(appConfig, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 4:
                it4 = (Iterator) anonymousClass1.L$2;
                scheduleBackupData = (ScheduleBackupData) anonymousClass1.L$1;
                scheduleService = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                while (it4.hasNext()) {
                    schedulePlan = (SchedulePlan) it4.next();
                    schedulePlanDao = scheduleService.schedulePlanDao;
                    anonymousClass1.L$0 = scheduleService;
                    anonymousClass1.L$1 = scheduleBackupData;
                    anonymousClass1.L$2 = it4;
                    anonymousClass1.label = 4;
                    if (schedulePlanDao.insert(schedulePlan, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                it5 = scheduleBackupData.getWorkList().iterator();
                while (it5.hasNext()) {
                    scheduleWork = (ScheduleWork) it5.next();
                    scheduleWorkDao = scheduleService.scheduleWorkDao;
                    anonymousClass1.L$0 = scheduleService;
                    anonymousClass1.L$1 = scheduleBackupData;
                    anonymousClass1.L$2 = it5;
                    anonymousClass1.label = 5;
                    if (scheduleWorkDao.insert(scheduleWork, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                scheduleConfigDao = scheduleService.configDao;
                appConfig = scheduleBackupData.getAppConfig();
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 6;
                if (scheduleConfigDao.set(appConfig, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 5:
                it5 = (Iterator) anonymousClass1.L$2;
                scheduleBackupData = (ScheduleBackupData) anonymousClass1.L$1;
                scheduleService = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                while (it5.hasNext()) {
                    scheduleWork = (ScheduleWork) it5.next();
                    scheduleWorkDao = scheduleService.scheduleWorkDao;
                    anonymousClass1.L$0 = scheduleService;
                    anonymousClass1.L$1 = scheduleBackupData;
                    anonymousClass1.L$2 = it5;
                    anonymousClass1.label = 5;
                    if (scheduleWorkDao.insert(scheduleWork, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                scheduleConfigDao = scheduleService.configDao;
                appConfig = scheduleBackupData.getAppConfig();
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 6;
                if (scheduleConfigDao.set(appConfig, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 6:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // cn.jianyun.workplan.main.base.service.BaseService
    public Object isEmpty(Continuation<? super Boolean> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object list = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(list);
            ScheduleDutyDao scheduleDutyDao = this.scheduleDutyDao;
            anonymousClass1.label = 1;
            list = scheduleDutyDao.list(anonymousClass1);
            if (list == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(list);
        }
        return Boxing.boxBoolean(((List) list).isEmpty());
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:35:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object isWorkUsed(String str, Continuation<? super String> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        ScheduleService scheduleService;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objFindWork = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i != 0) {
            if (i == 1) {
                str = (String) anonymousClass1.L$1;
                scheduleService = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objFindWork);
            } else if (i == 2) {
                str = (String) anonymousClass1.L$1;
                scheduleService = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objFindWork);
                if (((Number) objFindWork).intValue() > 0) {
                    return "该班次已被用于组合班次，禁止删除";
                }
                SchedulePlanDao schedulePlanDao = scheduleService.schedulePlanDao;
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 3;
                objFindWork = schedulePlanDao.findWork(str, anonymousClass1);
                if (objFindWork == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFindWork);
            }
            if (((Number) objFindWork).intValue() > 0) {
                return "该班次已被用于周期排班，禁止删除";
            }
            return "ok";
        }
        ResultKt.throwOnFailure(objFindWork);
        ScheduleDutyDao scheduleDutyDao = this.scheduleDutyDao;
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = str;
        anonymousClass1.label = 1;
        objFindWork = scheduleDutyDao.findWork(str, anonymousClass1);
        if (objFindWork == coroutine_suspended) {
            return coroutine_suspended;
        }
        scheduleService = this;
        if (((Number) objFindWork).intValue() > 0) {
            return "该班次已被排班，禁止删除";
        }
        ScheduleWorkDao scheduleWorkDao = scheduleService.scheduleWorkDao;
        anonymousClass1.L$0 = scheduleService;
        anonymousClass1.L$1 = str;
        anonymousClass1.label = 2;
        objFindWork = scheduleWorkDao.findWork(str, anonymousClass1);
        if (objFindWork == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (((Number) objFindWork).intValue() > 0) {
            return "该班次已被用于组合班次，禁止删除";
        }
        SchedulePlanDao schedulePlanDao2 = scheduleService.schedulePlanDao;
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 3;
        objFindWork = schedulePlanDao2.findWork(str, anonymousClass1);
        if (objFindWork == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (((Number) objFindWork).intValue() > 0) {
            return "该班次已被用于周期排班，禁止删除";
        }
        return "ok";
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object deleteByProject(ScheduleProject scheduleProject, Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        ScheduleService scheduleService;
        String str;
        SchedulePlanDao schedulePlanDao;
        ScheduleDutyDao scheduleDutyDao;
        ScheduleAlarmDao scheduleAlarmDao;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String uuid = scheduleProject.getUuid();
            ScheduleProjectDao scheduleProjectDao = this.scheduleProjectDao;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = uuid;
            anonymousClass1.label = 1;
            if (scheduleProjectDao.delete(scheduleProject, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            scheduleService = this;
            str = uuid;
        } else {
            if (i == 1) {
                str = (String) anonymousClass1.L$1;
                scheduleService = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                str = (String) anonymousClass1.L$1;
                scheduleService = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                schedulePlanDao = scheduleService.schedulePlanDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 3;
                if (schedulePlanDao.deleteByProject(str, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleDutyDao = scheduleService.scheduleDutyDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 4;
                if (scheduleDutyDao.deleteByProject(str, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleAlarmDao = scheduleService.alarmDao;
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 5;
                if (scheduleAlarmDao.deleteByProject(str, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 3) {
                str = (String) anonymousClass1.L$1;
                scheduleService = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                scheduleDutyDao = scheduleService.scheduleDutyDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 4;
                if (scheduleDutyDao.deleteByProject(str, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleAlarmDao = scheduleService.alarmDao;
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 5;
                if (scheduleAlarmDao.deleteByProject(str, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 4) {
                str = (String) anonymousClass1.L$1;
                scheduleService = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                scheduleAlarmDao = scheduleService.alarmDao;
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 5;
                if (scheduleAlarmDao.deleteByProject(str, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ScheduleWorkDao scheduleWorkDao = scheduleService.scheduleWorkDao;
        anonymousClass1.L$0 = scheduleService;
        anonymousClass1.L$1 = str;
        anonymousClass1.label = 2;
        if (scheduleWorkDao.deleteByProject(str, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        schedulePlanDao = scheduleService.schedulePlanDao;
        anonymousClass1.L$0 = scheduleService;
        anonymousClass1.L$1 = str;
        anonymousClass1.label = 3;
        if (schedulePlanDao.deleteByProject(str, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        scheduleDutyDao = scheduleService.scheduleDutyDao;
        anonymousClass1.L$0 = scheduleService;
        anonymousClass1.L$1 = str;
        anonymousClass1.label = 4;
        if (scheduleDutyDao.deleteByProject(str, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        scheduleAlarmDao = scheduleService.alarmDao;
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 5;
        if (scheduleAlarmDao.deleteByProject(str, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[LOOP:5: B:33:0x00e8->B:101:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x012f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:41:0x011e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0142  */
    /* JADX WARN: Code duplicated, block: B:53:0x0172  */
    /* JADX WARN: Code duplicated, block: B:59:0x0196  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:77:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[LOOP:0: B:69:0x01e4->B:79:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[LOOP:1: B:57:0x0190->B:83:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x01c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[LOOP:3: B:45:0x013c->B:92:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0106 A[SYNTHETIC] */
    public final Object writeByProject(ScheduleBackupData scheduleBackupData, ScheduleProject scheduleProject, Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        String uuid;
        ScheduleService scheduleService;
        ScheduleService scheduleService2;
        ScheduleBackupData scheduleBackupData2;
        Iterator it;
        String str;
        ArrayList arrayList;
        Iterator it2;
        ScheduleService scheduleService3;
        ScheduleWork scheduleWork;
        ScheduleWorkDao scheduleWorkDao;
        ArrayList arrayList2;
        Iterator it3;
        ScheduleService scheduleService4;
        SchedulePlan schedulePlan;
        SchedulePlanDao schedulePlanDao;
        ArrayList arrayList3;
        Iterator it4;
        ScheduleService scheduleService5;
        ScheduleDuty scheduleDuty;
        ScheduleDutyDao scheduleDutyDao;
        ScheduleAlarm scheduleAlarm;
        ScheduleAlarmDao scheduleAlarmDao;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            uuid = scheduleProject.getUuid();
            ScheduleProjectDao scheduleProjectDao = this.scheduleProjectDao;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = scheduleBackupData;
            anonymousClass1.L$2 = uuid;
            anonymousClass1.label = 1;
            if (scheduleProjectDao.insert(scheduleProject, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            scheduleService = this;
        } else {
            if (i == 1) {
                String str2 = (String) anonymousClass1.L$2;
                ScheduleBackupData scheduleBackupData3 = (ScheduleBackupData) anonymousClass1.L$1;
                scheduleService = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                uuid = str2;
                scheduleBackupData = scheduleBackupData3;
            } else if (i == 2) {
                it = (Iterator) anonymousClass1.L$3;
                str = (String) anonymousClass1.L$2;
                scheduleBackupData2 = (ScheduleBackupData) anonymousClass1.L$1;
                scheduleService2 = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                while (it.hasNext()) {
                    scheduleWork = (ScheduleWork) it.next();
                    scheduleWorkDao = scheduleService2.scheduleWorkDao;
                    anonymousClass1.L$0 = scheduleService2;
                    anonymousClass1.L$1 = scheduleBackupData2;
                    anonymousClass1.L$2 = str;
                    anonymousClass1.L$3 = it;
                    anonymousClass1.label = 2;
                    if (scheduleWorkDao.insert(scheduleWork, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                List<SchedulePlan> planList = scheduleBackupData2.getPlanList();
                arrayList = new ArrayList();
                for (Object obj2 : planList) {
                    if (Intrinsics.areEqual(((SchedulePlan) obj2).getProjectUuid(), str)) {
                        arrayList.add(obj2);
                    }
                }
                it2 = arrayList.iterator();
                scheduleService3 = scheduleService2;
                while (it2.hasNext()) {
                    schedulePlan = (SchedulePlan) it2.next();
                    schedulePlanDao = scheduleService3.schedulePlanDao;
                    anonymousClass1.L$0 = scheduleService3;
                    anonymousClass1.L$1 = scheduleBackupData2;
                    anonymousClass1.L$2 = str;
                    anonymousClass1.L$3 = it2;
                    anonymousClass1.label = 3;
                    if (schedulePlanDao.insert(schedulePlan, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                List<ScheduleDuty> dutyList = scheduleBackupData2.getDutyList();
                arrayList2 = new ArrayList();
                for (Object obj3 : dutyList) {
                    if (Intrinsics.areEqual(((ScheduleDuty) obj3).getProjectUuid(), str)) {
                        arrayList2.add(obj3);
                    }
                }
                it3 = arrayList2.iterator();
                scheduleService4 = scheduleService3;
                while (it3.hasNext()) {
                    scheduleDuty = (ScheduleDuty) it3.next();
                    scheduleDutyDao = scheduleService4.scheduleDutyDao;
                    anonymousClass1.L$0 = scheduleService4;
                    anonymousClass1.L$1 = scheduleBackupData2;
                    anonymousClass1.L$2 = str;
                    anonymousClass1.L$3 = it3;
                    anonymousClass1.label = 4;
                    if (scheduleDutyDao.insert(scheduleDuty, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                List<ScheduleAlarm> alarmList = scheduleBackupData2.getAlarmList();
                arrayList3 = new ArrayList();
                for (Object obj4 : alarmList) {
                    if (Intrinsics.areEqual(((ScheduleAlarm) obj4).getProjectUuid(), str)) {
                        arrayList3.add(obj4);
                    }
                }
                it4 = arrayList3.iterator();
                scheduleService5 = scheduleService4;
            } else if (i == 3) {
                it2 = (Iterator) anonymousClass1.L$3;
                str = (String) anonymousClass1.L$2;
                scheduleBackupData2 = (ScheduleBackupData) anonymousClass1.L$1;
                scheduleService3 = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                while (it2.hasNext()) {
                    schedulePlan = (SchedulePlan) it2.next();
                    schedulePlanDao = scheduleService3.schedulePlanDao;
                    anonymousClass1.L$0 = scheduleService3;
                    anonymousClass1.L$1 = scheduleBackupData2;
                    anonymousClass1.L$2 = str;
                    anonymousClass1.L$3 = it2;
                    anonymousClass1.label = 3;
                    if (schedulePlanDao.insert(schedulePlan, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                List<ScheduleDuty> dutyList2 = scheduleBackupData2.getDutyList();
                arrayList2 = new ArrayList();
                while (r11.hasNext()) {
                    if (Intrinsics.areEqual(((ScheduleDuty) obj3).getProjectUuid(), str)) {
                        arrayList2.add(obj3);
                    }
                }
                it3 = arrayList2.iterator();
                scheduleService4 = scheduleService3;
                while (it3.hasNext()) {
                    scheduleDuty = (ScheduleDuty) it3.next();
                    scheduleDutyDao = scheduleService4.scheduleDutyDao;
                    anonymousClass1.L$0 = scheduleService4;
                    anonymousClass1.L$1 = scheduleBackupData2;
                    anonymousClass1.L$2 = str;
                    anonymousClass1.L$3 = it3;
                    anonymousClass1.label = 4;
                    if (scheduleDutyDao.insert(scheduleDuty, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                List<ScheduleAlarm> alarmList2 = scheduleBackupData2.getAlarmList();
                arrayList3 = new ArrayList();
                while (r11.hasNext()) {
                    if (Intrinsics.areEqual(((ScheduleAlarm) obj4).getProjectUuid(), str)) {
                        arrayList3.add(obj4);
                    }
                }
                it4 = arrayList3.iterator();
                scheduleService5 = scheduleService4;
            } else if (i == 4) {
                it3 = (Iterator) anonymousClass1.L$3;
                str = (String) anonymousClass1.L$2;
                scheduleBackupData2 = (ScheduleBackupData) anonymousClass1.L$1;
                scheduleService4 = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                while (it3.hasNext()) {
                    scheduleDuty = (ScheduleDuty) it3.next();
                    scheduleDutyDao = scheduleService4.scheduleDutyDao;
                    anonymousClass1.L$0 = scheduleService4;
                    anonymousClass1.L$1 = scheduleBackupData2;
                    anonymousClass1.L$2 = str;
                    anonymousClass1.L$3 = it3;
                    anonymousClass1.label = 4;
                    if (scheduleDutyDao.insert(scheduleDuty, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                List<ScheduleAlarm> alarmList3 = scheduleBackupData2.getAlarmList();
                arrayList3 = new ArrayList();
                while (r11.hasNext()) {
                    if (Intrinsics.areEqual(((ScheduleAlarm) obj4).getProjectUuid(), str)) {
                        arrayList3.add(obj4);
                    }
                }
                it4 = arrayList3.iterator();
                scheduleService5 = scheduleService4;
            } else {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it4 = (Iterator) anonymousClass1.L$1;
                scheduleService5 = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            while (it4.hasNext()) {
                scheduleAlarm = (ScheduleAlarm) it4.next();
                scheduleAlarmDao = scheduleService5.alarmDao;
                anonymousClass1.L$0 = scheduleService5;
                anonymousClass1.L$1 = it4;
                anonymousClass1.L$2 = null;
                anonymousClass1.L$3 = null;
                anonymousClass1.label = 5;
                if (scheduleAlarmDao.insert(scheduleAlarm, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        List<ScheduleWork> workList = scheduleBackupData.getWorkList();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj5 : workList) {
            if (Intrinsics.areEqual(((ScheduleWork) obj5).getProjectUuid(), uuid)) {
                arrayList4.add(obj5);
            }
        }
        Iterator it5 = arrayList4.iterator();
        scheduleService2 = scheduleService;
        scheduleBackupData2 = scheduleBackupData;
        it = it5;
        str = uuid;
        while (it.hasNext()) {
            scheduleWork = (ScheduleWork) it.next();
            scheduleWorkDao = scheduleService2.scheduleWorkDao;
            anonymousClass1.L$0 = scheduleService2;
            anonymousClass1.L$1 = scheduleBackupData2;
            anonymousClass1.L$2 = str;
            anonymousClass1.L$3 = it;
            anonymousClass1.label = 2;
            if (scheduleWorkDao.insert(scheduleWork, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        List<SchedulePlan> planList2 = scheduleBackupData2.getPlanList();
        arrayList = new ArrayList();
        while (r11.hasNext()) {
            if (Intrinsics.areEqual(((SchedulePlan) obj2).getProjectUuid(), str)) {
                arrayList.add(obj2);
            }
        }
        it2 = arrayList.iterator();
        scheduleService3 = scheduleService2;
        while (it2.hasNext()) {
            schedulePlan = (SchedulePlan) it2.next();
            schedulePlanDao = scheduleService3.schedulePlanDao;
            anonymousClass1.L$0 = scheduleService3;
            anonymousClass1.L$1 = scheduleBackupData2;
            anonymousClass1.L$2 = str;
            anonymousClass1.L$3 = it2;
            anonymousClass1.label = 3;
            if (schedulePlanDao.insert(schedulePlan, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        List<ScheduleDuty> dutyList3 = scheduleBackupData2.getDutyList();
        arrayList2 = new ArrayList();
        while (r11.hasNext()) {
            if (Intrinsics.areEqual(((ScheduleDuty) obj3).getProjectUuid(), str)) {
                arrayList2.add(obj3);
            }
        }
        it3 = arrayList2.iterator();
        scheduleService4 = scheduleService3;
        while (it3.hasNext()) {
            scheduleDuty = (ScheduleDuty) it3.next();
            scheduleDutyDao = scheduleService4.scheduleDutyDao;
            anonymousClass1.L$0 = scheduleService4;
            anonymousClass1.L$1 = scheduleBackupData2;
            anonymousClass1.L$2 = str;
            anonymousClass1.L$3 = it3;
            anonymousClass1.label = 4;
            if (scheduleDutyDao.insert(scheduleDuty, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        List<ScheduleAlarm> alarmList4 = scheduleBackupData2.getAlarmList();
        arrayList3 = new ArrayList();
        while (r11.hasNext()) {
            if (Intrinsics.areEqual(((ScheduleAlarm) obj4).getProjectUuid(), str)) {
                arrayList3.add(obj4);
            }
        }
        it4 = arrayList3.iterator();
        scheduleService5 = scheduleService4;
        while (it4.hasNext()) {
            scheduleAlarm = (ScheduleAlarm) it4.next();
            scheduleAlarmDao = scheduleService5.alarmDao;
            anonymousClass1.L$0 = scheduleService5;
            anonymousClass1.L$1 = it4;
            anonymousClass1.L$2 = null;
            anonymousClass1.L$3 = null;
            anonymousClass1.label = 5;
            if (scheduleAlarmDao.insert(scheduleAlarm, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0384  */
    /* JADX WARN: Code duplicated, block: B:110:0x0394 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x03b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x037e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x037e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x032d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0317 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0317 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0371 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x035a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x02c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x02df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x02f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x025b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x0245 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0245 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x029f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x0288 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x021a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0138 A[LOOP:11: B:25:0x0132->B:27:0x0138, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x015c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x015d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0178 A[LOOP:10: B:33:0x0172->B:35:0x0178, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x019d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x019e  */
    /* JADX WARN: Code duplicated, block: B:43:0x01ba A[LOOP:9: B:41:0x01b4->B:43:0x01ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x01e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x01f9 A[LOOP:7: B:48:0x01f3->B:50:0x01f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0220  */
    /* JADX WARN: Code duplicated, block: B:60:0x024b  */
    /* JADX WARN: Code duplicated, block: B:68:0x028e  */
    /* JADX WARN: Code duplicated, block: B:74:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code duplicated, block: B:82:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x031d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0360  */
    public final Object increaseByProject(ScheduleBackupData scheduleBackupData, ScheduleProject scheduleProject, Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        String uuid;
        ScheduleService scheduleService;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        Object objListByProject;
        ScheduleBackupData scheduleBackupData2;
        List list;
        ArrayList arrayList3;
        Iterator it2;
        ArrayList arrayList4;
        ScheduleService scheduleService2;
        String str;
        List list2;
        ScheduleBackupData scheduleBackupData3;
        List list3;
        ArrayList arrayList5;
        Iterator it3;
        ArrayList arrayList6;
        ArrayList arrayList7;
        Iterator it4;
        ArrayList arrayList8;
        List list4;
        List list5;
        ScheduleService scheduleService3;
        ScheduleBackupData scheduleBackupData4;
        String str2;
        List list6;
        List list7;
        Iterator it5;
        ArrayList arrayList9;
        Iterator it6;
        String str3;
        ScheduleBackupData scheduleBackupData5;
        ScheduleService scheduleService4;
        ScheduleWork scheduleWork;
        ScheduleWorkDao scheduleWorkDao;
        ArrayList arrayList10;
        Iterator it7;
        String str4;
        ScheduleBackupData scheduleBackupData6;
        ScheduleService scheduleService5;
        SchedulePlan schedulePlan;
        SchedulePlanDao schedulePlanDao;
        ArrayList arrayList11;
        Iterator it8;
        ScheduleService scheduleService6;
        ScheduleDuty scheduleDuty;
        ScheduleDutyDao scheduleDutyDao;
        ScheduleAlarm scheduleAlarm;
        ScheduleAlarmDao scheduleAlarmDao;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objListByProject2 = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (anonymousClass1.label) {
            case 0:
                ResultKt.throwOnFailure(objListByProject2);
                uuid = scheduleProject.getUuid();
                ScheduleWorkDao scheduleWorkDao2 = this.scheduleWorkDao;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = scheduleBackupData;
                anonymousClass1.L$2 = uuid;
                anonymousClass1.label = 1;
                objListByProject2 = scheduleWorkDao2.listByProject(uuid, anonymousClass1);
                if (objListByProject2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleService = this;
                Iterable iterable = (Iterable) objListByProject2;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ScheduleWork) it.next()).getUuid());
                }
                arrayList2 = arrayList;
                SchedulePlanDao schedulePlanDao2 = scheduleService.schedulePlanDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = scheduleBackupData;
                anonymousClass1.L$2 = uuid;
                anonymousClass1.L$3 = arrayList2;
                anonymousClass1.label = 2;
                objListByProject = schedulePlanDao2.listByProject(uuid, anonymousClass1);
                if (objListByProject == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleBackupData2 = scheduleBackupData;
                list = arrayList2;
                objListByProject2 = objListByProject;
                Iterable iterable2 = (Iterable) objListByProject2;
                arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
                it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((SchedulePlan) it2.next()).getUuid());
                }
                arrayList4 = arrayList3;
                ScheduleDutyDao scheduleDutyDao2 = scheduleService.scheduleDutyDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = scheduleBackupData2;
                anonymousClass1.L$2 = uuid;
                anonymousClass1.L$3 = list;
                anonymousClass1.L$4 = arrayList4;
                anonymousClass1.label = 3;
                objListByProject2 = scheduleDutyDao2.listByProject(uuid, anonymousClass1);
                if (objListByProject2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleService2 = scheduleService;
                str = uuid;
                list2 = arrayList4;
                scheduleBackupData3 = scheduleBackupData2;
                list3 = list;
                Iterable iterable3 = (Iterable) objListByProject2;
                arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable3, 10));
                it3 = iterable3.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(((ScheduleDuty) it3.next()).getUuid());
                }
                arrayList6 = arrayList5;
                ScheduleAlarmDao scheduleAlarmDao2 = scheduleService2.alarmDao;
                anonymousClass1.L$0 = scheduleService2;
                anonymousClass1.L$1 = scheduleBackupData3;
                anonymousClass1.L$2 = str;
                anonymousClass1.L$3 = list3;
                anonymousClass1.L$4 = list2;
                anonymousClass1.L$5 = arrayList6;
                anonymousClass1.label = 4;
                objListByProject2 = scheduleAlarmDao2.listByProject(str, anonymousClass1);
                if (objListByProject2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Iterable iterable4 = (Iterable) objListByProject2;
                arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable4, 10));
                it4 = iterable4.iterator();
                while (it4.hasNext()) {
                    arrayList7.add(((ScheduleAlarm) it4.next()).getUuid());
                }
                ArrayList arrayList12 = arrayList7;
                List<ScheduleWork> workList = scheduleBackupData3.getWorkList();
                arrayList8 = new ArrayList();
                for (Object obj : workList) {
                    if (Intrinsics.areEqual(((ScheduleWork) obj).getProjectUuid(), str)) {
                        arrayList8.add(obj);
                    }
                }
                Iterator it9 = arrayList8.iterator();
                list4 = list2;
                list5 = arrayList12;
                scheduleService3 = scheduleService2;
                scheduleBackupData4 = scheduleBackupData3;
                str2 = str;
                list6 = list3;
                list7 = arrayList6;
                it5 = it9;
                while (it5.hasNext()) {
                    scheduleWork = (ScheduleWork) it5.next();
                    if (list6.contains(scheduleWork.getUuid())) {
                        scheduleWorkDao = scheduleService3.scheduleWorkDao;
                        anonymousClass1.L$0 = scheduleService3;
                        anonymousClass1.L$1 = scheduleBackupData4;
                        anonymousClass1.L$2 = str2;
                        anonymousClass1.L$3 = list6;
                        anonymousClass1.L$4 = list4;
                        anonymousClass1.L$5 = list7;
                        anonymousClass1.L$6 = list5;
                        anonymousClass1.L$7 = it5;
                        anonymousClass1.label = 5;
                        if (scheduleWorkDao.insert(scheduleWork, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                List<SchedulePlan> planList = scheduleBackupData4.getPlanList();
                arrayList9 = new ArrayList();
                for (Object obj2 : planList) {
                    if (Intrinsics.areEqual(((SchedulePlan) obj2).getProjectUuid(), str2)) {
                        arrayList9.add(obj2);
                    }
                }
                it6 = arrayList9.iterator();
                str3 = str2;
                scheduleBackupData5 = scheduleBackupData4;
                scheduleService4 = scheduleService3;
                while (it6.hasNext()) {
                    schedulePlan = (SchedulePlan) it6.next();
                    if (list4.contains(schedulePlan.getUuid())) {
                        schedulePlanDao = scheduleService4.schedulePlanDao;
                        anonymousClass1.L$0 = scheduleService4;
                        anonymousClass1.L$1 = scheduleBackupData5;
                        anonymousClass1.L$2 = str3;
                        anonymousClass1.L$3 = list4;
                        anonymousClass1.L$4 = list7;
                        anonymousClass1.L$5 = list5;
                        anonymousClass1.L$6 = it6;
                        anonymousClass1.L$7 = null;
                        anonymousClass1.label = 6;
                        if (schedulePlanDao.insert(schedulePlan, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                List<ScheduleDuty> dutyList = scheduleBackupData5.getDutyList();
                arrayList10 = new ArrayList();
                for (Object obj3 : dutyList) {
                    if (Intrinsics.areEqual(((ScheduleDuty) obj3).getProjectUuid(), str3)) {
                        arrayList10.add(obj3);
                    }
                }
                it7 = arrayList10.iterator();
                str4 = str3;
                scheduleBackupData6 = scheduleBackupData5;
                scheduleService5 = scheduleService4;
                while (it7.hasNext()) {
                    scheduleDuty = (ScheduleDuty) it7.next();
                    if (list7.contains(scheduleDuty.getUuid())) {
                        scheduleDutyDao = scheduleService5.scheduleDutyDao;
                        anonymousClass1.L$0 = scheduleService5;
                        anonymousClass1.L$1 = scheduleBackupData6;
                        anonymousClass1.L$2 = str4;
                        anonymousClass1.L$3 = list7;
                        anonymousClass1.L$4 = list5;
                        anonymousClass1.L$5 = it7;
                        anonymousClass1.L$6 = null;
                        anonymousClass1.L$7 = null;
                        anonymousClass1.label = 7;
                        if (scheduleDutyDao.insert(scheduleDuty, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                List<ScheduleAlarm> alarmList = scheduleBackupData6.getAlarmList();
                arrayList11 = new ArrayList();
                for (Object obj4 : alarmList) {
                    if (Intrinsics.areEqual(((ScheduleAlarm) obj4).getProjectUuid(), str4)) {
                        arrayList11.add(obj4);
                    }
                }
                it8 = arrayList11.iterator();
                scheduleService6 = scheduleService5;
                while (it8.hasNext()) {
                    scheduleAlarm = (ScheduleAlarm) it8.next();
                    if (list5.contains(scheduleAlarm.getUuid())) {
                        scheduleAlarmDao = scheduleService6.alarmDao;
                        anonymousClass1.L$0 = scheduleService6;
                        anonymousClass1.L$1 = list5;
                        anonymousClass1.L$2 = it8;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.L$4 = null;
                        anonymousClass1.L$5 = null;
                        anonymousClass1.L$6 = null;
                        anonymousClass1.L$7 = null;
                        anonymousClass1.label = 8;
                        if (scheduleAlarmDao.insert(scheduleAlarm, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 1:
                String str5 = (String) anonymousClass1.L$2;
                ScheduleBackupData scheduleBackupData7 = (ScheduleBackupData) anonymousClass1.L$1;
                ScheduleService scheduleService7 = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objListByProject2);
                scheduleService = scheduleService7;
                uuid = str5;
                scheduleBackupData = scheduleBackupData7;
                Iterable iterable5 = (Iterable) objListByProject2;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable5, 10));
                it = iterable5.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ScheduleWork) it.next()).getUuid());
                }
                arrayList2 = arrayList;
                SchedulePlanDao schedulePlanDao3 = scheduleService.schedulePlanDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = scheduleBackupData;
                anonymousClass1.L$2 = uuid;
                anonymousClass1.L$3 = arrayList2;
                anonymousClass1.label = 2;
                objListByProject = schedulePlanDao3.listByProject(uuid, anonymousClass1);
                if (objListByProject == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleBackupData2 = scheduleBackupData;
                list = arrayList2;
                objListByProject2 = objListByProject;
                Iterable iterable6 = (Iterable) objListByProject2;
                arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable6, 10));
                it2 = iterable6.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((SchedulePlan) it2.next()).getUuid());
                }
                arrayList4 = arrayList3;
                ScheduleDutyDao scheduleDutyDao3 = scheduleService.scheduleDutyDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = scheduleBackupData2;
                anonymousClass1.L$2 = uuid;
                anonymousClass1.L$3 = list;
                anonymousClass1.L$4 = arrayList4;
                anonymousClass1.label = 3;
                objListByProject2 = scheduleDutyDao3.listByProject(uuid, anonymousClass1);
                if (objListByProject2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleService2 = scheduleService;
                str = uuid;
                list2 = arrayList4;
                scheduleBackupData3 = scheduleBackupData2;
                list3 = list;
                Iterable iterable7 = (Iterable) objListByProject2;
                arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable7, 10));
                it3 = iterable7.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(((ScheduleDuty) it3.next()).getUuid());
                }
                arrayList6 = arrayList5;
                ScheduleAlarmDao scheduleAlarmDao3 = scheduleService2.alarmDao;
                anonymousClass1.L$0 = scheduleService2;
                anonymousClass1.L$1 = scheduleBackupData3;
                anonymousClass1.L$2 = str;
                anonymousClass1.L$3 = list3;
                anonymousClass1.L$4 = list2;
                anonymousClass1.L$5 = arrayList6;
                anonymousClass1.label = 4;
                objListByProject2 = scheduleAlarmDao3.listByProject(str, anonymousClass1);
                if (objListByProject2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Iterable iterable8 = (Iterable) objListByProject2;
                arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable8, 10));
                it4 = iterable8.iterator();
                while (it4.hasNext()) {
                    arrayList7.add(((ScheduleAlarm) it4.next()).getUuid());
                }
                ArrayList arrayList13 = arrayList7;
                List<ScheduleWork> workList2 = scheduleBackupData3.getWorkList();
                arrayList8 = new ArrayList();
                while (r15.hasNext()) {
                    if (Intrinsics.areEqual(((ScheduleWork) obj).getProjectUuid(), str)) {
                        arrayList8.add(obj);
                    }
                }
                Iterator it10 = arrayList8.iterator();
                list4 = list2;
                list5 = arrayList13;
                scheduleService3 = scheduleService2;
                scheduleBackupData4 = scheduleBackupData3;
                str2 = str;
                list6 = list3;
                list7 = arrayList6;
                it5 = it10;
                while (it5.hasNext()) {
                    scheduleWork = (ScheduleWork) it5.next();
                    if (list6.contains(scheduleWork.getUuid())) {
                        scheduleWorkDao = scheduleService3.scheduleWorkDao;
                        anonymousClass1.L$0 = scheduleService3;
                        anonymousClass1.L$1 = scheduleBackupData4;
                        anonymousClass1.L$2 = str2;
                        anonymousClass1.L$3 = list6;
                        anonymousClass1.L$4 = list4;
                        anonymousClass1.L$5 = list7;
                        anonymousClass1.L$6 = list5;
                        anonymousClass1.L$7 = it5;
                        anonymousClass1.label = 5;
                        if (scheduleWorkDao.insert(scheduleWork, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                List<SchedulePlan> planList2 = scheduleBackupData4.getPlanList();
                arrayList9 = new ArrayList();
                while (r13.hasNext()) {
                    if (Intrinsics.areEqual(((SchedulePlan) obj2).getProjectUuid(), str2)) {
                        arrayList9.add(obj2);
                    }
                }
                it6 = arrayList9.iterator();
                str3 = str2;
                scheduleBackupData5 = scheduleBackupData4;
                scheduleService4 = scheduleService3;
                while (it6.hasNext()) {
                    schedulePlan = (SchedulePlan) it6.next();
                    if (list4.contains(schedulePlan.getUuid())) {
                        schedulePlanDao = scheduleService4.schedulePlanDao;
                        anonymousClass1.L$0 = scheduleService4;
                        anonymousClass1.L$1 = scheduleBackupData5;
                        anonymousClass1.L$2 = str3;
                        anonymousClass1.L$3 = list4;
                        anonymousClass1.L$4 = list7;
                        anonymousClass1.L$5 = list5;
                        anonymousClass1.L$6 = it6;
                        anonymousClass1.L$7 = null;
                        anonymousClass1.label = 6;
                        if (schedulePlanDao.insert(schedulePlan, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                List<ScheduleDuty> dutyList2 = scheduleBackupData5.getDutyList();
                arrayList10 = new ArrayList();
                while (r13.hasNext()) {
                    if (Intrinsics.areEqual(((ScheduleDuty) obj3).getProjectUuid(), str3)) {
                        arrayList10.add(obj3);
                    }
                }
                it7 = arrayList10.iterator();
                str4 = str3;
                scheduleBackupData6 = scheduleBackupData5;
                scheduleService5 = scheduleService4;
                while (it7.hasNext()) {
                    scheduleDuty = (ScheduleDuty) it7.next();
                    if (list7.contains(scheduleDuty.getUuid())) {
                        scheduleDutyDao = scheduleService5.scheduleDutyDao;
                        anonymousClass1.L$0 = scheduleService5;
                        anonymousClass1.L$1 = scheduleBackupData6;
                        anonymousClass1.L$2 = str4;
                        anonymousClass1.L$3 = list7;
                        anonymousClass1.L$4 = list5;
                        anonymousClass1.L$5 = it7;
                        anonymousClass1.L$6 = null;
                        anonymousClass1.L$7 = null;
                        anonymousClass1.label = 7;
                        if (scheduleDutyDao.insert(scheduleDuty, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                List<ScheduleAlarm> alarmList2 = scheduleBackupData6.getAlarmList();
                arrayList11 = new ArrayList();
                while (r13.hasNext()) {
                    if (Intrinsics.areEqual(((ScheduleAlarm) obj4).getProjectUuid(), str4)) {
                        arrayList11.add(obj4);
                    }
                }
                it8 = arrayList11.iterator();
                scheduleService6 = scheduleService5;
                while (it8.hasNext()) {
                    scheduleAlarm = (ScheduleAlarm) it8.next();
                    if (list5.contains(scheduleAlarm.getUuid())) {
                        scheduleAlarmDao = scheduleService6.alarmDao;
                        anonymousClass1.L$0 = scheduleService6;
                        anonymousClass1.L$1 = list5;
                        anonymousClass1.L$2 = it8;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.L$4 = null;
                        anonymousClass1.L$5 = null;
                        anonymousClass1.L$6 = null;
                        anonymousClass1.L$7 = null;
                        anonymousClass1.label = 8;
                        if (scheduleAlarmDao.insert(scheduleAlarm, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 2:
                list = (List) anonymousClass1.L$3;
                uuid = (String) anonymousClass1.L$2;
                scheduleBackupData2 = (ScheduleBackupData) anonymousClass1.L$1;
                scheduleService = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objListByProject2);
                Iterable iterable9 = (Iterable) objListByProject2;
                arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable9, 10));
                it2 = iterable9.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((SchedulePlan) it2.next()).getUuid());
                }
                arrayList4 = arrayList3;
                ScheduleDutyDao scheduleDutyDao4 = scheduleService.scheduleDutyDao;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = scheduleBackupData2;
                anonymousClass1.L$2 = uuid;
                anonymousClass1.L$3 = list;
                anonymousClass1.L$4 = arrayList4;
                anonymousClass1.label = 3;
                objListByProject2 = scheduleDutyDao4.listByProject(uuid, anonymousClass1);
                if (objListByProject2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleService2 = scheduleService;
                str = uuid;
                list2 = arrayList4;
                scheduleBackupData3 = scheduleBackupData2;
                list3 = list;
                Iterable iterable10 = (Iterable) objListByProject2;
                arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable10, 10));
                it3 = iterable10.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(((ScheduleDuty) it3.next()).getUuid());
                }
                arrayList6 = arrayList5;
                ScheduleAlarmDao scheduleAlarmDao4 = scheduleService2.alarmDao;
                anonymousClass1.L$0 = scheduleService2;
                anonymousClass1.L$1 = scheduleBackupData3;
                anonymousClass1.L$2 = str;
                anonymousClass1.L$3 = list3;
                anonymousClass1.L$4 = list2;
                anonymousClass1.L$5 = arrayList6;
                anonymousClass1.label = 4;
                objListByProject2 = scheduleAlarmDao4.listByProject(str, anonymousClass1);
                if (objListByProject2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Iterable iterable11 = (Iterable) objListByProject2;
                arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable11, 10));
                it4 = iterable11.iterator();
                while (it4.hasNext()) {
                    arrayList7.add(((ScheduleAlarm) it4.next()).getUuid());
                }
                ArrayList arrayList14 = arrayList7;
                List<ScheduleWork> workList3 = scheduleBackupData3.getWorkList();
                arrayList8 = new ArrayList();
                while (r15.hasNext()) {
                    if (Intrinsics.areEqual(((ScheduleWork) obj).getProjectUuid(), str)) {
                        arrayList8.add(obj);
                    }
                }
                Iterator it11 = arrayList8.iterator();
                list4 = list2;
                list5 = arrayList14;
                scheduleService3 = scheduleService2;
                scheduleBackupData4 = scheduleBackupData3;
                str2 = str;
                list6 = list3;
                list7 = arrayList6;
                it5 = it11;
                while (it5.hasNext()) {
                    scheduleWork = (ScheduleWork) it5.next();
                    if (list6.contains(scheduleWork.getUuid())) {
                        scheduleWorkDao = scheduleService3.scheduleWorkDao;
                        anonymousClass1.L$0 = scheduleService3;
                        anonymousClass1.L$1 = scheduleBackupData4;
                        anonymousClass1.L$2 = str2;
                        anonymousClass1.L$3 = list6;
                        anonymousClass1.L$4 = list4;
                        anonymousClass1.L$5 = list7;
                        anonymousClass1.L$6 = list5;
                        anonymousClass1.L$7 = it5;
                        anonymousClass1.label = 5;
                        if (scheduleWorkDao.insert(scheduleWork, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                List<SchedulePlan> planList3 = scheduleBackupData4.getPlanList();
                arrayList9 = new ArrayList();
                while (r13.hasNext()) {
                    if (Intrinsics.areEqual(((SchedulePlan) obj2).getProjectUuid(), str2)) {
                        arrayList9.add(obj2);
                    }
                }
                it6 = arrayList9.iterator();
                str3 = str2;
                scheduleBackupData5 = scheduleBackupData4;
                scheduleService4 = scheduleService3;
                while (it6.hasNext()) {
                    schedulePlan = (SchedulePlan) it6.next();
                    if (list4.contains(schedulePlan.getUuid())) {
                        schedulePlanDao = scheduleService4.schedulePlanDao;
                        anonymousClass1.L$0 = scheduleService4;
                        anonymousClass1.L$1 = scheduleBackupData5;
                        anonymousClass1.L$2 = str3;
                        anonymousClass1.L$3 = list4;
                        anonymousClass1.L$4 = list7;
                        anonymousClass1.L$5 = list5;
                        anonymousClass1.L$6 = it6;
                        anonymousClass1.L$7 = null;
                        anonymousClass1.label = 6;
                        if (schedulePlanDao.insert(schedulePlan, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                List<ScheduleDuty> dutyList3 = scheduleBackupData5.getDutyList();
                arrayList10 = new ArrayList();
                while (r13.hasNext()) {
                    if (Intrinsics.areEqual(((ScheduleDuty) obj3).getProjectUuid(), str3)) {
                        arrayList10.add(obj3);
                    }
                }
                it7 = arrayList10.iterator();
                str4 = str3;
                scheduleBackupData6 = scheduleBackupData5;
                scheduleService5 = scheduleService4;
                while (it7.hasNext()) {
                    scheduleDuty = (ScheduleDuty) it7.next();
                    if (list7.contains(scheduleDuty.getUuid())) {
                        scheduleDutyDao = scheduleService5.scheduleDutyDao;
                        anonymousClass1.L$0 = scheduleService5;
                        anonymousClass1.L$1 = scheduleBackupData6;
                        anonymousClass1.L$2 = str4;
                        anonymousClass1.L$3 = list7;
                        anonymousClass1.L$4 = list5;
                        anonymousClass1.L$5 = it7;
                        anonymousClass1.L$6 = null;
                        anonymousClass1.L$7 = null;
                        anonymousClass1.label = 7;
                        if (scheduleDutyDao.insert(scheduleDuty, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                List<ScheduleAlarm> alarmList3 = scheduleBackupData6.getAlarmList();
                arrayList11 = new ArrayList();
                while (r13.hasNext()) {
                    if (Intrinsics.areEqual(((ScheduleAlarm) obj4).getProjectUuid(), str4)) {
                        arrayList11.add(obj4);
                    }
                }
                it8 = arrayList11.iterator();
                scheduleService6 = scheduleService5;
                while (it8.hasNext()) {
                    scheduleAlarm = (ScheduleAlarm) it8.next();
                    if (list5.contains(scheduleAlarm.getUuid())) {
                        scheduleAlarmDao = scheduleService6.alarmDao;
                        anonymousClass1.L$0 = scheduleService6;
                        anonymousClass1.L$1 = list5;
                        anonymousClass1.L$2 = it8;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.L$4 = null;
                        anonymousClass1.L$5 = null;
                        anonymousClass1.L$6 = null;
                        anonymousClass1.L$7 = null;
                        anonymousClass1.label = 8;
                        if (scheduleAlarmDao.insert(scheduleAlarm, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 3:
                List list8 = (List) anonymousClass1.L$4;
                List list9 = (List) anonymousClass1.L$3;
                String str6 = (String) anonymousClass1.L$2;
                ScheduleBackupData scheduleBackupData8 = (ScheduleBackupData) anonymousClass1.L$1;
                ScheduleService scheduleService8 = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objListByProject2);
                scheduleService2 = scheduleService8;
                scheduleBackupData3 = scheduleBackupData8;
                str = str6;
                list3 = list9;
                list2 = list8;
                Iterable iterable12 = (Iterable) objListByProject2;
                arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable12, 10));
                it3 = iterable12.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(((ScheduleDuty) it3.next()).getUuid());
                }
                arrayList6 = arrayList5;
                ScheduleAlarmDao scheduleAlarmDao5 = scheduleService2.alarmDao;
                anonymousClass1.L$0 = scheduleService2;
                anonymousClass1.L$1 = scheduleBackupData3;
                anonymousClass1.L$2 = str;
                anonymousClass1.L$3 = list3;
                anonymousClass1.L$4 = list2;
                anonymousClass1.L$5 = arrayList6;
                anonymousClass1.label = 4;
                objListByProject2 = scheduleAlarmDao5.listByProject(str, anonymousClass1);
                if (objListByProject2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Iterable iterable13 = (Iterable) objListByProject2;
                arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable13, 10));
                it4 = iterable13.iterator();
                while (it4.hasNext()) {
                    arrayList7.add(((ScheduleAlarm) it4.next()).getUuid());
                }
                ArrayList arrayList15 = arrayList7;
                List<ScheduleWork> workList4 = scheduleBackupData3.getWorkList();
                arrayList8 = new ArrayList();
                while (r15.hasNext()) {
                    if (Intrinsics.areEqual(((ScheduleWork) obj).getProjectUuid(), str)) {
                        arrayList8.add(obj);
                    }
                }
                Iterator it12 = arrayList8.iterator();
                list4 = list2;
                list5 = arrayList15;
                scheduleService3 = scheduleService2;
                scheduleBackupData4 = scheduleBackupData3;
                str2 = str;
                list6 = list3;
                list7 = arrayList6;
                it5 = it12;
                while (it5.hasNext()) {
                    scheduleWork = (ScheduleWork) it5.next();
                    if (list6.contains(scheduleWork.getUuid())) {
                        scheduleWorkDao = scheduleService3.scheduleWorkDao;
                        anonymousClass1.L$0 = scheduleService3;
                        anonymousClass1.L$1 = scheduleBackupData4;
                        anonymousClass1.L$2 = str2;
                        anonymousClass1.L$3 = list6;
                        anonymousClass1.L$4 = list4;
                        anonymousClass1.L$5 = list7;
                        anonymousClass1.L$6 = list5;
                        anonymousClass1.L$7 = it5;
                        anonymousClass1.label = 5;
                        if (scheduleWorkDao.insert(scheduleWork, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                List<SchedulePlan> planList4 = scheduleBackupData4.getPlanList();
                arrayList9 = new ArrayList();
                while (r13.hasNext()) {
                    if (Intrinsics.areEqual(((SchedulePlan) obj2).getProjectUuid(), str2)) {
                        arrayList9.add(obj2);
                    }
                }
                it6 = arrayList9.iterator();
                str3 = str2;
                scheduleBackupData5 = scheduleBackupData4;
                scheduleService4 = scheduleService3;
                while (it6.hasNext()) {
                    schedulePlan = (SchedulePlan) it6.next();
                    if (list4.contains(schedulePlan.getUuid())) {
                        schedulePlanDao = scheduleService4.schedulePlanDao;
                        anonymousClass1.L$0 = scheduleService4;
                        anonymousClass1.L$1 = scheduleBackupData5;
                        anonymousClass1.L$2 = str3;
                        anonymousClass1.L$3 = list4;
                        anonymousClass1.L$4 = list7;
                        anonymousClass1.L$5 = list5;
                        anonymousClass1.L$6 = it6;
                        anonymousClass1.L$7 = null;
                        anonymousClass1.label = 6;
                        if (schedulePlanDao.insert(schedulePlan, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                List<ScheduleDuty> dutyList4 = scheduleBackupData5.getDutyList();
                arrayList10 = new ArrayList();
                while (r13.hasNext()) {
                    if (Intrinsics.areEqual(((ScheduleDuty) obj3).getProjectUuid(), str3)) {
                        arrayList10.add(obj3);
                    }
                }
                it7 = arrayList10.iterator();
                str4 = str3;
                scheduleBackupData6 = scheduleBackupData5;
                scheduleService5 = scheduleService4;
                while (it7.hasNext()) {
                    scheduleDuty = (ScheduleDuty) it7.next();
                    if (list7.contains(scheduleDuty.getUuid())) {
                        scheduleDutyDao = scheduleService5.scheduleDutyDao;
                        anonymousClass1.L$0 = scheduleService5;
                        anonymousClass1.L$1 = scheduleBackupData6;
                        anonymousClass1.L$2 = str4;
                        anonymousClass1.L$3 = list7;
                        anonymousClass1.L$4 = list5;
                        anonymousClass1.L$5 = it7;
                        anonymousClass1.L$6 = null;
                        anonymousClass1.L$7 = null;
                        anonymousClass1.label = 7;
                        if (scheduleDutyDao.insert(scheduleDuty, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                List<ScheduleAlarm> alarmList4 = scheduleBackupData6.getAlarmList();
                arrayList11 = new ArrayList();
                while (r13.hasNext()) {
                    if (Intrinsics.areEqual(((ScheduleAlarm) obj4).getProjectUuid(), str4)) {
                        arrayList11.add(obj4);
                    }
                }
                it8 = arrayList11.iterator();
                scheduleService6 = scheduleService5;
                while (it8.hasNext()) {
                    scheduleAlarm = (ScheduleAlarm) it8.next();
                    if (list5.contains(scheduleAlarm.getUuid())) {
                        scheduleAlarmDao = scheduleService6.alarmDao;
                        anonymousClass1.L$0 = scheduleService6;
                        anonymousClass1.L$1 = list5;
                        anonymousClass1.L$2 = it8;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.L$4 = null;
                        anonymousClass1.L$5 = null;
                        anonymousClass1.L$6 = null;
                        anonymousClass1.L$7 = null;
                        anonymousClass1.label = 8;
                        if (scheduleAlarmDao.insert(scheduleAlarm, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 4:
                arrayList6 = (List) anonymousClass1.L$5;
                list2 = (List) anonymousClass1.L$4;
                list3 = (List) anonymousClass1.L$3;
                str = (String) anonymousClass1.L$2;
                scheduleBackupData3 = (ScheduleBackupData) anonymousClass1.L$1;
                scheduleService2 = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objListByProject2);
                Iterable iterable14 = (Iterable) objListByProject2;
                arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable14, 10));
                it4 = iterable14.iterator();
                while (it4.hasNext()) {
                    arrayList7.add(((ScheduleAlarm) it4.next()).getUuid());
                }
                ArrayList arrayList16 = arrayList7;
                List<ScheduleWork> workList5 = scheduleBackupData3.getWorkList();
                arrayList8 = new ArrayList();
                while (r15.hasNext()) {
                    if (Intrinsics.areEqual(((ScheduleWork) obj).getProjectUuid(), str)) {
                        arrayList8.add(obj);
                    }
                }
                Iterator it13 = arrayList8.iterator();
                list4 = list2;
                list5 = arrayList16;
                scheduleService3 = scheduleService2;
                scheduleBackupData4 = scheduleBackupData3;
                str2 = str;
                list6 = list3;
                list7 = arrayList6;
                it5 = it13;
                while (it5.hasNext()) {
                    scheduleWork = (ScheduleWork) it5.next();
                    if (list6.contains(scheduleWork.getUuid())) {
                        scheduleWorkDao = scheduleService3.scheduleWorkDao;
                        anonymousClass1.L$0 = scheduleService3;
                        anonymousClass1.L$1 = scheduleBackupData4;
                        anonymousClass1.L$2 = str2;
                        anonymousClass1.L$3 = list6;
                        anonymousClass1.L$4 = list4;
                        anonymousClass1.L$5 = list7;
                        anonymousClass1.L$6 = list5;
                        anonymousClass1.L$7 = it5;
                        anonymousClass1.label = 5;
                        if (scheduleWorkDao.insert(scheduleWork, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                List<SchedulePlan> planList5 = scheduleBackupData4.getPlanList();
                arrayList9 = new ArrayList();
                while (r13.hasNext()) {
                    if (Intrinsics.areEqual(((SchedulePlan) obj2).getProjectUuid(), str2)) {
                        arrayList9.add(obj2);
                    }
                }
                it6 = arrayList9.iterator();
                str3 = str2;
                scheduleBackupData5 = scheduleBackupData4;
                scheduleService4 = scheduleService3;
                while (it6.hasNext()) {
                    schedulePlan = (SchedulePlan) it6.next();
                    if (list4.contains(schedulePlan.getUuid())) {
                        schedulePlanDao = scheduleService4.schedulePlanDao;
                        anonymousClass1.L$0 = scheduleService4;
                        anonymousClass1.L$1 = scheduleBackupData5;
                        anonymousClass1.L$2 = str3;
                        anonymousClass1.L$3 = list4;
                        anonymousClass1.L$4 = list7;
                        anonymousClass1.L$5 = list5;
                        anonymousClass1.L$6 = it6;
                        anonymousClass1.L$7 = null;
                        anonymousClass1.label = 6;
                        if (schedulePlanDao.insert(schedulePlan, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                List<ScheduleDuty> dutyList5 = scheduleBackupData5.getDutyList();
                arrayList10 = new ArrayList();
                while (r13.hasNext()) {
                    if (Intrinsics.areEqual(((ScheduleDuty) obj3).getProjectUuid(), str3)) {
                        arrayList10.add(obj3);
                    }
                }
                it7 = arrayList10.iterator();
                str4 = str3;
                scheduleBackupData6 = scheduleBackupData5;
                scheduleService5 = scheduleService4;
                while (it7.hasNext()) {
                    scheduleDuty = (ScheduleDuty) it7.next();
                    if (list7.contains(scheduleDuty.getUuid())) {
                        scheduleDutyDao = scheduleService5.scheduleDutyDao;
                        anonymousClass1.L$0 = scheduleService5;
                        anonymousClass1.L$1 = scheduleBackupData6;
                        anonymousClass1.L$2 = str4;
                        anonymousClass1.L$3 = list7;
                        anonymousClass1.L$4 = list5;
                        anonymousClass1.L$5 = it7;
                        anonymousClass1.L$6 = null;
                        anonymousClass1.L$7 = null;
                        anonymousClass1.label = 7;
                        if (scheduleDutyDao.insert(scheduleDuty, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                List<ScheduleAlarm> alarmList5 = scheduleBackupData6.getAlarmList();
                arrayList11 = new ArrayList();
                while (r13.hasNext()) {
                    if (Intrinsics.areEqual(((ScheduleAlarm) obj4).getProjectUuid(), str4)) {
                        arrayList11.add(obj4);
                    }
                }
                it8 = arrayList11.iterator();
                scheduleService6 = scheduleService5;
                while (it8.hasNext()) {
                    scheduleAlarm = (ScheduleAlarm) it8.next();
                    if (list5.contains(scheduleAlarm.getUuid())) {
                        scheduleAlarmDao = scheduleService6.alarmDao;
                        anonymousClass1.L$0 = scheduleService6;
                        anonymousClass1.L$1 = list5;
                        anonymousClass1.L$2 = it8;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.L$4 = null;
                        anonymousClass1.L$5 = null;
                        anonymousClass1.L$6 = null;
                        anonymousClass1.L$7 = null;
                        anonymousClass1.label = 8;
                        if (scheduleAlarmDao.insert(scheduleAlarm, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 5:
                it5 = (Iterator) anonymousClass1.L$7;
                list5 = (List) anonymousClass1.L$6;
                list7 = (List) anonymousClass1.L$5;
                list4 = (List) anonymousClass1.L$4;
                list6 = (List) anonymousClass1.L$3;
                str2 = (String) anonymousClass1.L$2;
                scheduleBackupData4 = (ScheduleBackupData) anonymousClass1.L$1;
                scheduleService3 = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objListByProject2);
                while (it5.hasNext()) {
                    scheduleWork = (ScheduleWork) it5.next();
                    if (list6.contains(scheduleWork.getUuid())) {
                        scheduleWorkDao = scheduleService3.scheduleWorkDao;
                        anonymousClass1.L$0 = scheduleService3;
                        anonymousClass1.L$1 = scheduleBackupData4;
                        anonymousClass1.L$2 = str2;
                        anonymousClass1.L$3 = list6;
                        anonymousClass1.L$4 = list4;
                        anonymousClass1.L$5 = list7;
                        anonymousClass1.L$6 = list5;
                        anonymousClass1.L$7 = it5;
                        anonymousClass1.label = 5;
                        if (scheduleWorkDao.insert(scheduleWork, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                List<SchedulePlan> planList6 = scheduleBackupData4.getPlanList();
                arrayList9 = new ArrayList();
                while (r13.hasNext()) {
                    if (Intrinsics.areEqual(((SchedulePlan) obj2).getProjectUuid(), str2)) {
                        arrayList9.add(obj2);
                    }
                }
                it6 = arrayList9.iterator();
                str3 = str2;
                scheduleBackupData5 = scheduleBackupData4;
                scheduleService4 = scheduleService3;
                while (it6.hasNext()) {
                    schedulePlan = (SchedulePlan) it6.next();
                    if (list4.contains(schedulePlan.getUuid())) {
                        schedulePlanDao = scheduleService4.schedulePlanDao;
                        anonymousClass1.L$0 = scheduleService4;
                        anonymousClass1.L$1 = scheduleBackupData5;
                        anonymousClass1.L$2 = str3;
                        anonymousClass1.L$3 = list4;
                        anonymousClass1.L$4 = list7;
                        anonymousClass1.L$5 = list5;
                        anonymousClass1.L$6 = it6;
                        anonymousClass1.L$7 = null;
                        anonymousClass1.label = 6;
                        if (schedulePlanDao.insert(schedulePlan, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                List<ScheduleDuty> dutyList6 = scheduleBackupData5.getDutyList();
                arrayList10 = new ArrayList();
                while (r13.hasNext()) {
                    if (Intrinsics.areEqual(((ScheduleDuty) obj3).getProjectUuid(), str3)) {
                        arrayList10.add(obj3);
                    }
                }
                it7 = arrayList10.iterator();
                str4 = str3;
                scheduleBackupData6 = scheduleBackupData5;
                scheduleService5 = scheduleService4;
                while (it7.hasNext()) {
                    scheduleDuty = (ScheduleDuty) it7.next();
                    if (list7.contains(scheduleDuty.getUuid())) {
                        scheduleDutyDao = scheduleService5.scheduleDutyDao;
                        anonymousClass1.L$0 = scheduleService5;
                        anonymousClass1.L$1 = scheduleBackupData6;
                        anonymousClass1.L$2 = str4;
                        anonymousClass1.L$3 = list7;
                        anonymousClass1.L$4 = list5;
                        anonymousClass1.L$5 = it7;
                        anonymousClass1.L$6 = null;
                        anonymousClass1.L$7 = null;
                        anonymousClass1.label = 7;
                        if (scheduleDutyDao.insert(scheduleDuty, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                List<ScheduleAlarm> alarmList6 = scheduleBackupData6.getAlarmList();
                arrayList11 = new ArrayList();
                while (r13.hasNext()) {
                    if (Intrinsics.areEqual(((ScheduleAlarm) obj4).getProjectUuid(), str4)) {
                        arrayList11.add(obj4);
                    }
                }
                it8 = arrayList11.iterator();
                scheduleService6 = scheduleService5;
                while (it8.hasNext()) {
                    scheduleAlarm = (ScheduleAlarm) it8.next();
                    if (list5.contains(scheduleAlarm.getUuid())) {
                        scheduleAlarmDao = scheduleService6.alarmDao;
                        anonymousClass1.L$0 = scheduleService6;
                        anonymousClass1.L$1 = list5;
                        anonymousClass1.L$2 = it8;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.L$4 = null;
                        anonymousClass1.L$5 = null;
                        anonymousClass1.L$6 = null;
                        anonymousClass1.L$7 = null;
                        anonymousClass1.label = 8;
                        if (scheduleAlarmDao.insert(scheduleAlarm, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 6:
                it6 = (Iterator) anonymousClass1.L$6;
                list5 = (List) anonymousClass1.L$5;
                list7 = (List) anonymousClass1.L$4;
                list4 = (List) anonymousClass1.L$3;
                str3 = (String) anonymousClass1.L$2;
                scheduleBackupData5 = (ScheduleBackupData) anonymousClass1.L$1;
                scheduleService4 = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objListByProject2);
                while (it6.hasNext()) {
                    schedulePlan = (SchedulePlan) it6.next();
                    if (list4.contains(schedulePlan.getUuid())) {
                        schedulePlanDao = scheduleService4.schedulePlanDao;
                        anonymousClass1.L$0 = scheduleService4;
                        anonymousClass1.L$1 = scheduleBackupData5;
                        anonymousClass1.L$2 = str3;
                        anonymousClass1.L$3 = list4;
                        anonymousClass1.L$4 = list7;
                        anonymousClass1.L$5 = list5;
                        anonymousClass1.L$6 = it6;
                        anonymousClass1.L$7 = null;
                        anonymousClass1.label = 6;
                        if (schedulePlanDao.insert(schedulePlan, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                List<ScheduleDuty> dutyList7 = scheduleBackupData5.getDutyList();
                arrayList10 = new ArrayList();
                while (r13.hasNext()) {
                    if (Intrinsics.areEqual(((ScheduleDuty) obj3).getProjectUuid(), str3)) {
                        arrayList10.add(obj3);
                    }
                }
                it7 = arrayList10.iterator();
                str4 = str3;
                scheduleBackupData6 = scheduleBackupData5;
                scheduleService5 = scheduleService4;
                while (it7.hasNext()) {
                    scheduleDuty = (ScheduleDuty) it7.next();
                    if (list7.contains(scheduleDuty.getUuid())) {
                        scheduleDutyDao = scheduleService5.scheduleDutyDao;
                        anonymousClass1.L$0 = scheduleService5;
                        anonymousClass1.L$1 = scheduleBackupData6;
                        anonymousClass1.L$2 = str4;
                        anonymousClass1.L$3 = list7;
                        anonymousClass1.L$4 = list5;
                        anonymousClass1.L$5 = it7;
                        anonymousClass1.L$6 = null;
                        anonymousClass1.L$7 = null;
                        anonymousClass1.label = 7;
                        if (scheduleDutyDao.insert(scheduleDuty, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                List<ScheduleAlarm> alarmList7 = scheduleBackupData6.getAlarmList();
                arrayList11 = new ArrayList();
                while (r13.hasNext()) {
                    if (Intrinsics.areEqual(((ScheduleAlarm) obj4).getProjectUuid(), str4)) {
                        arrayList11.add(obj4);
                    }
                }
                it8 = arrayList11.iterator();
                scheduleService6 = scheduleService5;
                while (it8.hasNext()) {
                    scheduleAlarm = (ScheduleAlarm) it8.next();
                    if (list5.contains(scheduleAlarm.getUuid())) {
                        scheduleAlarmDao = scheduleService6.alarmDao;
                        anonymousClass1.L$0 = scheduleService6;
                        anonymousClass1.L$1 = list5;
                        anonymousClass1.L$2 = it8;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.L$4 = null;
                        anonymousClass1.L$5 = null;
                        anonymousClass1.L$6 = null;
                        anonymousClass1.L$7 = null;
                        anonymousClass1.label = 8;
                        if (scheduleAlarmDao.insert(scheduleAlarm, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 7:
                it7 = (Iterator) anonymousClass1.L$5;
                list5 = (List) anonymousClass1.L$4;
                list7 = (List) anonymousClass1.L$3;
                str4 = (String) anonymousClass1.L$2;
                scheduleBackupData6 = (ScheduleBackupData) anonymousClass1.L$1;
                scheduleService5 = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objListByProject2);
                while (it7.hasNext()) {
                    scheduleDuty = (ScheduleDuty) it7.next();
                    if (list7.contains(scheduleDuty.getUuid())) {
                        scheduleDutyDao = scheduleService5.scheduleDutyDao;
                        anonymousClass1.L$0 = scheduleService5;
                        anonymousClass1.L$1 = scheduleBackupData6;
                        anonymousClass1.L$2 = str4;
                        anonymousClass1.L$3 = list7;
                        anonymousClass1.L$4 = list5;
                        anonymousClass1.L$5 = it7;
                        anonymousClass1.L$6 = null;
                        anonymousClass1.L$7 = null;
                        anonymousClass1.label = 7;
                        if (scheduleDutyDao.insert(scheduleDuty, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                List<ScheduleAlarm> alarmList8 = scheduleBackupData6.getAlarmList();
                arrayList11 = new ArrayList();
                while (r13.hasNext()) {
                    if (Intrinsics.areEqual(((ScheduleAlarm) obj4).getProjectUuid(), str4)) {
                        arrayList11.add(obj4);
                    }
                }
                it8 = arrayList11.iterator();
                scheduleService6 = scheduleService5;
                while (it8.hasNext()) {
                    scheduleAlarm = (ScheduleAlarm) it8.next();
                    if (list5.contains(scheduleAlarm.getUuid())) {
                        scheduleAlarmDao = scheduleService6.alarmDao;
                        anonymousClass1.L$0 = scheduleService6;
                        anonymousClass1.L$1 = list5;
                        anonymousClass1.L$2 = it8;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.L$4 = null;
                        anonymousClass1.L$5 = null;
                        anonymousClass1.L$6 = null;
                        anonymousClass1.L$7 = null;
                        anonymousClass1.label = 8;
                        if (scheduleAlarmDao.insert(scheduleAlarm, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 8:
                it8 = (Iterator) anonymousClass1.L$2;
                list5 = (List) anonymousClass1.L$1;
                scheduleService6 = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objListByProject2);
                while (it8.hasNext()) {
                    scheduleAlarm = (ScheduleAlarm) it8.next();
                    if (list5.contains(scheduleAlarm.getUuid())) {
                        scheduleAlarmDao = scheduleService6.alarmDao;
                        anonymousClass1.L$0 = scheduleService6;
                        anonymousClass1.L$1 = list5;
                        anonymousClass1.L$2 = it8;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.L$4 = null;
                        anonymousClass1.L$5 = null;
                        anonymousClass1.L$6 = null;
                        anonymousClass1.L$7 = null;
                        anonymousClass1.label = 8;
                        if (scheduleAlarmDao.insert(scheduleAlarm, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object tryInitProject(Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        ScheduleService scheduleService;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object list = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(list);
            ScheduleProjectDao scheduleProjectDao = this.scheduleProjectDao;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            list = scheduleProjectDao.list(anonymousClass1);
            if (list == coroutine_suspended) {
                return coroutine_suspended;
            }
            scheduleService = this;
        } else {
            if (i == 1) {
                scheduleService = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(list);
            } else if (i == 2) {
                scheduleService = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(list);
                anonymousClass1.L$0 = null;
                anonymousClass1.label = 3;
                if (scheduleService.setProjectId("default", anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(list);
            }
            return Unit.INSTANCE;
        }
        if (!((List) list).isEmpty()) {
            return Unit.INSTANCE;
        }
        ScheduleProjectDao scheduleProjectDao2 = scheduleService.scheduleProjectDao;
        ScheduleProject scheduleProject = new ScheduleProject("default", "默认项目", null, null, 0, 0, false, null, null, null, null, 0, null, 8172, null);
        anonymousClass1.L$0 = scheduleService;
        anonymousClass1.label = 2;
        if (scheduleProjectDao2.insert(scheduleProject, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 3;
        if (scheduleService.setProjectId("default", anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object listCurrentWorkData(Continuation<? super List<ScheduleWork>> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        ScheduleWorkDao scheduleWorkDao;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object projectId = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i != 0) {
            if (i == 1) {
                scheduleWorkDao = (ScheduleWorkDao) anonymousClass1.L$0;
                ResultKt.throwOnFailure(projectId);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(projectId);
            }
        }
        ResultKt.throwOnFailure(projectId);
        scheduleWorkDao = this.scheduleWorkDao;
        anonymousClass1.L$0 = scheduleWorkDao;
        anonymousClass1.label = 1;
        projectId = getProjectId(anonymousClass1);
        if (projectId == coroutine_suspended) {
            return coroutine_suspended;
        }
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 2;
        projectId = scheduleWorkDao.listByProject((String) projectId, anonymousClass1);
        return projectId == coroutine_suspended ? coroutine_suspended : projectId;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object listCurrentPlanData(Continuation<? super List<SchedulePlan>> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        SchedulePlanDao schedulePlanDao;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object projectId = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i != 0) {
            if (i == 1) {
                schedulePlanDao = (SchedulePlanDao) anonymousClass1.L$0;
                ResultKt.throwOnFailure(projectId);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(projectId);
            }
        }
        ResultKt.throwOnFailure(projectId);
        schedulePlanDao = this.schedulePlanDao;
        anonymousClass1.L$0 = schedulePlanDao;
        anonymousClass1.label = 1;
        projectId = getProjectId(anonymousClass1);
        if (projectId == coroutine_suspended) {
            return coroutine_suspended;
        }
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 2;
        projectId = schedulePlanDao.listByProject((String) projectId, anonymousClass1);
        return projectId == coroutine_suspended ? coroutine_suspended : projectId;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object listCurrentAlarmData(Continuation<? super List<ScheduleAlarm>> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        ScheduleAlarmDao scheduleAlarmDao;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object projectId = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i != 0) {
            if (i == 1) {
                scheduleAlarmDao = (ScheduleAlarmDao) anonymousClass1.L$0;
                ResultKt.throwOnFailure(projectId);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(projectId);
            }
        }
        ResultKt.throwOnFailure(projectId);
        scheduleAlarmDao = this.alarmDao;
        anonymousClass1.L$0 = scheduleAlarmDao;
        anonymousClass1.label = 1;
        projectId = getProjectId(anonymousClass1);
        if (projectId == coroutine_suspended) {
            return coroutine_suspended;
        }
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 2;
        projectId = scheduleAlarmDao.listByProject((String) projectId, anonymousClass1);
        return projectId == coroutine_suspended ? coroutine_suspended : projectId;
    }

    public final Object getConfig(Continuation<? super ScheduleConfig> continuation) {
        return this.configDao.get(continuation);
    }

    public static /* synthetic */ Object getWidgetDataModel$default(ScheduleService scheduleService, String str, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return scheduleService.getWidgetDataModel(str, i, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0138 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0139  */
    /* JADX WARN: Code duplicated, block: B:28:0x0177 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0178  */
    /* JADX WARN: Code duplicated, block: B:32:0x01b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:36:0x01ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:40:0x0204 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0205  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object getWidgetDataModel(String str, int i, Continuation<? super WidgetDataModel> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        ScheduleService scheduleService;
        WidgetDataModel widgetDataModel;
        Date date;
        Map<String, FestivalData> map;
        Object config;
        ScheduleService scheduleService2;
        Date date2;
        Map<String, FestivalData> map2;
        ScheduleConfig scheduleConfig;
        Object widgetConfig;
        ScheduleConfig scheduleConfig2;
        WidgetDataModel widgetDataModel2;
        Date date3;
        ScheduleService scheduleService3;
        String str2;
        Object objListByPeriod;
        String str3;
        List<ScheduleDuty> list;
        Object objListByProject;
        List<ScheduleDuty> list2;
        WidgetDataModel widgetDataModel3;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object projectId = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (anonymousClass1.label) {
            case 0:
                ResultKt.throwOnFailure(projectId);
                Date dateGapMonth = MyDateTool.gapMonth(MyDateTool.parseDate(str), i);
                String now = MyDateTool.toDateString(dateGapMonth);
                WidgetDataModel widgetDataModel4 = new WidgetDataModel(null, null, null, null, null, null, null, null, null, null, IEEEDouble.EXPONENT_BIAS, null);
                Intrinsics.checkNotNullExpressionValue(now, "now");
                widgetDataModel4.setDate(now);
                String str4 = MyDateTool.format(dateGapMonth, MyDateTool.PATTERN_MONTH_ONLY);
                Intrinsics.checkNotNullExpressionValue(str4, "format(currentDate, PATTERN_MONTH_ONLY)");
                widgetDataModel4.setMonth(str4);
                String str5 = MyDateTool.format(dateGapMonth, MyDateTool.PATTERN_YEAR_CHINESE);
                Intrinsics.checkNotNullExpressionValue(str5, "format(currentDate, PATTERN_YEAR_CHINESE)");
                widgetDataModel4.setYear(str5);
                String str6 = MyDateTool.format(dateGapMonth, MyDateTool.PATTERN_DAY_CHINESE);
                Intrinsics.checkNotNullExpressionValue(str6, "format(currentDate, PATTERN_DAY_CHINESE)");
                widgetDataModel4.setDay(str6);
                BaseRepository baseRepository = this.baseRepository;
                int year = MyDateTool.getYear(new Date());
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = dateGapMonth;
                anonymousClass1.L$2 = widgetDataModel4;
                anonymousClass1.label = 1;
                Object objFetchHoliday = baseRepository.fetchHoliday(year, anonymousClass1);
                if (objFetchHoliday == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleService = this;
                widgetDataModel = widgetDataModel4;
                date = dateGapMonth;
                projectId = objFetchHoliday;
                map = (Map) projectId;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = date;
                anonymousClass1.L$2 = widgetDataModel;
                anonymousClass1.L$3 = map;
                anonymousClass1.label = 2;
                config = scheduleService.getConfig(anonymousClass1);
                if (config == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleService2 = scheduleService;
                date2 = date;
                map2 = map;
                projectId = config;
                scheduleConfig = (ScheduleConfig) projectId;
                List<List<MonthDateInfo>> monthInfos = MyDateTool.getMonthInfo(date2, scheduleConfig.isMondayFirst(), (Map) CommonToolKt.ifv(scheduleConfig.getShowFestival(), map2, MapsKt.emptyMap()), scheduleConfig.getFillCalendar());
                Intrinsics.checkNotNullExpressionValue(monthInfos, "monthInfos");
                widgetDataModel.setMonthInfos(monthInfos);
                widgetDataModel.setHolidayMap(map2);
                BaseRepository baseRepository2 = scheduleService2.baseRepository;
                anonymousClass1.L$0 = scheduleService2;
                anonymousClass1.L$1 = date2;
                anonymousClass1.L$2 = widgetDataModel;
                anonymousClass1.L$3 = scheduleConfig;
                anonymousClass1.label = 3;
                widgetConfig = baseRepository2.getWidgetConfig(anonymousClass1);
                if (widgetConfig == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleConfig2 = scheduleConfig;
                projectId = widgetConfig;
                WidgetConfig widgetConfig2 = (WidgetConfig) projectId;
                widgetConfig2.setShowLunar(scheduleConfig2.getShowLunar());
                widgetConfig2.setShowFestival(scheduleConfig2.getShowFestival());
                widgetConfig2.setMondayFirst(scheduleConfig2.isMondayFirst());
                widgetConfig2.setShowLine(scheduleConfig2.getShowHLine());
                widgetDataModel.setWidgetConfig(widgetConfig2);
                anonymousClass1.L$0 = scheduleService2;
                anonymousClass1.L$1 = date2;
                anonymousClass1.L$2 = widgetDataModel;
                anonymousClass1.L$3 = null;
                anonymousClass1.label = 4;
                projectId = scheduleService2.getProjectId(anonymousClass1);
                if (projectId == coroutine_suspended) {
                    return coroutine_suspended;
                }
                widgetDataModel2 = widgetDataModel;
                date3 = date2;
                scheduleService3 = scheduleService2;
                str2 = (String) projectId;
                Date startDayOfMonth = MyDateTool.getStartDayOfMonth(date3);
                Intrinsics.checkNotNullExpressionValue(startDayOfMonth, "getStartDayOfMonth(currentDate)");
                String strDateStr = CommonDateToolKt.dateStr(startDayOfMonth);
                String lastDayStringOfMonth = MyDateTool.getLastDayStringOfMonth(date3);
                Intrinsics.checkNotNullExpressionValue(lastDayStringOfMonth, "getLastDayStringOfMonth(currentDate)");
                RangeDate rangeDate = new RangeDate(strDateStr, lastDayStringOfMonth);
                ScheduleDutyDao scheduleDutyDao = scheduleService3.scheduleDutyDao;
                String beginDate = rangeDate.getBeginDate();
                String endDate = rangeDate.getEndDate();
                anonymousClass1.L$0 = scheduleService3;
                anonymousClass1.L$1 = widgetDataModel2;
                anonymousClass1.L$2 = str2;
                anonymousClass1.label = 5;
                objListByPeriod = scheduleDutyDao.listByPeriod(str2, beginDate, endDate, anonymousClass1);
                if (objListByPeriod == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str3 = str2;
                projectId = objListByPeriod;
                list = (List) projectId;
                ScheduleWorkDao scheduleWorkDao = scheduleService3.scheduleWorkDao;
                anonymousClass1.L$0 = widgetDataModel2;
                anonymousClass1.L$1 = list;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 6;
                objListByProject = scheduleWorkDao.listByProject(str3, anonymousClass1);
                if (objListByProject == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list2 = list;
                projectId = objListByProject;
                widgetDataModel3 = widgetDataModel2;
                widgetDataModel3.setDutys(list2);
                widgetDataModel3.setWorks((List) projectId);
                return widgetDataModel3;
            case 1:
                WidgetDataModel widgetDataModel5 = (WidgetDataModel) anonymousClass1.L$2;
                Date date4 = (Date) anonymousClass1.L$1;
                scheduleService = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(projectId);
                widgetDataModel = widgetDataModel5;
                date = date4;
                map = (Map) projectId;
                anonymousClass1.L$0 = scheduleService;
                anonymousClass1.L$1 = date;
                anonymousClass1.L$2 = widgetDataModel;
                anonymousClass1.L$3 = map;
                anonymousClass1.label = 2;
                config = scheduleService.getConfig(anonymousClass1);
                if (config == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleService2 = scheduleService;
                date2 = date;
                map2 = map;
                projectId = config;
                scheduleConfig = (ScheduleConfig) projectId;
                List<List<MonthDateInfo>> monthInfos2 = MyDateTool.getMonthInfo(date2, scheduleConfig.isMondayFirst(), (Map) CommonToolKt.ifv(scheduleConfig.getShowFestival(), map2, MapsKt.emptyMap()), scheduleConfig.getFillCalendar());
                Intrinsics.checkNotNullExpressionValue(monthInfos2, "monthInfos");
                widgetDataModel.setMonthInfos(monthInfos2);
                widgetDataModel.setHolidayMap(map2);
                BaseRepository baseRepository3 = scheduleService2.baseRepository;
                anonymousClass1.L$0 = scheduleService2;
                anonymousClass1.L$1 = date2;
                anonymousClass1.L$2 = widgetDataModel;
                anonymousClass1.L$3 = scheduleConfig;
                anonymousClass1.label = 3;
                widgetConfig = baseRepository3.getWidgetConfig(anonymousClass1);
                if (widgetConfig == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleConfig2 = scheduleConfig;
                projectId = widgetConfig;
                WidgetConfig widgetConfig3 = (WidgetConfig) projectId;
                widgetConfig3.setShowLunar(scheduleConfig2.getShowLunar());
                widgetConfig3.setShowFestival(scheduleConfig2.getShowFestival());
                widgetConfig3.setMondayFirst(scheduleConfig2.isMondayFirst());
                widgetConfig3.setShowLine(scheduleConfig2.getShowHLine());
                widgetDataModel.setWidgetConfig(widgetConfig3);
                anonymousClass1.L$0 = scheduleService2;
                anonymousClass1.L$1 = date2;
                anonymousClass1.L$2 = widgetDataModel;
                anonymousClass1.L$3 = null;
                anonymousClass1.label = 4;
                projectId = scheduleService2.getProjectId(anonymousClass1);
                if (projectId == coroutine_suspended) {
                    return coroutine_suspended;
                }
                widgetDataModel2 = widgetDataModel;
                date3 = date2;
                scheduleService3 = scheduleService2;
                str2 = (String) projectId;
                Date startDayOfMonth2 = MyDateTool.getStartDayOfMonth(date3);
                Intrinsics.checkNotNullExpressionValue(startDayOfMonth2, "getStartDayOfMonth(currentDate)");
                String strDateStr2 = CommonDateToolKt.dateStr(startDayOfMonth2);
                String lastDayStringOfMonth2 = MyDateTool.getLastDayStringOfMonth(date3);
                Intrinsics.checkNotNullExpressionValue(lastDayStringOfMonth2, "getLastDayStringOfMonth(currentDate)");
                RangeDate rangeDate2 = new RangeDate(strDateStr2, lastDayStringOfMonth2);
                ScheduleDutyDao scheduleDutyDao2 = scheduleService3.scheduleDutyDao;
                String beginDate2 = rangeDate2.getBeginDate();
                String endDate2 = rangeDate2.getEndDate();
                anonymousClass1.L$0 = scheduleService3;
                anonymousClass1.L$1 = widgetDataModel2;
                anonymousClass1.L$2 = str2;
                anonymousClass1.label = 5;
                objListByPeriod = scheduleDutyDao2.listByPeriod(str2, beginDate2, endDate2, anonymousClass1);
                if (objListByPeriod == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str3 = str2;
                projectId = objListByPeriod;
                list = (List) projectId;
                ScheduleWorkDao scheduleWorkDao2 = scheduleService3.scheduleWorkDao;
                anonymousClass1.L$0 = widgetDataModel2;
                anonymousClass1.L$1 = list;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 6;
                objListByProject = scheduleWorkDao2.listByProject(str3, anonymousClass1);
                if (objListByProject == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list2 = list;
                projectId = objListByProject;
                widgetDataModel3 = widgetDataModel2;
                widgetDataModel3.setDutys(list2);
                widgetDataModel3.setWorks((List) projectId);
                return widgetDataModel3;
            case 2:
                map2 = (Map) anonymousClass1.L$3;
                widgetDataModel = (WidgetDataModel) anonymousClass1.L$2;
                date2 = (Date) anonymousClass1.L$1;
                scheduleService2 = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(projectId);
                scheduleConfig = (ScheduleConfig) projectId;
                List<List<MonthDateInfo>> monthInfos3 = MyDateTool.getMonthInfo(date2, scheduleConfig.isMondayFirst(), (Map) CommonToolKt.ifv(scheduleConfig.getShowFestival(), map2, MapsKt.emptyMap()), scheduleConfig.getFillCalendar());
                Intrinsics.checkNotNullExpressionValue(monthInfos3, "monthInfos");
                widgetDataModel.setMonthInfos(monthInfos3);
                widgetDataModel.setHolidayMap(map2);
                BaseRepository baseRepository4 = scheduleService2.baseRepository;
                anonymousClass1.L$0 = scheduleService2;
                anonymousClass1.L$1 = date2;
                anonymousClass1.L$2 = widgetDataModel;
                anonymousClass1.L$3 = scheduleConfig;
                anonymousClass1.label = 3;
                widgetConfig = baseRepository4.getWidgetConfig(anonymousClass1);
                if (widgetConfig == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleConfig2 = scheduleConfig;
                projectId = widgetConfig;
                WidgetConfig widgetConfig4 = (WidgetConfig) projectId;
                widgetConfig4.setShowLunar(scheduleConfig2.getShowLunar());
                widgetConfig4.setShowFestival(scheduleConfig2.getShowFestival());
                widgetConfig4.setMondayFirst(scheduleConfig2.isMondayFirst());
                widgetConfig4.setShowLine(scheduleConfig2.getShowHLine());
                widgetDataModel.setWidgetConfig(widgetConfig4);
                anonymousClass1.L$0 = scheduleService2;
                anonymousClass1.L$1 = date2;
                anonymousClass1.L$2 = widgetDataModel;
                anonymousClass1.L$3 = null;
                anonymousClass1.label = 4;
                projectId = scheduleService2.getProjectId(anonymousClass1);
                if (projectId == coroutine_suspended) {
                    return coroutine_suspended;
                }
                widgetDataModel2 = widgetDataModel;
                date3 = date2;
                scheduleService3 = scheduleService2;
                str2 = (String) projectId;
                Date startDayOfMonth3 = MyDateTool.getStartDayOfMonth(date3);
                Intrinsics.checkNotNullExpressionValue(startDayOfMonth3, "getStartDayOfMonth(currentDate)");
                String strDateStr3 = CommonDateToolKt.dateStr(startDayOfMonth3);
                String lastDayStringOfMonth3 = MyDateTool.getLastDayStringOfMonth(date3);
                Intrinsics.checkNotNullExpressionValue(lastDayStringOfMonth3, "getLastDayStringOfMonth(currentDate)");
                RangeDate rangeDate3 = new RangeDate(strDateStr3, lastDayStringOfMonth3);
                ScheduleDutyDao scheduleDutyDao3 = scheduleService3.scheduleDutyDao;
                String beginDate3 = rangeDate3.getBeginDate();
                String endDate3 = rangeDate3.getEndDate();
                anonymousClass1.L$0 = scheduleService3;
                anonymousClass1.L$1 = widgetDataModel2;
                anonymousClass1.L$2 = str2;
                anonymousClass1.label = 5;
                objListByPeriod = scheduleDutyDao3.listByPeriod(str2, beginDate3, endDate3, anonymousClass1);
                if (objListByPeriod == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str3 = str2;
                projectId = objListByPeriod;
                list = (List) projectId;
                ScheduleWorkDao scheduleWorkDao3 = scheduleService3.scheduleWorkDao;
                anonymousClass1.L$0 = widgetDataModel2;
                anonymousClass1.L$1 = list;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 6;
                objListByProject = scheduleWorkDao3.listByProject(str3, anonymousClass1);
                if (objListByProject == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list2 = list;
                projectId = objListByProject;
                widgetDataModel3 = widgetDataModel2;
                widgetDataModel3.setDutys(list2);
                widgetDataModel3.setWorks((List) projectId);
                return widgetDataModel3;
            case 3:
                scheduleConfig2 = (ScheduleConfig) anonymousClass1.L$3;
                widgetDataModel = (WidgetDataModel) anonymousClass1.L$2;
                date2 = (Date) anonymousClass1.L$1;
                scheduleService2 = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(projectId);
                WidgetConfig widgetConfig5 = (WidgetConfig) projectId;
                widgetConfig5.setShowLunar(scheduleConfig2.getShowLunar());
                widgetConfig5.setShowFestival(scheduleConfig2.getShowFestival());
                widgetConfig5.setMondayFirst(scheduleConfig2.isMondayFirst());
                widgetConfig5.setShowLine(scheduleConfig2.getShowHLine());
                widgetDataModel.setWidgetConfig(widgetConfig5);
                anonymousClass1.L$0 = scheduleService2;
                anonymousClass1.L$1 = date2;
                anonymousClass1.L$2 = widgetDataModel;
                anonymousClass1.L$3 = null;
                anonymousClass1.label = 4;
                projectId = scheduleService2.getProjectId(anonymousClass1);
                if (projectId == coroutine_suspended) {
                    return coroutine_suspended;
                }
                widgetDataModel2 = widgetDataModel;
                date3 = date2;
                scheduleService3 = scheduleService2;
                str2 = (String) projectId;
                Date startDayOfMonth4 = MyDateTool.getStartDayOfMonth(date3);
                Intrinsics.checkNotNullExpressionValue(startDayOfMonth4, "getStartDayOfMonth(currentDate)");
                String strDateStr4 = CommonDateToolKt.dateStr(startDayOfMonth4);
                String lastDayStringOfMonth4 = MyDateTool.getLastDayStringOfMonth(date3);
                Intrinsics.checkNotNullExpressionValue(lastDayStringOfMonth4, "getLastDayStringOfMonth(currentDate)");
                RangeDate rangeDate4 = new RangeDate(strDateStr4, lastDayStringOfMonth4);
                ScheduleDutyDao scheduleDutyDao4 = scheduleService3.scheduleDutyDao;
                String beginDate4 = rangeDate4.getBeginDate();
                String endDate4 = rangeDate4.getEndDate();
                anonymousClass1.L$0 = scheduleService3;
                anonymousClass1.L$1 = widgetDataModel2;
                anonymousClass1.L$2 = str2;
                anonymousClass1.label = 5;
                objListByPeriod = scheduleDutyDao4.listByPeriod(str2, beginDate4, endDate4, anonymousClass1);
                if (objListByPeriod == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str3 = str2;
                projectId = objListByPeriod;
                list = (List) projectId;
                ScheduleWorkDao scheduleWorkDao4 = scheduleService3.scheduleWorkDao;
                anonymousClass1.L$0 = widgetDataModel2;
                anonymousClass1.L$1 = list;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 6;
                objListByProject = scheduleWorkDao4.listByProject(str3, anonymousClass1);
                if (objListByProject == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list2 = list;
                projectId = objListByProject;
                widgetDataModel3 = widgetDataModel2;
                widgetDataModel3.setDutys(list2);
                widgetDataModel3.setWorks((List) projectId);
                return widgetDataModel3;
            case 4:
                widgetDataModel2 = (WidgetDataModel) anonymousClass1.L$2;
                date3 = (Date) anonymousClass1.L$1;
                scheduleService3 = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(projectId);
                str2 = (String) projectId;
                Date startDayOfMonth5 = MyDateTool.getStartDayOfMonth(date3);
                Intrinsics.checkNotNullExpressionValue(startDayOfMonth5, "getStartDayOfMonth(currentDate)");
                String strDateStr5 = CommonDateToolKt.dateStr(startDayOfMonth5);
                String lastDayStringOfMonth5 = MyDateTool.getLastDayStringOfMonth(date3);
                Intrinsics.checkNotNullExpressionValue(lastDayStringOfMonth5, "getLastDayStringOfMonth(currentDate)");
                RangeDate rangeDate5 = new RangeDate(strDateStr5, lastDayStringOfMonth5);
                ScheduleDutyDao scheduleDutyDao5 = scheduleService3.scheduleDutyDao;
                String beginDate5 = rangeDate5.getBeginDate();
                String endDate5 = rangeDate5.getEndDate();
                anonymousClass1.L$0 = scheduleService3;
                anonymousClass1.L$1 = widgetDataModel2;
                anonymousClass1.L$2 = str2;
                anonymousClass1.label = 5;
                objListByPeriod = scheduleDutyDao5.listByPeriod(str2, beginDate5, endDate5, anonymousClass1);
                if (objListByPeriod == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str3 = str2;
                projectId = objListByPeriod;
                list = (List) projectId;
                ScheduleWorkDao scheduleWorkDao5 = scheduleService3.scheduleWorkDao;
                anonymousClass1.L$0 = widgetDataModel2;
                anonymousClass1.L$1 = list;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 6;
                objListByProject = scheduleWorkDao5.listByProject(str3, anonymousClass1);
                if (objListByProject == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list2 = list;
                projectId = objListByProject;
                widgetDataModel3 = widgetDataModel2;
                widgetDataModel3.setDutys(list2);
                widgetDataModel3.setWorks((List) projectId);
                return widgetDataModel3;
            case 5:
                String str7 = (String) anonymousClass1.L$2;
                WidgetDataModel widgetDataModel6 = (WidgetDataModel) anonymousClass1.L$1;
                scheduleService3 = (ScheduleService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(projectId);
                str3 = str7;
                widgetDataModel2 = widgetDataModel6;
                list = (List) projectId;
                ScheduleWorkDao scheduleWorkDao6 = scheduleService3.scheduleWorkDao;
                anonymousClass1.L$0 = widgetDataModel2;
                anonymousClass1.L$1 = list;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 6;
                objListByProject = scheduleWorkDao6.listByProject(str3, anonymousClass1);
                if (objListByProject == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list2 = list;
                projectId = objListByProject;
                widgetDataModel3 = widgetDataModel2;
                widgetDataModel3.setDutys(list2);
                widgetDataModel3.setWorks((List) projectId);
                return widgetDataModel3;
            case 6:
                list2 = (List) anonymousClass1.L$1;
                widgetDataModel3 = (WidgetDataModel) anonymousClass1.L$0;
                ResultKt.throwOnFailure(projectId);
                widgetDataModel3.setDutys(list2);
                widgetDataModel3.setWorks((List) projectId);
                return widgetDataModel3;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}