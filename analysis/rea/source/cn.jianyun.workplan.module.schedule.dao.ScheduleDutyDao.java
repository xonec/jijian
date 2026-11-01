package cn.jianyun.workplan.module.schedule.dao;

import cn.jianyun.workplan.module.schedule.model.ScheduleDuty;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.apache.xmlbeans.XmlErrorCodes;

/* JADX INFO: compiled from: ScheduleDutyDao.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\n\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\bJ!\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0019\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\u0006\u0010\n\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ/\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\u0006\u0010\n\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0019\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;", "", "clearAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "item", "Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;", "(Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteByDay", "projectUuid", "", "day", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteByProject", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findByDay", "", "findWork", "", "workUuid", "insert", XmlErrorCodes.LIST, "listByPeriod", "gmtBegin", "gmtEnd", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listByProject", "update", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ScheduleDutyDao {
    Object clearAll(Continuation<? super Unit> continuation);

    Object delete(ScheduleDuty scheduleDuty, Continuation<? super Unit> continuation);

    Object deleteByDay(String str, String str2, Continuation<? super Unit> continuation);

    Object deleteByProject(String str, Continuation<? super Unit> continuation);

    Object findByDay(String str, String str2, Continuation<? super List<ScheduleDuty>> continuation);

    Object findWork(String str, Continuation<? super Integer> continuation);

    Object insert(ScheduleDuty scheduleDuty, Continuation<? super Unit> continuation);

    Object list(String str, Continuation<? super List<ScheduleDuty>> continuation);

    Object list(Continuation<? super List<ScheduleDuty>> continuation);

    Object listByPeriod(String str, String str2, String str3, Continuation<? super List<ScheduleDuty>> continuation);

    Object listByProject(String str, Continuation<? super List<ScheduleDuty>> continuation);

    Object update(ScheduleDuty scheduleDuty, Continuation<? super Unit> continuation);
}