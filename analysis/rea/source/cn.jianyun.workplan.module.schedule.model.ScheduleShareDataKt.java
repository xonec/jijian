package cn.jianyun.workplan.module.schedule.model;

import androidx.core.app.NotificationCompat;
import androidx.room.FtsOptions;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.MyDateTool;
import com.alibaba.fastjson2.JSON;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.xmlbeans.XmlErrorCodes;

/* JADX INFO: compiled from: ScheduleShareData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\b\u001a\n\u0010\t\u001a\u00020\n*\u00020\u000b\u001a\n\u0010\f\u001a\u00020\r*\u00020\u000e\u001a\n\u0010\u000f\u001a\u00020\u0010*\u00020\u0011\u001a\n\u0010\u0012\u001a\u00020\u0005*\u00020\u0004\u001a\n\u0010\u0013\u001a\u00020\b*\u00020\u0007\u001a\n\u0010\u0014\u001a\u00020\u000e*\u00020\r\u001a\u0014\u0010\u0015\u001a\u00020\u000b*\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u0001\u001a\n\u0010\u0017\u001a\u00020\u0011*\u00020\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"SCHEDULE_SHARE_APP_CODE", "", "SCHEDULE_SHARE_APP_ID", "toIosAlarm", "Lcn/jianyun/workplan/module/schedule/model/IosAlarmDO;", "Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;", "toIosDuty", "Lcn/jianyun/workplan/module/schedule/model/IosDutyDO;", "Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;", "toIosProject", "Lcn/jianyun/workplan/module/schedule/model/IosProjectDO;", "Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;", "toIosSchedulePlan", "Lcn/jianyun/workplan/module/schedule/model/IosSchedulePlanDO;", "Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;", "toIosWorkPlan", "Lcn/jianyun/workplan/module/schedule/model/IosWorkPlanDO;", "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;", "toScheduleAlarm", "toScheduleDuty", "toSchedulePlan", "toScheduleProject", "newProjectName", "toScheduleWork", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ScheduleShareDataKt {
    public static final String SCHEDULE_SHARE_APP_CODE = "android";
    public static final String SCHEDULE_SHARE_APP_ID = "jjpb";

    public static final IosProjectDO toIosProject(ScheduleProject scheduleProject) {
        Intrinsics.checkNotNullParameter(scheduleProject, "<this>");
        return new IosProjectDO(scheduleProject.getUuid(), scheduleProject.getName(), false, false, false, scheduleProject.getOrdinal(), null, scheduleProject.getGmtCreate(), 92, null);
    }

    public static final IosWorkPlanDO toIosWorkPlan(ScheduleWork scheduleWork) {
        List listEmptyList;
        Object objM7405constructorimpl;
        Intrinsics.checkNotNullParameter(scheduleWork, "<this>");
        if (scheduleWork.getComplex() && (!StringsKt.isBlank(scheduleWork.getConfig()))) {
            try {
                Result.Companion companion = Result.INSTANCE;
                List array = JSON.parseArray(scheduleWork.getConfig(), ScheduleWork.class);
                Intrinsics.checkNotNullExpressionValue(array, "parseArray(config, ScheduleWork::class.java)");
                List<ScheduleWork> list = array;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (ScheduleWork it : list) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    arrayList.add(toIosWorkPlan(it));
                }
                objM7405constructorimpl = Result.m7405constructorimpl(arrayList);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM7405constructorimpl = Result.m7405constructorimpl(ResultKt.createFailure(th));
            }
            List listEmptyList2 = CollectionsKt.emptyList();
            if (Result.m7411isFailureimpl(objM7405constructorimpl)) {
                objM7405constructorimpl = listEmptyList2;
            }
            listEmptyList = (List) objM7405constructorimpl;
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        String str = null;
        String uuid = scheduleWork.getUuid();
        String projectUuid = scheduleWork.getProjectUuid();
        String name = scheduleWork.getName();
        String str2 = "#ffffff";
        String strJoinToString$default = scheduleWork.getComplex() ? CollectionsKt.joinToString$default(listEmptyList, ",", null, null, 0, null, new Function1<IosWorkPlanDO, CharSequence>() { // from class: cn.jianyun.workplan.module.schedule.model.ScheduleShareDataKt.toIosWorkPlan.1
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(IosWorkPlanDO it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2.getBgColor();
            }
        }, 30, null) : scheduleWork.getTheme();
        String gmtBegin = scheduleWork.getGmtBegin();
        String gmtEnd = scheduleWork.getGmtEnd();
        boolean complex = scheduleWork.getComplex();
        int ordinal = scheduleWork.getOrdinal();
        boolean fullDay = scheduleWork.getFullDay();
        String str3 = null;
        boolean z = true;
        String strJoinToString$default2 = scheduleWork.getComplex() ? CollectionsKt.joinToString$default(listEmptyList, ",", null, null, 0, null, new Function1<IosWorkPlanDO, CharSequence>() { // from class: cn.jianyun.workplan.module.schedule.model.ScheduleShareDataKt.toIosWorkPlan.2
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(IosWorkPlanDO it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2.getUuid();
            }
        }, 30, null) : "";
        List list2 = listEmptyList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((IosWorkPlanDO) it2.next()).getUuid());
        }
        return new IosWorkPlanDO(str, uuid, projectUuid, name, str2, strJoinToString$default, gmtBegin, gmtEnd, complex, ordinal, fullDay, str3, z, strJoinToString$default2, arrayList2, scheduleWork.getComplex() ? XmlErrorCodes.DOUBLE : FtsOptions.TOKENIZER_SIMPLE, null, 0, 198657, null);
    }

    public static final IosDutyDO toIosDuty(ScheduleDuty scheduleDuty) {
        Intrinsics.checkNotNullParameter(scheduleDuty, "<this>");
        return new IosDutyDO(scheduleDuty.getUuid(), scheduleDuty.getProjectUuid(), scheduleDuty.getDay(), scheduleDuty.getWorkUuid(), scheduleDuty.getSecondWorkUuid(), null, null, scheduleDuty.getRemark(), scheduleDuty.getSecondWorkUuid(), null, null, 1632, null);
    }

    public static final IosSchedulePlanDO toIosSchedulePlan(SchedulePlan schedulePlan) {
        Object objM7405constructorimpl;
        String iosDetail;
        Intrinsics.checkNotNullParameter(schedulePlan, "<this>");
        if (!StringsKt.isBlank(schedulePlan.getConfig())) {
            try {
                Result.Companion companion = Result.INSTANCE;
                List array = JSON.parseArray(schedulePlan.getConfig(), ScheduleWork.class);
                Intrinsics.checkNotNullExpressionValue(array, "parseArray(config, ScheduleWork::class.java)");
                List<ScheduleWork> list = array;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (ScheduleWork it : list) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    arrayList.add(toIosWorkPlan(it));
                }
                objM7405constructorimpl = Result.m7405constructorimpl(JSON.toJSONString(arrayList));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM7405constructorimpl = Result.m7405constructorimpl(ResultKt.createFailure(th));
            }
            String config = schedulePlan.getConfig();
            if (Result.m7411isFailureimpl(objM7405constructorimpl)) {
                objM7405constructorimpl = config;
            }
            iosDetail = (String) objM7405constructorimpl;
        } else {
            iosDetail = "";
        }
        String uuid = schedulePlan.getUuid();
        String projectUuid = schedulePlan.getProjectUuid();
        String name = schedulePlan.getName();
        Intrinsics.checkNotNullExpressionValue(iosDetail, "iosDetail");
        return new IosSchedulePlanDO(uuid, projectUuid, name, iosDetail);
    }

    public static final IosAlarmDO toIosAlarm(ScheduleAlarm scheduleAlarm) {
        Intrinsics.checkNotNullParameter(scheduleAlarm, "<this>");
        return new IosAlarmDO(scheduleAlarm.getUuid(), scheduleAlarm.getProjectUuid(), scheduleAlarm.getType(), scheduleAlarm.getBeforeDay(), scheduleAlarm.getName(), null, null, scheduleAlarm.getNotifyTime(), null, scheduleAlarm.getWorkUuid(), scheduleAlarm.getRemark(), false, null, scheduleAlarm.getOpened(), null, 22880, null);
    }

    public static /* synthetic */ ScheduleProject toScheduleProject$default(IosProjectDO iosProjectDO, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return toScheduleProject(iosProjectDO, str);
    }

    public static final ScheduleProject toScheduleProject(IosProjectDO iosProjectDO, String newProjectName) {
        Intrinsics.checkNotNullParameter(iosProjectDO, "<this>");
        Intrinsics.checkNotNullParameter(newProjectName, "newProjectName");
        String uuid = iosProjectDO.getUuid();
        String name = newProjectName;
        if (StringsKt.isBlank(name)) {
            name = iosProjectDO.getName();
        }
        String str = name;
        String str2 = null;
        String str3 = null;
        int ordinal = iosProjectDO.getOrdinal();
        int i = 0;
        boolean z = false;
        String gmtCreate = iosProjectDO.getGmtCreate();
        if (StringsKt.isBlank(gmtCreate)) {
            gmtCreate = MyDateTool.toDateString(new Date());
        }
        Intrinsics.checkNotNullExpressionValue(gmtCreate, "gmtCreate.ifBlank { MyDa…ol.toDateString(Date()) }");
        return new ScheduleProject(uuid, str, str2, str3, ordinal, i, z, gmtCreate, null, null, null, 0, null, 8044, null);
    }

    public static final ScheduleWork toScheduleWork(IosWorkPlanDO iosWorkPlanDO) {
        ArrayList arrayListEmptyList;
        String name;
        Intrinsics.checkNotNullParameter(iosWorkPlanDO, "<this>");
        if (!iosWorkPlanDO.getWorkIds().isEmpty()) {
            List<String> workIds = iosWorkPlanDO.getWorkIds();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(workIds, 10));
            int i = 0;
            for (Object obj : workIds) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str = (String) obj;
                String str2 = null;
                String projectUuid = iosWorkPlanDO.getProjectUuid();
                IosWorkPlanDO iosWorkPlanDO2 = (IosWorkPlanDO) CollectionsKt.getOrNull(iosWorkPlanDO.getRefGroups(), i);
                String str3 = (iosWorkPlanDO2 == null || (name = iosWorkPlanDO2.getName()) == null) ? "" : name;
                String str4 = null;
                String bgColor = (String) CollectionsKt.getOrNull(StringsKt.split$default((CharSequence) iosWorkPlanDO.getBgColor(), new String[]{","}, false, 0, 6, (Object) null), i);
                if (bgColor == null) {
                    bgColor = iosWorkPlanDO.getBgColor();
                }
                arrayList.add(toScheduleWork(new IosWorkPlanDO(str2, str, projectUuid, str3, str4, bgColor, null, null, false, 0, false, null, false, null, null, null, null, 0, 262097, null)));
                i = i2;
            }
            arrayListEmptyList = arrayList;
        } else {
            arrayListEmptyList = CollectionsKt.emptyList();
        }
        String uuid = iosWorkPlanDO.getUuid();
        String name2 = iosWorkPlanDO.getName();
        String gmtBegin = iosWorkPlanDO.getGmtBegin();
        String gmtEnd = iosWorkPlanDO.getGmtEnd();
        String projectUuid2 = iosWorkPlanDO.getProjectUuid();
        boolean z = Intrinsics.areEqual(iosWorkPlanDO.getType(), XmlErrorCodes.DOUBLE) || (iosWorkPlanDO.getWorkIds().isEmpty() ^ true);
        String jSONString = arrayListEmptyList.isEmpty() ^ true ? JSON.toJSONString(arrayListEmptyList) : "";
        int ordinal = iosWorkPlanDO.getOrdinal();
        boolean fullDay = iosWorkPlanDO.getFullDay();
        String str5 = (String) CollectionsKt.firstOrNull(StringsKt.split$default((CharSequence) iosWorkPlanDO.getBgColor(), new String[]{","}, false, 0, 6, (Object) null));
        String str6 = str5 == null ? "" : str5;
        Intrinsics.checkNotNullExpressionValue(jSONString, "if (children.isNotEmpty(…en.toJSONString() else \"\"");
        return new ScheduleWork(uuid, name2, null, gmtBegin, gmtEnd, null, str6, projectUuid2, z, jSONString, ordinal, fullDay, 0, null, null, null, null, null, 0, null, 1044516, null);
    }

    public static final ScheduleDuty toScheduleDuty(IosDutyDO iosDutyDO) {
        Intrinsics.checkNotNullParameter(iosDutyDO, "<this>");
        String uuid = iosDutyDO.getUuid();
        if (StringsKt.isBlank(uuid)) {
            uuid = CommonToolKt.uuid();
        }
        String str = uuid;
        String day = iosDutyDO.getDay();
        String str2 = null;
        String planUuid = iosDutyDO.getPlanUuid();
        String secondPlanUuid = iosDutyDO.getSecondPlanUuid();
        if (StringsKt.isBlank(secondPlanUuid)) {
            secondPlanUuid = iosDutyDO.getGmtBed();
        }
        return new ScheduleDuty(str, day, str2, planUuid, secondPlanUuid, iosDutyDO.getProjectUuid(), iosDutyDO.getRemark(), null, null, null, null, 0, null, 8068, null);
    }

    public static final SchedulePlan toSchedulePlan(IosSchedulePlanDO iosSchedulePlanDO) {
        Object objM7405constructorimpl;
        String str;
        Intrinsics.checkNotNullParameter(iosSchedulePlanDO, "<this>");
        if (!StringsKt.isBlank(iosSchedulePlanDO.getDetail())) {
            try {
                Result.Companion companion = Result.INSTANCE;
                List array = JSON.parseArray(iosSchedulePlanDO.getDetail(), IosWorkPlanDO.class);
                Intrinsics.checkNotNullExpressionValue(array, "parseArray(detail, IosWorkPlanDO::class.java)");
                List<IosWorkPlanDO> list = array;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (IosWorkPlanDO it : list) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    arrayList.add(toScheduleWork(it));
                }
                objM7405constructorimpl = Result.m7405constructorimpl(JSON.toJSONString(arrayList));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM7405constructorimpl = Result.m7405constructorimpl(ResultKt.createFailure(th));
            }
            String detail = iosSchedulePlanDO.getDetail();
            if (Result.m7411isFailureimpl(objM7405constructorimpl)) {
                objM7405constructorimpl = detail;
            }
            str = (String) objM7405constructorimpl;
        } else {
            str = "";
        }
        String androidConfig = str;
        String projectUuid = iosSchedulePlanDO.getProjectUuid();
        Intrinsics.checkNotNullExpressionValue(androidConfig, "androidConfig");
        return new SchedulePlan(iosSchedulePlanDO.getUuid(), iosSchedulePlanDO.getName(), null, null, null, null, null, projectUuid, androidConfig, 0, 0, null, null, null, null, 0, null, 130684, null);
    }

    public static final ScheduleAlarm toScheduleAlarm(IosAlarmDO iosAlarmDO) {
        Intrinsics.checkNotNullParameter(iosAlarmDO, "<this>");
        String uuid = iosAlarmDO.getUuid();
        if (StringsKt.isBlank(uuid)) {
            uuid = CommonToolKt.uuid();
        }
        return new ScheduleAlarm(uuid, iosAlarmDO.getName(), iosAlarmDO.getType(), iosAlarmDO.getBeforeDay(), iosAlarmDO.getNotifyTime(), iosAlarmDO.getPlanUuid(), iosAlarmDO.getProjectUuid(), Intrinsics.areEqual(iosAlarmDO.getType(), NotificationCompat.CATEGORY_ALARM), iosAlarmDO.getOpen(), null, iosAlarmDO.getRemark(), null, null, null, null, 0, null, 129536, null);
    }
}