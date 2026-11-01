package cn.jianyun.workplan.module.schedule.vm;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.core.app.NotificationCompat;
import androidx.core.content.FileProvider;
import androidx.lifecycle.ViewModelKt;
import cn.jianyun.workplan.api.FestivalData;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.module.base.vm.BaseViewModel;
import cn.jianyun.workplan.module.schedule.model.DutyDetail;
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
import cn.jianyun.workplan.util.MyDataTool;
import cn.jianyun.workplan.util.MyDateTool;
import com.alipay.sdk.m.u0.b;
import com.alipay.sdk.m.w.a;
import com.bykv.vk.component.ttvideo.player.C;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import com.thegrizzlylabs.sardineandroid.DavPrincipal;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.logging.log4j.message.ParameterizedMessage;
import org.apache.poi.ss.formula.functions.Complex;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.XmlErrorCodes;

/* JADX INFO: compiled from: ScheduleStatViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b&\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0084\u0001\u001a\u00030\u0085\u0001J\u0011\u0010\u0086\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u0087\u0001\u001a\u00020iJ\b\u0010\u0088\u0001\u001a\u00030\u0085\u0001J\b\u0010\u0089\u0001\u001a\u00030\u0085\u0001J\u0012\u0010\u008a\u0001\u001a\u00020$2\u0007\u0010\u008b\u0001\u001a\u00020$H\u0002J\u0007\u0010\u008c\u0001\u001a\u00020:J\u0010\u0010\u008d\u0001\u001a\u00020$2\u0007\u0010\u008e\u0001\u001a\u00020\u001dJ\u0010\u0010\u008f\u0001\u001a\u00020\u007f2\u0007\u0010\u008e\u0001\u001a\u00020\u001dJ\u0010\u0010\u0090\u0001\u001a\u00020\u007f2\u0007\u0010\u008e\u0001\u001a\u00020\u001dJ\u0010\u0010\u0091\u0001\u001a\u00020$2\u0007\u0010\u0092\u0001\u001a\u00020\u007fJ\b\u0010\u0093\u0001\u001a\u00030\u0085\u0001J\u0007\u0010\u0094\u0001\u001a\u00020$J\t\u0010\u0095\u0001\u001a\u00020\u0003H\u0016J\u0011\u0010\u0096\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u0097\u0001\u001a\u00020?J\u0007\u0010\u0098\u0001\u001a\u00020\bJ\u0007\u0010\u0099\u0001\u001a\u00020\bJ\u0007\u0010\u009a\u0001\u001a\u00020\bJ\u0007\u0010\u009b\u0001\u001a\u00020\bJ\u0007\u0010\u009c\u0001\u001a\u00020\bJ\b\u0010\u009d\u0001\u001a\u00030\u0085\u0001J\u0011\u0010\u009e\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u0092\u0001\u001a\u00020\u007fJ\u0013\u0010\u009f\u0001\u001a\u00030\u0085\u00012\t\b\u0002\u0010 \u0001\u001a\u00020\bJ\u0011\u0010¡\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u0087\u0001\u001a\u00020dJ\b\u0010¢\u0001\u001a\u00030\u0085\u0001J\n\u0010£\u0001\u001a\u00030\u0085\u0001H\u0016J\u0013\u0010¤\u0001\u001a\u00030\u0085\u00012\u0007\u0010¥\u0001\u001a\u00020\bH\u0016J\b\u0010¦\u0001\u001a\u00030\u0085\u0001J\u0011\u0010§\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u0092\u0001\u001a\u00020\u007fJ\u0010\u0010¨\u0001\u001a\u00020\b2\u0007\u0010©\u0001\u001a\u00020$J\u0011\u0010ª\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u0092\u0001\u001a\u00020\u007fR+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R+\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\rR+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00168F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u001d8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u000f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010%\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020$8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u000f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R+\u0010,\u001a\u00020+2\u0006\u0010\u0007\u001a\u00020+8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010\u000f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R7\u00104\u001a\b\u0012\u0004\u0012\u000203022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u000203028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010\u000f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R7\u0010;\u001a\b\u0012\u0004\u0012\u00020:022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020:028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010\u000f\u001a\u0004\b<\u00106\"\u0004\b=\u00108R+\u0010@\u001a\u00020?2\u0006\u0010\u0007\u001a\u00020?8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010\u000f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DRC\u0010H\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020G0F2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020G0F8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010\u000f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR+\u0010N\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010\u000f\u001a\u0004\bO\u0010\u000b\"\u0004\bP\u0010\rR+\u0010R\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bT\u0010\u000f\u001a\u0004\bR\u0010\u000b\"\u0004\bS\u0010\rR+\u0010V\u001a\u00020U2\u0006\u0010\u0007\u001a\u00020U8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b[\u0010\u000f\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR7\u0010\\\u001a\b\u0012\u0004\u0012\u00020:022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020:028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b_\u0010\u000f\u001a\u0004\b]\u00106\"\u0004\b^\u00108R+\u0010`\u001a\u00020+2\u0006\u0010\u0007\u001a\u00020+8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bc\u0010\u000f\u001a\u0004\ba\u0010.\"\u0004\bb\u00100R7\u0010e\u001a\b\u0012\u0004\u0012\u00020d022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020d028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bh\u0010\u000f\u001a\u0004\bf\u00106\"\u0004\bg\u00108R7\u0010j\u001a\b\u0012\u0004\u0012\u00020i022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020i028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bm\u0010\u000f\u001a\u0004\bk\u00106\"\u0004\bl\u00108R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR+\u0010q\u001a\u00020p2\u0006\u0010\u0007\u001a\u00020p8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bv\u0010\u000f\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR+\u0010w\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020$8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bz\u0010\u000f\u001a\u0004\bx\u0010'\"\u0004\by\u0010)RC\u0010{\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0F2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0F8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b~\u0010\u000f\u001a\u0004\b|\u0010J\"\u0004\b}\u0010LR;\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u007f022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u007f028F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010\u000f\u001a\u0005\b\u0081\u0001\u00106\"\u0005\b\u0082\u0001\u00108¨\u0006«\u0001"}, d2 = {"Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;", "Lcn/jianyun/workplan/module/base/vm/BaseViewModel;", "baseRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "scheduleService", "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;", "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;)V", "<set-?>", "", "adding", "getAdding", "()Z", "setAdding", "(Z)V", "adding$delegate", "Landroidx/compose/runtime/MutableState;", "getBaseRepository", "()Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "clear", "getClear", "setClear", "clear$delegate", "Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;", "config", "getConfig", "()Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;", "setConfig", "(Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;)V", "config$delegate", "Ljava/util/Date;", "currentDate", "getCurrentDate", "()Ljava/util/Date;", "setCurrentDate", "(Ljava/util/Date;)V", "currentDate$delegate", "", "currentProjectName", "getCurrentProjectName", "()Ljava/lang/String;", "setCurrentProjectName", "(Ljava/lang/String;)V", "currentProjectName$delegate", "Lcn/jianyun/workplan/ui/graph/model/PieGraphData;", "durationPieData", "getDurationPieData", "()Lcn/jianyun/workplan/ui/graph/model/PieGraphData;", "setDurationPieData", "(Lcn/jianyun/workplan/ui/graph/model/PieGraphData;)V", "durationPieData$delegate", "", "Lcn/jianyun/workplan/module/schedule/model/DutyDetail;", "dutyList", "getDutyList", "()Ljava/util/List;", "setDutyList", "(Ljava/util/List;)V", "dutyList$delegate", "Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;", "dutys", "getDutys", "setDutys", "dutys$delegate", "", "gid", "getGid", "()I", "setGid", "(I)V", "gid$delegate", "", "Lcn/jianyun/workplan/api/FestivalData;", "holidayMap", "getHolidayMap", "()Ljava/util/Map;", "setHolidayMap", "(Ljava/util/Map;)V", "holidayMap$delegate", "homeEdit", "getHomeEdit", "setHomeEdit", "homeEdit$delegate", "isEmptyWork", "setEmptyWork", "isEmptyWork$delegate", "Lcn/jianyun/workplan/model/FormType;", "pageType", "getPageType", "()Lcn/jianyun/workplan/model/FormType;", "setPageType", "(Lcn/jianyun/workplan/model/FormType;)V", "pageType$delegate", "periodDutys", "getPeriodDutys", "setPeriodDutys", "periodDutys$delegate", "pieData", "getPieData", "setPieData", "pieData$delegate", "Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;", "plans", "getPlans", "setPlans", "plans$delegate", "Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;", "projectList", "getProjectList", "setProjectList", "projectList$delegate", "getScheduleService", "()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;", "Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;", "statModel", "getStatModel", "()Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;", "setStatModel", "(Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;)V", "statModel$delegate", "totalDuration", "getTotalDuration", "setTotalDuration", "totalDuration$delegate", "workDurationMap", "getWorkDurationMap", "setWorkDurationMap", "workDurationMap$delegate", "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;", "works", "getWorks", "setWorks", "works$delegate", "changeConfig", "", "changeProject", "it", "doChange", "doExport", "exportDurationText", b.f2259d, "fetchDuty", "fetchDutyRemark", XmlErrorCodes.DATE, "fetchDutyWork", "fetchSecondDutyWork", "fetchWorkDuration", "work", "finish", "getCurrentDateStr", "getRepository", "goDay", "day", "isAlarmPage", "isHomePage", "isSettingPage", "isStatPage", "isWorkPage", "makeClean", "makeDuty", "makeEdit", "toggle", "makePlanDuty", "makeStat", "reload", "reloadData", "dataChanged", "removeCurrentDay", "setFirstWork", "setRemark", "remark", "setSecondWork", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ScheduleStatViewModel extends BaseViewModel {
    public static final int $stable = 8;

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

    /* JADX INFO: renamed from: durationPieData$delegate, reason: from kotlin metadata */
    private final MutableState durationPieData;

    /* JADX INFO: renamed from: dutyList$delegate, reason: from kotlin metadata */
    private final MutableState dutyList;

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

    /* JADX INFO: renamed from: statModel$delegate, reason: from kotlin metadata */
    private final MutableState statModel;

    /* JADX INFO: renamed from: totalDuration$delegate, reason: from kotlin metadata */
    private final MutableState totalDuration;

    /* JADX INFO: renamed from: workDurationMap$delegate, reason: from kotlin metadata */
    private final MutableState workDurationMap;

    /* JADX INFO: renamed from: works$delegate, reason: from kotlin metadata */
    private final MutableState works;

    public final BaseRepository getBaseRepository() {
        return this.baseRepository;
    }

    public final ScheduleService getScheduleService() {
        return this.scheduleService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public ScheduleStatViewModel(BaseRepository baseRepository, ScheduleService scheduleService) {
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
        String str = null;
        this.config = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new ScheduleConfig(null == true ? 1 : 0, str, null == true ? 1 : 0, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, 0, null, 67108863, null), null, 2, null);
        this.adding = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.clear = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.isEmptyWork = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        this.dutyList = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
        this.workDurationMap = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
        this.totalDuration = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.statModel = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new RangeDate(null, null == true ? 1 : 0, 3, null == true ? 1 : 0), null, 2, null);
        String str2 = null;
        String str3 = null;
        int i = 15;
        this.pieData = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new PieGraphData(str2, str3, null == true ? 1 : 0, str, i, null == true ? 1 : 0), null, 2, null);
        this.durationPieData = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new PieGraphData(str2, str3, null == true ? 1 : 0, str, i, null == true ? 1 : 0), null, 2, null);
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

    public final List<DutyDetail> getDutyList() {
        return (List) this.dutyList.getValue();
    }

    public final void setDutyList(List<DutyDetail> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dutyList.setValue(list);
    }

    public final Map<String, String> getWorkDurationMap() {
        return (Map) this.workDurationMap.getValue();
    }

    public final void setWorkDurationMap(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.workDurationMap.setValue(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getTotalDuration() {
        return (String) this.totalDuration.getValue();
    }

    public final void setTotalDuration(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.totalDuration.setValue(str);
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

    /* JADX WARN: Multi-variable type inference failed */
    public final PieGraphData getDurationPieData() {
        return (PieGraphData) this.durationPieData.getValue();
    }

    public final void setDurationPieData(PieGraphData pieGraphData) {
        Intrinsics.checkNotNullParameter(pieGraphData, "<set-?>");
        this.durationPieData.setValue(pieGraphData);
    }

    public static /* synthetic */ void makeEdit$default(ScheduleStatViewModel scheduleStatViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        scheduleStatViewModel.makeEdit(z);
    }

    public final void makeEdit(boolean toggle) {
        if (toggle && getHomeEdit()) {
            setHomeEdit(false);
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

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$reload$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleStatViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$reload$1", f = "ScheduleStatViewModel.kt", i = {}, l = {111, 112, 113, 117, 126, 127, 128, 129}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleStatViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x007a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:22:0x0098 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:34:0x00fa A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:36:0x010f  */
        /* JADX WARN: Code duplicated, block: B:39:0x0154 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:42:0x016e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:45:0x0192 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:48:0x01b7 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:49:0x01b8  */
        /* JADX WARN: Code duplicated, block: B:52:0x00c8 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ScheduleStatViewModel scheduleStatViewModel;
            ScheduleStatViewModel scheduleStatViewModel2;
            ScheduleStatViewModel scheduleStatViewModel3;
            Iterator<T> it;
            Object next;
            ScheduleProject scheduleProject;
            ScheduleStatViewModel scheduleStatViewModel4;
            ScheduleStatViewModel scheduleStatViewModel5;
            ScheduleStatViewModel scheduleStatViewModel6;
            ScheduleStatViewModel scheduleStatViewModel7;
            Object objListByProject;
            ScheduleStatViewModel scheduleStatViewModel8;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (ScheduleStatViewModel.this.getScheduleService().tryInitProject(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel;
                    this.label = 2;
                    obj = scheduleStatViewModel.getScheduleService().getProjectId(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel.setCurrentProjectId((String) obj);
                    scheduleStatViewModel2 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel2;
                    this.label = 3;
                    obj = scheduleStatViewModel2.getScheduleService().getScheduleProjectDao().list(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel2.setProjectList((List) obj);
                    List<ScheduleProject> projectList = ScheduleStatViewModel.this.getProjectList();
                    scheduleStatViewModel3 = ScheduleStatViewModel.this;
                    it = projectList.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        scheduleProject = (ScheduleProject) next;
                        if (scheduleProject == null) {
                            ScheduleStatViewModel scheduleStatViewModel9 = ScheduleStatViewModel.this;
                            scheduleStatViewModel9.setCurrentProjectId(scheduleStatViewModel9.getProjectList().get(0).getUuid());
                            this.L$0 = null;
                            this.label = 4;
                            if (ScheduleStatViewModel.this.getScheduleService().setProjectId(ScheduleStatViewModel.this.getCurrentProjectId(), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            ScheduleStatViewModel scheduleStatViewModel10 = ScheduleStatViewModel.this;
                            scheduleStatViewModel10.setCurrentProjectName(scheduleStatViewModel10.getProjectList().get(0).getName());
                        } else {
                            ScheduleStatViewModel.this.setCurrentProjectName(scheduleProject.getName());
                        }
                        ScheduleStatViewModel.this.setFormType(new FormType(DavPrincipal.KEY_SELF, null, null, 6, null));
                        ScheduleStatViewModel scheduleStatViewModel11 = ScheduleStatViewModel.this;
                        scheduleStatViewModel11.setOldSid(scheduleStatViewModel11.getBaseRepository().getSid());
                        scheduleStatViewModel4 = ScheduleStatViewModel.this;
                        this.L$0 = scheduleStatViewModel4;
                        this.label = 5;
                        obj = scheduleStatViewModel4.getBaseRepository().fetchHoliday(MyDateTool.getYear(ScheduleStatViewModel.this.getCurrentDate()), this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleStatViewModel4.setHolidayMap((Map) obj);
                        scheduleStatViewModel5 = ScheduleStatViewModel.this;
                        this.L$0 = scheduleStatViewModel5;
                        this.label = 6;
                        obj = scheduleStatViewModel5.getScheduleService().getConfig(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleStatViewModel5.setConfig((ScheduleConfig) obj);
                        scheduleStatViewModel6 = ScheduleStatViewModel.this;
                        this.L$0 = scheduleStatViewModel6;
                        this.label = 7;
                        obj = scheduleStatViewModel6.getScheduleService().getScheduleWorkDao().listByProject(ScheduleStatViewModel.this.getCurrentProjectId(), this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleStatViewModel6.setWorks((List) obj);
                        scheduleStatViewModel7 = ScheduleStatViewModel.this;
                        this.L$0 = scheduleStatViewModel7;
                        this.label = 8;
                        objListByProject = scheduleStatViewModel7.getScheduleService().getSchedulePlanDao().listByProject(ScheduleStatViewModel.this.getCurrentProjectId(), this);
                        if (objListByProject == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleStatViewModel8 = scheduleStatViewModel7;
                        obj = objListByProject;
                        scheduleStatViewModel8.setPlans((List) obj);
                        ScheduleStatViewModel scheduleStatViewModel12 = ScheduleStatViewModel.this;
                        scheduleStatViewModel12.setEmptyWork(scheduleStatViewModel12.getWorks().isEmpty());
                        ScheduleStatViewModel scheduleStatViewModel13 = ScheduleStatViewModel.this;
                        Date startDayOfMonth = MyDateTool.getStartDayOfMonth(ScheduleStatViewModel.this.getCurrentDate());
                        Intrinsics.checkNotNullExpressionValue(startDayOfMonth, "getStartDayOfMonth(currentDate)");
                        String strDateStr = CommonDateToolKt.dateStr(startDayOfMonth);
                        String lastDayStringOfMonth = MyDateTool.getLastDayStringOfMonth(ScheduleStatViewModel.this.getCurrentDate());
                        Intrinsics.checkNotNullExpressionValue(lastDayStringOfMonth, "getLastDayStringOfMonth(currentDate)");
                        scheduleStatViewModel13.setStatModel(new RangeDate(strDateStr, lastDayStringOfMonth));
                        BaseViewModel.reloadData$default(ScheduleStatViewModel.this, false, 1, null);
                        return Unit.INSTANCE;
                    } while (!Intrinsics.areEqual(((ScheduleProject) next).getUuid(), scheduleStatViewModel3.getCurrentProjectId()));
                    scheduleProject = (ScheduleProject) next;
                    if (scheduleProject == null) {
                        ScheduleStatViewModel scheduleStatViewModel14 = ScheduleStatViewModel.this;
                        scheduleStatViewModel14.setCurrentProjectId(scheduleStatViewModel14.getProjectList().get(0).getUuid());
                        this.L$0 = null;
                        this.label = 4;
                        if (ScheduleStatViewModel.this.getScheduleService().setProjectId(ScheduleStatViewModel.this.getCurrentProjectId(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ScheduleStatViewModel scheduleStatViewModel15 = ScheduleStatViewModel.this;
                        scheduleStatViewModel15.setCurrentProjectName(scheduleStatViewModel15.getProjectList().get(0).getName());
                    } else {
                        ScheduleStatViewModel.this.setCurrentProjectName(scheduleProject.getName());
                    }
                    ScheduleStatViewModel.this.setFormType(new FormType(DavPrincipal.KEY_SELF, null, null, 6, null));
                    ScheduleStatViewModel scheduleStatViewModel16 = ScheduleStatViewModel.this;
                    scheduleStatViewModel16.setOldSid(scheduleStatViewModel16.getBaseRepository().getSid());
                    scheduleStatViewModel4 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel4;
                    this.label = 5;
                    obj = scheduleStatViewModel4.getBaseRepository().fetchHoliday(MyDateTool.getYear(ScheduleStatViewModel.this.getCurrentDate()), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel4.setHolidayMap((Map) obj);
                    scheduleStatViewModel5 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel5;
                    this.label = 6;
                    obj = scheduleStatViewModel5.getScheduleService().getConfig(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel5.setConfig((ScheduleConfig) obj);
                    scheduleStatViewModel6 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel6;
                    this.label = 7;
                    obj = scheduleStatViewModel6.getScheduleService().getScheduleWorkDao().listByProject(ScheduleStatViewModel.this.getCurrentProjectId(), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel6.setWorks((List) obj);
                    scheduleStatViewModel7 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel7;
                    this.label = 8;
                    objListByProject = scheduleStatViewModel7.getScheduleService().getSchedulePlanDao().listByProject(ScheduleStatViewModel.this.getCurrentProjectId(), this);
                    if (objListByProject == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel8 = scheduleStatViewModel7;
                    obj = objListByProject;
                    scheduleStatViewModel8.setPlans((List) obj);
                    ScheduleStatViewModel scheduleStatViewModel17 = ScheduleStatViewModel.this;
                    scheduleStatViewModel17.setEmptyWork(scheduleStatViewModel17.getWorks().isEmpty());
                    ScheduleStatViewModel scheduleStatViewModel18 = ScheduleStatViewModel.this;
                    Date startDayOfMonth2 = MyDateTool.getStartDayOfMonth(ScheduleStatViewModel.this.getCurrentDate());
                    Intrinsics.checkNotNullExpressionValue(startDayOfMonth2, "getStartDayOfMonth(currentDate)");
                    String strDateStr2 = CommonDateToolKt.dateStr(startDayOfMonth2);
                    String lastDayStringOfMonth2 = MyDateTool.getLastDayStringOfMonth(ScheduleStatViewModel.this.getCurrentDate());
                    Intrinsics.checkNotNullExpressionValue(lastDayStringOfMonth2, "getLastDayStringOfMonth(currentDate)");
                    scheduleStatViewModel18.setStatModel(new RangeDate(strDateStr2, lastDayStringOfMonth2));
                    BaseViewModel.reloadData$default(ScheduleStatViewModel.this, false, 1, null);
                    return Unit.INSTANCE;
                case 1:
                    ResultKt.throwOnFailure(obj);
                    scheduleStatViewModel = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel;
                    this.label = 2;
                    obj = scheduleStatViewModel.getScheduleService().getProjectId(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel.setCurrentProjectId((String) obj);
                    scheduleStatViewModel2 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel2;
                    this.label = 3;
                    obj = scheduleStatViewModel2.getScheduleService().getScheduleProjectDao().list(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel2.setProjectList((List) obj);
                    List<ScheduleProject> projectList2 = ScheduleStatViewModel.this.getProjectList();
                    scheduleStatViewModel3 = ScheduleStatViewModel.this;
                    it = projectList2.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        scheduleProject = (ScheduleProject) next;
                        if (scheduleProject == null) {
                            ScheduleStatViewModel scheduleStatViewModel19 = ScheduleStatViewModel.this;
                            scheduleStatViewModel19.setCurrentProjectId(scheduleStatViewModel19.getProjectList().get(0).getUuid());
                            this.L$0 = null;
                            this.label = 4;
                            if (ScheduleStatViewModel.this.getScheduleService().setProjectId(ScheduleStatViewModel.this.getCurrentProjectId(), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            ScheduleStatViewModel scheduleStatViewModel110 = ScheduleStatViewModel.this;
                            scheduleStatViewModel110.setCurrentProjectName(scheduleStatViewModel110.getProjectList().get(0).getName());
                        } else {
                            ScheduleStatViewModel.this.setCurrentProjectName(scheduleProject.getName());
                        }
                        ScheduleStatViewModel.this.setFormType(new FormType(DavPrincipal.KEY_SELF, null, null, 6, null));
                        ScheduleStatViewModel scheduleStatViewModel111 = ScheduleStatViewModel.this;
                        scheduleStatViewModel111.setOldSid(scheduleStatViewModel111.getBaseRepository().getSid());
                        scheduleStatViewModel4 = ScheduleStatViewModel.this;
                        this.L$0 = scheduleStatViewModel4;
                        this.label = 5;
                        obj = scheduleStatViewModel4.getBaseRepository().fetchHoliday(MyDateTool.getYear(ScheduleStatViewModel.this.getCurrentDate()), this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleStatViewModel4.setHolidayMap((Map) obj);
                        scheduleStatViewModel5 = ScheduleStatViewModel.this;
                        this.L$0 = scheduleStatViewModel5;
                        this.label = 6;
                        obj = scheduleStatViewModel5.getScheduleService().getConfig(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleStatViewModel5.setConfig((ScheduleConfig) obj);
                        scheduleStatViewModel6 = ScheduleStatViewModel.this;
                        this.L$0 = scheduleStatViewModel6;
                        this.label = 7;
                        obj = scheduleStatViewModel6.getScheduleService().getScheduleWorkDao().listByProject(ScheduleStatViewModel.this.getCurrentProjectId(), this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleStatViewModel6.setWorks((List) obj);
                        scheduleStatViewModel7 = ScheduleStatViewModel.this;
                        this.L$0 = scheduleStatViewModel7;
                        this.label = 8;
                        objListByProject = scheduleStatViewModel7.getScheduleService().getSchedulePlanDao().listByProject(ScheduleStatViewModel.this.getCurrentProjectId(), this);
                        if (objListByProject == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleStatViewModel8 = scheduleStatViewModel7;
                        obj = objListByProject;
                        scheduleStatViewModel8.setPlans((List) obj);
                        ScheduleStatViewModel scheduleStatViewModel112 = ScheduleStatViewModel.this;
                        scheduleStatViewModel112.setEmptyWork(scheduleStatViewModel112.getWorks().isEmpty());
                        ScheduleStatViewModel scheduleStatViewModel113 = ScheduleStatViewModel.this;
                        Date startDayOfMonth3 = MyDateTool.getStartDayOfMonth(ScheduleStatViewModel.this.getCurrentDate());
                        Intrinsics.checkNotNullExpressionValue(startDayOfMonth3, "getStartDayOfMonth(currentDate)");
                        String strDateStr3 = CommonDateToolKt.dateStr(startDayOfMonth3);
                        String lastDayStringOfMonth3 = MyDateTool.getLastDayStringOfMonth(ScheduleStatViewModel.this.getCurrentDate());
                        Intrinsics.checkNotNullExpressionValue(lastDayStringOfMonth3, "getLastDayStringOfMonth(currentDate)");
                        scheduleStatViewModel113.setStatModel(new RangeDate(strDateStr3, lastDayStringOfMonth3));
                        BaseViewModel.reloadData$default(ScheduleStatViewModel.this, false, 1, null);
                        return Unit.INSTANCE;
                    } while (!Intrinsics.areEqual(((ScheduleProject) next).getUuid(), scheduleStatViewModel3.getCurrentProjectId()));
                    scheduleProject = (ScheduleProject) next;
                    if (scheduleProject == null) {
                        ScheduleStatViewModel scheduleStatViewModel114 = ScheduleStatViewModel.this;
                        scheduleStatViewModel114.setCurrentProjectId(scheduleStatViewModel114.getProjectList().get(0).getUuid());
                        this.L$0 = null;
                        this.label = 4;
                        if (ScheduleStatViewModel.this.getScheduleService().setProjectId(ScheduleStatViewModel.this.getCurrentProjectId(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ScheduleStatViewModel scheduleStatViewModel115 = ScheduleStatViewModel.this;
                        scheduleStatViewModel115.setCurrentProjectName(scheduleStatViewModel115.getProjectList().get(0).getName());
                    } else {
                        ScheduleStatViewModel.this.setCurrentProjectName(scheduleProject.getName());
                    }
                    ScheduleStatViewModel.this.setFormType(new FormType(DavPrincipal.KEY_SELF, null, null, 6, null));
                    ScheduleStatViewModel scheduleStatViewModel116 = ScheduleStatViewModel.this;
                    scheduleStatViewModel116.setOldSid(scheduleStatViewModel116.getBaseRepository().getSid());
                    scheduleStatViewModel4 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel4;
                    this.label = 5;
                    obj = scheduleStatViewModel4.getBaseRepository().fetchHoliday(MyDateTool.getYear(ScheduleStatViewModel.this.getCurrentDate()), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel4.setHolidayMap((Map) obj);
                    scheduleStatViewModel5 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel5;
                    this.label = 6;
                    obj = scheduleStatViewModel5.getScheduleService().getConfig(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel5.setConfig((ScheduleConfig) obj);
                    scheduleStatViewModel6 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel6;
                    this.label = 7;
                    obj = scheduleStatViewModel6.getScheduleService().getScheduleWorkDao().listByProject(ScheduleStatViewModel.this.getCurrentProjectId(), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel6.setWorks((List) obj);
                    scheduleStatViewModel7 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel7;
                    this.label = 8;
                    objListByProject = scheduleStatViewModel7.getScheduleService().getSchedulePlanDao().listByProject(ScheduleStatViewModel.this.getCurrentProjectId(), this);
                    if (objListByProject == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel8 = scheduleStatViewModel7;
                    obj = objListByProject;
                    scheduleStatViewModel8.setPlans((List) obj);
                    ScheduleStatViewModel scheduleStatViewModel117 = ScheduleStatViewModel.this;
                    scheduleStatViewModel117.setEmptyWork(scheduleStatViewModel117.getWorks().isEmpty());
                    ScheduleStatViewModel scheduleStatViewModel118 = ScheduleStatViewModel.this;
                    Date startDayOfMonth4 = MyDateTool.getStartDayOfMonth(ScheduleStatViewModel.this.getCurrentDate());
                    Intrinsics.checkNotNullExpressionValue(startDayOfMonth4, "getStartDayOfMonth(currentDate)");
                    String strDateStr4 = CommonDateToolKt.dateStr(startDayOfMonth4);
                    String lastDayStringOfMonth4 = MyDateTool.getLastDayStringOfMonth(ScheduleStatViewModel.this.getCurrentDate());
                    Intrinsics.checkNotNullExpressionValue(lastDayStringOfMonth4, "getLastDayStringOfMonth(currentDate)");
                    scheduleStatViewModel118.setStatModel(new RangeDate(strDateStr4, lastDayStringOfMonth4));
                    BaseViewModel.reloadData$default(ScheduleStatViewModel.this, false, 1, null);
                    return Unit.INSTANCE;
                case 2:
                    scheduleStatViewModel = (ScheduleStatViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    scheduleStatViewModel.setCurrentProjectId((String) obj);
                    scheduleStatViewModel2 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel2;
                    this.label = 3;
                    obj = scheduleStatViewModel2.getScheduleService().getScheduleProjectDao().list(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel2.setProjectList((List) obj);
                    List<ScheduleProject> projectList3 = ScheduleStatViewModel.this.getProjectList();
                    scheduleStatViewModel3 = ScheduleStatViewModel.this;
                    it = projectList3.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        scheduleProject = (ScheduleProject) next;
                        if (scheduleProject == null) {
                            ScheduleStatViewModel scheduleStatViewModel119 = ScheduleStatViewModel.this;
                            scheduleStatViewModel119.setCurrentProjectId(scheduleStatViewModel119.getProjectList().get(0).getUuid());
                            this.L$0 = null;
                            this.label = 4;
                            if (ScheduleStatViewModel.this.getScheduleService().setProjectId(ScheduleStatViewModel.this.getCurrentProjectId(), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            ScheduleStatViewModel scheduleStatViewModel1110 = ScheduleStatViewModel.this;
                            scheduleStatViewModel1110.setCurrentProjectName(scheduleStatViewModel1110.getProjectList().get(0).getName());
                        } else {
                            ScheduleStatViewModel.this.setCurrentProjectName(scheduleProject.getName());
                        }
                        ScheduleStatViewModel.this.setFormType(new FormType(DavPrincipal.KEY_SELF, null, null, 6, null));
                        ScheduleStatViewModel scheduleStatViewModel1111 = ScheduleStatViewModel.this;
                        scheduleStatViewModel1111.setOldSid(scheduleStatViewModel1111.getBaseRepository().getSid());
                        scheduleStatViewModel4 = ScheduleStatViewModel.this;
                        this.L$0 = scheduleStatViewModel4;
                        this.label = 5;
                        obj = scheduleStatViewModel4.getBaseRepository().fetchHoliday(MyDateTool.getYear(ScheduleStatViewModel.this.getCurrentDate()), this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleStatViewModel4.setHolidayMap((Map) obj);
                        scheduleStatViewModel5 = ScheduleStatViewModel.this;
                        this.L$0 = scheduleStatViewModel5;
                        this.label = 6;
                        obj = scheduleStatViewModel5.getScheduleService().getConfig(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleStatViewModel5.setConfig((ScheduleConfig) obj);
                        scheduleStatViewModel6 = ScheduleStatViewModel.this;
                        this.L$0 = scheduleStatViewModel6;
                        this.label = 7;
                        obj = scheduleStatViewModel6.getScheduleService().getScheduleWorkDao().listByProject(ScheduleStatViewModel.this.getCurrentProjectId(), this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleStatViewModel6.setWorks((List) obj);
                        scheduleStatViewModel7 = ScheduleStatViewModel.this;
                        this.L$0 = scheduleStatViewModel7;
                        this.label = 8;
                        objListByProject = scheduleStatViewModel7.getScheduleService().getSchedulePlanDao().listByProject(ScheduleStatViewModel.this.getCurrentProjectId(), this);
                        if (objListByProject == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleStatViewModel8 = scheduleStatViewModel7;
                        obj = objListByProject;
                        scheduleStatViewModel8.setPlans((List) obj);
                        ScheduleStatViewModel scheduleStatViewModel1112 = ScheduleStatViewModel.this;
                        scheduleStatViewModel1112.setEmptyWork(scheduleStatViewModel1112.getWorks().isEmpty());
                        ScheduleStatViewModel scheduleStatViewModel1113 = ScheduleStatViewModel.this;
                        Date startDayOfMonth5 = MyDateTool.getStartDayOfMonth(ScheduleStatViewModel.this.getCurrentDate());
                        Intrinsics.checkNotNullExpressionValue(startDayOfMonth5, "getStartDayOfMonth(currentDate)");
                        String strDateStr5 = CommonDateToolKt.dateStr(startDayOfMonth5);
                        String lastDayStringOfMonth5 = MyDateTool.getLastDayStringOfMonth(ScheduleStatViewModel.this.getCurrentDate());
                        Intrinsics.checkNotNullExpressionValue(lastDayStringOfMonth5, "getLastDayStringOfMonth(currentDate)");
                        scheduleStatViewModel1113.setStatModel(new RangeDate(strDateStr5, lastDayStringOfMonth5));
                        BaseViewModel.reloadData$default(ScheduleStatViewModel.this, false, 1, null);
                        return Unit.INSTANCE;
                    } while (!Intrinsics.areEqual(((ScheduleProject) next).getUuid(), scheduleStatViewModel3.getCurrentProjectId()));
                    scheduleProject = (ScheduleProject) next;
                    if (scheduleProject == null) {
                        ScheduleStatViewModel scheduleStatViewModel1114 = ScheduleStatViewModel.this;
                        scheduleStatViewModel1114.setCurrentProjectId(scheduleStatViewModel1114.getProjectList().get(0).getUuid());
                        this.L$0 = null;
                        this.label = 4;
                        if (ScheduleStatViewModel.this.getScheduleService().setProjectId(ScheduleStatViewModel.this.getCurrentProjectId(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ScheduleStatViewModel scheduleStatViewModel1115 = ScheduleStatViewModel.this;
                        scheduleStatViewModel1115.setCurrentProjectName(scheduleStatViewModel1115.getProjectList().get(0).getName());
                    } else {
                        ScheduleStatViewModel.this.setCurrentProjectName(scheduleProject.getName());
                    }
                    ScheduleStatViewModel.this.setFormType(new FormType(DavPrincipal.KEY_SELF, null, null, 6, null));
                    ScheduleStatViewModel scheduleStatViewModel1116 = ScheduleStatViewModel.this;
                    scheduleStatViewModel1116.setOldSid(scheduleStatViewModel1116.getBaseRepository().getSid());
                    scheduleStatViewModel4 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel4;
                    this.label = 5;
                    obj = scheduleStatViewModel4.getBaseRepository().fetchHoliday(MyDateTool.getYear(ScheduleStatViewModel.this.getCurrentDate()), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel4.setHolidayMap((Map) obj);
                    scheduleStatViewModel5 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel5;
                    this.label = 6;
                    obj = scheduleStatViewModel5.getScheduleService().getConfig(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel5.setConfig((ScheduleConfig) obj);
                    scheduleStatViewModel6 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel6;
                    this.label = 7;
                    obj = scheduleStatViewModel6.getScheduleService().getScheduleWorkDao().listByProject(ScheduleStatViewModel.this.getCurrentProjectId(), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel6.setWorks((List) obj);
                    scheduleStatViewModel7 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel7;
                    this.label = 8;
                    objListByProject = scheduleStatViewModel7.getScheduleService().getSchedulePlanDao().listByProject(ScheduleStatViewModel.this.getCurrentProjectId(), this);
                    if (objListByProject == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel8 = scheduleStatViewModel7;
                    obj = objListByProject;
                    scheduleStatViewModel8.setPlans((List) obj);
                    ScheduleStatViewModel scheduleStatViewModel1117 = ScheduleStatViewModel.this;
                    scheduleStatViewModel1117.setEmptyWork(scheduleStatViewModel1117.getWorks().isEmpty());
                    ScheduleStatViewModel scheduleStatViewModel1118 = ScheduleStatViewModel.this;
                    Date startDayOfMonth6 = MyDateTool.getStartDayOfMonth(ScheduleStatViewModel.this.getCurrentDate());
                    Intrinsics.checkNotNullExpressionValue(startDayOfMonth6, "getStartDayOfMonth(currentDate)");
                    String strDateStr6 = CommonDateToolKt.dateStr(startDayOfMonth6);
                    String lastDayStringOfMonth6 = MyDateTool.getLastDayStringOfMonth(ScheduleStatViewModel.this.getCurrentDate());
                    Intrinsics.checkNotNullExpressionValue(lastDayStringOfMonth6, "getLastDayStringOfMonth(currentDate)");
                    scheduleStatViewModel1118.setStatModel(new RangeDate(strDateStr6, lastDayStringOfMonth6));
                    BaseViewModel.reloadData$default(ScheduleStatViewModel.this, false, 1, null);
                    return Unit.INSTANCE;
                case 3:
                    scheduleStatViewModel2 = (ScheduleStatViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    scheduleStatViewModel2.setProjectList((List) obj);
                    List<ScheduleProject> projectList4 = ScheduleStatViewModel.this.getProjectList();
                    scheduleStatViewModel3 = ScheduleStatViewModel.this;
                    it = projectList4.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        scheduleProject = (ScheduleProject) next;
                        if (scheduleProject == null) {
                            ScheduleStatViewModel scheduleStatViewModel1119 = ScheduleStatViewModel.this;
                            scheduleStatViewModel1119.setCurrentProjectId(scheduleStatViewModel1119.getProjectList().get(0).getUuid());
                            this.L$0 = null;
                            this.label = 4;
                            if (ScheduleStatViewModel.this.getScheduleService().setProjectId(ScheduleStatViewModel.this.getCurrentProjectId(), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            ScheduleStatViewModel scheduleStatViewModel11110 = ScheduleStatViewModel.this;
                            scheduleStatViewModel11110.setCurrentProjectName(scheduleStatViewModel11110.getProjectList().get(0).getName());
                        } else {
                            ScheduleStatViewModel.this.setCurrentProjectName(scheduleProject.getName());
                        }
                        ScheduleStatViewModel.this.setFormType(new FormType(DavPrincipal.KEY_SELF, null, null, 6, null));
                        ScheduleStatViewModel scheduleStatViewModel11111 = ScheduleStatViewModel.this;
                        scheduleStatViewModel11111.setOldSid(scheduleStatViewModel11111.getBaseRepository().getSid());
                        scheduleStatViewModel4 = ScheduleStatViewModel.this;
                        this.L$0 = scheduleStatViewModel4;
                        this.label = 5;
                        obj = scheduleStatViewModel4.getBaseRepository().fetchHoliday(MyDateTool.getYear(ScheduleStatViewModel.this.getCurrentDate()), this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleStatViewModel4.setHolidayMap((Map) obj);
                        scheduleStatViewModel5 = ScheduleStatViewModel.this;
                        this.L$0 = scheduleStatViewModel5;
                        this.label = 6;
                        obj = scheduleStatViewModel5.getScheduleService().getConfig(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleStatViewModel5.setConfig((ScheduleConfig) obj);
                        scheduleStatViewModel6 = ScheduleStatViewModel.this;
                        this.L$0 = scheduleStatViewModel6;
                        this.label = 7;
                        obj = scheduleStatViewModel6.getScheduleService().getScheduleWorkDao().listByProject(ScheduleStatViewModel.this.getCurrentProjectId(), this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleStatViewModel6.setWorks((List) obj);
                        scheduleStatViewModel7 = ScheduleStatViewModel.this;
                        this.L$0 = scheduleStatViewModel7;
                        this.label = 8;
                        objListByProject = scheduleStatViewModel7.getScheduleService().getSchedulePlanDao().listByProject(ScheduleStatViewModel.this.getCurrentProjectId(), this);
                        if (objListByProject == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleStatViewModel8 = scheduleStatViewModel7;
                        obj = objListByProject;
                        scheduleStatViewModel8.setPlans((List) obj);
                        ScheduleStatViewModel scheduleStatViewModel11112 = ScheduleStatViewModel.this;
                        scheduleStatViewModel11112.setEmptyWork(scheduleStatViewModel11112.getWorks().isEmpty());
                        ScheduleStatViewModel scheduleStatViewModel11113 = ScheduleStatViewModel.this;
                        Date startDayOfMonth7 = MyDateTool.getStartDayOfMonth(ScheduleStatViewModel.this.getCurrentDate());
                        Intrinsics.checkNotNullExpressionValue(startDayOfMonth7, "getStartDayOfMonth(currentDate)");
                        String strDateStr7 = CommonDateToolKt.dateStr(startDayOfMonth7);
                        String lastDayStringOfMonth7 = MyDateTool.getLastDayStringOfMonth(ScheduleStatViewModel.this.getCurrentDate());
                        Intrinsics.checkNotNullExpressionValue(lastDayStringOfMonth7, "getLastDayStringOfMonth(currentDate)");
                        scheduleStatViewModel11113.setStatModel(new RangeDate(strDateStr7, lastDayStringOfMonth7));
                        BaseViewModel.reloadData$default(ScheduleStatViewModel.this, false, 1, null);
                        return Unit.INSTANCE;
                    } while (!Intrinsics.areEqual(((ScheduleProject) next).getUuid(), scheduleStatViewModel3.getCurrentProjectId()));
                    scheduleProject = (ScheduleProject) next;
                    if (scheduleProject == null) {
                        ScheduleStatViewModel scheduleStatViewModel11114 = ScheduleStatViewModel.this;
                        scheduleStatViewModel11114.setCurrentProjectId(scheduleStatViewModel11114.getProjectList().get(0).getUuid());
                        this.L$0 = null;
                        this.label = 4;
                        if (ScheduleStatViewModel.this.getScheduleService().setProjectId(ScheduleStatViewModel.this.getCurrentProjectId(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ScheduleStatViewModel scheduleStatViewModel11115 = ScheduleStatViewModel.this;
                        scheduleStatViewModel11115.setCurrentProjectName(scheduleStatViewModel11115.getProjectList().get(0).getName());
                    } else {
                        ScheduleStatViewModel.this.setCurrentProjectName(scheduleProject.getName());
                    }
                    ScheduleStatViewModel.this.setFormType(new FormType(DavPrincipal.KEY_SELF, null, null, 6, null));
                    ScheduleStatViewModel scheduleStatViewModel11116 = ScheduleStatViewModel.this;
                    scheduleStatViewModel11116.setOldSid(scheduleStatViewModel11116.getBaseRepository().getSid());
                    scheduleStatViewModel4 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel4;
                    this.label = 5;
                    obj = scheduleStatViewModel4.getBaseRepository().fetchHoliday(MyDateTool.getYear(ScheduleStatViewModel.this.getCurrentDate()), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel4.setHolidayMap((Map) obj);
                    scheduleStatViewModel5 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel5;
                    this.label = 6;
                    obj = scheduleStatViewModel5.getScheduleService().getConfig(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel5.setConfig((ScheduleConfig) obj);
                    scheduleStatViewModel6 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel6;
                    this.label = 7;
                    obj = scheduleStatViewModel6.getScheduleService().getScheduleWorkDao().listByProject(ScheduleStatViewModel.this.getCurrentProjectId(), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel6.setWorks((List) obj);
                    scheduleStatViewModel7 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel7;
                    this.label = 8;
                    objListByProject = scheduleStatViewModel7.getScheduleService().getSchedulePlanDao().listByProject(ScheduleStatViewModel.this.getCurrentProjectId(), this);
                    if (objListByProject == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel8 = scheduleStatViewModel7;
                    obj = objListByProject;
                    scheduleStatViewModel8.setPlans((List) obj);
                    ScheduleStatViewModel scheduleStatViewModel11117 = ScheduleStatViewModel.this;
                    scheduleStatViewModel11117.setEmptyWork(scheduleStatViewModel11117.getWorks().isEmpty());
                    ScheduleStatViewModel scheduleStatViewModel11118 = ScheduleStatViewModel.this;
                    Date startDayOfMonth8 = MyDateTool.getStartDayOfMonth(ScheduleStatViewModel.this.getCurrentDate());
                    Intrinsics.checkNotNullExpressionValue(startDayOfMonth8, "getStartDayOfMonth(currentDate)");
                    String strDateStr8 = CommonDateToolKt.dateStr(startDayOfMonth8);
                    String lastDayStringOfMonth8 = MyDateTool.getLastDayStringOfMonth(ScheduleStatViewModel.this.getCurrentDate());
                    Intrinsics.checkNotNullExpressionValue(lastDayStringOfMonth8, "getLastDayStringOfMonth(currentDate)");
                    scheduleStatViewModel11118.setStatModel(new RangeDate(strDateStr8, lastDayStringOfMonth8));
                    BaseViewModel.reloadData$default(ScheduleStatViewModel.this, false, 1, null);
                    return Unit.INSTANCE;
                case 4:
                    ResultKt.throwOnFailure(obj);
                    ScheduleStatViewModel scheduleStatViewModel11119 = ScheduleStatViewModel.this;
                    scheduleStatViewModel11119.setCurrentProjectName(scheduleStatViewModel11119.getProjectList().get(0).getName());
                    ScheduleStatViewModel.this.setFormType(new FormType(DavPrincipal.KEY_SELF, null, null, 6, null));
                    ScheduleStatViewModel scheduleStatViewModel111110 = ScheduleStatViewModel.this;
                    scheduleStatViewModel111110.setOldSid(scheduleStatViewModel111110.getBaseRepository().getSid());
                    scheduleStatViewModel4 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel4;
                    this.label = 5;
                    obj = scheduleStatViewModel4.getBaseRepository().fetchHoliday(MyDateTool.getYear(ScheduleStatViewModel.this.getCurrentDate()), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel4.setHolidayMap((Map) obj);
                    scheduleStatViewModel5 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel5;
                    this.label = 6;
                    obj = scheduleStatViewModel5.getScheduleService().getConfig(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel5.setConfig((ScheduleConfig) obj);
                    scheduleStatViewModel6 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel6;
                    this.label = 7;
                    obj = scheduleStatViewModel6.getScheduleService().getScheduleWorkDao().listByProject(ScheduleStatViewModel.this.getCurrentProjectId(), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel6.setWorks((List) obj);
                    scheduleStatViewModel7 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel7;
                    this.label = 8;
                    objListByProject = scheduleStatViewModel7.getScheduleService().getSchedulePlanDao().listByProject(ScheduleStatViewModel.this.getCurrentProjectId(), this);
                    if (objListByProject == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel8 = scheduleStatViewModel7;
                    obj = objListByProject;
                    scheduleStatViewModel8.setPlans((List) obj);
                    ScheduleStatViewModel scheduleStatViewModel111111 = ScheduleStatViewModel.this;
                    scheduleStatViewModel111111.setEmptyWork(scheduleStatViewModel111111.getWorks().isEmpty());
                    ScheduleStatViewModel scheduleStatViewModel111112 = ScheduleStatViewModel.this;
                    Date startDayOfMonth9 = MyDateTool.getStartDayOfMonth(ScheduleStatViewModel.this.getCurrentDate());
                    Intrinsics.checkNotNullExpressionValue(startDayOfMonth9, "getStartDayOfMonth(currentDate)");
                    String strDateStr9 = CommonDateToolKt.dateStr(startDayOfMonth9);
                    String lastDayStringOfMonth9 = MyDateTool.getLastDayStringOfMonth(ScheduleStatViewModel.this.getCurrentDate());
                    Intrinsics.checkNotNullExpressionValue(lastDayStringOfMonth9, "getLastDayStringOfMonth(currentDate)");
                    scheduleStatViewModel111112.setStatModel(new RangeDate(strDateStr9, lastDayStringOfMonth9));
                    BaseViewModel.reloadData$default(ScheduleStatViewModel.this, false, 1, null);
                    return Unit.INSTANCE;
                case 5:
                    scheduleStatViewModel4 = (ScheduleStatViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    scheduleStatViewModel4.setHolidayMap((Map) obj);
                    scheduleStatViewModel5 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel5;
                    this.label = 6;
                    obj = scheduleStatViewModel5.getScheduleService().getConfig(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel5.setConfig((ScheduleConfig) obj);
                    scheduleStatViewModel6 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel6;
                    this.label = 7;
                    obj = scheduleStatViewModel6.getScheduleService().getScheduleWorkDao().listByProject(ScheduleStatViewModel.this.getCurrentProjectId(), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel6.setWorks((List) obj);
                    scheduleStatViewModel7 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel7;
                    this.label = 8;
                    objListByProject = scheduleStatViewModel7.getScheduleService().getSchedulePlanDao().listByProject(ScheduleStatViewModel.this.getCurrentProjectId(), this);
                    if (objListByProject == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel8 = scheduleStatViewModel7;
                    obj = objListByProject;
                    scheduleStatViewModel8.setPlans((List) obj);
                    ScheduleStatViewModel scheduleStatViewModel111113 = ScheduleStatViewModel.this;
                    scheduleStatViewModel111113.setEmptyWork(scheduleStatViewModel111113.getWorks().isEmpty());
                    ScheduleStatViewModel scheduleStatViewModel111114 = ScheduleStatViewModel.this;
                    Date startDayOfMonth10 = MyDateTool.getStartDayOfMonth(ScheduleStatViewModel.this.getCurrentDate());
                    Intrinsics.checkNotNullExpressionValue(startDayOfMonth10, "getStartDayOfMonth(currentDate)");
                    String strDateStr10 = CommonDateToolKt.dateStr(startDayOfMonth10);
                    String lastDayStringOfMonth10 = MyDateTool.getLastDayStringOfMonth(ScheduleStatViewModel.this.getCurrentDate());
                    Intrinsics.checkNotNullExpressionValue(lastDayStringOfMonth10, "getLastDayStringOfMonth(currentDate)");
                    scheduleStatViewModel111114.setStatModel(new RangeDate(strDateStr10, lastDayStringOfMonth10));
                    BaseViewModel.reloadData$default(ScheduleStatViewModel.this, false, 1, null);
                    return Unit.INSTANCE;
                case 6:
                    scheduleStatViewModel5 = (ScheduleStatViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    scheduleStatViewModel5.setConfig((ScheduleConfig) obj);
                    scheduleStatViewModel6 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel6;
                    this.label = 7;
                    obj = scheduleStatViewModel6.getScheduleService().getScheduleWorkDao().listByProject(ScheduleStatViewModel.this.getCurrentProjectId(), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel6.setWorks((List) obj);
                    scheduleStatViewModel7 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel7;
                    this.label = 8;
                    objListByProject = scheduleStatViewModel7.getScheduleService().getSchedulePlanDao().listByProject(ScheduleStatViewModel.this.getCurrentProjectId(), this);
                    if (objListByProject == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel8 = scheduleStatViewModel7;
                    obj = objListByProject;
                    scheduleStatViewModel8.setPlans((List) obj);
                    ScheduleStatViewModel scheduleStatViewModel111115 = ScheduleStatViewModel.this;
                    scheduleStatViewModel111115.setEmptyWork(scheduleStatViewModel111115.getWorks().isEmpty());
                    ScheduleStatViewModel scheduleStatViewModel111116 = ScheduleStatViewModel.this;
                    Date startDayOfMonth11 = MyDateTool.getStartDayOfMonth(ScheduleStatViewModel.this.getCurrentDate());
                    Intrinsics.checkNotNullExpressionValue(startDayOfMonth11, "getStartDayOfMonth(currentDate)");
                    String strDateStr11 = CommonDateToolKt.dateStr(startDayOfMonth11);
                    String lastDayStringOfMonth11 = MyDateTool.getLastDayStringOfMonth(ScheduleStatViewModel.this.getCurrentDate());
                    Intrinsics.checkNotNullExpressionValue(lastDayStringOfMonth11, "getLastDayStringOfMonth(currentDate)");
                    scheduleStatViewModel111116.setStatModel(new RangeDate(strDateStr11, lastDayStringOfMonth11));
                    BaseViewModel.reloadData$default(ScheduleStatViewModel.this, false, 1, null);
                    return Unit.INSTANCE;
                case 7:
                    scheduleStatViewModel6 = (ScheduleStatViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    scheduleStatViewModel6.setWorks((List) obj);
                    scheduleStatViewModel7 = ScheduleStatViewModel.this;
                    this.L$0 = scheduleStatViewModel7;
                    this.label = 8;
                    objListByProject = scheduleStatViewModel7.getScheduleService().getSchedulePlanDao().listByProject(ScheduleStatViewModel.this.getCurrentProjectId(), this);
                    if (objListByProject == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleStatViewModel8 = scheduleStatViewModel7;
                    obj = objListByProject;
                    scheduleStatViewModel8.setPlans((List) obj);
                    ScheduleStatViewModel scheduleStatViewModel111117 = ScheduleStatViewModel.this;
                    scheduleStatViewModel111117.setEmptyWork(scheduleStatViewModel111117.getWorks().isEmpty());
                    ScheduleStatViewModel scheduleStatViewModel111118 = ScheduleStatViewModel.this;
                    Date startDayOfMonth12 = MyDateTool.getStartDayOfMonth(ScheduleStatViewModel.this.getCurrentDate());
                    Intrinsics.checkNotNullExpressionValue(startDayOfMonth12, "getStartDayOfMonth(currentDate)");
                    String strDateStr12 = CommonDateToolKt.dateStr(startDayOfMonth12);
                    String lastDayStringOfMonth12 = MyDateTool.getLastDayStringOfMonth(ScheduleStatViewModel.this.getCurrentDate());
                    Intrinsics.checkNotNullExpressionValue(lastDayStringOfMonth12, "getLastDayStringOfMonth(currentDate)");
                    scheduleStatViewModel111118.setStatModel(new RangeDate(strDateStr12, lastDayStringOfMonth12));
                    BaseViewModel.reloadData$default(ScheduleStatViewModel.this, false, 1, null);
                    return Unit.INSTANCE;
                case 8:
                    scheduleStatViewModel8 = (ScheduleStatViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    scheduleStatViewModel8.setPlans((List) obj);
                    ScheduleStatViewModel scheduleStatViewModel111119 = ScheduleStatViewModel.this;
                    scheduleStatViewModel111119.setEmptyWork(scheduleStatViewModel111119.getWorks().isEmpty());
                    ScheduleStatViewModel scheduleStatViewModel1111110 = ScheduleStatViewModel.this;
                    Date startDayOfMonth13 = MyDateTool.getStartDayOfMonth(ScheduleStatViewModel.this.getCurrentDate());
                    Intrinsics.checkNotNullExpressionValue(startDayOfMonth13, "getStartDayOfMonth(currentDate)");
                    String strDateStr13 = CommonDateToolKt.dateStr(startDayOfMonth13);
                    String lastDayStringOfMonth13 = MyDateTool.getLastDayStringOfMonth(ScheduleStatViewModel.this.getCurrentDate());
                    Intrinsics.checkNotNullExpressionValue(lastDayStringOfMonth13, "getLastDayStringOfMonth(currentDate)");
                    scheduleStatViewModel1111110.setStatModel(new RangeDate(strDateStr13, lastDayStringOfMonth13));
                    BaseViewModel.reloadData$default(ScheduleStatViewModel.this, false, 1, null);
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

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$reloadData$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleStatViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$reloadData$1", f = "ScheduleStatViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleStatViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ScheduleStatViewModel.this.makeStat();
            return Unit.INSTANCE;
        }
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseViewModel
    public void reloadData(boolean dataChanged) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final void doChange() {
        reloadData(false);
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

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$removeCurrentDay$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleStatViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$removeCurrentDay$1", f = "ScheduleStatViewModel.kt", i = {}, l = {214, 217}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleStatViewModel.this.new AnonymousClass1(continuation);
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
                obj = ScheduleStatViewModel.this.getScheduleService().getScheduleDutyDao().findByDay(ScheduleStatViewModel.this.getCurrentProjectId(), ScheduleStatViewModel.this.getCurrentDateStr(), this);
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
                ScheduleStatViewModel.this.reloadData(true);
                return Unit.INSTANCE;
            }
            if (!((List) obj).isEmpty()) {
                this.label = 2;
                if (ScheduleStatViewModel.this.getScheduleService().getScheduleDutyDao().deleteByDay(ScheduleStatViewModel.this.getCurrentProjectId(), ScheduleStatViewModel.this.getCurrentDateStr(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ScheduleStatViewModel.this.reloadData(true);
            }
            return Unit.INSTANCE;
        }
    }

    public final void removeCurrentDay() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final void goDay(int day) {
        Date dateGapDay = MyDateTool.gapDay(getCurrentDate(), day);
        Intrinsics.checkNotNullExpressionValue(dateGapDay, "gapDay(currentDate, day)");
        setCurrentDate(dateGapDay);
    }

    public final void finish() {
        setHomeEdit(false);
    }

    public final void makeDuty(ScheduleWork work) {
        Intrinsics.checkNotNullParameter(work, "work");
        setAdding(true);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(work, null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$makeDuty$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleStatViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$makeDuty$1", f = "ScheduleStatViewModel.kt", i = {}, l = {235, 238, MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_INDEX_CACHE}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ScheduleWork $work;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ScheduleWork scheduleWork, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$work = scheduleWork;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleStatViewModel.this.new AnonymousClass1(this.$work, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x00c0 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objFindByDay;
            ScheduleDuty scheduleDuty;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objFindByDay = ScheduleStatViewModel.this.getScheduleService().getScheduleDutyDao().findByDay(ScheduleStatViewModel.this.getCurrentProjectId(), ScheduleStatViewModel.this.getCurrentDateStr(), this);
                if (objFindByDay == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    objFindByDay = obj;
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    String str = null;
                    scheduleDuty = new ScheduleDuty(CommonToolKt.uuid(), ScheduleStatViewModel.this.getCurrentDateStr(), str, this.$work.fetchFirstWorkUuid(), this.$work.fetchSecondWorkUuid(), ScheduleStatViewModel.this.getCurrentProjectId(), null, null, null, null, null, 0, null, 8132, null);
                    this.label = 3;
                    if (ScheduleStatViewModel.this.getScheduleService().getScheduleDutyDao().insert(scheduleDuty, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ScheduleStatViewModel scheduleStatViewModel = ScheduleStatViewModel.this;
                Date dateGapDay = MyDateTool.gapDay(scheduleStatViewModel.getCurrentDate(), 1);
                Intrinsics.checkNotNullExpressionValue(dateGapDay, "gapDay(currentDate, 1)");
                scheduleStatViewModel.setCurrentDate(dateGapDay);
                ScheduleStatViewModel.this.reloadData(true);
                ScheduleStatViewModel.this.setAdding(false);
                return Unit.INSTANCE;
            }
            if (!((List) objFindByDay).isEmpty()) {
                this.label = 2;
                if (ScheduleStatViewModel.this.getScheduleService().getScheduleDutyDao().deleteByDay(ScheduleStatViewModel.this.getCurrentProjectId(), ScheduleStatViewModel.this.getCurrentDateStr(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            String str2 = null;
            scheduleDuty = new ScheduleDuty(CommonToolKt.uuid(), ScheduleStatViewModel.this.getCurrentDateStr(), str2, this.$work.fetchFirstWorkUuid(), this.$work.fetchSecondWorkUuid(), ScheduleStatViewModel.this.getCurrentProjectId(), null, null, null, null, null, 0, null, 8132, null);
            this.label = 3;
            if (ScheduleStatViewModel.this.getScheduleService().getScheduleDutyDao().insert(scheduleDuty, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            ScheduleStatViewModel scheduleStatViewModel2 = ScheduleStatViewModel.this;
            Date dateGapDay2 = MyDateTool.gapDay(scheduleStatViewModel2.getCurrentDate(), 1);
            Intrinsics.checkNotNullExpressionValue(dateGapDay2, "gapDay(currentDate, 1)");
            scheduleStatViewModel2.setCurrentDate(dateGapDay2);
            ScheduleStatViewModel.this.reloadData(true);
            ScheduleStatViewModel.this.setAdding(false);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$makePlanDuty$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleStatViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$makePlanDuty$1", f = "ScheduleStatViewModel.kt", i = {1, 1, 1, 2, 2}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_AUDIO_PROCESSOR_ADDR, 255, MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_RANGE_TIME}, m = "invokeSuspend", n = {"works", "day", Complex.DEFAULT_SUFFIX, "works", Complex.DEFAULT_SUFFIX}, s = {"L$0", "L$1", "I$0", "L$0", "I$0"})
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
            return ScheduleStatViewModel.this.new AnonymousClass1(this.$it, continuation);
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
            throw new UnsupportedOperationException("Method not decompiled: cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void makePlanDuty(SchedulePlan it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(it, null), 3, null);
    }

    public final void makeStat() {
        if (getStatModel().isValid()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$makeStat$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleStatViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$makeStat$1", f = "ScheduleStatViewModel.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_HTTP_REQ_FINSIH_TIME}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleStatViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [T, java.util.List] */
        /* JADX WARN: Type inference failed for: r4v6, types: [T, java.util.Map] */
        /* JADX WARN: Type inference failed for: r6v4, types: [T, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objListByPeriod;
            ScheduleStatViewModel scheduleStatViewModel;
            String str;
            Object next;
            boolean z;
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            int i2 = 1;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScheduleStatViewModel scheduleStatViewModel2 = ScheduleStatViewModel.this;
                this.L$0 = scheduleStatViewModel2;
                this.label = 1;
                objListByPeriod = scheduleStatViewModel2.getScheduleService().getScheduleDutyDao().listByPeriod(ScheduleStatViewModel.this.getCurrentProjectId(), ScheduleStatViewModel.this.getStatModel().getBeginDate(), ScheduleStatViewModel.this.getStatModel().getEndDate(), this);
                if (objListByPeriod == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleStatViewModel = scheduleStatViewModel2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                scheduleStatViewModel = (ScheduleStatViewModel) this.L$0;
                ResultKt.throwOnFailure(obj);
                objListByPeriod = obj;
            }
            scheduleStatViewModel.setPeriodDutys((List) objListByPeriod);
            ScheduleStatViewModel scheduleStatViewModel3 = ScheduleStatViewModel.this;
            scheduleStatViewModel3.setDutys(scheduleStatViewModel3.getPeriodDutys());
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = new ArrayList();
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = new LinkedHashMap();
            Ref.FloatRef floatRef = new Ref.FloatRef();
            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            objectRef3.element = ScheduleStatViewModel.this.getWorks();
            Iterator it = ((Iterable) objectRef3.element).iterator();
            while (it.hasNext()) {
                ((ScheduleWork) it.next()).setCnt(0);
            }
            List<ScheduleDuty> periodDutys = ScheduleStatViewModel.this.getPeriodDutys();
            ScheduleStatViewModel scheduleStatViewModel4 = ScheduleStatViewModel.this;
            Iterator<T> it2 = periodDutys.iterator();
            while (true) {
                str = "";
                if (!it2.hasNext()) {
                    break;
                }
                ScheduleDuty scheduleDuty = (ScheduleDuty) it2.next();
                Iterator it3 = ((Iterable) objectRef3.element).iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!Intrinsics.areEqual(scheduleDuty.getWorkUuid(), ((ScheduleWork) next).getUuid()));
                ScheduleWork scheduleWork = (ScheduleWork) next;
                if (scheduleWork != null) {
                    scheduleWork.setCnt(scheduleWork.getCnt() + i2);
                    DutyDetail dutyDetail = new DutyDetail(null, null, null, null, null, 31, null);
                    dutyDetail.setDay(scheduleDuty.getDay());
                    String weekdayName = MyDateTool.getWeekdayName(MyDateTool.parseDate(scheduleDuty.getDay()));
                    Intrinsics.checkNotNullExpressionValue(weekdayName, "getWeekdayName(MyDateTool.parseDate(duty.day))");
                    dutyDetail.setWeekday(weekdayName);
                    dutyDetail.setWork(scheduleWork);
                    dutyDetail.setDuration(scheduleStatViewModel4.fetchWorkDuration(scheduleWork));
                    dutyDetail.setRemark(scheduleDuty.getRemark());
                    if (!Intrinsics.areEqual(dutyDetail.getDuration(), "")) {
                        float fTimeToFloat = CommonToolKt.timeToFloat(dutyDetail.getDuration(), i2);
                        Map map = (Map) objectRef2.element;
                        String uuid = scheduleWork.getUuid();
                        Float f2 = (Float) ((Map) objectRef2.element).get(scheduleWork.getUuid());
                        map.put(uuid, Boxing.boxFloat((f2 != null ? f2.floatValue() : 0.0f) + fTimeToFloat));
                        floatRef.element += fTimeToFloat;
                    }
                    ((List) objectRef.element).add(dutyDetail);
                    z = true;
                } else {
                    z = false;
                }
                Iterator it4 = ((Iterable) objectRef3.element).iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    Object next2 = it4.next();
                    if (Intrinsics.areEqual(scheduleDuty.getSecondWorkUuid(), ((ScheduleWork) next2).getUuid())) {
                        obj2 = next2;
                        break;
                    }
                }
                ScheduleWork scheduleWork2 = (ScheduleWork) obj2;
                if (scheduleWork2 != null) {
                    scheduleWork2.setCnt(scheduleWork2.getCnt() + 1);
                    DutyDetail dutyDetail2 = new DutyDetail(null, null, null, null, null, 31, null);
                    dutyDetail2.setDay(scheduleDuty.getDay());
                    String weekdayName2 = MyDateTool.getWeekdayName(MyDateTool.parseDate(scheduleDuty.getDay()));
                    Intrinsics.checkNotNullExpressionValue(weekdayName2, "getWeekdayName(MyDateTool.parseDate(duty.day))");
                    dutyDetail2.setWeekday(weekdayName2);
                    dutyDetail2.setWork(scheduleWork2);
                    dutyDetail2.setDuration(scheduleStatViewModel4.fetchWorkDuration(scheduleWork2));
                    dutyDetail2.setRemark(scheduleDuty.getRemark());
                    if (!Intrinsics.areEqual(dutyDetail2.getDuration(), "")) {
                        float fTimeToFloat2 = CommonToolKt.timeToFloat(dutyDetail2.getDuration(), 1);
                        Map map2 = (Map) objectRef2.element;
                        String uuid2 = scheduleWork2.getUuid();
                        Float f3 = (Float) ((Map) objectRef2.element).get(scheduleWork2.getUuid());
                        map2.put(uuid2, Boxing.boxFloat((f3 != null ? f3.floatValue() : 0.0f) + fTimeToFloat2));
                        floatRef.element += fTimeToFloat2;
                    }
                    ((List) objectRef.element).add(dutyDetail2);
                    z = true;
                }
                if (!z && !Intrinsics.areEqual(scheduleDuty.getRemark(), "")) {
                    List list = (List) objectRef.element;
                    String day = scheduleDuty.getDay();
                    String weekdayName3 = MyDateTool.getWeekdayName(MyDateTool.parseDate(scheduleDuty.getDay()));
                    Intrinsics.checkNotNullExpressionValue(weekdayName3, "getWeekdayName(MyDateTool.parseDate(duty.day))");
                    list.add(new DutyDetail(day, weekdayName3, null, null, scheduleDuty.getRemark(), 12, null));
                }
                i2 = 1;
            }
            Iterable<ScheduleWork> iterable = (Iterable) objectRef3.element;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (ScheduleWork scheduleWork3 : iterable) {
                arrayList.add(new PieGraphItem(scheduleWork3.getName(), String.valueOf(scheduleWork3.getCnt()), scheduleWork3.getTheme(), 0.0f, 8, null));
            }
            ArrayList arrayList2 = arrayList;
            ScheduleStatViewModel.this.setDutyList((List) objectRef.element);
            ScheduleStatViewModel scheduleStatViewModel5 = ScheduleStatViewModel.this;
            Iterable iterable2 = (Iterable) objectRef3.element;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : iterable2) {
                if (((Map) objectRef2.element).containsKey(((ScheduleWork) obj3).getUuid())) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList<ScheduleWork> arrayList4 = arrayList3;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList4, 10)), 16));
            for (ScheduleWork scheduleWork4 : arrayList4) {
                String name = scheduleWork4.getName();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArr = new Object[1];
                Float f4 = (Float) ((Map) objectRef2.element).get(scheduleWork4.getUuid());
                objArr[0] = Boxing.boxFloat(f4 != null ? f4.floatValue() : 0.0f);
                String str2 = String.format("%.1f", Arrays.copyOf(objArr, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                Pair pair = TuplesKt.to(name, str2 + "h");
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            scheduleStatViewModel5.setWorkDurationMap(linkedHashMap);
            ScheduleStatViewModel scheduleStatViewModel6 = ScheduleStatViewModel.this;
            if (floatRef.element > 0.0f) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String str3 = String.format("%.1f", Arrays.copyOf(new Object[]{Boxing.boxFloat(floatRef.element)}, 1));
                Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                str = str3 + "h";
            }
            scheduleStatViewModel6.setTotalDuration(str);
            ScheduleStatViewModel scheduleStatViewModel7 = ScheduleStatViewModel.this;
            Iterable iterable3 = (Iterable) objectRef3.element;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : iterable3) {
                if (((Map) objectRef2.element).containsKey(((ScheduleWork) obj4).getUuid())) {
                    arrayList5.add(obj4);
                }
            }
            ArrayList<ScheduleWork> arrayList6 = arrayList5;
            ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList6, 10));
            for (ScheduleWork scheduleWork5 : arrayList6) {
                String name2 = scheduleWork5.getName();
                StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                Object[] objArr2 = new Object[1];
                Float f5 = (Float) ((Map) objectRef2.element).get(scheduleWork5.getUuid());
                objArr2[0] = Boxing.boxFloat(f5 != null ? f5.floatValue() : 0.0f);
                String str4 = String.format("%.1f", Arrays.copyOf(objArr2, 1));
                Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                arrayList7.add(new PieGraphItem(name2, str4, scheduleWork5.getTheme(), 0.0f, 8, null));
            }
            PieGraphData pieGraphDataMakePieStatData = PieGraphDataKt.makePieStatData("时长统计", "h", arrayList7, 1);
            pieGraphDataMakePieStatData.setCenterText(ScheduleStatViewModel.this.getTotalDuration());
            scheduleStatViewModel7.setDurationPieData(pieGraphDataMakePieStatData);
            ScheduleStatViewModel.this.setPieData(PieGraphDataKt.makePieStatData$default("班次统计", "次", arrayList2, 0, 8, null));
            ScheduleStatViewModel scheduleStatViewModel8 = ScheduleStatViewModel.this;
            scheduleStatViewModel8.setGid(scheduleStatViewModel8.getGid() + 1);
            CommonToolKt.mlog("make data", ScheduleStatViewModel.this.getPieData());
            return Unit.INSTANCE;
        }
    }

    public final String fetchWorkDuration(ScheduleWork work) {
        Intrinsics.checkNotNullParameter(work, "work");
        if (work.getFullDay() || Intrinsics.areEqual(work.getGmtBegin(), "") || Intrinsics.areEqual(work.getGmtEnd(), "")) {
            return "";
        }
        String totalDuration = MyDataTool.minusTime(work.getGmtEnd(), work.getGmtBegin(), work.getGmtEnd().compareTo(work.getGmtBegin()) < 0);
        if (Intrinsics.areEqual(work.getExtField1(), "")) {
            Intrinsics.checkNotNullExpressionValue(totalDuration, "totalDuration");
            return totalDuration;
        }
        Intrinsics.checkNotNullExpressionValue(totalDuration, "totalDuration");
        float fCoerceAtLeast = RangesKt.coerceAtLeast(CommonToolKt.timeToFloat(totalDuration, 2) - CommonToolKt.timeToFloat(work.getExtField1(), 2), 0.0f);
        int i = (int) fCoerceAtLeast;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf((int) ((fCoerceAtLeast - i) * 60))}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$doExport$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleStatViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$doExport$1", f = "ScheduleStatViewModel.kt", i = {0}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSION_TIME_MS}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = ScheduleStatViewModel.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                if (ScheduleStatViewModel.this.getDutyList().isEmpty()) {
                    ScheduleStatViewModel.this.getBaseRepository().toast("没有数据可导出");
                    return Unit.INSTANCE;
                }
                this.L$0 = coroutineScope;
                this.label = 1;
                if (ScheduleStatViewModel.this.getBaseRepository().loading(true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            XSSFWorkbook xSSFWorkbook = new XSSFWorkbook();
            try {
                try {
                    Sheet sheetCreateSheet = xSSFWorkbook.createSheet("排班明细");
                    ArrayList arrayList = new ArrayList();
                    int i2 = 8;
                    arrayList.add(new String[]{"日期", "星期", "班次", "上班", "下班", "休息时长", "工作时长", "备注"});
                    List<DutyDetail> dutyList = ScheduleStatViewModel.this.getDutyList();
                    ScheduleStatViewModel scheduleStatViewModel = ScheduleStatViewModel.this;
                    for (DutyDetail dutyDetail : dutyList) {
                        String[] strArr = new String[i2];
                        strArr[0] = dutyDetail.getDay();
                        strArr[1] = dutyDetail.getWeekday();
                        strArr[2] = dutyDetail.getWork().getName();
                        strArr[3] = dutyDetail.getWork().fetchBeginTime();
                        strArr[4] = dutyDetail.getWork().fetchEndTime();
                        strArr[5] = scheduleStatViewModel.exportDurationText(dutyDetail.getWork().getExtField1());
                        strArr[6] = scheduleStatViewModel.exportDurationText(dutyDetail.getDuration());
                        strArr[7] = dutyDetail.getRemark();
                        arrayList.add(strArr);
                        i2 = 8;
                    }
                    int i3 = 0;
                    for (Object obj2 : arrayList) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        String[] strArr2 = (String[]) obj2;
                        Row rowCreateRow = sheetCreateSheet.createRow(i3);
                        int length = strArr2.length;
                        int i5 = 0;
                        int i6 = 0;
                        while (i6 < length) {
                            rowCreateRow.createCell(i5).setCellValue(strArr2[i6]);
                            i6++;
                            i5++;
                        }
                        i3 = i4;
                    }
                    sheetCreateSheet.setColumnWidth(0, 3072);
                    sheetCreateSheet.setColumnWidth(1, 2048);
                    sheetCreateSheet.setColumnWidth(2, 2560);
                    sheetCreateSheet.setColumnWidth(3, 2560);
                    sheetCreateSheet.setColumnWidth(4, 2560);
                    sheetCreateSheet.setColumnWidth(5, 2560);
                    sheetCreateSheet.setColumnWidth(6, 2560);
                    sheetCreateSheet.setColumnWidth(7, 6144);
                    File externalFilesDir = ScheduleStatViewModel.this.getBaseRepository().getContext().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
                    if (externalFilesDir != null && !externalFilesDir.exists()) {
                        externalFilesDir.mkdirs();
                    }
                    if (externalFilesDir == null) {
                        ScheduleStatViewModel.this.getBaseRepository().toast("导出目录不可用");
                        Unit unit = Unit.INSTANCE;
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            xSSFWorkbook.close();
                            Result.m7405constructorimpl(Unit.INSTANCE);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            Result.m7405constructorimpl(ResultKt.createFailure(th));
                        }
                        ScheduleStatViewModel.this.getBaseRepository().finish();
                        return unit;
                    }
                    File file = new File(externalFilesDir, "极简排班明细_" + MyDateTool.format(new Date(), "yyyyMMdd_HHmmss") + ".xlsx");
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        xSSFWorkbook.write(fileOutputStream);
                        Unit unit2 = Unit.INSTANCE;
                        CloseableKt.closeFinally(fileOutputStream, null);
                        xSSFWorkbook.close();
                        Uri uriForFile = FileProvider.getUriForFile(ScheduleStatViewModel.this.getBaseRepository().getContext(), ScheduleStatViewModel.this.getBaseRepository().getContext().getPackageName() + ".TTFileProvider", file);
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.SEND");
                        intent.putExtra("android.intent.extra.STREAM", uriForFile);
                        intent.setType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
                        intent.setFlags(1);
                        Intent intentCreateChooser = Intent.createChooser(intent, "分享排班明细");
                        intentCreateChooser.addFlags(C.ENCODING_PCM_MU_LAW);
                        ScheduleStatViewModel.this.getBaseRepository().getContext().startActivity(intentCreateChooser);
                        ScheduleStatViewModel.this.getBaseRepository().toast("已导出到下载目录");
                        try {
                            Result.Companion companion3 = Result.INSTANCE;
                            xSSFWorkbook.close();
                            Result.m7405constructorimpl(Unit.INSTANCE);
                        } catch (Throwable th2) {
                            th = th2;
                            Result.Companion companion4 = Result.INSTANCE;
                            Result.m7405constructorimpl(ResultKt.createFailure(th));
                        }
                        ScheduleStatViewModel.this.getBaseRepository().finish();
                        return Unit.INSTANCE;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            CloseableKt.closeFinally(fileOutputStream, th3);
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        Result.Companion companion5 = Result.INSTANCE;
                        xSSFWorkbook.close();
                        Result.m7405constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th6) {
                        Result.Companion companion6 = Result.INSTANCE;
                        Result.m7405constructorimpl(ResultKt.createFailure(th6));
                    }
                    ScheduleStatViewModel.this.getBaseRepository().finish();
                    throw th5;
                }
            } catch (IOException unused) {
                ScheduleStatViewModel.this.getBaseRepository().toast("导出失败");
                try {
                    Result.Companion companion7 = Result.INSTANCE;
                    xSSFWorkbook.close();
                    Result.m7405constructorimpl(Unit.INSTANCE);
                } catch (Throwable th7) {
                    th = th7;
                    Result.Companion companion8 = Result.INSTANCE;
                    Result.m7405constructorimpl(ResultKt.createFailure(th));
                }
            }
        }
    }

    public final void doExport() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String exportDurationText(String value) {
        String str = value;
        if (StringsKt.isBlank(str)) {
            return "--";
        }
        List listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{ParameterizedMessage.ERROR_MSG_SEPARATOR}, false, 0, 6, (Object) null);
        if (listSplit$default.size() != 2) {
            return value;
        }
        Integer intOrNull = StringsKt.toIntOrNull((String) listSplit$default.get(0));
        int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
        Integer intOrNull2 = StringsKt.toIntOrNull((String) listSplit$default.get(1));
        int iIntValue2 = intOrNull2 != null ? intOrNull2.intValue() : 0;
        if (iIntValue <= 0 && iIntValue2 <= 0) {
            return "--";
        }
        if (iIntValue > 0 && iIntValue2 > 0) {
            return iIntValue + "小时" + iIntValue2 + "分钟";
        }
        if (iIntValue > 0) {
            return iIntValue + "小时";
        }
        return iIntValue2 + "分钟";
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$changeProject$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleStatViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$changeProject$1", f = "ScheduleStatViewModel.kt", i = {}, l = {489}, m = "invokeSuspend", n = {}, s = {})
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
            return ScheduleStatViewModel.this.new AnonymousClass1(this.$it, continuation);
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
                if (ScheduleStatViewModel.this.getScheduleService().setProjectId(this.$it.getUuid(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ScheduleStatViewModel.this.setCurrentProjectName(this.$it.getName());
            ScheduleStatViewModel.this.setCurrentProjectId(this.$it.getUuid());
            ScheduleStatViewModel.this.setCurrentDate(new Date());
            ScheduleStatViewModel.this.reloadData(true);
            ScheduleStatViewModel.this.resetForm();
            return Unit.INSTANCE;
        }
    }

    public final void changeProject(ScheduleProject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(it, null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$changeConfig$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleStatViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$changeConfig$1", f = "ScheduleStatViewModel.kt", i = {}, l = {500}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleStatViewModel.this.new AnonymousClass1(continuation);
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
                if (ScheduleStatViewModel.this.getScheduleService().getConfigDao().set(ScheduleStatViewModel.this.getConfig(), this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$setFirstWork$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleStatViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$setFirstWork$1", f = "ScheduleStatViewModel.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_DIR}, m = "invokeSuspend", n = {}, s = {})
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
            return ScheduleStatViewModel.this.new AnonymousClass1(this.$t, continuation);
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
                if (ScheduleStatViewModel.this.getScheduleService().getScheduleDutyDao().update(this.$t, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ScheduleStatViewModel.this.resetForm();
            ScheduleStatViewModel.this.getBaseRepository().reload();
            return Unit.INSTANCE;
        }
    }

    public final void setSecondWork(ScheduleWork work) {
        Intrinsics.checkNotNullParameter(work, "work");
        ScheduleDuty scheduleDutyFetchDuty = fetchDuty();
        scheduleDutyFetchDuty.setSecondWorkUuid(work.getUuid());
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(scheduleDutyFetchDuty, null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$setSecondWork$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleStatViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$setSecondWork$1", f = "ScheduleStatViewModel.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_CURRENT_DOWNLOAD_INDEX}, m = "invokeSuspend", n = {}, s = {})
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
            return ScheduleStatViewModel.this.new AnonymousClass1(this.$t, continuation);
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
                if (ScheduleStatViewModel.this.getScheduleService().getScheduleDutyDao().update(this.$t, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ScheduleStatViewModel.this.resetForm();
            ScheduleStatViewModel.this.getBaseRepository().reload();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, cn.jianyun.workplan.module.schedule.model.ScheduleDuty] */
    public final boolean setRemark(String remark) {
        Intrinsics.checkNotNullParameter(remark, "remark");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = fetchDuty();
        ((ScheduleDuty) objectRef.element).setRemark(remark);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(objectRef, null), 3, null);
        return true;
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$setRemark$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleStatViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$setRemark$1", f = "ScheduleStatViewModel.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_DEMUXER_VIDEO_STACK_SIZE}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<ScheduleDuty> $t;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref.ObjectRef<ScheduleDuty> objectRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$t = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleStatViewModel.this.new AnonymousClass1(this.$t, continuation);
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
                if (ScheduleStatViewModel.this.getScheduleService().getScheduleDutyDao().update(this.$t.element, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ScheduleStatViewModel.this.reload();
            ScheduleStatViewModel.this.reloadData(true);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$makeClean$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleStatViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$makeClean$1", f = "ScheduleStatViewModel.kt", i = {1}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_DUMMY_VOICE_SLEEP, MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_NATIVE_YV12_RENDER}, m = "invokeSuspend", n = {Complex.DEFAULT_SUFFIX}, s = {"I$0"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int I$0;
        int I$1;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleStatViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004c  */
        /* JADX WARN: Code duplicated, block: B:17:0x007e A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007c -> B:18:0x007f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L24
                if (r1 == r4) goto L20
                if (r1 != r3) goto L18
                int r1 = r9.I$1
                int r2 = r9.I$0
                kotlin.ResultKt.throwOnFailure(r10)
                r10 = r9
                goto L7f
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                kotlin.ResultKt.throwOnFailure(r10)
                goto L3a
            L24:
                kotlin.ResultKt.throwOnFailure(r10)
                cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel r10 = cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel.this
                cn.jianyun.workplan.hilt.respo.BaseRepository r10 = r10.getBaseRepository()
                r1 = r9
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                r9.label = r4
                r5 = 0
                java.lang.Object r10 = cn.jianyun.workplan.hilt.respo.BaseRepository.loading$default(r10, r2, r1, r4, r5)
                if (r10 != r0) goto L3a
                return r0
            L3a:
                cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel r10 = cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel.this
                cn.jianyun.workplan.module.schedule.model.ScheduleConfig r10 = r10.getConfig()
                java.lang.String r10 = r10.getAutoDay()
                int r10 = cn.jianyun.workplan.util.CommonToolKt.toIntData(r10)
                r1 = r10
                r10 = r9
            L4a:
                if (r2 >= r1) goto L81
                cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel r5 = cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel.this
                java.util.Date r5 = r5.getCurrentDate()
                java.util.Date r5 = cn.jianyun.workplan.util.MyDateTool.gapDay(r5, r2)
                cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel r6 = cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel.this
                cn.jianyun.workplan.module.schedule.views.service.ScheduleService r6 = r6.getScheduleService()
                cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao r6 = r6.getScheduleDutyDao()
                cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel r7 = cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel.this
                java.lang.String r7 = r7.getCurrentProjectId()
                java.lang.String r5 = cn.jianyun.workplan.util.MyDateTool.toDateString(r5)
                java.lang.String r8 = "toDateString(day)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r8)
                r8 = r10
                kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
                r10.I$0 = r2
                r10.I$1 = r1
                r10.label = r3
                java.lang.Object r5 = r6.deleteByDay(r7, r5, r8)
                if (r5 != r0) goto L7f
                return r0
            L7f:
                int r2 = r2 + r4
                goto L4a
            L81:
                cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel r0 = cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel.this
                r0.reloadData(r4)
                cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel r0 = cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel.this
                cn.jianyun.workplan.hilt.respo.BaseRepository r0 = r0.getBaseRepository()
                r0.finish()
                cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel r10 = cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel.this
                cn.jianyun.workplan.hilt.respo.BaseRepository r10 = r10.getBaseRepository()
                java.lang.String r0 = "周期内班次已被清空"
                r10.toast(r0)
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void makeClean() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }
}