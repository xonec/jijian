package cn.jianyun.workplan.module.schedule.dao;

import cn.jianyun.workplan.module.schedule.model.ScheduleConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: ScheduleConfigDao.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;", "", "clearAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;", "realGet", "set", "item", "(Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ScheduleConfigDao {

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao$get$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleConfigDao.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao$DefaultImpls", f = "ScheduleConfigDao.kt", i = {}, l = {16}, m = "get", n = {}, s = {})
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
            return DefaultImpls.get(null, this);
        }
    }

    Object clearAll(Continuation<? super Unit> continuation);

    Object get(Continuation<? super ScheduleConfig> continuation);

    Object realGet(Continuation<? super ScheduleConfig> continuation);

    Object set(ScheduleConfig scheduleConfig, Continuation<? super Unit> continuation);

    /* JADX INFO: compiled from: ScheduleConfigDao.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
        public static Object get(ScheduleConfigDao scheduleConfigDao, Continuation<? super ScheduleConfig> continuation) throws Throwable {
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
            Object objRealGet = anonymousClass1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = anonymousClass1.label;
            if (i == 0) {
                ResultKt.throwOnFailure(objRealGet);
                anonymousClass1.label = 1;
                objRealGet = scheduleConfigDao.realGet(anonymousClass1);
                if (objRealGet == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objRealGet);
            }
            ScheduleConfig scheduleConfig = (ScheduleConfig) objRealGet;
            return scheduleConfig == null ? new ScheduleConfig(null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, 0, null, 67108863, null) : scheduleConfig;
        }
    }
}