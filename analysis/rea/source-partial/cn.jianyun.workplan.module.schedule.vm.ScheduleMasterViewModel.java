package cn.jianyun.workplan.module.schedule.vm;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModelKt;
import cn.jianyun.workplan.api.FestivalData;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.model.MonthDateInfo;
import cn.jianyun.workplan.module.base.vm.BaseViewModel;
import cn.jianyun.workplan.module.schedule.model.ScheduleConfig;
import cn.jianyun.workplan.module.schedule.model.ScheduleDuty;
import cn.jianyun.workplan.module.schedule.model.SchedulePlan;
import cn.jianyun.workplan.module.schedule.model.ScheduleProject;
import cn.jianyun.workplan.module.schedule.model.ScheduleWork;
import cn.jianyun.workplan.module.schedule.views.service.ScheduleService;
import cn.jianyun.workplan.ui.component.model.kt.RangeDate;
import cn.jianyun.workplan.ui.graph.model.PieGraphData;
import cn.jianyun.workplan.ui.graph.model.PieGraphDataKt;
import cn.jianyun.workplan.ui.graph.model.PieGraphItem;
import cn.jianyun.workplan.util.CommonDateToolKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.MyDateTool;
import com.alipay.sdk.m.w.a;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.thegrizzlylabs.sardineandroid.DavPrincipal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.poi.ss.formula.functions.Complex;
import org.apache.xmlbeans.XmlErrorCodes;

/* JADX INFO: compiled from: ScheduleMasterViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b%\b\u0007\u0018\u0000 ¡\u00012\u00020\u0001:\u0002¡\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010|\u001a\u00020}J\u000e\u0010~\u001a\u00020}2\u0006\u0010\u007f\u001a\u00020eJ\u0007\u0010\u0080\u0001\u001a\u00020}J\u0007\u0010\u0081\u0001\u001a\u00020}J\u0007\u0010\u0082\u0001\u001a\u00020,J\u0010\u0010\u0083\u0001\u001a\u00020$2\u0007\u0010\u0084\u0001\u001a\u00020\u001dJ\u0010\u0010\u0085\u0001\u001a\u00020w2\u0007\u0010\u0084\u0001\u001a\u00020\u001dJ\u0010\u0010\u0086\u0001\u001a\u00020w2\u0007\u0010\u0084\u0001\u001a\u00020\u001dJ\u0007\u0010\u0087\u0001\u001a\u00020}J\u0007\u0010\u0088\u0001\u001a\u00020$J\t\u0010\u0089\u0001\u001a\u00020\u0003H\u0016J\u0010\u0010\u008a\u0001\u001a\u00020}2\u0007\u0010\u008b\u0001\u001a\u000203J\u0007\u0010\u008c\u0001\u001a\u00020\bJ\u0010\u0010\u008d\u0001\u001a\u00020\b2\u0007\u0010\u0084\u0001\u001a\u00020\u001dJ\u0007\u0010\u008e\u0001\u001a\u00020\bJ\u0007\u0010\u008f\u0001\u001a\u00020\bJ\u0007\u0010\u0090\u0001\u001a\u00020\bJ\u0007\u0010\u0091\u0001\u001a\u00020\bJ\u0007\u0010\u0092\u0001\u001a\u00020}J\u0010\u0010\u0093\u0001\u001a\u00020}2\u0007\u0010\u0094\u0001\u001a\u00020wJ\u0012\u0010\u0095\u0001\u001a\u00020}2\t\b\u0002\u0010\u0096\u0001\u001a\u00020\bJ\u000f\u0010\u0097\u0001\u001a\u00020}2\u0006\u0010\u007f\u001a\u00020`J\u0007\u0010\u0098\u0001\u001a\u00020}J\t\u0010\u0099\u0001\u001a\u00020}H\u0016J\u0012\u0010\u009a\u0001\u001a\u00020}2\u0007\u0010\u009b\u0001\u001a\u00020\bH\u0016J\u0007\u0010\u009c\u0001\u001a\u00020}J\u0010\u0010\u009d\u0001\u001a\u00020}2\u0007\u0010\u0094\u0001\u001a\u00020wJ\u0010\u0010\u009e\u0001\u001a\u00020\b2\u0007\u0010\u009f\u0001\u001a\u00020$J\u0010\u0010 \u0001\u001a\u00020}2\u0007\u0010\u0094\u0001\u001a\u00020wR+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R+\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\rR+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00168F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u001d8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u000f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010%\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020$8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u000f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R7\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020,0+8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010\u000f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R+\u00104\u001a\u0002032\u0006\u0010\u0007\u001a\u0002038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010\u000f\u001a\u0004\b5\u00106\"\u0004\b7\u00108RC\u0010<\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020;0:2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020;0:8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010\u000f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R+\u0010B\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010\u000f\u001a\u0004\bC\u0010\u000b\"\u0004\bD\u0010\rR+\u0010F\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010\u000f\u001a\u0004\bF\u0010\u000b\"\u0004\bG\u0010\rRC\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0+0+2\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0+0+8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010\u000f\u001a\u0004\bK\u0010/\"\u0004\bL\u00101R+\u0010O\u001a\u00020N2\u0006\u0010\u0007\u001a\u00020N8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bT\u0010\u000f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR7\u0010U\u001a\b\u0012\u0004\u0012\u00020,0+2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020,0+8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bX\u0010\u000f\u001a\u0004\bV\u0010/\"\u0004\bW\u00101R+\u0010Z\u001a\u00020Y2\u0006\u0010\u0007\u001a\u00020Y8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b_\u0010\u000f\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R7\u0010a\u001a\b\u0012\u0004\u0012\u00020`0+2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020`0+8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bd\u0010\u000f\u001a\u0004\bb\u0010/\"\u0004\bc\u00101R7\u0010f\u001a\b\u0012\u0004\u0012\u00020e0+2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020e0+8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bi\u0010\u000f\u001a\u0004\bg\u0010/\"\u0004\bh\u00101R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR+\u0010l\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bo\u0010\u000f\u001a\u0004\bm\u0010\u000b\"\u0004\bn\u0010\rR+\u0010q\u001a\u00020p2\u0006\u0010\u0007\u001a\u00020p8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bv\u0010\u000f\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR7\u0010x\u001a\b\u0012\u0004\u0012\u00020w0+2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020w0+8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b{\u0010\u000f\u001a\u0004\by\u0010/\"\u0004\bz\u00101¨\u0006¢\u0001"}, d2 = {"Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;", "Lcn/jianyun/workplan/module/base/vm/BaseViewModel;", "baseRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "scheduleService", "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;", "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;)V", "<set-?>", "", "adding", "getAdding", "()Z", "setAdding", "(Z)V", "adding$delegate", "Landroidx/compose/runtime/MutableState;", "getBaseRepository", "()Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "clear", "getClear", "setClear", "clear$delegate", "Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;", "config", "getConfig", "()Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;", "setConfig", "(Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;)V", "config$delegate", "Ljava/util/Date;", "currentDate", "getCurrentDate", "()Ljava/util/Date;", "setCurrentDate", "(Ljava/util/Date;)V", "currentDate$delegate", "", "currentProjectName", "getCurrentProjectName", "()Ljava/lang/String;", "setCurrentProjectName", "(Ljava/lang/String;)V", "currentProjectName$delegate", "", "Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;", "dutys", "getDutys", "()Ljava/util/List;", "setDutys", "(Ljava/util/List;)V", "dutys$delegate", "", "gid", "getGid", "()I", "setGid", "(I)V", "gid$delegate", "", "Lcn/jianyun/workplan/api/FestivalData;", "holidayMap", "getHolidayMap", "()Ljava/util/Map;", "setHolidayMap", "(Ljava/util/Map;)V", "holidayMap$delegate", "homeEdit", "getHomeEdit", "setHomeEdit", "homeEdit$delegate", "isEmptyWork", "setEmptyWork", "isEmptyWork$delegate", "Lcn/jianyun/workplan/model/MonthDateInfo;", "monthInfos", "getMonthInfos", "setMonthInfos", "monthInfos$delegate", "Lcn/jianyun/workplan/model/FormType;", "pageType", "getPageType", "()Lcn/jianyun/workplan/model/FormType;", "setPageType", "(Lcn/jianyun/workplan/model/FormType;)V", "pageType$delegate", "periodDutys", "getPeriodDutys", "setPeriodDutys", "periodDutys$delegate", "Lcn/jianyun/workplan/ui/graph/model/PieGraphData;", "pieData", "getPieData", "()Lcn/jianyun/workplan/ui/graph/model/PieGraphData;", "setPieData", "(Lcn/jianyun/workplan/ui/graph/model/PieGraphData;)V", "pieData$delegate", "Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;", "plans", "getPlans", "setPlans", "plans$delegate", "Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;", "projectList", "getProjectList", "setProjectList", "projectList$delegate", "getScheduleService", "()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;", "showConfigHint", "getShowConfigHint", "setShowConfigHint", "showConfigHint$delegate", "Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;", "statModel", "getStatModel", "()Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;", "setStatModel", "(Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;)V", "statModel$delegate", "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;", "works", "getWorks", "setWorks", "works$delegate", "changeConfig", "", "changeProject", "it", "closeConfigHint", "doChange", "fetchDuty", "fetchDutyRemark", XmlErrorCodes.DATE, "fetchDutyWork", "fetchSecondDutyWork", "finish", "getCurrentDateStr", "getRepository", "goDay", "day", "isAlarmPage", "isFocus", "isHomePage", "isSettingPage", "isStatPage", "isWorkPage", "makeClean", "makeDuty", "work", "makeEdit", "toggle", "makePlanDuty", "makeStat", "reload", "reloadData", "dataChanged", "removeCurrentDay", "setFirstWork", "setRemark", "remark", "setSecondWork", "Companion", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ScheduleMasterViewModel extends BaseViewModel {
    private static final String CONFIG_HINT_KEY = "home_config_hint_dismissed";

    /* JADX INFO: renamed from: adding$delegate, reason: from kotlin metadata */
    private final MutableState adding;
    private final BaseRepository baseRepository;

    /* JADX INFO: renamed from: clear$delegate, reason: from kotlin metadata */
    private final MutableState clear;

    /* JADX INFO: renamed from: config$delegate, reason: from kotlin metadata */
    private final MutableState config;

    /* JADX INFO: renamed from: currentDate$delegate, reason: from kotlin metadata */
    private final MutableState currentDate;

    /* JADX INFO: renamed from: currentProjectName$delegate, reason: from kotlin metadata */
    private final MutableState currentProjectName;

    /* JADX INFO: renamed from: dutys$delegate, reason: from kotlin metadata */
    private final MutableState dutys;

    /* JADX INFO: renamed from: gid$delegate, reason: from kotlin metadata */
    private final MutableState gid;

    /* JADX INFO: renamed from: holidayMap$delegate, reason: from kotlin metadata */
    private final MutableState holidayMap;

    /* JADX INFO: renamed from: homeEdit$delegate, reason: from kotlin metadata */
    private final MutableState homeEdit;

    /* JADX INFO: renamed from: isEmptyWork$delegate, reason: from kotlin metadata */
    private final MutableState isEmptyWork;

    /* JADX INFO: renamed from: monthInfos$delegate, reason: from kotlin metadata */
    private final MutableState monthInfos;

    /* JADX INFO: renamed from: pageType$delegate, reason: from kotlin metadata */
    private final MutableState pageType;

    /* JADX INFO: renamed from: periodDutys$delegate, reason: from kotlin metadata */
    private final MutableState periodDutys;

    /* JADX INFO: renamed from: pieData$delegate, reason: from kotlin metadata */
    private final MutableState pieData;

    /* JADX INFO: renamed from: plans$delegate, reason: from kotlin metadata */
    private final MutableState plans;

    /* JADX INFO: renamed from: projectList$delegate, reason: from kotlin metadata */
    private final MutableState projectList;
    private final ScheduleService scheduleService;

    /* JADX INFO: renamed from: showConfigHint$delegate, reason: from kotlin metadata */
    private final MutableState showConfigHint;

    /* JADX INFO: renamed from: statModel$delegate, reason: from kotlin metadata */
    private final MutableState statModel;

    /* JADX INFO: renamed from: works$delegate, reason: from kotlin metadata */
    private final MutableState works;
    public static final int $stable = 8;

    public final BaseRepository getBaseRepository() {
        return this.baseRepository;
    }

    public final ScheduleService getScheduleService() {
        return this.scheduleService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public ScheduleMasterViewModel(BaseRepository baseRepository, ScheduleService scheduleService) {
        Intrinsics.checkNotNullParameter(baseRepository, "baseRepository");
        Intrinsics.checkNotNullParameter(scheduleService, "scheduleService");
        this.baseRepository = baseRepository;
        this.scheduleService = scheduleService;
        this.pageType = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FormType("home", null, null, 6, null), null, 2, null);
        this.works = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
        this.plans = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
        this.dutys = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
        this.periodDutys = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
        this.currentDate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Date(), null, 2, null);
        this.currentProjectName = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.projectList = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
        this.homeEdit = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.gid = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.holidayMap = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
        this.showConfigHint = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        String str = null;
        this.config = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new ScheduleConfig(null == true ? 1 : 0, str, null == true ? 1 : 0, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, 0, null, 67108863, null), null, 2, null);
        this.adding = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.clear = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.isEmptyWork = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        this.monthInfos = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
        this.statModel = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new RangeDate(null, null == true ? 1 : 0, 3, null == true ? 1 : 0), null, 2, null);
        this.pieData = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new PieGraphData(null, null, null == true ? 1 : 0, str, 15, null == true ? 1 : 0), null, 2, null);
        setCurrentPage("ScheduleMasterView");
        reload();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FormType getPageType() {
        return (FormType) this.pageType.getValue();
    }

    public final void setPageType(FormType formType) {
        Intrinsics.checkNotNullParameter(formType, "<set-?>");
        this.pageType.setValue(formType);
    }

    public final List<ScheduleWork> getWorks() {
        return (List) this.works.getValue();
    }

    public final void setWorks(List<ScheduleWork> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.works.setValue(list);
    }

    public final List<SchedulePlan> getPlans() {
        return (List) this.plans.getValue();
    }

    public final void setPlans(List<SchedulePlan> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.plans.setValue(list);
    }

    public final List<ScheduleDuty> getDutys() {
        return (List) this.dutys.getValue();
    }

    public final void setDutys(List<ScheduleDuty> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dutys.setValue(list);
    }

    public final List<ScheduleDuty> getPeriodDutys() {
        return (List) this.periodDutys.getValue();
    }

    public final void setPeriodDutys(List<ScheduleDuty> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.periodDutys.setValue(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Date getCurrentDate() {
        return (Date) this.currentDate.getValue();
    }

    public final void setCurrentDate(Date date) {
        Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.currentDate.setValue(date);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getCurrentProjectName() {
        return (String) this.currentProjectName.getValue();
    }

    public final void setCurrentProjectName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentProjectName.setValue(str);
    }

    public final List<ScheduleProject> getProjectList() {
        return (List) this.projectList.getValue();
    }

    public final void setProjectList(List<ScheduleProject> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.projectList.setValue(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHomeEdit() {
        return ((Boolean) this.homeEdit.getValue()).booleanValue();
    }

    public final void setHomeEdit(boolean z) {
        this.homeEdit.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getGid() {
        return ((Number) this.gid.getValue()).intValue();
    }

    public final void setGid(int i) {
        this.gid.setValue(Integer.valueOf(i));
    }

    public final Map<String, FestivalData> getHolidayMap() {
        return (Map) this.holidayMap.getValue();
    }

    public final void setHolidayMap(Map<String, FestivalData> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.holidayMap.setValue(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowConfigHint() {
        return ((Boolean) this.showConfigHint.getValue()).booleanValue();
    }

    public final void setShowConfigHint(boolean z) {
        this.showConfigHint.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ScheduleConfig getConfig() {
        return (ScheduleConfig) this.config.getValue();
    }

    public final void setConfig(ScheduleConfig scheduleConfig) {
        Intrinsics.checkNotNullParameter(scheduleConfig, "<set-?>");
        this.config.setValue(scheduleConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getAdding() {
        return ((Boolean) this.adding.getValue()).booleanValue();
    }

    public final void setAdding(boolean z) {
        this.adding.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getClear() {
        return ((Boolean) this.clear.getValue()).booleanValue();
    }

    public final void setClear(boolean z) {
        this.clear.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isEmptyWork() {
        return ((Boolean) this.isEmptyWork.getValue()).booleanValue();
    }

    public final void setEmptyWork(boolean z) {
        this.isEmptyWork.setValue(Boolean.valueOf(z));
    }

    public final List<List<MonthDateInfo>> getMonthInfos() {
        return (List) this.monthInfos.getValue();
    }

    public final void setMonthInfos(List<? extends List<MonthDateInfo>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.monthInfos.setValue(list);
    }

    public final String getCurrentDateStr() {
        String dateString = MyDateTool.toDateString(getCurrentDate());
        Intrinsics.checkNotNullExpressionValue(dateString, "toDateString(currentDate)");
        return dateString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RangeDate getStatModel() {
        return (RangeDate) this.statModel.getValue();
    }

    public final void setStatModel(RangeDate rangeDate) {
        Intrinsics.checkNotNullParameter(rangeDate, "<set-?>");
        this.statModel.setValue(rangeDate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PieGraphData getPieData() {
        return (PieGraphData) this.pieData.getValue();
    }

    public final void setPieData(PieGraphData pieGraphData) {
        Intrinsics.checkNotNullParameter(pieGraphData, "<set-?>");
        this.pieData.setValue(pieGraphData);
    }

    public static /* synthetic */ void makeEdit$default(ScheduleMasterViewModel scheduleMasterViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        scheduleMasterViewModel.makeEdit(z);
    }

    public final void makeEdit(boolean toggle) {
        if (toggle && getHomeEdit()) {
            finish();
        } else if (isEmptyWork()) {
            toast("请先设置好班次再来排班");
        } else {
            setHomeEdit(true);
            setFormType(new FormType(DavPrincipal.KEY_SELF, null, null, 6, null));
        }
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseViewModel
    public BaseRepository getRepository() {
        return this.baseRepository;
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$reload$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleMasterViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$reload$1", f = "ScheduleMasterViewModel.kt", i = {}, l = {104, 105, 106, 110, 119, 120, 121, 122, 126, 127, 131}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleMasterViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x008d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:25:0x00ab A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:29:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:35:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:37:0x010d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:39:0x0122  */
        /* JADX WARN: Code duplicated, block: B:42:0x0167 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:45:0x0181 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:48:0x01a5 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:51:0x01ca A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:54:0x01fb A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:57:0x021b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:60:0x0224  */
        /* JADX WARN: Code duplicated, block: B:63:0x0248 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:66:0x00db A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ScheduleMasterViewModel scheduleMasterViewModel;
            ScheduleMasterViewModel scheduleMasterViewModel2;
            ScheduleMasterViewModel scheduleMasterViewModel3;
            Iterator<T> it;
            Object next;
            ScheduleProject scheduleProject;
            ScheduleMasterViewModel scheduleMasterViewModel4;
            ScheduleMasterViewModel scheduleMasterViewModel5;
            ScheduleMasterViewModel scheduleMasterViewModel6;
            ScheduleMasterViewModel scheduleMasterViewModel7;
            ScheduleMasterViewModel scheduleMasterViewModel8;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (ScheduleMasterViewModel.this.getScheduleService().tryInitProject(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel;
                    this.label = 2;
                    obj = scheduleMasterViewModel.getScheduleService().getProjectId(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel.setCurrentProjectId((String) obj);
                    scheduleMasterViewModel2 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel2;
                    this.label = 3;
                    obj = scheduleMasterViewModel2.getScheduleService().getScheduleProjectDao().list(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel2.setProjectList((List) obj);
                    List<ScheduleProject> projectList = ScheduleMasterViewModel.this.getProjectList();
                    scheduleMasterViewModel3 = ScheduleMasterViewModel.this;
                    it = projectList.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        scheduleProject = (ScheduleProject) next;
                        if (scheduleProject == null) {
                            ScheduleMasterViewModel scheduleMasterViewModel9 = ScheduleMasterViewModel.this;
                            scheduleMasterViewModel9.setCurrentProjectId(scheduleMasterViewModel9.getProjectList().get(0).getUuid());
                            this.L$0 = null;
                            this.label = 4;
                            if (ScheduleMasterViewModel.this.getScheduleService().setProjectId(ScheduleMasterViewModel.this.getCurrentProjectId(), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            ScheduleMasterViewModel scheduleMasterViewModel10 = ScheduleMasterViewModel.this;
                            scheduleMasterViewModel10.setCurrentProjectName(scheduleMasterViewModel10.getProjectList().get(0).getName());
                        } else {
                            ScheduleMasterViewModel.this.setCurrentProjectName(scheduleProject.getName());
                        }
                        ScheduleMasterViewModel.this.setFormType(new FormType(DavPrincipal.KEY_SELF, null, null, 6, null));
                        ScheduleMasterViewModel scheduleMasterViewModel11 = ScheduleMasterViewModel.this;
                        scheduleMasterViewModel11.setOldSid(scheduleMasterViewModel11.getBaseRepository().getSid());
                        scheduleMasterViewModel4 = ScheduleMasterViewModel.this;
                        this.L$0 = scheduleMasterViewModel4;
                        this.label = 5;
                        obj = scheduleMasterViewModel4.getBaseRepository().fetchHoliday(MyDateTool.getYear(ScheduleMasterViewModel.this.getCurrentDate()), this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleMasterViewModel4.setHolidayMap((Map) obj);
                        scheduleMasterViewModel5 = ScheduleMasterViewModel.this;
                        this.L$0 = scheduleMasterViewModel5;
                        this.label = 6;
                        obj = scheduleMasterViewModel5.getScheduleService().getConfig(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleMasterViewModel5.setConfig((ScheduleConfig) obj);
                        scheduleMasterViewModel6 = ScheduleMasterViewModel.this;
                        this.L$0 = scheduleMasterViewModel6;
                        this.label = 7;
                        obj = scheduleMasterViewModel6.getScheduleService().getScheduleWorkDao().listByProject(ScheduleMasterViewModel.this.getCurrentProjectId(), this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleMasterViewModel6.setWorks((List) obj);
                        scheduleMasterViewModel7 = ScheduleMasterViewModel.this;
                        this.L$0 = scheduleMasterViewModel7;
                        this.label = 8;
                        obj = scheduleMasterViewModel7.getScheduleService().getSchedulePlanDao().listByProject(ScheduleMasterViewModel.this.getCurrentProjectId(), this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleMasterViewModel7.setPlans((List) obj);
                        ScheduleMasterViewModel scheduleMasterViewModel12 = ScheduleMasterViewModel.this;
                        scheduleMasterViewModel12.setEmptyWork(scheduleMasterViewModel12.getWorks().isEmpty());
                        BaseViewModel.reloadData$default(ScheduleMasterViewModel.this, false, 1, null);
                        scheduleMasterViewModel8 = ScheduleMasterViewModel.this;
                        this.L$0 = scheduleMasterViewModel8;
                        this.label = 9;
                        obj = scheduleMasterViewModel8.getBaseRepository().booleanCache(ScheduleMasterViewModel.CONFIG_HINT_KEY, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleMasterViewModel8.setShowConfigHint(!((Boolean) obj).booleanValue());
                        this.L$0 = null;
                        this.label = 10;
                        obj = ScheduleMasterViewModel.this.getBaseRepository().tryUpgrade(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (((Boolean) obj).booleanValue()) {
                            ScheduleMasterViewModel.this.setFormType(new FormType("upgrade", null, null, 6, null));
                        }
                        this.label = 11;
                        if (ScheduleMasterViewModel.this.getScheduleService().tryNotify(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    } while (!Intrinsics.areEqual(((ScheduleProject) next).getUuid(), scheduleMasterViewModel3.getCurrentProjectId()));
                    scheduleProject = (ScheduleProject) next;
                    if (scheduleProject == null) {
                        ScheduleMasterViewModel scheduleMasterViewModel13 = ScheduleMasterViewModel.this;
                        scheduleMasterViewModel13.setCurrentProjectId(scheduleMasterViewModel13.getProjectList().get(0).getUuid());
                        this.L$0 = null;
                        this.label = 4;
                        if (ScheduleMasterViewModel.this.getScheduleService().setProjectId(ScheduleMasterViewModel.this.getCurrentProjectId(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ScheduleMasterViewModel scheduleMasterViewModel14 = ScheduleMasterViewModel.this;
                        scheduleMasterViewModel14.setCurrentProjectName(scheduleMasterViewModel14.getProjectList().get(0).getName());
                    } else {
                        ScheduleMasterViewModel.this.setCurrentProjectName(scheduleProject.getName());
                    }
                    ScheduleMasterViewModel.this.setFormType(new FormType(DavPrincipal.KEY_SELF, null, null, 6, null));
                    ScheduleMasterViewModel scheduleMasterViewModel15 = ScheduleMasterViewModel.this;
                    scheduleMasterViewModel15.setOldSid(scheduleMasterViewModel15.getBaseRepository().getSid());
                    scheduleMasterViewModel4 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel4;
                    this.label = 5;
                    obj = scheduleMasterViewModel4.getBaseRepository().fetchHoliday(MyDateTool.getYear(ScheduleMasterViewModel.this.getCurrentDate()), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel4.setHolidayMap((Map) obj);
                    scheduleMasterViewModel5 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel5;
                    this.label = 6;
                    obj = scheduleMasterViewModel5.getScheduleService().getConfig(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel5.setConfig((ScheduleConfig) obj);
                    scheduleMasterViewModel6 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel6;
                    this.label = 7;
                    obj = scheduleMasterViewModel6.getScheduleService().getScheduleWorkDao().listByProject(ScheduleMasterViewModel.this.getCurrentProjectId(), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel6.setWorks((List) obj);
                    scheduleMasterViewModel7 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel7;
                    this.label = 8;
                    obj = scheduleMasterViewModel7.getScheduleService().getSchedulePlanDao().listByProject(ScheduleMasterViewModel.this.getCurrentProjectId(), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel7.setPlans((List) obj);
                    ScheduleMasterViewModel scheduleMasterViewModel16 = ScheduleMasterViewModel.this;
                    scheduleMasterViewModel16.setEmptyWork(scheduleMasterViewModel16.getWorks().isEmpty());
                    BaseViewModel.reloadData$default(ScheduleMasterViewModel.this, false, 1, null);
                    scheduleMasterViewModel8 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel8;
                    this.label = 9;
                    obj = scheduleMasterViewModel8.getBaseRepository().booleanCache(ScheduleMasterViewModel.CONFIG_HINT_KEY, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel8.setShowConfigHint(!((Boolean) obj).booleanValue());
                    this.L$0 = null;
                    this.label = 10;
                    obj = ScheduleMasterViewModel.this.getBaseRepository().tryUpgrade(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        ScheduleMasterViewModel.this.setFormType(new FormType("upgrade", null, null, 6, null));
                    }
                    this.label = 11;
                    if (ScheduleMasterViewModel.this.getScheduleService().tryNotify(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 1:
                    ResultKt.throwOnFailure(obj);
                    scheduleMasterViewModel = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel;
                    this.label = 2;
                    obj = scheduleMasterViewModel.getScheduleService().getProjectId(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel.setCurrentProjectId((String) obj);
                    scheduleMasterViewModel2 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel2;
                    this.label = 3;
                    obj = scheduleMasterViewModel2.getScheduleService().getScheduleProjectDao().list(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel2.setProjectList((List) obj);
                    List<ScheduleProject> projectList2 = ScheduleMasterViewModel.this.getProjectList();
                    scheduleMasterViewModel3 = ScheduleMasterViewModel.this;
                    it = projectList2.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        scheduleProject = (ScheduleProject) next;
                        if (scheduleProject == null) {
                            ScheduleMasterViewModel scheduleMasterViewModel17 = ScheduleMasterViewModel.this;
                            scheduleMasterViewModel17.setCurrentProjectId(scheduleMasterViewModel17.getProjectList().get(0).getUuid());
                            this.L$0 = null;
                            this.label = 4;
                            if (ScheduleMasterViewModel.this.getScheduleService().setProjectId(ScheduleMasterViewModel.this.getCurrentProjectId(), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            ScheduleMasterViewModel scheduleMasterViewModel18 = ScheduleMasterViewModel.this;
                            scheduleMasterViewModel18.setCurrentProjectName(scheduleMasterViewModel18.getProjectList().get(0).getName());
                        } else {
                            ScheduleMasterViewModel.this.setCurrentProjectName(scheduleProject.getName());
                        }
                        ScheduleMasterViewModel.this.setFormType(new FormType(DavPrincipal.KEY_SELF, null, null, 6, null));
                        ScheduleMasterViewModel scheduleMasterViewModel19 = ScheduleMasterViewModel.this;
                        scheduleMasterViewModel19.setOldSid(scheduleMasterViewModel19.getBaseRepository().getSid());
                        scheduleMasterViewModel4 = ScheduleMasterViewModel.this;
                        this.L$0 = scheduleMasterViewModel4;
                        this.label = 5;
                        obj = scheduleMasterViewModel4.getBaseRepository().fetchHoliday(MyDateTool.getYear(ScheduleMasterViewModel.this.getCurrentDate()), this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleMasterViewModel4.setHolidayMap((Map) obj);
                        scheduleMasterViewModel5 = ScheduleMasterViewModel.this;
                        this.L$0 = scheduleMasterViewModel5;
                        this.label = 6;
                        obj = scheduleMasterViewModel5.getScheduleService().getConfig(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleMasterViewModel5.setConfig((ScheduleConfig) obj);
                        scheduleMasterViewModel6 = ScheduleMasterViewModel.this;
                        this.L$0 = scheduleMasterViewModel6;
                        this.label = 7;
                        obj = scheduleMasterViewModel6.getScheduleService().getScheduleWorkDao().listByProject(ScheduleMasterViewModel.this.getCurrentProjectId(), this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleMasterViewModel6.setWorks((List) obj);
                        scheduleMasterViewModel7 = ScheduleMasterViewModel.this;
                        this.L$0 = scheduleMasterViewModel7;
                        this.label = 8;
                        obj = scheduleMasterViewModel7.getScheduleService().getSchedulePlanDao().listByProject(ScheduleMasterViewModel.this.getCurrentProjectId(), this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleMasterViewModel7.setPlans((List) obj);
                        ScheduleMasterViewModel scheduleMasterViewModel110 = ScheduleMasterViewModel.this;
                        scheduleMasterViewModel110.setEmptyWork(scheduleMasterViewModel110.getWorks().isEmpty());
                        BaseViewModel.reloadData$default(ScheduleMasterViewModel.this, false, 1, null);
                        scheduleMasterViewModel8 = ScheduleMasterViewModel.this;
                        this.L$0 = scheduleMasterViewModel8;
                        this.label = 9;
                        obj = scheduleMasterViewModel8.getBaseRepository().booleanCache(ScheduleMasterViewModel.CONFIG_HINT_KEY, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleMasterViewModel8.setShowConfigHint(!((Boolean) obj).booleanValue());
                        this.L$0 = null;
                        this.label = 10;
                        obj = ScheduleMasterViewModel.this.getBaseRepository().tryUpgrade(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (((Boolean) obj).booleanValue()) {
                            ScheduleMasterViewModel.this.setFormType(new FormType("upgrade", null, null, 6, null));
                        }
                        this.label = 11;
                        if (ScheduleMasterViewModel.this.getScheduleService().tryNotify(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    } while (!Intrinsics.areEqual(((ScheduleProject) next).getUuid(), scheduleMasterViewModel3.getCurrentProjectId()));
                    scheduleProject = (ScheduleProject) next;
                    if (scheduleProject == null) {
                        ScheduleMasterViewModel scheduleMasterViewModel111 = ScheduleMasterViewModel.this;
                        scheduleMasterViewModel111.setCurrentProjectId(scheduleMasterViewModel111.getProjectList().get(0).getUuid());
                        this.L$0 = null;
                        this.label = 4;
                        if (ScheduleMasterViewModel.this.getScheduleService().setProjectId(ScheduleMasterViewModel.this.getCurrentProjectId(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ScheduleMasterViewModel scheduleMasterViewModel112 = ScheduleMasterViewModel.this;
                        scheduleMasterViewModel112.setCurrentProjectName(scheduleMasterViewModel112.getProjectList().get(0).getName());
                    } else {
                        ScheduleMasterViewModel.this.setCurrentProjectName(scheduleProject.getName());
                    }
                    ScheduleMasterViewModel.this.setFormType(new FormType(DavPrincipal.KEY_SELF, null, null, 6, null));
                    ScheduleMasterViewModel scheduleMasterViewModel113 = ScheduleMasterViewModel.this;
                    scheduleMasterViewModel113.setOldSid(scheduleMasterViewModel113.getBaseRepository().getSid());
                    scheduleMasterViewModel4 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel4;
                    this.label = 5;
                    obj = scheduleMasterViewModel4.getBaseRepository().fetchHoliday(MyDateTool.getYear(ScheduleMasterViewModel.this.getCurrentDate()), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel4.setHolidayMap((Map) obj);
                    scheduleMasterViewModel5 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel5;
                    this.label = 6;
                    obj = scheduleMasterViewModel5.getScheduleService().getConfig(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel5.setConfig((ScheduleConfig) obj);
                    scheduleMasterViewModel6 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel6;
                    this.label = 7;
                    obj = scheduleMasterViewModel6.getScheduleService().getScheduleWorkDao().listByProject(ScheduleMasterViewModel.this.getCurrentProjectId(), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel6.setWorks((List) obj);
                    scheduleMasterViewModel7 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel7;
                    this.label = 8;
                    obj = scheduleMasterViewModel7.getScheduleService().getSchedulePlanDao().listByProject(ScheduleMasterViewModel.this.getCurrentProjectId(), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel7.setPlans((List) obj);
                    ScheduleMasterViewModel scheduleMasterViewModel114 = ScheduleMasterViewModel.this;
                    scheduleMasterViewModel114.setEmptyWork(scheduleMasterViewModel114.getWorks().isEmpty());
                    BaseViewModel.reloadData$default(ScheduleMasterViewModel.this, false, 1, null);
                    scheduleMasterViewModel8 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel8;
                    this.label = 9;
                    obj = scheduleMasterViewModel8.getBaseRepository().booleanCache(ScheduleMasterViewModel.CONFIG_HINT_KEY, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel8.setShowConfigHint(!((Boolean) obj).booleanValue());
                    this.L$0 = null;
                    this.label = 10;
                    obj = ScheduleMasterViewModel.this.getBaseRepository().tryUpgrade(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        ScheduleMasterViewModel.this.setFormType(new FormType("upgrade", null, null, 6, null));
                    }
                    this.label = 11;
                    if (ScheduleMasterViewModel.this.getScheduleService().tryNotify(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 2:
                    scheduleMasterViewModel = (ScheduleMasterViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    scheduleMasterViewModel.setCurrentProjectId((String) obj);
                    scheduleMasterViewModel2 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel2;
                    this.label = 3;
                    obj = scheduleMasterViewModel2.getScheduleService().getScheduleProjectDao().list(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel2.setProjectList((List) obj);
                    List<ScheduleProject> projectList3 = ScheduleMasterViewModel.this.getProjectList();
                    scheduleMasterViewModel3 = ScheduleMasterViewModel.this;
                    it = projectList3.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        scheduleProject = (ScheduleProject) next;
                        if (scheduleProject == null) {
                            ScheduleMasterViewModel scheduleMasterViewModel115 = ScheduleMasterViewModel.this;
                            scheduleMasterViewModel115.setCurrentProjectId(scheduleMasterViewModel115.getProjectList().get(0).getUuid());
                            this.L$0 = null;
                            this.label = 4;
                            if (ScheduleMasterViewModel.this.getScheduleService().setProjectId(ScheduleMasterViewModel.this.getCurrentProjectId(), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            ScheduleMasterViewModel scheduleMasterViewModel116 = ScheduleMasterViewModel.this;
                            scheduleMasterViewModel116.setCurrentProjectName(scheduleMasterViewModel116.getProjectList().get(0).getName());
                        } else {
                            ScheduleMasterViewModel.this.setCurrentProjectName(scheduleProject.getName());
                        }
                        ScheduleMasterViewModel.this.setFormType(new FormType(DavPrincipal.KEY_SELF, null, null, 6, null));
                        ScheduleMasterViewModel scheduleMasterViewModel117 = ScheduleMasterViewModel.this;
                        scheduleMasterViewModel117.setOldSid(scheduleMasterViewModel117.getBaseRepository().getSid());
                        scheduleMasterViewModel4 = ScheduleMasterViewModel.this;
                        this.L$0 = scheduleMasterViewModel4;
                        this.label = 5;
                        obj = scheduleMasterViewModel4.getBaseRepository().fetchHoliday(MyDateTool.getYear(ScheduleMasterViewModel.this.getCurrentDate()), this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleMasterViewModel4.setHolidayMap((Map) obj);
                        scheduleMasterViewModel5 = ScheduleMasterViewModel.this;
                        this.L$0 = scheduleMasterViewModel5;
                        this.label = 6;
                        obj = scheduleMasterViewModel5.getScheduleService().getConfig(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleMasterViewModel5.setConfig((ScheduleConfig) obj);
                        scheduleMasterViewModel6 = ScheduleMasterViewModel.this;
                        this.L$0 = scheduleMasterViewModel6;
                        this.label = 7;
                        obj = scheduleMasterViewModel6.getScheduleService().getScheduleWorkDao().listByProject(ScheduleMasterViewModel.this.getCurrentProjectId(), this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleMasterViewModel6.setWorks((List) obj);
                        scheduleMasterViewModel7 = ScheduleMasterViewModel.this;
                        this.L$0 = scheduleMasterViewModel7;
                        this.label = 8;
                        obj = scheduleMasterViewModel7.getScheduleService().getSchedulePlanDao().listByProject(ScheduleMasterViewModel.this.getCurrentProjectId(), this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleMasterViewModel7.setPlans((List) obj);
                        ScheduleMasterViewModel scheduleMasterViewModel118 = ScheduleMasterViewModel.this;
                        scheduleMasterViewModel118.setEmptyWork(scheduleMasterViewModel118.getWorks().isEmpty());
                        BaseViewModel.reloadData$default(ScheduleMasterViewModel.this, false, 1, null);
                        scheduleMasterViewModel8 = ScheduleMasterViewModel.this;
                        this.L$0 = scheduleMasterViewModel8;
                        this.label = 9;
                        obj = scheduleMasterViewModel8.getBaseRepository().booleanCache(ScheduleMasterViewModel.CONFIG_HINT_KEY, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleMasterViewModel8.setShowConfigHint(!((Boolean) obj).booleanValue());
                        this.L$0 = null;
                        this.label = 10;
                        obj = ScheduleMasterViewModel.this.getBaseRepository().tryUpgrade(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (((Boolean) obj).booleanValue()) {
                            ScheduleMasterViewModel.this.setFormType(new FormType("upgrade", null, null, 6, null));
                        }
                        this.label = 11;
                        if (ScheduleMasterViewModel.this.getScheduleService().tryNotify(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    } while (!Intrinsics.areEqual(((ScheduleProject) next).getUuid(), scheduleMasterViewModel3.getCurrentProjectId()));
                    scheduleProject = (ScheduleProject) next;
                    if (scheduleProject == null) {
                        ScheduleMasterViewModel scheduleMasterViewModel119 = ScheduleMasterViewModel.this;
                        scheduleMasterViewModel119.setCurrentProjectId(scheduleMasterViewModel119.getProjectList().get(0).getUuid());
                        this.L$0 = null;
                        this.label = 4;
                        if (ScheduleMasterViewModel.this.getScheduleService().setProjectId(ScheduleMasterViewModel.this.getCurrentProjectId(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ScheduleMasterViewModel scheduleMasterViewModel1110 = ScheduleMasterViewModel.this;
                        scheduleMasterViewModel1110.setCurrentProjectName(scheduleMasterViewModel1110.getProjectList().get(0).getName());
                    } else {
                        ScheduleMasterViewModel.this.setCurrentProjectName(scheduleProject.getName());
                    }
                    ScheduleMasterViewModel.this.setFormType(new FormType(DavPrincipal.KEY_SELF, null, null, 6, null));
                    ScheduleMasterViewModel scheduleMasterViewModel1111 = ScheduleMasterViewModel.this;
                    scheduleMasterViewModel1111.setOldSid(scheduleMasterViewModel1111.getBaseRepository().getSid());
                    scheduleMasterViewModel4 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel4;
                    this.label = 5;
                    obj = scheduleMasterViewModel4.getBaseRepository().fetchHoliday(MyDateTool.getYear(ScheduleMasterViewModel.this.getCurrentDate()), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel4.setHolidayMap((Map) obj);
                    scheduleMasterViewModel5 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel5;
                    this.label = 6;
                    obj = scheduleMasterViewModel5.getScheduleService().getConfig(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel5.setConfig((ScheduleConfig) obj);
                    scheduleMasterViewModel6 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel6;
                    this.label = 7;
                    obj = scheduleMasterViewModel6.getScheduleService().getScheduleWorkDao().listByProject(ScheduleMasterViewModel.this.getCurrentProjectId(), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel6.setWorks((List) obj);
                    scheduleMasterViewModel7 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel7;
                    this.label = 8;
                    obj = scheduleMasterViewModel7.getScheduleService().getSchedulePlanDao().listByProject(ScheduleMasterViewModel.this.getCurrentProjectId(), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel7.setPlans((List) obj);
                    ScheduleMasterViewModel scheduleMasterViewModel1112 = ScheduleMasterViewModel.this;
                    scheduleMasterViewModel1112.setEmptyWork(scheduleMasterViewModel1112.getWorks().isEmpty());
                    BaseViewModel.reloadData$default(ScheduleMasterViewModel.this, false, 1, null);
                    scheduleMasterViewModel8 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel8;
                    this.label = 9;
                    obj = scheduleMasterViewModel8.getBaseRepository().booleanCache(ScheduleMasterViewModel.CONFIG_HINT_KEY, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel8.setShowConfigHint(!((Boolean) obj).booleanValue());
                    this.L$0 = null;
                    this.label = 10;
                    obj = ScheduleMasterViewModel.this.getBaseRepository().tryUpgrade(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        ScheduleMasterViewModel.this.setFormType(new FormType("upgrade", null, null, 6, null));
                    }
                    this.label = 11;
                    if (ScheduleMasterViewModel.this.getScheduleService().tryNotify(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 3:
                    scheduleMasterViewModel2 = (ScheduleMasterViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    scheduleMasterViewModel2.setProjectList((List) obj);
                    List<ScheduleProject> projectList4 = ScheduleMasterViewModel.this.getProjectList();
                    scheduleMasterViewModel3 = ScheduleMasterViewModel.this;
                    it = projectList4.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        scheduleProject = (ScheduleProject) next;
                        if (scheduleProject == null) {
                            ScheduleMasterViewModel scheduleMasterViewModel1113 = ScheduleMasterViewModel.this;
                            scheduleMasterViewModel1113.setCurrentProjectId(scheduleMasterViewModel1113.getProjectList().get(0).getUuid());
                            this.L$0 = null;
                            this.label = 4;
                            if (ScheduleMasterViewModel.this.getScheduleService().setProjectId(ScheduleMasterViewModel.this.getCurrentProjectId(), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            ScheduleMasterViewModel scheduleMasterViewModel1114 = ScheduleMasterViewModel.this;
                            scheduleMasterViewModel1114.setCurrentProjectName(scheduleMasterViewModel1114.getProjectList().get(0).getName());
                        } else {
                            ScheduleMasterViewModel.this.setCurrentProjectName(scheduleProject.getName());
                        }
                        ScheduleMasterViewModel.this.setFormType(new FormType(DavPrincipal.KEY_SELF, null, null, 6, null));
                        ScheduleMasterViewModel scheduleMasterViewModel1115 = ScheduleMasterViewModel.this;
                        scheduleMasterViewModel1115.setOldSid(scheduleMasterViewModel1115.getBaseRepository().getSid());
                        scheduleMasterViewModel4 = ScheduleMasterViewModel.this;
                        this.L$0 = scheduleMasterViewModel4;
                        this.label = 5;
                        obj = scheduleMasterViewModel4.getBaseRepository().fetchHoliday(MyDateTool.getYear(ScheduleMasterViewModel.this.getCurrentDate()), this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleMasterViewModel4.setHolidayMap((Map) obj);
                        scheduleMasterViewModel5 = ScheduleMasterViewModel.this;
                        this.L$0 = scheduleMasterViewModel5;
                        this.label = 6;
                        obj = scheduleMasterViewModel5.getScheduleService().getConfig(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleMasterViewModel5.setConfig((ScheduleConfig) obj);
                        scheduleMasterViewModel6 = ScheduleMasterViewModel.this;
                        this.L$0 = scheduleMasterViewModel6;
                        this.label = 7;
                        obj = scheduleMasterViewModel6.getScheduleService().getScheduleWorkDao().listByProject(ScheduleMasterViewModel.this.getCurrentProjectId(), this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleMasterViewModel6.setWorks((List) obj);
                        scheduleMasterViewModel7 = ScheduleMasterViewModel.this;
                        this.L$0 = scheduleMasterViewModel7;
                        this.label = 8;
                        obj = scheduleMasterViewModel7.getScheduleService().getSchedulePlanDao().listByProject(ScheduleMasterViewModel.this.getCurrentProjectId(), this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleMasterViewModel7.setPlans((List) obj);
                        ScheduleMasterViewModel scheduleMasterViewModel1116 = ScheduleMasterViewModel.this;
                        scheduleMasterViewModel1116.setEmptyWork(scheduleMasterViewModel1116.getWorks().isEmpty());
                        BaseViewModel.reloadData$default(ScheduleMasterViewModel.this, false, 1, null);
                        scheduleMasterViewModel8 = ScheduleMasterViewModel.this;
                        this.L$0 = scheduleMasterViewModel8;
                        this.label = 9;
                        obj = scheduleMasterViewModel8.getBaseRepository().booleanCache(ScheduleMasterViewModel.CONFIG_HINT_KEY, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleMasterViewModel8.setShowConfigHint(!((Boolean) obj).booleanValue());
                        this.L$0 = null;
                        this.label = 10;
                        obj = ScheduleMasterViewModel.this.getBaseRepository().tryUpgrade(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (((Boolean) obj).booleanValue()) {
                            ScheduleMasterViewModel.this.setFormType(new FormType("upgrade", null, null, 6, null));
                        }
                        this.label = 11;
                        if (ScheduleMasterViewModel.this.getScheduleService().tryNotify(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    } while (!Intrinsics.areEqual(((ScheduleProject) next).getUuid(), scheduleMasterViewModel3.getCurrentProjectId()));
                    scheduleProject = (ScheduleProject) next;
                    if (scheduleProject == null) {
                        ScheduleMasterViewModel scheduleMasterViewModel1117 = ScheduleMasterViewModel.this;
                        scheduleMasterViewModel1117.setCurrentProjectId(scheduleMasterViewModel1117.getProjectList().get(0).getUuid());
                        this.L$0 = null;
                        this.label = 4;
                        if (ScheduleMasterViewModel.this.getScheduleService().setProjectId(ScheduleMasterViewModel.this.getCurrentProjectId(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ScheduleMasterViewModel scheduleMasterViewModel1118 = ScheduleMasterViewModel.this;
                        scheduleMasterViewModel1118.setCurrentProjectName(scheduleMasterViewModel1118.getProjectList().get(0).getName());
                    } else {
                        ScheduleMasterViewModel.this.setCurrentProjectName(scheduleProject.getName());
                    }
                    ScheduleMasterViewModel.this.setFormType(new FormType(DavPrincipal.KEY_SELF, null, null, 6, null));
                    ScheduleMasterViewModel scheduleMasterViewModel1119 = ScheduleMasterViewModel.this;
                    scheduleMasterViewModel1119.setOldSid(scheduleMasterViewModel1119.getBaseRepository().getSid());
                    scheduleMasterViewModel4 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel4;
                    this.label = 5;
                    obj = scheduleMasterViewModel4.getBaseRepository().fetchHoliday(MyDateTool.getYear(ScheduleMasterViewModel.this.getCurrentDate()), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel4.setHolidayMap((Map) obj);
                    scheduleMasterViewModel5 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel5;
                    this.label = 6;
                    obj = scheduleMasterViewModel5.getScheduleService().getConfig(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel5.setConfig((ScheduleConfig) obj);
                    scheduleMasterViewModel6 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel6;
                    this.label = 7;
                    obj = scheduleMasterViewModel6.getScheduleService().getScheduleWorkDao().listByProject(ScheduleMasterViewModel.this.getCurrentProjectId(), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel6.setWorks((List) obj);
                    scheduleMasterViewModel7 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel7;
                    this.label = 8;
                    obj = scheduleMasterViewModel7.getScheduleService().getSchedulePlanDao().listByProject(ScheduleMasterViewModel.this.getCurrentProjectId(), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel7.setPlans((List) obj);
                    ScheduleMasterViewModel scheduleMasterViewModel11110 = ScheduleMasterViewModel.this;
                    scheduleMasterViewModel11110.setEmptyWork(scheduleMasterViewModel11110.getWorks().isEmpty());
                    BaseViewModel.reloadData$default(ScheduleMasterViewModel.this, false, 1, null);
                    scheduleMasterViewModel8 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel8;
                    this.label = 9;
                    obj = scheduleMasterViewModel8.getBaseRepository().booleanCache(ScheduleMasterViewModel.CONFIG_HINT_KEY, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel8.setShowConfigHint(!((Boolean) obj).booleanValue());
                    this.L$0 = null;
                    this.label = 10;
                    obj = ScheduleMasterViewModel.this.getBaseRepository().tryUpgrade(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        ScheduleMasterViewModel.this.setFormType(new FormType("upgrade", null, null, 6, null));
                    }
                    this.label = 11;
                    if (ScheduleMasterViewModel.this.getScheduleService().tryNotify(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 4:
                    ResultKt.throwOnFailure(obj);
                    ScheduleMasterViewModel scheduleMasterViewModel11111 = ScheduleMasterViewModel.this;
                    scheduleMasterViewModel11111.setCurrentProjectName(scheduleMasterViewModel11111.getProjectList().get(0).getName());
                    ScheduleMasterViewModel.this.setFormType(new FormType(DavPrincipal.KEY_SELF, null, null, 6, null));
                    ScheduleMasterViewModel scheduleMasterViewModel11112 = ScheduleMasterViewModel.this;
                    scheduleMasterViewModel11112.setOldSid(scheduleMasterViewModel11112.getBaseRepository().getSid());
                    scheduleMasterViewModel4 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel4;
                    this.label = 5;
                    obj = scheduleMasterViewModel4.getBaseRepository().fetchHoliday(MyDateTool.getYear(ScheduleMasterViewModel.this.getCurrentDate()), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel4.setHolidayMap((Map) obj);
                    scheduleMasterViewModel5 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel5;
                    this.label = 6;
                    obj = scheduleMasterViewModel5.getScheduleService().getConfig(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel5.setConfig((ScheduleConfig) obj);
                    scheduleMasterViewModel6 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel6;
                    this.label = 7;
                    obj = scheduleMasterViewModel6.getScheduleService().getScheduleWorkDao().listByProject(ScheduleMasterViewModel.this.getCurrentProjectId(), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel6.setWorks((List) obj);
                    scheduleMasterViewModel7 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel7;
                    this.label = 8;
                    obj = scheduleMasterViewModel7.getScheduleService().getSchedulePlanDao().listByProject(ScheduleMasterViewModel.this.getCurrentProjectId(), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel7.setPlans((List) obj);
                    ScheduleMasterViewModel scheduleMasterViewModel11113 = ScheduleMasterViewModel.this;
                    scheduleMasterViewModel11113.setEmptyWork(scheduleMasterViewModel11113.getWorks().isEmpty());
                    BaseViewModel.reloadData$default(ScheduleMasterViewModel.this, false, 1, null);
                    scheduleMasterViewModel8 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel8;
                    this.label = 9;
                    obj = scheduleMasterViewModel8.getBaseRepository().booleanCache(ScheduleMasterViewModel.CONFIG_HINT_KEY, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel8.setShowConfigHint(!((Boolean) obj).booleanValue());
                    this.L$0 = null;
                    this.label = 10;
                    obj = ScheduleMasterViewModel.this.getBaseRepository().tryUpgrade(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        ScheduleMasterViewModel.this.setFormType(new FormType("upgrade", null, null, 6, null));
                    }
                    this.label = 11;
                    if (ScheduleMasterViewModel.this.getScheduleService().tryNotify(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 5:
                    scheduleMasterViewModel4 = (ScheduleMasterViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    scheduleMasterViewModel4.setHolidayMap((Map) obj);
                    scheduleMasterViewModel5 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel5;
                    this.label = 6;
                    obj = scheduleMasterViewModel5.getScheduleService().getConfig(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel5.setConfig((ScheduleConfig) obj);
                    scheduleMasterViewModel6 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel6;
                    this.label = 7;
                    obj = scheduleMasterViewModel6.getScheduleService().getScheduleWorkDao().listByProject(ScheduleMasterViewModel.this.getCurrentProjectId(), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel6.setWorks((List) obj);
                    scheduleMasterViewModel7 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel7;
                    this.label = 8;
                    obj = scheduleMasterViewModel7.getScheduleService().getSchedulePlanDao().listByProject(ScheduleMasterViewModel.this.getCurrentProjectId(), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel7.setPlans((List) obj);
                    ScheduleMasterViewModel scheduleMasterViewModel11114 = ScheduleMasterViewModel.this;
                    scheduleMasterViewModel11114.setEmptyWork(scheduleMasterViewModel11114.getWorks().isEmpty());
                    BaseViewModel.reloadData$default(ScheduleMasterViewModel.this, false, 1, null);
                    scheduleMasterViewModel8 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel8;
                    this.label = 9;
                    obj = scheduleMasterViewModel8.getBaseRepository().booleanCache(ScheduleMasterViewModel.CONFIG_HINT_KEY, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel8.setShowConfigHint(!((Boolean) obj).booleanValue());
                    this.L$0 = null;
                    this.label = 10;
                    obj = ScheduleMasterViewModel.this.getBaseRepository().tryUpgrade(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        ScheduleMasterViewModel.this.setFormType(new FormType("upgrade", null, null, 6, null));
                    }
                    this.label = 11;
                    if (ScheduleMasterViewModel.this.getScheduleService().tryNotify(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 6:
                    scheduleMasterViewModel5 = (ScheduleMasterViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    scheduleMasterViewModel5.setConfig((ScheduleConfig) obj);
                    scheduleMasterViewModel6 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel6;
                    this.label = 7;
                    obj = scheduleMasterViewModel6.getScheduleService().getScheduleWorkDao().listByProject(ScheduleMasterViewModel.this.getCurrentProjectId(), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel6.setWorks((List) obj);
                    scheduleMasterViewModel7 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel7;
                    this.label = 8;
                    obj = scheduleMasterViewModel7.getScheduleService().getSchedulePlanDao().listByProject(ScheduleMasterViewModel.this.getCurrentProjectId(), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel7.setPlans((List) obj);
                    ScheduleMasterViewModel scheduleMasterViewModel11115 = ScheduleMasterViewModel.this;
                    scheduleMasterViewModel11115.setEmptyWork(scheduleMasterViewModel11115.getWorks().isEmpty());
                    BaseViewModel.reloadData$default(ScheduleMasterViewModel.this, false, 1, null);
                    scheduleMasterViewModel8 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel8;
                    this.label = 9;
                    obj = scheduleMasterViewModel8.getBaseRepository().booleanCache(ScheduleMasterViewModel.CONFIG_HINT_KEY, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel8.setShowConfigHint(!((Boolean) obj).booleanValue());
                    this.L$0 = null;
                    this.label = 10;
                    obj = ScheduleMasterViewModel.this.getBaseRepository().tryUpgrade(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        ScheduleMasterViewModel.this.setFormType(new FormType("upgrade", null, null, 6, null));
                    }
                    this.label = 11;
                    if (ScheduleMasterViewModel.this.getScheduleService().tryNotify(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 7:
                    scheduleMasterViewModel6 = (ScheduleMasterViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    scheduleMasterViewModel6.setWorks((List) obj);
                    scheduleMasterViewModel7 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel7;
                    this.label = 8;
                    obj = scheduleMasterViewModel7.getScheduleService().getSchedulePlanDao().listByProject(ScheduleMasterViewModel.this.getCurrentProjectId(), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel7.setPlans((List) obj);
                    ScheduleMasterViewModel scheduleMasterViewModel11116 = ScheduleMasterViewModel.this;
                    scheduleMasterViewModel11116.setEmptyWork(scheduleMasterViewModel11116.getWorks().isEmpty());
                    BaseViewModel.reloadData$default(ScheduleMasterViewModel.this, false, 1, null);
                    scheduleMasterViewModel8 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel8;
                    this.label = 9;
                    obj = scheduleMasterViewModel8.getBaseRepository().booleanCache(ScheduleMasterViewModel.CONFIG_HINT_KEY, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel8.setShowConfigHint(!((Boolean) obj).booleanValue());
                    this.L$0 = null;
                    this.label = 10;
                    obj = ScheduleMasterViewModel.this.getBaseRepository().tryUpgrade(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        ScheduleMasterViewModel.this.setFormType(new FormType("upgrade", null, null, 6, null));
                    }
                    this.label = 11;
                    if (ScheduleMasterViewModel.this.getScheduleService().tryNotify(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 8:
                    scheduleMasterViewModel7 = (ScheduleMasterViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    scheduleMasterViewModel7.setPlans((List) obj);
                    ScheduleMasterViewModel scheduleMasterViewModel11117 = ScheduleMasterViewModel.this;
                    scheduleMasterViewModel11117.setEmptyWork(scheduleMasterViewModel11117.getWorks().isEmpty());
                    BaseViewModel.reloadData$default(ScheduleMasterViewModel.this, false, 1, null);
                    scheduleMasterViewModel8 = ScheduleMasterViewModel.this;
                    this.L$0 = scheduleMasterViewModel8;
                    this.label = 9;
                    obj = scheduleMasterViewModel8.getBaseRepository().booleanCache(ScheduleMasterViewModel.CONFIG_HINT_KEY, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleMasterViewModel8.setShowConfigHint(!((Boolean) obj).booleanValue());
                    this.L$0 = null;
                    this.label = 10;
                    obj = ScheduleMasterViewModel.this.getBaseRepository().tryUpgrade(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        ScheduleMasterViewModel.this.setFormType(new FormType("upgrade", null, null, 6, null));
                    }
                    this.label = 11;
                    if (ScheduleMasterViewModel.this.getScheduleService().tryNotify(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 9:
                    scheduleMasterViewModel8 = (ScheduleMasterViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    scheduleMasterViewModel8.setShowConfigHint(!((Boolean) obj).booleanValue());
                    this.L$0 = null;
                    this.label = 10;
                    obj = ScheduleMasterViewModel.this.getBaseRepository().tryUpgrade(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        ScheduleMasterViewModel.this.setFormType(new FormType("upgrade", null, null, 6, null));
                    }
                    this.label = 11;
                    if (ScheduleMasterViewModel.this.getScheduleService().tryNotify(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 10:
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        ScheduleMasterViewModel.this.setFormType(new FormType("upgrade", null, null, 6, null));
                    }
                    this.label = 11;
                    if (ScheduleMasterViewModel.this.getScheduleService().tryNotify(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 11:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseViewModel
    public void reload() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$reloadData$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleMasterViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$reloadData$1", f = "ScheduleMasterViewModel.kt", i = {}, l = {140, 141}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $dataChanged;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$dataChanged = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleMasterViewModel.this.new AnonymousClass1(this.$dataChanged, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x008e A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScheduleMasterViewModel scheduleMasterViewModel = ScheduleMasterViewModel.this;
                List<List<MonthDateInfo>> monthInfo = MyDateTool.getMonthInfo(scheduleMasterViewModel.getCurrentDate(), ScheduleMasterViewModel.this.getConfig().isMondayFirst(), (Map) CommonToolKt.ifv(ScheduleMasterViewModel.this.getConfig().getShowFestival(), ScheduleMasterViewModel.this.getHolidayMap(), MapsKt.emptyMap()), ScheduleMasterViewModel.this.getConfig().getFillCalendar());
                Intrinsics.checkNotNullExpressionValue(monthInfo, "getMonthInfo(currentDate…f()),config.fillCalendar)");
                scheduleMasterViewModel.setMonthInfos(monthInfo);
                ScheduleMasterViewModel.this.makeStat();
                if (this.$dataChanged) {
                    this.label = 1;
                    if (ScheduleMasterViewModel.this.getScheduleService().notifyWidget(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.label = 2;
                    if (ScheduleMasterViewModel.this.getScheduleService().makeNotify(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                this.label = 2;
                if (ScheduleMasterViewModel.this.getScheduleService().makeNotify(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseViewModel
    public void reloadData(boolean dataChanged) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(dataChanged, null), 3, null);
    }

    public final boolean isFocus(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return Intrinsics.areEqual(getCurrentDateStr(), CommonDateToolKt.dateStr(date));
    }

    public final void doChange() {
        reloadData(false);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$closeConfigHint$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleMasterViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$closeConfigHint$1", f = "ScheduleMasterViewModel.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleMasterViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ScheduleMasterViewModel.this.getBaseRepository().cacheBoolean(ScheduleMasterViewModel.CONFIG_HINT_KEY, true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void closeConfigHint() {
        setShowConfigHint(false);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final boolean isHomePage() {
        return Intrinsics.areEqual(getPageType().getType(), "home");
    }

    public final boolean isWorkPage() {
        return Intrinsics.areEqual(getPageType().getType(), "work");
    }

    public final boolean isAlarmPage() {
        return Intrinsics.areEqual(getPageType().getType(), NotificationCompat.CATEGORY_ALARM);
    }

    public final boolean isStatPage() {
        return Intrinsics.areEqual(getPageType().getType(), "stat");
    }

    public final boolean isSettingPage() {
        return Intrinsics.areEqual(getPageType().getType(), a.x);
    }

    public final ScheduleDuty fetchDuty() {
        Object next;
        Iterator<T> it = getDutys().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((ScheduleDuty) next).getDay(), MyDateTool.toDateString(getCurrentDate())));
        ScheduleDuty scheduleDuty = (ScheduleDuty) next;
        return scheduleDuty == null ? new ScheduleDuty(null, null, null, null, null, null, null, null, null, null, null, 0, null, 8191, null) : scheduleDuty;
    }

    public final String fetchDutyRemark(Date date) {
        Object next;
        Intrinsics.checkNotNullParameter(date, "date");
        Iterator<T> it = getDutys().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((ScheduleDuty) next).getDay(), MyDateTool.toDateString(date)));
        ScheduleDuty scheduleDuty = (ScheduleDuty) next;
        return scheduleDuty == null ? "" : scheduleDuty.getRemark();
    }

    public final ScheduleWork fetchDutyWork(Date date) {
        Object obj;
        Object next;
        Intrinsics.checkNotNullParameter(date, "date");
        Iterator<T> it = getDutys().iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((ScheduleDuty) next).getDay(), MyDateTool.toDateString(date)));
        ScheduleDuty scheduleDuty = (ScheduleDuty) next;
        if (scheduleDuty == null) {
            return new ScheduleWork(null, null, null, null, null, null, null, null, false, null, 0, false, 0, null, null, null, null, null, 0, null, 1048575, null);
        }
        for (Object obj2 : getWorks()) {
            if (Intrinsics.areEqual(((ScheduleWork) obj2).getUuid(), scheduleDuty.getWorkUuid())) {
                obj = obj2;
                break;
            }
        }
        ScheduleWork scheduleWork = (ScheduleWork) obj;
        return scheduleWork == null ? new ScheduleWork(null, null, null, null, null, null, null, null, false, null, 0, false, 0, null, null, null, null, null, 0, null, 1048575, null) : scheduleWork;
    }

    public final ScheduleWork fetchSecondDutyWork(Date date) {
        Object obj;
        Object next;
        Intrinsics.checkNotNullParameter(date, "date");
        Iterator<T> it = getDutys().iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((ScheduleDuty) next).getDay(), MyDateTool.toDateString(date)));
        ScheduleDuty scheduleDuty = (ScheduleDuty) next;
        if (scheduleDuty == null) {
            return new ScheduleWork(null, null, null, null, null, null, null, null, false, null, 0, false, 0, null, null, null, null, null, 0, null, 1048575, null);
        }
        for (Object obj2 : getWorks()) {
            if (Intrinsics.areEqual(((ScheduleWork) obj2).getUuid(), scheduleDuty.getSecondWorkUuid())) {
                obj = obj2;
                break;
            }
        }
        ScheduleWork scheduleWork = (ScheduleWork) obj;
        return scheduleWork == null ? new ScheduleWork(null, null, null, null, null, null, null, null, false, null, 0, false, 0, null, null, null, null, null, 0, null, 1048575, null) : scheduleWork;
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$removeCurrentDay$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleMasterViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$removeCurrentDay$1", f = "ScheduleMasterViewModel.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_ALOG_WRITE_FUNC_ADDR, 234}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleMasterViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = ScheduleMasterViewModel.this.getScheduleService().getScheduleDutyDao().findByDay(ScheduleMasterViewModel.this.getCurrentProjectId(), ScheduleMasterViewModel.this.getCurrentDateStr(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ScheduleMasterViewModel.this.reloadData(true);
                return Unit.INSTANCE;
            }
            if (!((List) obj).isEmpty()) {
                this.label = 2;
                if (ScheduleMasterViewModel.this.getScheduleService().getScheduleDutyDao().deleteByDay(ScheduleMasterViewModel.this.getCurrentProjectId(), ScheduleMasterViewModel.this.getCurrentDateStr(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ScheduleMasterViewModel.this.reloadData(true);
            }
            return Unit.INSTANCE;
        }
    }

    public final void removeCurrentDay() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final void goDay(int day) {
        int month = getCurrentDate().getMonth();
        Date dateGapDay = MyDateTool.gapDay(getCurrentDate(), day);
        Intrinsics.checkNotNullExpressionValue(dateGapDay, "gapDay(currentDate, day)");
        setCurrentDate(dateGapDay);
        if (month != getCurrentDate().getMonth()) {
            doChange();
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$finish$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleMasterViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$finish$1", f = "ScheduleMasterViewModel.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_ACCURATE_LAYOUT}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleMasterViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScheduleMasterViewModel.this.getBaseRepository().reload();
                this.label = 1;
                if (ScheduleMasterViewModel.this.getScheduleService().makeNotify(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void finish() {
        setHomeEdit(false);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final void makeDuty(ScheduleWork work) {
        Intrinsics.checkNotNullParameter(work, "work");
        setAdding(true);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(work, null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$makeDuty$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleMasterViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$makeDuty$1", f = "ScheduleMasterViewModel.kt", i = {1}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_SET_RADIO_MODE, MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_TRAN_CONNECT_TIME, MediaPlayer.MEDIA_PLAYER_OPTION_AUDIO_HTTP_RES_FINSIH_TIME}, m = "invokeSuspend", n = {"oldRemark"}, s = {"L$0"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ScheduleWork $work;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ScheduleWork scheduleWork, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$work = scheduleWork;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleMasterViewModel.this.new AnonymousClass1(this.$work, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00dc A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objFindByDay;
            String remark;
            String str;
            String str2;
            ScheduleDuty scheduleDuty;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objFindByDay = ScheduleMasterViewModel.this.getScheduleService().getScheduleDutyDao().findByDay(ScheduleMasterViewModel.this.getCurrentProjectId(), ScheduleMasterViewModel.this.getCurrentDateStr(), this);
                if (objFindByDay == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    objFindByDay = obj;
                } else if (i == 2) {
                    str2 = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    str = str2;
                    scheduleDuty = new ScheduleDuty(CommonToolKt.uuid(), ScheduleMasterViewModel.this.getCurrentDateStr(), null, this.$work.fetchFirstWorkUuid(), this.$work.fetchSecondWorkUuid(), ScheduleMasterViewModel.this.getCurrentProjectId(), str, null, null, null, null, 0, null, 8068, null);
                    this.L$0 = null;
                    this.label = 3;
                    if (ScheduleMasterViewModel.this.getScheduleService().getScheduleDutyDao().insert(scheduleDuty, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ScheduleMasterViewModel scheduleMasterViewModel = ScheduleMasterViewModel.this;
                Date dateGapDay = MyDateTool.gapDay(scheduleMasterViewModel.getCurrentDate(), 1);
                Intrinsics.checkNotNullExpressionValue(dateGapDay, "gapDay(currentDate, 1)");
                scheduleMasterViewModel.setCurrentDate(dateGapDay);
                ScheduleMasterViewModel.this.reloadData(true);
                ScheduleMasterViewModel.this.setAdding(false);
                return Unit.INSTANCE;
            }
            List list = (List) objFindByDay;
            ScheduleDuty scheduleDuty2 = (ScheduleDuty) CollectionsKt.firstOrNull(list);
            if (scheduleDuty2 == null || (remark = scheduleDuty2.getRemark()) == null) {
                remark = "";
            }
            if (list.isEmpty()) {
                str = remark;
            } else {
                this.L$0 = remark;
                this.label = 2;
                if (ScheduleMasterViewModel.this.getScheduleService().getScheduleDutyDao().deleteByDay(ScheduleMasterViewModel.this.getCurrentProjectId(), ScheduleMasterViewModel.this.getCurrentDateStr(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str2 = remark;
                str = str2;
            }
            scheduleDuty = new ScheduleDuty(CommonToolKt.uuid(), ScheduleMasterViewModel.this.getCurrentDateStr(), null, this.$work.fetchFirstWorkUuid(), this.$work.fetchSecondWorkUuid(), ScheduleMasterViewModel.this.getCurrentProjectId(), str, null, null, null, null, 0, null, 8068, null);
            this.L$0 = null;
            this.label = 3;
            if (ScheduleMasterViewModel.this.getScheduleService().getScheduleDutyDao().insert(scheduleDuty, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            ScheduleMasterViewModel scheduleMasterViewModel2 = ScheduleMasterViewModel.this;
            Date dateGapDay2 = MyDateTool.gapDay(scheduleMasterViewModel2.getCurrentDate(), 1);
            Intrinsics.checkNotNullExpressionValue(dateGapDay2, "gapDay(currentDate, 1)");
            scheduleMasterViewModel2.setCurrentDate(dateGapDay2);
            ScheduleMasterViewModel.this.reloadData(true);
            ScheduleMasterViewModel.this.setAdding(false);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$makePlanDuty$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleMasterViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$makePlanDuty$1", f = "ScheduleMasterViewModel.kt", i = {1, 1, 1, 2, 2}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_FRC_LEVEL, MediaPlayer.MEDIA_PLAYER_OPTION_READ_CACHE_MODE, MediaPlayer.MEDIA_PLAYER_OPTION_KEEP_FORMAT_THREAD_ALIVE}, m = "invokeSuspend", n = {"works", "day", Complex.DEFAULT_SUFFIX, "works", Complex.DEFAULT_SUFFIX}, s = {"L$0", "L$1", "I$0", "L$0", "I$0"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SchedulePlan $it;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SchedulePlan schedulePlan, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$it = schedulePlan;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleMasterViewModel.this.new AnonymousClass1(this.$it, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0075  */
        /* JADX WARN: Code duplicated, block: B:20:0x00a9 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:21:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:24:0x010b A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0109 -> B:8:0x0023). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r31) {
            /*
                Method dump skipped, instruction units count: 299
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void makePlanDuty(SchedulePlan it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(it, null), 3, null);
    }

    public final void makeStat() {
        Date startDayOfMonth = MyDateTool.getStartDayOfMonth(getCurrentDate());
        Intrinsics.checkNotNullExpressionValue(startDayOfMonth, "getStartDayOfMonth(currentDate)");
        String strDateStr = CommonDateToolKt.dateStr(startDayOfMonth);
        String lastDayStringOfMonth = MyDateTool.getLastDayStringOfMonth(getCurrentDate());
        Intrinsics.checkNotNullExpressionValue(lastDayStringOfMonth, "getLastDayStringOfMonth(currentDate)");
        setStatModel(new RangeDate(strDateStr, lastDayStringOfMonth));
        if (getStatModel().isValid()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$makeStat$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleMasterViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$makeStat$1", f = "ScheduleMasterViewModel.kt", i = {}, l = {307}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleMasterViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [T, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objListByPeriod;
            ScheduleMasterViewModel scheduleMasterViewModel;
            Object obj2;
            Object next;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScheduleMasterViewModel scheduleMasterViewModel2 = ScheduleMasterViewModel.this;
                this.L$0 = scheduleMasterViewModel2;
                this.label = 1;
                objListByPeriod = scheduleMasterViewModel2.getScheduleService().getScheduleDutyDao().listByPeriod(ScheduleMasterViewModel.this.getCurrentProjectId(), ScheduleMasterViewModel.this.getStatModel().getBeginDate(), ScheduleMasterViewModel.this.getStatModel().getEndDate(), this);
                if (objListByPeriod == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleMasterViewModel = scheduleMasterViewModel2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                scheduleMasterViewModel = (ScheduleMasterViewModel) this.L$0;
                ResultKt.throwOnFailure(obj);
                objListByPeriod = obj;
            }
            scheduleMasterViewModel.setPeriodDutys((List) objListByPeriod);
            ScheduleMasterViewModel scheduleMasterViewModel3 = ScheduleMasterViewModel.this;
            scheduleMasterViewModel3.setDutys(scheduleMasterViewModel3.getPeriodDutys());
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = ScheduleMasterViewModel.this.getWorks();
            Iterator it = ((Iterable) objectRef.element).iterator();
            while (it.hasNext()) {
                ((ScheduleWork) it.next()).setCnt(0);
            }
            for (ScheduleDuty scheduleDuty : ScheduleMasterViewModel.this.getPeriodDutys()) {
                Iterator it2 = ((Iterable) objectRef.element).iterator();
                do {
                    obj2 = null;
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Intrinsics.areEqual(scheduleDuty.getWorkUuid(), ((ScheduleWork) next).getUuid()));
                ScheduleWork scheduleWork = (ScheduleWork) next;
                if (scheduleWork != null) {
                    scheduleWork.setCnt(scheduleWork.getCnt() + 1);
                }
                for (Object obj3 : (Iterable) objectRef.element) {
                    if (Intrinsics.areEqual(scheduleDuty.getSecondWorkUuid(), ((ScheduleWork) obj3).getUuid())) {
                        obj2 = obj3;
                        break;
                    }
                }
                ScheduleWork scheduleWork2 = (ScheduleWork) obj2;
                if (scheduleWork2 != null) {
                    scheduleWork2.setCnt(scheduleWork2.getCnt() + 1);
                }
            }
            Iterable<ScheduleWork> iterable = (Iterable) objectRef.element;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (ScheduleWork scheduleWork3 : iterable) {
                arrayList.add(new PieGraphItem(scheduleWork3.getName(), String.valueOf(scheduleWork3.getCnt()), scheduleWork3.getTheme(), 0.0f, 8, null));
            }
            ScheduleMasterViewModel.this.setPieData(PieGraphDataKt.makePieStatData$default("班次统计", "次", arrayList, 0, 8, null));
            ScheduleMasterViewModel scheduleMasterViewModel4 = ScheduleMasterViewModel.this;
            scheduleMasterViewModel4.setGid(scheduleMasterViewModel4.getGid() + 1);
            CommonToolKt.mlog("make data", ScheduleMasterViewModel.this.getPieData());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$changeProject$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleMasterViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$changeProject$1", f = "ScheduleMasterViewModel.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_GET_FIRST_VIDEO_POS}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ScheduleProject $it;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ScheduleProject scheduleProject, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$it = scheduleProject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleMasterViewModel.this.new AnonymousClass1(this.$it, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ScheduleMasterViewModel.this.getScheduleService().setProjectId(this.$it.getUuid(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ScheduleMasterViewModel.this.setCurrentProjectName(this.$it.getName());
            ScheduleMasterViewModel.this.setCurrentProjectId(this.$it.getUuid());
            ScheduleMasterViewModel.this.getBaseRepository().reload();
            ScheduleMasterViewModel.this.resetForm();
            return Unit.INSTANCE;
        }
    }

    public final void changeProject(ScheduleProject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(it, null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$changeConfig$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleMasterViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$changeConfig$1", f = "ScheduleMasterViewModel.kt", i = {}, l = {351}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleMasterViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ScheduleMasterViewModel.this.getScheduleService().getConfigDao().set(ScheduleMasterViewModel.this.getConfig(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void changeConfig() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final void setFirstWork(ScheduleWork work) {
        Intrinsics.checkNotNullParameter(work, "work");
        ScheduleDuty scheduleDutyFetchDuty = fetchDuty();
        scheduleDutyFetchDuty.setWorkUuid(work.getUuid());
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(scheduleDutyFetchDuty, null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$setFirstWork$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleMasterViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$setFirstWork$1", f = "ScheduleMasterViewModel.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_DECODER_STALL}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ScheduleDuty $t;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ScheduleDuty scheduleDuty, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$t = scheduleDuty;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleMasterViewModel.this.new AnonymousClass1(this.$t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ScheduleMasterViewModel.this.getScheduleService().getScheduleDutyDao().update(this.$t, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ScheduleMasterViewModel.this.reloadData(true);
            ScheduleMasterViewModel.this.resetForm();
            ScheduleMasterViewModel.this.getBaseRepository().reload();
            return Unit.INSTANCE;
        }
    }

    public final void setSecondWork(ScheduleWork work) {
        Intrinsics.checkNotNullParameter(work, "work");
        ScheduleDuty scheduleDutyFetchDuty = fetchDuty();
        scheduleDutyFetchDuty.setSecondWorkUuid(work.getUuid());
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(scheduleDutyFetchDuty, null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$setSecondWork$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleMasterViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$setSecondWork$1", f = "ScheduleMasterViewModel.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_DECODE_MULTI_SEI}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ScheduleDuty $t;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ScheduleDuty scheduleDuty, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$t = scheduleDuty;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleMasterViewModel.this.new AnonymousClass1(this.$t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ScheduleMasterViewModel.this.getScheduleService().getScheduleDutyDao().update(this.$t, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ScheduleMasterViewModel.this.reloadData(true);
            ScheduleMasterViewModel.this.resetForm();
            ScheduleMasterViewModel.this.getBaseRepository().reload();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$setRemark$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleMasterViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$setRemark$1", f = "ScheduleMasterViewModel.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSIONS, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_RETRANSMISSION_TIME_MS, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MIN_RECEIVED_BEFORE_ACK_DECIMATION}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $remark;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$remark = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleMasterViewModel.this.new AnonymousClass1(this.$remark, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objListByPeriod;
            ScheduleMasterViewModel scheduleMasterViewModel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScheduleDuty scheduleDutyFetchDuty = ScheduleMasterViewModel.this.fetchDuty();
                if (scheduleDutyFetchDuty.isAdd()) {
                    ScheduleDuty scheduleDuty = new ScheduleDuty(CommonToolKt.uuid(), ScheduleMasterViewModel.this.getCurrentDateStr(), null, null, null, ScheduleMasterViewModel.this.getCurrentProjectId(), this.$remark, null, null, null, null, 0, null, 8092, null);
                    this.label = 1;
                    if (ScheduleMasterViewModel.this.getScheduleService().getScheduleDutyDao().insert(scheduleDuty, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.label = 2;
                    if (ScheduleMasterViewModel.this.getScheduleService().getScheduleDutyDao().update(scheduleDutyFetchDuty.copy((8190 & 1) != 0 ? scheduleDutyFetchDuty.uuid : null, (8190 & 2) != 0 ? scheduleDutyFetchDuty.day : null, (8190 & 4) != 0 ? scheduleDutyFetchDuty.userId : null, (8190 & 8) != 0 ? scheduleDutyFetchDuty.workUuid : null, (8190 & 16) != 0 ? scheduleDutyFetchDuty.secondWorkUuid : null, (8190 & 32) != 0 ? scheduleDutyFetchDuty.projectUuid : null, (8190 & 64) != 0 ? scheduleDutyFetchDuty.remark : this.$remark, (8190 & 128) != 0 ? scheduleDutyFetchDuty.gmtCreate : null, (8190 & 256) != 0 ? scheduleDutyFetchDuty.extField1 : null, (8190 & 512) != 0 ? scheduleDutyFetchDuty.extField2 : null, (8190 & 1024) != 0 ? scheduleDutyFetchDuty.extField3 : null, (8190 & 2048) != 0 ? scheduleDutyFetchDuty.cc : 0, (8190 & 4096) != 0 ? scheduleDutyFetchDuty.cid : null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i == 1 || i == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    scheduleMasterViewModel = (ScheduleMasterViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objListByPeriod = obj;
                }
                scheduleMasterViewModel.setDutys((List) objListByPeriod);
                ScheduleMasterViewModel scheduleMasterViewModel2 = ScheduleMasterViewModel.this;
                scheduleMasterViewModel2.setPeriodDutys(scheduleMasterViewModel2.getDutys());
                ScheduleMasterViewModel.this.reloadData(true);
                return Unit.INSTANCE;
            }
            ScheduleMasterViewModel scheduleMasterViewModel3 = ScheduleMasterViewModel.this;
            this.L$0 = scheduleMasterViewModel3;
            this.label = 3;
            objListByPeriod = scheduleMasterViewModel3.getScheduleService().getScheduleDutyDao().listByPeriod(ScheduleMasterViewModel.this.getCurrentProjectId(), ScheduleMasterViewModel.this.getStatModel().getBeginDate(), ScheduleMasterViewModel.this.getStatModel().getEndDate(), this);
            if (objListByPeriod == coroutine_suspended) {
                return coroutine_suspended;
            }
            scheduleMasterViewModel = scheduleMasterViewModel3;
            scheduleMasterViewModel.setDutys((List) objListByPeriod);
            ScheduleMasterViewModel scheduleMasterViewModel4 = ScheduleMasterViewModel.this;
            scheduleMasterViewModel4.setPeriodDutys(scheduleMasterViewModel4.getDutys());
            ScheduleMasterViewModel.this.reloadData(true);
            return Unit.INSTANCE;
        }
    }

    public final boolean setRemark(String remark) {
        Intrinsics.checkNotNullParameter(remark, "remark");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(remark, null), 3, null);
        return true;
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$makeClean$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleMasterViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$makeClean$1", f = "ScheduleMasterViewModel.kt", i = {1}, l = {TTAdConstant.DOWNLOAD_URL_CODE, TTAdConstant.IMAGE_LIST_SIZE_CODE}, m = "invokeSuspend", n = {Complex.DEFAULT_SUFFIX}, s = {"I$0"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int I$0;
        int I$1;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleMasterViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004d  */
        /* JADX WARN: Code duplicated, block: B:17:0x007f A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007d -> B:18:0x0080). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L24
                if (r1 == r4) goto L20
                if (r1 != r2) goto L18
                int r1 = r10.I$1
                int r5 = r10.I$0
                kotlin.ResultKt.throwOnFailure(r11)
                r11 = r10
                goto L80
            L18:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L20:
                kotlin.ResultKt.throwOnFailure(r11)
                goto L3a
            L24:
                kotlin.ResultKt.throwOnFailure(r11)
                cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel r11 = cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel.this
                cn.jianyun.workplan.hilt.respo.BaseRepository r11 = r11.getBaseRepository()
                r1 = r10
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                r10.label = r4
                r5 = 0
                java.lang.Object r11 = cn.jianyun.workplan.hilt.respo.BaseRepository.loading$default(r11, r3, r1, r4, r5)
                if (r11 != r0) goto L3a
                return r0
            L3a:
                cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel r11 = cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel.this
                cn.jianyun.workplan.module.schedule.model.ScheduleConfig r11 = r11.getConfig()
                java.lang.String r11 = r11.getAutoDay()
                int r11 = cn.jianyun.workplan.util.CommonToolKt.toIntData(r11)
                r1 = r11
                r5 = r3
                r11 = r10
            L4b:
                if (r5 >= r1) goto L82
                cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel r6 = cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel.this
                java.util.Date r6 = r6.getCurrentDate()
                java.util.Date r6 = cn.jianyun.workplan.util.MyDateTool.gapDay(r6, r5)
                cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel r7 = cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel.this
                cn.jianyun.workplan.module.schedule.views.service.ScheduleService r7 = r7.getScheduleService()
                cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao r7 = r7.getScheduleDutyDao()
                cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel r8 = cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel.this
                java.lang.String r8 = r8.getCurrentProjectId()
                java.lang.String r6 = cn.jianyun.workplan.util.MyDateTool.toDateString(r6)
                java.lang.String r9 = "toDateString(day)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r9)
                r9 = r11
                kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
                r11.I$0 = r5
                r11.I$1 = r1
                r11.label = r2
                java.lang.Object r6 = r7.deleteByDay(r8, r6, r9)
                if (r6 != r0) goto L80
                return r0
            L80:
                int r5 = r5 + r4
                goto L4b
            L82:
                cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel r0 = cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel.this
                r0.reloadData(r4)
                cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel r0 = cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel.this
                cn.jianyun.workplan.hilt.respo.BaseRepository r0 = r0.getBaseRepository()
                r0.finish()
                cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel r0 = cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel.this
                r0.setClear(r3)
                cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel r11 = cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel.this
                cn.jianyun.workplan.hilt.respo.BaseRepository r11 = r11.getBaseRepository()
                java.lang.String r0 = "周期内班次已被清空"
                r11.toast(r0)
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void makeClean() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }
}