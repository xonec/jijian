package cn.jianyun.workplan.module.schedule.dao;

import cn.jianyun.workplan.module.schedule.model.ScheduleWork;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.apache.xmlbeans.XmlErrorCodes;

/* JADX INFO: compiled from: ScheduleWorkDao.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\n\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0019\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;", "", "clearAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "item", "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;", "(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteByProject", "projectUuid", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findWork", "", "workUuid", "insert", XmlErrorCodes.LIST, "", "listByProject", "update", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ScheduleWorkDao {
    Object clearAll(Continuation<? super Unit> continuation);

    Object delete(ScheduleWork scheduleWork, Continuation<? super Unit> continuation);

    Object deleteByProject(String str, Continuation<? super Unit> continuation);

    Object findWork(String str, Continuation<? super Integer> continuation);

    Object insert(ScheduleWork scheduleWork, Continuation<? super Unit> continuation);

    Object list(Continuation<? super List<ScheduleWork>> continuation);

    Object listByProject(String str, Continuation<? super List<ScheduleWork>> continuation);

    Object update(ScheduleWork scheduleWork, Continuation<? super Unit> continuation);
}