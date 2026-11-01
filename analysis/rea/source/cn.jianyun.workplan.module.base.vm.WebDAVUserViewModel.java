package cn.jianyun.workplan.module.base.vm;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.navigation.NavHostController;
import cn.jianyun.workplan.api.BaseApi;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.main.setting.user.User;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.module.base.dao.WebDAVUserDao;
import cn.jianyun.workplan.module.base.model.WebDAVUser;
import cn.jianyun.workplan.util.CommonToolKt;
import com.alibaba.fastjson2.JSON;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: WebDAVUserViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u00101\u001a\u0002022\u0006\u00103\u001a\u000204J\u000e\u00105\u001a\u0002022\u0006\u00103\u001a\u000204J\u0014\u00106\u001a\u0002022\f\u00107\u001a\b\u0012\u0004\u0012\u0002080\nJ\u000e\u00109\u001a\u0002022\u0006\u0010:\u001a\u00020\u000bJ\u0006\u0010;\u001a\u000202J\u0006\u0010<\u001a\u000202J\u000e\u0010=\u001a\u0002022\u0006\u00103\u001a\u000204J\u0006\u0010>\u001a\u000202J\u0006\u0010?\u001a\u000202R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R7\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R+\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR+\u0010!\u001a\u00020 2\u0006\u0010\t\u001a\u00020 8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0012\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R+\u0010'\u001a\u00020 2\u0006\u0010\t\u001a\u00020 8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010\u0012\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R+\u0010+\u001a\u00020*2\u0006\u0010\t\u001a\u00020*8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\u0012\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u0006@"}, d2 = {"Lcn/jianyun/workplan/module/base/vm/WebDAVUserViewModel;", "Landroidx/lifecycle/ViewModel;", "baseRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "dao", "Lcn/jianyun/workplan/module/base/dao/WebDAVUserDao;", "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lcn/jianyun/workplan/module/base/dao/WebDAVUserDao;)V", "getBaseRepository", "()Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "<set-?>", "", "Lcn/jianyun/workplan/module/base/model/WebDAVUser;", "datalist", "getDatalist", "()Ljava/util/List;", "setDatalist", "(Ljava/util/List;)V", "datalist$delegate", "Landroidx/compose/runtime/MutableState;", "editItem", "getEditItem", "()Lcn/jianyun/workplan/module/base/model/WebDAVUser;", "setEditItem", "(Lcn/jianyun/workplan/module/base/model/WebDAVUser;)V", "editItem$delegate", "Lcn/jianyun/workplan/model/FormType;", "formType", "getFormType", "()Lcn/jianyun/workplan/model/FormType;", "setFormType", "(Lcn/jianyun/workplan/model/FormType;)V", "formType$delegate", "", "inited", "getInited", "()Z", "setInited", "(Z)V", "inited$delegate", "isDelete", "setDelete", "isDelete$delegate", "", "oldSid", "getOldSid", "()I", "setOldSid", "(I)V", "oldSid$delegate", "copyOne", "", "navHostController", "Landroidx/navigation/NavHostController;", "doDelete", "doSort", "newOrderList", "", "initModel", "model", "reload", "resetForm", "save", "saveToServer", "tryReload", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebDAVUserViewModel extends ViewModel {
    public static final int $stable = 8;
    private final BaseRepository baseRepository;
    private final WebDAVUserDao dao;

    /* JADX INFO: renamed from: datalist$delegate, reason: from kotlin metadata */
    private final MutableState datalist;

    /* JADX INFO: renamed from: editItem$delegate, reason: from kotlin metadata */
    private final MutableState editItem;

    /* JADX INFO: renamed from: formType$delegate, reason: from kotlin metadata */
    private final MutableState formType;

    /* JADX INFO: renamed from: inited$delegate, reason: from kotlin metadata */
    private final MutableState inited;

    /* JADX INFO: renamed from: isDelete$delegate, reason: from kotlin metadata */
    private final MutableState isDelete;

    /* JADX INFO: renamed from: oldSid$delegate, reason: from kotlin metadata */
    private final MutableState oldSid;

    public final BaseRepository getBaseRepository() {
        return this.baseRepository;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public WebDAVUserViewModel(BaseRepository baseRepository, WebDAVUserDao dao) {
        Intrinsics.checkNotNullParameter(baseRepository, "baseRepository");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.baseRepository = baseRepository;
        this.dao = dao;
        String str = null;
        this.formType = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FormType("", null, str, 6, null), null, 2, null);
        this.isDelete = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.editItem = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new WebDAVUser(str, null, null == true ? 1 : 0, null, null, null, null, false, false, 0, false, null, false, 8191, null), null, 2, null);
        this.datalist = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
        this.oldSid = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.inited = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        reload();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FormType getFormType() {
        return (FormType) this.formType.getValue();
    }

    public final void setFormType(FormType formType) {
        Intrinsics.checkNotNullParameter(formType, "<set-?>");
        this.formType.setValue(formType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDelete() {
        return ((Boolean) this.isDelete.getValue()).booleanValue();
    }

    public final void setDelete(boolean z) {
        this.isDelete.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebDAVUser getEditItem() {
        return (WebDAVUser) this.editItem.getValue();
    }

    public final void setEditItem(WebDAVUser webDAVUser) {
        Intrinsics.checkNotNullParameter(webDAVUser, "<set-?>");
        this.editItem.setValue(webDAVUser);
    }

    public final List<WebDAVUser> getDatalist() {
        return (List) this.datalist.getValue();
    }

    public final void setDatalist(List<WebDAVUser> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.datalist.setValue(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getOldSid() {
        return ((Number) this.oldSid.getValue()).intValue();
    }

    public final void setOldSid(int i) {
        this.oldSid.setValue(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getInited() {
        return ((Boolean) this.inited.getValue()).booleanValue();
    }

    public final void setInited(boolean z) {
        this.inited.setValue(Boolean.valueOf(z));
    }

    public final void tryReload() {
        if (getOldSid() != this.baseRepository.getSid()) {
            reload();
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.base.vm.WebDAVUserViewModel$reload$1, reason: invalid class name */
    /* JADX INFO: compiled from: WebDAVUserViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.base.vm.WebDAVUserViewModel$reload$1", f = "WebDAVUserViewModel.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WebDAVUserViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            WebDAVUserViewModel webDAVUserViewModel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WebDAVUserViewModel webDAVUserViewModel2 = WebDAVUserViewModel.this;
                webDAVUserViewModel2.setOldSid(webDAVUserViewModel2.getBaseRepository().getSid());
                WebDAVUserViewModel webDAVUserViewModel3 = WebDAVUserViewModel.this;
                this.L$0 = webDAVUserViewModel3;
                this.label = 1;
                Object list = webDAVUserViewModel3.dao.list(this);
                if (list == coroutine_suspended) {
                    return coroutine_suspended;
                }
                webDAVUserViewModel = webDAVUserViewModel3;
                obj = list;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                webDAVUserViewModel = (WebDAVUserViewModel) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            webDAVUserViewModel.setDatalist((List) obj);
            return Unit.INSTANCE;
        }
    }

    public final void reload() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final void initModel(WebDAVUser model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (getInited()) {
            return;
        }
        setInited(true);
        setEditItem(model);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.base.vm.WebDAVUserViewModel$save$1, reason: invalid class name */
    /* JADX INFO: compiled from: WebDAVUserViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.base.vm.WebDAVUserViewModel$save$1", f = "WebDAVUserViewModel.kt", i = {}, l = {69, 76, 86, 92, 95}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ NavHostController $navHostController;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NavHostController navHostController, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$navHostController = navHostController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WebDAVUserViewModel.this.new AnonymousClass1(this.$navHostController, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:41:0x011b  */
        /* JADX WARN: Code duplicated, block: B:43:0x0129  */
        /* JADX WARN: Code duplicated, block: B:45:0x0135  */
        /* JADX WARN: Code duplicated, block: B:48:0x0150  */
        /* JADX WARN: Code duplicated, block: B:54:0x0184  */
        /* JADX WARN: Code duplicated, block: B:57:0x01ba  */
        /* JADX WARN: Code duplicated, block: B:60:0x01c7  */
        /* JADX WARN: Code duplicated, block: B:62:0x020c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:63:0x020d  */
        /* JADX WARN: Code duplicated, block: B:65:0x0245 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:72:0x01b9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:74:? A[LOOP:0: B:52:0x017e->B:74:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:75:0x016a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:78:0x014a A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objWithContext;
            WebDAVUserViewModel webDAVUserViewModel;
            ArrayList arrayList;
            WebDAVUserViewModel webDAVUserViewModel2;
            Iterator it;
            WebDAVUserDao webDAVUserDao;
            WebDAVUser editItem;
            WebDAVUserDao webDAVUserDao2;
            WebDAVUser editItem2;
            WebDAVUserDao webDAVUserDao3;
            WebDAVUser webDAVUserCopy;
            AnonymousClass1 anonymousClass1 = this;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = anonymousClass1.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String strIsValid = WebDAVUserViewModel.this.getEditItem().isValid();
                if (CommonToolKt.isOk(strIsValid)) {
                    anonymousClass1.label = 1;
                    if (BaseRepository.loading$default(WebDAVUserViewModel.this.getBaseRepository(), false, anonymousClass1, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    WebDAVUserViewModel.this.getBaseRepository().toast(strIsValid);
                }
                return Unit.INSTANCE;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                objWithContext = obj;
                if (!((Boolean) objWithContext).booleanValue()) {
                    WebDAVUserViewModel.this.getBaseRepository().toast("服务器连接失败");
                    return Unit.INSTANCE;
                }
                if (WebDAVUserViewModel.this.getEditItem().getMasterNode()) {
                    List<WebDAVUser> datalist = WebDAVUserViewModel.this.getDatalist();
                    webDAVUserViewModel = WebDAVUserViewModel.this;
                    arrayList = new ArrayList();
                    for (Object obj2 : datalist) {
                        if (!Intrinsics.areEqual(((WebDAVUser) obj2).getUuid(), webDAVUserViewModel.getEditItem().getUuid())) {
                            arrayList.add(obj2);
                        }
                    }
                    webDAVUserViewModel2 = WebDAVUserViewModel.this;
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        WebDAVUser webDAVUser = (WebDAVUser) it.next();
                        webDAVUserDao3 = webDAVUserViewModel2.dao;
                        webDAVUserCopy = webDAVUser.copy((8063 & 1) != 0 ? webDAVUser.uuid : null, (8063 & 2) != 0 ? webDAVUser.url : null, (8063 & 4) != 0 ? webDAVUser.username : null, (8063 & 8) != 0 ? webDAVUser.password : null, (8063 & 16) != 0 ? webDAVUser.platform : null, (8063 & 32) != 0 ? webDAVUser.type : null, (8063 & 64) != 0 ? webDAVUser.defaultPath : null, (8063 & 128) != 0 ? webDAVUser.masterNode : false, (8063 & 256) != 0 ? webDAVUser.bind : false, (8063 & 512) != 0 ? webDAVUser.ordinal : 0, (8063 & 1024) != 0 ? webDAVUser.shown : false, (8063 & 2048) != 0 ? webDAVUser.message : null, (8063 & 4096) != 0 ? webDAVUser.cloud : false);
                        anonymousClass1.L$0 = webDAVUserViewModel2;
                        anonymousClass1.L$1 = it;
                        anonymousClass1.label = 3;
                        if (webDAVUserDao3.update(webDAVUserCopy, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    anonymousClass1 = anonymousClass1;
                }
                if (!WebDAVUserViewModel.this.getEditItem().isAdd()) {
                    webDAVUserDao = WebDAVUserViewModel.this.dao;
                    editItem = WebDAVUserViewModel.this.getEditItem();
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 5;
                    if (webDAVUserDao.update(editItem.copy((8063 & 1) != 0 ? editItem.uuid : null, (8063 & 2) != 0 ? editItem.url : null, (8063 & 4) != 0 ? editItem.username : null, (8063 & 8) != 0 ? editItem.password : null, (8063 & 16) != 0 ? editItem.platform : null, (8063 & 32) != 0 ? editItem.type : null, (8063 & 64) != 0 ? editItem.defaultPath : null, (8063 & 128) != 0 ? editItem.masterNode : false, (8063 & 256) != 0 ? editItem.bind : true, (8063 & 512) != 0 ? editItem.ordinal : 0, (8063 & 1024) != 0 ? editItem.shown : false, (8063 & 2048) != 0 ? editItem.message : null, (8063 & 4096) != 0 ? editItem.cloud : false), anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    WebDAVUserViewModel.this.reload();
                } else {
                    WebDAVUserViewModel.this.getEditItem().setUuid(CommonToolKt.uuid());
                    webDAVUserDao2 = WebDAVUserViewModel.this.dao;
                    editItem2 = WebDAVUserViewModel.this.getEditItem();
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 4;
                    if (webDAVUserDao2.insert(editItem2.copy((8063 & 1) != 0 ? editItem2.uuid : null, (8063 & 2) != 0 ? editItem2.url : null, (8063 & 4) != 0 ? editItem2.username : null, (8063 & 8) != 0 ? editItem2.password : null, (8063 & 16) != 0 ? editItem2.platform : null, (8063 & 32) != 0 ? editItem2.type : null, (8063 & 64) != 0 ? editItem2.defaultPath : null, (8063 & 128) != 0 ? editItem2.masterNode : false, (8063 & 256) != 0 ? editItem2.bind : true, (8063 & 512) != 0 ? editItem2.ordinal : 0, (8063 & 1024) != 0 ? editItem2.shown : false, (8063 & 2048) != 0 ? editItem2.message : null, (8063 & 4096) != 0 ? editItem2.cloud : false), anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i == 3) {
                it = (Iterator) anonymousClass1.L$1;
                webDAVUserViewModel2 = (WebDAVUserViewModel) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                while (it.hasNext()) {
                    WebDAVUser webDAVUser2 = (WebDAVUser) it.next();
                    webDAVUserDao3 = webDAVUserViewModel2.dao;
                    webDAVUserCopy = webDAVUser2.copy((8063 & 1) != 0 ? webDAVUser2.uuid : null, (8063 & 2) != 0 ? webDAVUser2.url : null, (8063 & 4) != 0 ? webDAVUser2.username : null, (8063 & 8) != 0 ? webDAVUser2.password : null, (8063 & 16) != 0 ? webDAVUser2.platform : null, (8063 & 32) != 0 ? webDAVUser2.type : null, (8063 & 64) != 0 ? webDAVUser2.defaultPath : null, (8063 & 128) != 0 ? webDAVUser2.masterNode : false, (8063 & 256) != 0 ? webDAVUser2.bind : false, (8063 & 512) != 0 ? webDAVUser2.ordinal : 0, (8063 & 1024) != 0 ? webDAVUser2.shown : false, (8063 & 2048) != 0 ? webDAVUser2.message : null, (8063 & 4096) != 0 ? webDAVUser2.cloud : false);
                    anonymousClass1.L$0 = webDAVUserViewModel2;
                    anonymousClass1.L$1 = it;
                    anonymousClass1.label = 3;
                    if (webDAVUserDao3.update(webDAVUserCopy, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (!WebDAVUserViewModel.this.getEditItem().isAdd()) {
                    webDAVUserDao = WebDAVUserViewModel.this.dao;
                    editItem = WebDAVUserViewModel.this.getEditItem();
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 5;
                    if (webDAVUserDao.update(editItem.copy((8063 & 1) != 0 ? editItem.uuid : null, (8063 & 2) != 0 ? editItem.url : null, (8063 & 4) != 0 ? editItem.username : null, (8063 & 8) != 0 ? editItem.password : null, (8063 & 16) != 0 ? editItem.platform : null, (8063 & 32) != 0 ? editItem.type : null, (8063 & 64) != 0 ? editItem.defaultPath : null, (8063 & 128) != 0 ? editItem.masterNode : false, (8063 & 256) != 0 ? editItem.bind : true, (8063 & 512) != 0 ? editItem.ordinal : 0, (8063 & 1024) != 0 ? editItem.shown : false, (8063 & 2048) != 0 ? editItem.message : null, (8063 & 4096) != 0 ? editItem.cloud : false), anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    WebDAVUserViewModel.this.reload();
                } else {
                    WebDAVUserViewModel.this.getEditItem().setUuid(CommonToolKt.uuid());
                    webDAVUserDao2 = WebDAVUserViewModel.this.dao;
                    editItem2 = WebDAVUserViewModel.this.getEditItem();
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 4;
                    if (webDAVUserDao2.insert(editItem2.copy((8063 & 1) != 0 ? editItem2.uuid : null, (8063 & 2) != 0 ? editItem2.url : null, (8063 & 4) != 0 ? editItem2.username : null, (8063 & 8) != 0 ? editItem2.password : null, (8063 & 16) != 0 ? editItem2.platform : null, (8063 & 32) != 0 ? editItem2.type : null, (8063 & 64) != 0 ? editItem2.defaultPath : null, (8063 & 128) != 0 ? editItem2.masterNode : false, (8063 & 256) != 0 ? editItem2.bind : true, (8063 & 512) != 0 ? editItem2.ordinal : 0, (8063 & 1024) != 0 ? editItem2.shown : false, (8063 & 2048) != 0 ? editItem2.message : null, (8063 & 4096) != 0 ? editItem2.cloud : false), anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i == 4) {
                ResultKt.throwOnFailure(obj);
                anonymousClass1 = anonymousClass1;
            } else {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                anonymousClass1 = anonymousClass1;
                WebDAVUserViewModel.this.reload();
            }
            WebDAVUserViewModel.this.getBaseRepository().reload();
            WebDAVUserViewModel.this.setFormType(new FormType(null, null, null, 7, null));
            WebDAVUserViewModel.this.saveToServer();
            CommonToolKt.goBack$default(anonymousClass1.$navHostController, null, 2, null);
            return Unit.INSTANCE;
            List<WebDAVUser> datalist2 = WebDAVUserViewModel.this.getDatalist();
            WebDAVUserViewModel webDAVUserViewModel3 = WebDAVUserViewModel.this;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : datalist2) {
                WebDAVUser webDAVUser3 = (WebDAVUser) obj3;
                if (Intrinsics.areEqual(webDAVUser3.nodeInfo(), webDAVUserViewModel3.getEditItem().nodeInfo()) && !Intrinsics.areEqual(webDAVUser3.getUuid(), webDAVUserViewModel3.getEditItem().getUuid())) {
                    arrayList2.add(obj3);
                }
            }
            if (!arrayList2.isEmpty()) {
                WebDAVUserViewModel.this.getBaseRepository().toast("该平台已经绑定" + WebDAVUserViewModel.this.getEditItem().getUsername() + "账号了");
                WebDAVUserViewModel.this.getBaseRepository().finish();
                return Unit.INSTANCE;
            }
            anonymousClass1.label = 2;
            objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new WebDAVUserViewModel$save$1$flag$1(WebDAVUserViewModel.this, null), anonymousClass1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) objWithContext).booleanValue()) {
                WebDAVUserViewModel.this.getBaseRepository().toast("服务器连接失败");
                return Unit.INSTANCE;
            }
            if (WebDAVUserViewModel.this.getEditItem().getMasterNode()) {
                List<WebDAVUser> datalist3 = WebDAVUserViewModel.this.getDatalist();
                webDAVUserViewModel = WebDAVUserViewModel.this;
                arrayList = new ArrayList();
                while (r2.hasNext()) {
                    if (!Intrinsics.areEqual(((WebDAVUser) obj2).getUuid(), webDAVUserViewModel.getEditItem().getUuid())) {
                        arrayList.add(obj2);
                    }
                }
                webDAVUserViewModel2 = WebDAVUserViewModel.this;
                it = arrayList.iterator();
                while (it.hasNext()) {
                    WebDAVUser webDAVUser4 = (WebDAVUser) it.next();
                    webDAVUserDao3 = webDAVUserViewModel2.dao;
                    webDAVUserCopy = webDAVUser4.copy((8063 & 1) != 0 ? webDAVUser4.uuid : null, (8063 & 2) != 0 ? webDAVUser4.url : null, (8063 & 4) != 0 ? webDAVUser4.username : null, (8063 & 8) != 0 ? webDAVUser4.password : null, (8063 & 16) != 0 ? webDAVUser4.platform : null, (8063 & 32) != 0 ? webDAVUser4.type : null, (8063 & 64) != 0 ? webDAVUser4.defaultPath : null, (8063 & 128) != 0 ? webDAVUser4.masterNode : false, (8063 & 256) != 0 ? webDAVUser4.bind : false, (8063 & 512) != 0 ? webDAVUser4.ordinal : 0, (8063 & 1024) != 0 ? webDAVUser4.shown : false, (8063 & 2048) != 0 ? webDAVUser4.message : null, (8063 & 4096) != 0 ? webDAVUser4.cloud : false);
                    anonymousClass1.L$0 = webDAVUserViewModel2;
                    anonymousClass1.L$1 = it;
                    anonymousClass1.label = 3;
                    if (webDAVUserDao3.update(webDAVUserCopy, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                anonymousClass1 = anonymousClass1;
            }
            if (!WebDAVUserViewModel.this.getEditItem().isAdd()) {
                webDAVUserDao = WebDAVUserViewModel.this.dao;
                editItem = WebDAVUserViewModel.this.getEditItem();
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 5;
                if (webDAVUserDao.update(editItem.copy((8063 & 1) != 0 ? editItem.uuid : null, (8063 & 2) != 0 ? editItem.url : null, (8063 & 4) != 0 ? editItem.username : null, (8063 & 8) != 0 ? editItem.password : null, (8063 & 16) != 0 ? editItem.platform : null, (8063 & 32) != 0 ? editItem.type : null, (8063 & 64) != 0 ? editItem.defaultPath : null, (8063 & 128) != 0 ? editItem.masterNode : false, (8063 & 256) != 0 ? editItem.bind : true, (8063 & 512) != 0 ? editItem.ordinal : 0, (8063 & 1024) != 0 ? editItem.shown : false, (8063 & 2048) != 0 ? editItem.message : null, (8063 & 4096) != 0 ? editItem.cloud : false), anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                WebDAVUserViewModel.this.reload();
            } else {
                WebDAVUserViewModel.this.getEditItem().setUuid(CommonToolKt.uuid());
                webDAVUserDao2 = WebDAVUserViewModel.this.dao;
                editItem2 = WebDAVUserViewModel.this.getEditItem();
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 4;
                if (webDAVUserDao2.insert(editItem2.copy((8063 & 1) != 0 ? editItem2.uuid : null, (8063 & 2) != 0 ? editItem2.url : null, (8063 & 4) != 0 ? editItem2.username : null, (8063 & 8) != 0 ? editItem2.password : null, (8063 & 16) != 0 ? editItem2.platform : null, (8063 & 32) != 0 ? editItem2.type : null, (8063 & 64) != 0 ? editItem2.defaultPath : null, (8063 & 128) != 0 ? editItem2.masterNode : false, (8063 & 256) != 0 ? editItem2.bind : true, (8063 & 512) != 0 ? editItem2.ordinal : 0, (8063 & 1024) != 0 ? editItem2.shown : false, (8063 & 2048) != 0 ? editItem2.message : null, (8063 & 4096) != 0 ? editItem2.cloud : false), anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            WebDAVUserViewModel.this.getBaseRepository().reload();
            WebDAVUserViewModel.this.setFormType(new FormType(null, null, null, 7, null));
            WebDAVUserViewModel.this.saveToServer();
            CommonToolKt.goBack$default(anonymousClass1.$navHostController, null, 2, null);
            return Unit.INSTANCE;
        }
    }

    public final void save(NavHostController navHostController) {
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(navHostController, null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.base.vm.WebDAVUserViewModel$doDelete$1, reason: invalid class name */
    /* JADX INFO: compiled from: WebDAVUserViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.base.vm.WebDAVUserViewModel$doDelete$1", f = "WebDAVUserViewModel.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ NavHostController $navHostController;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NavHostController navHostController, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$navHostController = navHostController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WebDAVUserViewModel.this.new AnonymousClass1(this.$navHostController, continuation);
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
                if (WebDAVUserViewModel.this.dao.delete(WebDAVUserViewModel.this.getEditItem(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            WebDAVUserViewModel.this.setDelete(false);
            WebDAVUserViewModel.this.resetForm();
            WebDAVUserViewModel.this.getBaseRepository().reload();
            WebDAVUserViewModel.this.saveToServer();
            WebDAVUserViewModel.this.reload();
            this.$navHostController.popBackStack();
            return Unit.INSTANCE;
        }
    }

    public final void doDelete(NavHostController navHostController) {
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(navHostController, null), 3, null);
    }

    public final void resetForm() {
        setFormType(new FormType(null, null, null, 7, null));
        reload();
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.base.vm.WebDAVUserViewModel$doSort$1, reason: invalid class name */
    /* JADX INFO: compiled from: WebDAVUserViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.base.vm.WebDAVUserViewModel$doSort$1", f = "WebDAVUserViewModel.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<String> $newOrderList;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<String> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$newOrderList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WebDAVUserViewModel.this.new AnonymousClass1(this.$newOrderList, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            WebDAVUserViewModel webDAVUserViewModel;
            List<String> list;
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<WebDAVUser> datalist = WebDAVUserViewModel.this.getDatalist();
                List<String> list2 = this.$newOrderList;
                webDAVUserViewModel = WebDAVUserViewModel.this;
                list = list2;
                it = datalist.iterator();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$2;
                webDAVUserViewModel = (WebDAVUserViewModel) this.L$1;
                list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            while (it.hasNext()) {
                WebDAVUser webDAVUser = (WebDAVUser) it.next();
                list.indexOf(webDAVUser.getUuid());
                WebDAVUserDao webDAVUserDao = webDAVUserViewModel.dao;
                this.L$0 = list;
                this.L$1 = webDAVUserViewModel;
                this.L$2 = it;
                this.label = 1;
                if (webDAVUserDao.update(webDAVUser, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            WebDAVUserViewModel.this.reload();
            return Unit.INSTANCE;
        }
    }

    public final void doSort(List<String> newOrderList) {
        Intrinsics.checkNotNullParameter(newOrderList, "newOrderList");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(newOrderList, null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.base.vm.WebDAVUserViewModel$copyOne$1, reason: invalid class name */
    /* JADX INFO: compiled from: WebDAVUserViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.base.vm.WebDAVUserViewModel$copyOne$1", f = "WebDAVUserViewModel.kt", i = {}, l = {142, 151, 161, 166}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ NavHostController $navHostController;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NavHostController navHostController, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$navHostController = navHostController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WebDAVUserViewModel.this.new AnonymousClass1(this.$navHostController, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x0104  */
        /* JADX WARN: Code duplicated, block: B:36:0x0112  */
        /* JADX WARN: Code duplicated, block: B:38:0x011e  */
        /* JADX WARN: Code duplicated, block: B:41:0x0139  */
        /* JADX WARN: Code duplicated, block: B:47:0x016d  */
        /* JADX WARN: Code duplicated, block: B:50:0x01a2  */
        /* JADX WARN: Code duplicated, block: B:53:0x01e2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:58:0x01a1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:61:? A[LOOP:0: B:45:0x0167->B:61:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:63:0x0153 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:65:0x0133 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objWithContext;
            WebDAVUserViewModel webDAVUserViewModel;
            ArrayList arrayList;
            WebDAVUserViewModel webDAVUserViewModel2;
            Iterator it;
            WebDAVUserDao webDAVUserDao;
            WebDAVUser editItem;
            WebDAVUserDao webDAVUserDao2;
            WebDAVUser webDAVUserCopy;
            AnonymousClass1 anonymousClass1 = this;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = anonymousClass1.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String strIsValid = WebDAVUserViewModel.this.getEditItem().isValid();
                if (CommonToolKt.isOk(strIsValid)) {
                    anonymousClass1.label = 1;
                    if (BaseRepository.loading$default(WebDAVUserViewModel.this.getBaseRepository(), false, anonymousClass1, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    WebDAVUserViewModel.this.getBaseRepository().toast(strIsValid);
                }
                return Unit.INSTANCE;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                objWithContext = obj;
                if (!((Boolean) objWithContext).booleanValue()) {
                    WebDAVUserViewModel.this.getBaseRepository().toast("服务器连接失败");
                    return Unit.INSTANCE;
                }
                if (WebDAVUserViewModel.this.getEditItem().getMasterNode()) {
                    List<WebDAVUser> datalist = WebDAVUserViewModel.this.getDatalist();
                    webDAVUserViewModel = WebDAVUserViewModel.this;
                    arrayList = new ArrayList();
                    for (Object obj2 : datalist) {
                        if (!Intrinsics.areEqual(((WebDAVUser) obj2).getUuid(), webDAVUserViewModel.getEditItem().getUuid())) {
                            arrayList.add(obj2);
                        }
                    }
                    webDAVUserViewModel2 = WebDAVUserViewModel.this;
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        WebDAVUser webDAVUser = (WebDAVUser) it.next();
                        webDAVUserDao2 = webDAVUserViewModel2.dao;
                        webDAVUserCopy = webDAVUser.copy((8063 & 1) != 0 ? webDAVUser.uuid : null, (8063 & 2) != 0 ? webDAVUser.url : null, (8063 & 4) != 0 ? webDAVUser.username : null, (8063 & 8) != 0 ? webDAVUser.password : null, (8063 & 16) != 0 ? webDAVUser.platform : null, (8063 & 32) != 0 ? webDAVUser.type : null, (8063 & 64) != 0 ? webDAVUser.defaultPath : null, (8063 & 128) != 0 ? webDAVUser.masterNode : false, (8063 & 256) != 0 ? webDAVUser.bind : false, (8063 & 512) != 0 ? webDAVUser.ordinal : 0, (8063 & 1024) != 0 ? webDAVUser.shown : false, (8063 & 2048) != 0 ? webDAVUser.message : null, (8063 & 4096) != 0 ? webDAVUser.cloud : false);
                        anonymousClass1.L$0 = webDAVUserViewModel2;
                        anonymousClass1.L$1 = it;
                        anonymousClass1.label = 3;
                        if (webDAVUserDao2.update(webDAVUserCopy, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    anonymousClass1 = anonymousClass1;
                }
                WebDAVUserViewModel.this.saveToServer();
                webDAVUserDao = WebDAVUserViewModel.this.dao;
                editItem = WebDAVUserViewModel.this.getEditItem();
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 4;
                if (webDAVUserDao.insert(editItem.copy((8063 & 1) != 0 ? editItem.uuid : CommonToolKt.uuid(), (8063 & 2) != 0 ? editItem.url : null, (8063 & 4) != 0 ? editItem.username : null, (8063 & 8) != 0 ? editItem.password : null, (8063 & 16) != 0 ? editItem.platform : null, (8063 & 32) != 0 ? editItem.type : null, (8063 & 64) != 0 ? editItem.defaultPath : null, (8063 & 128) != 0 ? editItem.masterNode : false, (8063 & 256) != 0 ? editItem.bind : true, (8063 & 512) != 0 ? editItem.ordinal : 0, (8063 & 1024) != 0 ? editItem.shown : false, (8063 & 2048) != 0 ? editItem.message : null, (8063 & 4096) != 0 ? editItem.cloud : false), anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 3) {
                it = (Iterator) anonymousClass1.L$1;
                webDAVUserViewModel2 = (WebDAVUserViewModel) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                while (it.hasNext()) {
                    WebDAVUser webDAVUser2 = (WebDAVUser) it.next();
                    webDAVUserDao2 = webDAVUserViewModel2.dao;
                    webDAVUserCopy = webDAVUser2.copy((8063 & 1) != 0 ? webDAVUser2.uuid : null, (8063 & 2) != 0 ? webDAVUser2.url : null, (8063 & 4) != 0 ? webDAVUser2.username : null, (8063 & 8) != 0 ? webDAVUser2.password : null, (8063 & 16) != 0 ? webDAVUser2.platform : null, (8063 & 32) != 0 ? webDAVUser2.type : null, (8063 & 64) != 0 ? webDAVUser2.defaultPath : null, (8063 & 128) != 0 ? webDAVUser2.masterNode : false, (8063 & 256) != 0 ? webDAVUser2.bind : false, (8063 & 512) != 0 ? webDAVUser2.ordinal : 0, (8063 & 1024) != 0 ? webDAVUser2.shown : false, (8063 & 2048) != 0 ? webDAVUser2.message : null, (8063 & 4096) != 0 ? webDAVUser2.cloud : false);
                    anonymousClass1.L$0 = webDAVUserViewModel2;
                    anonymousClass1.L$1 = it;
                    anonymousClass1.label = 3;
                    if (webDAVUserDao2.update(webDAVUserCopy, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                WebDAVUserViewModel.this.saveToServer();
                webDAVUserDao = WebDAVUserViewModel.this.dao;
                editItem = WebDAVUserViewModel.this.getEditItem();
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 4;
                if (webDAVUserDao.insert(editItem.copy((8063 & 1) != 0 ? editItem.uuid : CommonToolKt.uuid(), (8063 & 2) != 0 ? editItem.url : null, (8063 & 4) != 0 ? editItem.username : null, (8063 & 8) != 0 ? editItem.password : null, (8063 & 16) != 0 ? editItem.platform : null, (8063 & 32) != 0 ? editItem.type : null, (8063 & 64) != 0 ? editItem.defaultPath : null, (8063 & 128) != 0 ? editItem.masterNode : false, (8063 & 256) != 0 ? editItem.bind : true, (8063 & 512) != 0 ? editItem.ordinal : 0, (8063 & 1024) != 0 ? editItem.shown : false, (8063 & 2048) != 0 ? editItem.message : null, (8063 & 4096) != 0 ? editItem.cloud : false), anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                anonymousClass1 = anonymousClass1;
            }
            WebDAVUserViewModel.this.getBaseRepository().reload();
            WebDAVUserViewModel.this.setFormType(new FormType(null, null, null, 7, null));
            CommonToolKt.goBack$default(anonymousClass1.$navHostController, null, 2, null);
            return Unit.INSTANCE;
            CommonToolKt.mlog("start check");
            List<WebDAVUser> datalist2 = WebDAVUserViewModel.this.getDatalist();
            WebDAVUserViewModel webDAVUserViewModel3 = WebDAVUserViewModel.this;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : datalist2) {
                if (Intrinsics.areEqual(((WebDAVUser) obj3).nodeInfo(), webDAVUserViewModel3.getEditItem().nodeInfo())) {
                    arrayList2.add(obj3);
                }
            }
            if (!arrayList2.isEmpty()) {
                WebDAVUserViewModel.this.getBaseRepository().toast("该平台已经绑定" + WebDAVUserViewModel.this.getEditItem().getUsername() + "账号了");
                WebDAVUserViewModel.this.getBaseRepository().finish();
                return Unit.INSTANCE;
            }
            anonymousClass1.label = 2;
            objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new WebDAVUserViewModel$copyOne$1$flag$1(WebDAVUserViewModel.this, null), anonymousClass1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) objWithContext).booleanValue()) {
                WebDAVUserViewModel.this.getBaseRepository().toast("服务器连接失败");
                return Unit.INSTANCE;
            }
            if (WebDAVUserViewModel.this.getEditItem().getMasterNode()) {
                List<WebDAVUser> datalist3 = WebDAVUserViewModel.this.getDatalist();
                webDAVUserViewModel = WebDAVUserViewModel.this;
                arrayList = new ArrayList();
                while (r2.hasNext()) {
                    if (!Intrinsics.areEqual(((WebDAVUser) obj2).getUuid(), webDAVUserViewModel.getEditItem().getUuid())) {
                        arrayList.add(obj2);
                    }
                }
                webDAVUserViewModel2 = WebDAVUserViewModel.this;
                it = arrayList.iterator();
                while (it.hasNext()) {
                    WebDAVUser webDAVUser3 = (WebDAVUser) it.next();
                    webDAVUserDao2 = webDAVUserViewModel2.dao;
                    webDAVUserCopy = webDAVUser3.copy((8063 & 1) != 0 ? webDAVUser3.uuid : null, (8063 & 2) != 0 ? webDAVUser3.url : null, (8063 & 4) != 0 ? webDAVUser3.username : null, (8063 & 8) != 0 ? webDAVUser3.password : null, (8063 & 16) != 0 ? webDAVUser3.platform : null, (8063 & 32) != 0 ? webDAVUser3.type : null, (8063 & 64) != 0 ? webDAVUser3.defaultPath : null, (8063 & 128) != 0 ? webDAVUser3.masterNode : false, (8063 & 256) != 0 ? webDAVUser3.bind : false, (8063 & 512) != 0 ? webDAVUser3.ordinal : 0, (8063 & 1024) != 0 ? webDAVUser3.shown : false, (8063 & 2048) != 0 ? webDAVUser3.message : null, (8063 & 4096) != 0 ? webDAVUser3.cloud : false);
                    anonymousClass1.L$0 = webDAVUserViewModel2;
                    anonymousClass1.L$1 = it;
                    anonymousClass1.label = 3;
                    if (webDAVUserDao2.update(webDAVUserCopy, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                anonymousClass1 = anonymousClass1;
            }
            WebDAVUserViewModel.this.saveToServer();
            webDAVUserDao = WebDAVUserViewModel.this.dao;
            editItem = WebDAVUserViewModel.this.getEditItem();
            anonymousClass1.L$0 = null;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 4;
            if (webDAVUserDao.insert(editItem.copy((8063 & 1) != 0 ? editItem.uuid : CommonToolKt.uuid(), (8063 & 2) != 0 ? editItem.url : null, (8063 & 4) != 0 ? editItem.username : null, (8063 & 8) != 0 ? editItem.password : null, (8063 & 16) != 0 ? editItem.platform : null, (8063 & 32) != 0 ? editItem.type : null, (8063 & 64) != 0 ? editItem.defaultPath : null, (8063 & 128) != 0 ? editItem.masterNode : false, (8063 & 256) != 0 ? editItem.bind : true, (8063 & 512) != 0 ? editItem.ordinal : 0, (8063 & 1024) != 0 ? editItem.shown : false, (8063 & 2048) != 0 ? editItem.message : null, (8063 & 4096) != 0 ? editItem.cloud : false), anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            WebDAVUserViewModel.this.getBaseRepository().reload();
            WebDAVUserViewModel.this.setFormType(new FormType(null, null, null, 7, null));
            CommonToolKt.goBack$default(anonymousClass1.$navHostController, null, 2, null);
            return Unit.INSTANCE;
        }
    }

    public final void copyOne(NavHostController navHostController) {
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(navHostController, null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.base.vm.WebDAVUserViewModel$saveToServer$1, reason: invalid class name */
    /* JADX INFO: compiled from: WebDAVUserViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.base.vm.WebDAVUserViewModel$saveToServer$1", f = "WebDAVUserViewModel.kt", i = {1}, l = {182, 183}, m = "invokeSuspend", n = {"cloudConfig"}, s = {"L$0"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WebDAVUserViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object list;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (WebDAVUserViewModel.this.getBaseRepository().isLogin()) {
                    this.label = 1;
                    list = WebDAVUserViewModel.this.dao.list(this);
                    if (list == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                list = obj;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            CommonToolKt.mlog("update cloud info", str);
            return Unit.INSTANCE;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) list) {
                if (((WebDAVUser) obj2).getCloud()) {
                    arrayList.add(obj2);
                }
            }
            String cloudConfig = JSON.toJSONString(arrayList);
            BaseApi api = WebDAVUserViewModel.this.getBaseRepository().getApi();
            User loginUser = WebDAVUserViewModel.this.getBaseRepository().getLoginUser();
            Intrinsics.checkNotNullExpressionValue(cloudConfig, "cloudConfig");
            this.L$0 = cloudConfig;
            this.label = 2;
            if (api.updateCloudInfo(loginUser.copy((262143 & 1) != 0 ? loginUser.uuid : null, (262143 & 2) != 0 ? loginUser.username : null, (262143 & 4) != 0 ? loginUser.nickname : null, (262143 & 8) != 0 ? loginUser.email : null, (262143 & 16) != 0 ? loginUser.avatar : null, (262143 & 32) != 0 ? loginUser.gmtCreate : null, (262143 & 64) != 0 ? loginUser.vipName : null, (262143 & 128) != 0 ? loginUser.vipDate : null, (262143 & 256) != 0 ? loginUser.password : null, (262143 & 512) != 0 ? loginUser.confirmPassword : null, (262143 & 1024) != 0 ? loginUser.wechat : null, (262143 & 2048) != 0 ? loginUser.qq : null, (262143 & 4096) != 0 ? loginUser.city : null, (262143 & 8192) != 0 ? loginUser.mobile : null, (262143 & 16384) != 0 ? loginUser.cloudConfig : cloudConfig, (262143 & 32768) != 0 ? loginUser.application : null, (262143 & 65536) != 0 ? loginUser.platform : null, (262143 & 131072) != 0 ? loginUser.deviceId : null, (262143 & 262144) != 0 ? loginUser.registTime : 0L), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = cloudConfig;
            CommonToolKt.mlog("update cloud info", str);
            return Unit.INSTANCE;
        }
    }

    public final void saveToServer() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }
}