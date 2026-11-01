package cn.jianyun.workplan.module.base.dao;

import cn.jianyun.workplan.module.base.model.WebDAVUser;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.apache.xmlbeans.XmlErrorCodes;

/* JADX INFO: compiled from: WebDAVUserDao.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH§@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcn/jianyun/workplan/module/base/dao/WebDAVUserDao;", "", "delete", "", "item", "Lcn/jianyun/workplan/module/base/model/WebDAVUser;", "(Lcn/jianyun/workplan/module/base/model/WebDAVUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMasterOne", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", XmlErrorCodes.LIST, "", "update", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface WebDAVUserDao {

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.base.dao.WebDAVUserDao$getMasterOne$1, reason: invalid class name */
    /* JADX INFO: compiled from: WebDAVUserDao.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.base.dao.WebDAVUserDao$DefaultImpls", f = "WebDAVUserDao.kt", i = {}, l = {28}, m = "getMasterOne", n = {}, s = {})
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
            return DefaultImpls.getMasterOne(null, this);
        }
    }

    Object delete(WebDAVUser webDAVUser, Continuation<? super Unit> continuation);

    Object getMasterOne(Continuation<? super WebDAVUser> continuation);

    Object insert(WebDAVUser webDAVUser, Continuation<? super Unit> continuation);

    Object list(Continuation<? super List<WebDAVUser>> continuation);

    Object update(WebDAVUser webDAVUser, Continuation<? super Unit> continuation);

    /* JADX INFO: compiled from: WebDAVUserDao.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
        public static Object getMasterOne(WebDAVUserDao webDAVUserDao, Continuation<? super WebDAVUser> continuation) throws Throwable {
            AnonymousClass1 anonymousClass1;
            Object next;
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
                anonymousClass1.label = 1;
                list = webDAVUserDao.list(anonymousClass1);
                if (list == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(list);
            }
            List list2 = (List) list;
            if (list2.isEmpty()) {
                return new WebDAVUser(null, null, null, null, null, null, null, false, false, 0, false, null, false, 8191, null);
            }
            Iterator it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((WebDAVUser) next).getMasterNode());
            WebDAVUser webDAVUser = (WebDAVUser) next;
            return webDAVUser != null ? webDAVUser : list2.get(0);
        }
    }
}