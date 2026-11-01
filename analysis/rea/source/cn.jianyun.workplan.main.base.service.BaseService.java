package cn.jianyun.workplan.main.base.service;

import android.content.Context;
import cn.jianyun.workplan.api.ApiResult;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.main.base.model.BasicCloudData;
import cn.jianyun.workplan.model.CloudFile;
import cn.jianyun.workplan.model.LocalBackupConfig;
import cn.jianyun.workplan.module.base.dto.BaseBackupData;
import cn.jianyun.workplan.module.base.model.WebDAVUser;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.MyFileUtil;
import cn.jianyun.workplan.util.MyWebdavTool;
import com.thegrizzlylabs.sardineandroid.DavResource;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;

/* JADX INFO: compiled from: BaseService.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0011\u0010\b\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u000f\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0019\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J!\u0010\u0014\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0006H&J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\u0011\u0010\u0018\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\b\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u0006H\u0016J\u0011\u0010\u001c\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0011\u0010\u001e\u001a\u00020\u001dH¦@ø\u0001\u0000¢\u0006\u0002\u0010\nJ'\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010 2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\"J\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010 2\u0006\u0010%\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010&J\u001f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\f\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u001b\u0010(\u001a\u00020\t2\b\b\u0002\u0010)\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010*J\u0011\u0010+\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0019\u0010,\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0011\u0010-\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0011\u0010.\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0019\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0019\u00101\u001a\u00020\t2\u0006\u00102\u001a\u000203H¦@ø\u0001\u0000¢\u0006\u0002\u00104\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Lcn/jianyun/workplan/main/base/service/BaseService;", "", "changeFileFormat", "", "Lcn/jianyun/workplan/main/base/model/BasicCloudData;", "files", "", "platform", "cleanLocalData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanWebdavCloud", "webDAVUser", "Lcn/jianyun/workplan/module/base/model/WebDAVUser;", "(Lcn/jianyun/workplan/module/base/model/WebDAVUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearAll", "Lcn/jianyun/workplan/model/CloudFile;", "deleteLocalFile", "fileName", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteWebdavFile", "(Lcn/jianyun/workplan/module/base/model/WebDAVUser;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBizName", "getNotifyBizName", "getProjectId", "getRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "getWorkSpace", "isCloudOk", "", "isEmpty", "loadCloudData", "Lcn/jianyun/workplan/api/ApiResult;", "file", "(Lcn/jianyun/workplan/module/base/model/WebDAVUser;Lcn/jianyun/workplan/main/base/model/BasicCloudData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLocalBackupData", "loadLocalData", "cloudData", "(Lcn/jianyun/workplan/main/base/model/BasicCloudData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWebDavCloudFiles", "makeLocalBackup", "force", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeNotify", "makeWebDavCloudBackup", "notifyWidget", "prepareBackupData", "setProjectId", "pid", "writeAll", "backupData", "Lcn/jianyun/workplan/module/base/dto/BaseBackupData;", "(Lcn/jianyun/workplan/module/base/dto/BaseBackupData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface BaseService {

    /* JADX INFO: renamed from: cn.jianyun.workplan.main.base.service.BaseService$cleanLocalData$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.main.base.service.BaseService$DefaultImpls", f = "BaseService.kt", i = {0}, l = {138}, m = "cleanLocalData", n = {"$this"}, s = {"L$0"})
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
            return DefaultImpls.cleanLocalData(null, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.main.base.service.BaseService$deleteLocalFile$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.main.base.service.BaseService$DefaultImpls", f = "BaseService.kt", i = {0, 0}, l = {87}, m = "deleteLocalFile", n = {"$this", "fileName"}, s = {"L$0", "L$1"})
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
            return DefaultImpls.deleteLocalFile(null, null, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.main.base.service.BaseService$isCloudOk$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.main.base.service.BaseService$DefaultImpls", f = "BaseService.kt", i = {}, l = {30}, m = "isCloudOk", n = {}, s = {})
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
            return DefaultImpls.isCloudOk(null, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.main.base.service.BaseService$loadLocalBackupData$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.main.base.service.BaseService$DefaultImpls", f = "BaseService.kt", i = {0}, l = {70}, m = "loadLocalBackupData", n = {"$this"}, s = {"L$0"})
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
            return DefaultImpls.loadLocalBackupData(null, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.main.base.service.BaseService$loadLocalData$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.main.base.service.BaseService$DefaultImpls", f = "BaseService.kt", i = {0, 0}, l = {116}, m = "loadLocalData", n = {"$this", "cloudData"}, s = {"L$0", "L$1"})
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
            return DefaultImpls.loadLocalData(null, null, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.main.base.service.BaseService$makeLocalBackup$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.main.base.service.BaseService$DefaultImpls", f = "BaseService.kt", i = {0, 0, 1, 1}, l = {56, 60, 61}, m = "makeLocalBackup", n = {"$this", "force", "$this", "localPath"}, s = {"L$0", "Z$0", "L$0", "L$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.makeLocalBackup(null, false, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.main.base.service.BaseService$makeWebDavCloudBackup$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.main.base.service.BaseService$DefaultImpls", f = "BaseService.kt", i = {0, 0}, l = {92}, m = "makeWebDavCloudBackup", n = {"$this", "webDAVUser"}, s = {"L$0", "L$1"})
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
            return DefaultImpls.makeWebDavCloudBackup(null, null, this);
        }
    }

    List<BasicCloudData> changeFileFormat(List<String> files, String platform);

    Object cleanLocalData(Continuation<? super Unit> continuation);

    Object cleanWebdavCloud(WebDAVUser webDAVUser, Continuation<? super Unit> continuation);

    Object clearAll(Continuation<? super CloudFile> continuation);

    Object deleteLocalFile(String str, Continuation<? super Unit> continuation);

    Object deleteWebdavFile(WebDAVUser webDAVUser, String str, Continuation<? super Unit> continuation);

    String getBizName();

    String getNotifyBizName();

    Object getProjectId(Continuation<? super String> continuation);

    BaseRepository getRepository();

    String getWorkSpace();

    Object isCloudOk(Continuation<? super Boolean> continuation);

    Object isEmpty(Continuation<? super Boolean> continuation);

    Object loadCloudData(WebDAVUser webDAVUser, BasicCloudData basicCloudData, Continuation<? super ApiResult<Object>> continuation);

    Object loadLocalBackupData(Continuation<? super List<BasicCloudData>> continuation);

    Object loadLocalData(BasicCloudData basicCloudData, Continuation<? super ApiResult<Object>> continuation);

    Object loadWebDavCloudFiles(WebDAVUser webDAVUser, Continuation<? super List<BasicCloudData>> continuation);

    Object makeLocalBackup(boolean z, Continuation<? super Unit> continuation);

    Object makeNotify(Continuation<? super Unit> continuation);

    Object makeWebDavCloudBackup(WebDAVUser webDAVUser, Continuation<? super Unit> continuation);

    Object notifyWidget(Continuation<? super Unit> continuation);

    Object prepareBackupData(Continuation<? super CloudFile> continuation);

    Object setProjectId(String str, Continuation<? super Unit> continuation);

    Object writeAll(BaseBackupData baseBackupData, Continuation<? super Unit> continuation);

    /* JADX INFO: compiled from: BaseService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Object setProjectId(BaseService baseService, String str, Continuation<? super Unit> continuation) {
            Object objCache = baseService.getRepository().cache(baseService.getBizName() + "_pid", str, continuation);
            return objCache == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCache : Unit.INSTANCE;
        }

        public static Object getProjectId(BaseService baseService, Continuation<? super String> continuation) {
            return baseService.getRepository().getCache(baseService.getBizName() + "_pid", "default", continuation);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        public static Object isCloudOk(BaseService baseService, Continuation<? super Boolean> continuation) throws Throwable {
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
            Object webDAVUser = anonymousClass1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = anonymousClass1.label;
            if (i == 0) {
                ResultKt.throwOnFailure(webDAVUser);
                BaseRepository repository = baseService.getRepository();
                anonymousClass1.label = 1;
                webDAVUser = repository.getWebDAVUser(anonymousClass1);
                if (webDAVUser == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(webDAVUser);
            }
            return Boxing.boxBoolean(((WebDAVUser) webDAVUser).getBind());
        }

        public static String getNotifyBizName(BaseService baseService) {
            return "Plan_" + baseService.getBizName();
        }

        public static String getWorkSpace(BaseService baseService) {
            return "SuperPlan/" + baseService.getBizName() + "/Backup/";
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00a5 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        public static Object makeLocalBackup(BaseService baseService, boolean z, Continuation<? super Unit> continuation) throws Throwable {
            AnonymousClass1 anonymousClass1;
            BaseService baseService2;
            String str;
            CoroutineDispatcher io2;
            AnonymousClass2 anonymousClass2;
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
            Object localBackupConfig = anonymousClass1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = anonymousClass1.label;
            if (i == 0) {
                ResultKt.throwOnFailure(localBackupConfig);
                BaseRepository repository = baseService.getRepository();
                anonymousClass1.L$0 = baseService;
                anonymousClass1.Z$0 = z;
                anonymousClass1.label = 1;
                localBackupConfig = repository.getLocalBackupConfig(anonymousClass1);
                if (localBackupConfig == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    z = anonymousClass1.Z$0;
                    baseService = (BaseService) anonymousClass1.L$0;
                    ResultKt.throwOnFailure(localBackupConfig);
                } else if (i == 2) {
                    str = (String) anonymousClass1.L$1;
                    baseService2 = (BaseService) anonymousClass1.L$0;
                    ResultKt.throwOnFailure(localBackupConfig);
                    io2 = Dispatchers.getIO();
                    anonymousClass2 = baseService2.new AnonymousClass2(str, (CloudFile) localBackupConfig, null);
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 3;
                    if (BuildersKt.withContext(io2, anonymousClass2, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(localBackupConfig);
                }
                return Unit.INSTANCE;
            }
            LocalBackupConfig localBackupConfig2 = (LocalBackupConfig) localBackupConfig;
            if (localBackupConfig2.getAutoBackup() || z) {
                String path = localBackupConfig2.getPath();
                if (!Intrinsics.areEqual(path, "")) {
                    anonymousClass1.L$0 = baseService;
                    anonymousClass1.L$1 = path;
                    anonymousClass1.label = 2;
                    localBackupConfig = baseService.prepareBackupData(anonymousClass1);
                    if (localBackupConfig == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    baseService2 = baseService;
                    str = path;
                    io2 = Dispatchers.getIO();
                    anonymousClass2 = baseService2.new AnonymousClass2(str, (CloudFile) localBackupConfig, null);
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 3;
                    if (BuildersKt.withContext(io2, anonymousClass2, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Object makeLocalBackup$default(BaseService baseService, boolean z, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makeLocalBackup");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return baseService.makeLocalBackup(z, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        public static Object loadLocalBackupData(BaseService baseService, Continuation<? super List<BasicCloudData>> continuation) throws Throwable {
            AnonymousClass1 anonymousClass1;
            MyFileUtil myFileUtil;
            BaseService baseService2;
            Context context;
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
                MyFileUtil myFileUtil2 = MyFileUtil.INSTANCE;
                Context context2 = baseService.getRepository().getContext();
                BaseRepository repository = baseService.getRepository();
                anonymousClass1.L$0 = baseService;
                anonymousClass1.L$1 = myFileUtil2;
                anonymousClass1.L$2 = context2;
                anonymousClass1.label = 1;
                Object localPath = repository.getLocalPath(anonymousClass1);
                if (localPath == coroutine_suspended) {
                    return coroutine_suspended;
                }
                myFileUtil = myFileUtil2;
                obj = localPath;
                baseService2 = baseService;
                context = context2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                context = (Context) anonymousClass1.L$2;
                myFileUtil = (MyFileUtil) anonymousClass1.L$1;
                baseService2 = (BaseService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            List<String> dirFiles = myFileUtil.readDirFiles(context, (String) obj, baseService2.getWorkSpace());
            if (dirFiles.isEmpty()) {
                return CollectionsKt.emptyList();
            }
            return baseService2.changeFileFormat(dirFiles, "本地备份");
        }

        public static Object cleanWebdavCloud(BaseService baseService, WebDAVUser webDAVUser, Continuation<? super Unit> continuation) {
            MyWebdavTool.INSTANCE.clean(webDAVUser, baseService.getWorkSpace());
            return Unit.INSTANCE;
        }

        public static Object deleteWebdavFile(BaseService baseService, WebDAVUser webDAVUser, String str, Continuation<? super Unit> continuation) {
            MyWebdavTool.INSTANCE.delete(webDAVUser, baseService.getWorkSpace(), str);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        public static Object deleteLocalFile(BaseService baseService, String str, Continuation<? super Unit> continuation) throws Throwable {
            AnonymousClass1 anonymousClass1;
            String str2;
            MyFileUtil myFileUtil;
            BaseService baseService2;
            Context context;
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
                MyFileUtil myFileUtil2 = MyFileUtil.INSTANCE;
                Context context2 = baseService.getRepository().getContext();
                BaseRepository repository = baseService.getRepository();
                anonymousClass1.L$0 = baseService;
                anonymousClass1.L$1 = str;
                anonymousClass1.L$2 = myFileUtil2;
                anonymousClass1.L$3 = context2;
                anonymousClass1.label = 1;
                Object localPath = repository.getLocalPath(anonymousClass1);
                if (localPath == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str2 = str;
                myFileUtil = myFileUtil2;
                obj = localPath;
                baseService2 = baseService;
                context = context2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                context = (Context) anonymousClass1.L$3;
                myFileUtil = (MyFileUtil) anonymousClass1.L$2;
                str2 = (String) anonymousClass1.L$1;
                baseService2 = (BaseService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            myFileUtil.deleteFile(context, (String) obj, baseService2.getWorkSpace() + str2);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        public static Object makeWebDavCloudBackup(BaseService baseService, WebDAVUser webDAVUser, Continuation<? super Unit> continuation) throws Throwable {
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
            Object objPrepareBackupData = anonymousClass1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = anonymousClass1.label;
            if (i == 0) {
                ResultKt.throwOnFailure(objPrepareBackupData);
                anonymousClass1.L$0 = baseService;
                anonymousClass1.L$1 = webDAVUser;
                anonymousClass1.label = 1;
                objPrepareBackupData = baseService.prepareBackupData(anonymousClass1);
                if (objPrepareBackupData == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                webDAVUser = (WebDAVUser) anonymousClass1.L$1;
                baseService = (BaseService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objPrepareBackupData);
            }
            CloudFile cloudFile = (CloudFile) objPrepareBackupData;
            MyWebdavTool.INSTANCE.put(webDAVUser, baseService.getWorkSpace() + PackagingURIHelper.FORWARD_SLASH_STRING + cloudFile.getName(), cloudFile.getContent());
            return Unit.INSTANCE;
        }

        public static Object loadWebDavCloudFiles(BaseService baseService, WebDAVUser webDAVUser, Continuation<? super List<BasicCloudData>> continuation) {
            ApiResult<Object> list = MyWebdavTool.INSTANCE.list(webDAVUser, baseService.getWorkSpace(), true);
            if (list.getSuccess()) {
                Object objFetchResult = list.fetchResult();
                Intrinsics.checkNotNull(objFetchResult, "null cannot be cast to non-null type kotlin.collections.List<com.thegrizzlylabs.sardineandroid.DavResource>");
                List list2 = (List) objFetchResult;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((DavResource) it.next()).getName());
                }
                return baseService.changeFileFormat(arrayList, webDAVUser.getPlatform());
            }
            return CollectionsKt.emptyList();
        }

        public static Object loadCloudData(BaseService baseService, WebDAVUser webDAVUser, BasicCloudData basicCloudData, Continuation<? super ApiResult<Object>> continuation) {
            return MyWebdavTool.INSTANCE.read(webDAVUser, baseService.getWorkSpace() + PackagingURIHelper.FORWARD_SLASH_STRING + basicCloudData.getFileName());
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        public static Object loadLocalData(BaseService baseService, BasicCloudData basicCloudData, Continuation<? super ApiResult<Object>> continuation) throws Throwable {
            AnonymousClass1 anonymousClass1;
            BasicCloudData basicCloudData2;
            MyFileUtil myFileUtil;
            BaseService baseService2;
            Context context;
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
                MyFileUtil myFileUtil2 = MyFileUtil.INSTANCE;
                Context context2 = baseService.getRepository().getContext();
                BaseRepository repository = baseService.getRepository();
                anonymousClass1.L$0 = baseService;
                anonymousClass1.L$1 = basicCloudData;
                anonymousClass1.L$2 = myFileUtil2;
                anonymousClass1.L$3 = context2;
                anonymousClass1.label = 1;
                Object localPath = repository.getLocalPath(anonymousClass1);
                if (localPath == coroutine_suspended) {
                    return coroutine_suspended;
                }
                basicCloudData2 = basicCloudData;
                myFileUtil = myFileUtil2;
                obj = localPath;
                baseService2 = baseService;
                context = context2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                context = (Context) anonymousClass1.L$3;
                myFileUtil = (MyFileUtil) anonymousClass1.L$2;
                basicCloudData2 = (BasicCloudData) anonymousClass1.L$1;
                baseService2 = (BaseService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return myFileUtil.readFileContent(context, (String) obj, baseService2.getWorkSpace() + basicCloudData2.getFileName());
        }

        public static List<BasicCloudData> changeFileFormat(BaseService baseService, List<String> files, String platform) {
            BasicCloudData basicCloudData;
            Intrinsics.checkNotNullParameter(files, "files");
            Intrinsics.checkNotNullParameter(platform, "platform");
            String lowerCase = baseService.getBizName().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String str = ".workplan." + lowerCase;
            ArrayList arrayList = new ArrayList();
            for (Object obj : files) {
                if (StringsKt.endsWith$default((String) obj, str, false, 2, (Object) null)) {
                    arrayList.add(obj);
                }
            }
            ArrayList<String> arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (String str2 : arrayList2) {
                String strSubstring = str2.substring(0, str2.length() - str.length());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                List listSplit$default = StringsKt.split$default((CharSequence) strSubstring, new String[]{"_"}, false, 0, 6, (Object) null);
                if (listSplit$default.size() == 3) {
                    basicCloudData = new BasicCloudData(str2, (String) listSplit$default.get(1), (String) listSplit$default.get(0), (String) listSplit$default.get(2), null, platform, 16, null);
                } else {
                    basicCloudData = new BasicCloudData(null, null, null, null, null, null, 63, null);
                }
                arrayList3.add(basicCloudData);
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList3) {
                if (!Intrinsics.areEqual(((BasicCloudData) obj2).getDate(), "")) {
                    arrayList4.add(obj2);
                }
            }
            final AnonymousClass4 anonymousClass4 = new Function2<BasicCloudData, BasicCloudData, Integer>() { // from class: cn.jianyun.workplan.main.base.service.BaseService.changeFileFormat.4
                @Override // kotlin.jvm.functions.Function2
                public final Integer invoke(BasicCloudData basicCloudData2, BasicCloudData basicCloudData3) {
                    return (Integer) CommonToolKt.ifv(basicCloudData2.getDate().compareTo(basicCloudData3.getDate()) < 0, 1, -1);
                }
            };
            return CollectionsKt.sortedWith(arrayList4, new Comparator() { // from class: cn.jianyun.workplan.main.base.service.BaseService$DefaultImpls$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj3, Object obj4) {
                    return BaseService.DefaultImpls.changeFileFormat$lambda$4(anonymousClass4, obj3, obj4);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int changeFileFormat$lambda$4(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Number) tmp0.invoke(obj, obj2)).intValue();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        public static Object cleanLocalData(BaseService baseService, Continuation<? super Unit> continuation) throws Throwable {
            AnonymousClass1 anonymousClass1;
            MyFileUtil myFileUtil;
            BaseService baseService2;
            Context context;
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
                MyFileUtil myFileUtil2 = MyFileUtil.INSTANCE;
                Context context2 = baseService.getRepository().getContext();
                BaseRepository repository = baseService.getRepository();
                anonymousClass1.L$0 = baseService;
                anonymousClass1.L$1 = myFileUtil2;
                anonymousClass1.L$2 = context2;
                anonymousClass1.label = 1;
                Object localPath = repository.getLocalPath(anonymousClass1);
                if (localPath == coroutine_suspended) {
                    return coroutine_suspended;
                }
                myFileUtil = myFileUtil2;
                obj = localPath;
                baseService2 = baseService;
                context = context2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                context = (Context) anonymousClass1.L$2;
                myFileUtil = (MyFileUtil) anonymousClass1.L$1;
                baseService2 = (BaseService) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            myFileUtil.cleanDir(context, (String) obj, baseService2.getWorkSpace());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.main.base.service.BaseService$makeLocalBackup$2, reason: invalid class name */
    /* JADX INFO: compiled from: BaseService.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.main.base.service.BaseService$makeLocalBackup$2", f = "BaseService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $localPath;
        final /* synthetic */ CloudFile $prepareData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, CloudFile cloudFile, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$localPath = str;
            this.$prepareData = cloudFile;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseService.this.new AnonymousClass2(this.$localPath, this.$prepareData, continuation);
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
            MyFileUtil.INSTANCE.writeFile(BaseService.this.getRepository().getContext(), this.$localPath, BaseService.this.getWorkSpace() + this.$prepareData.getName(), this.$prepareData.getContent());
            return Unit.INSTANCE;
        }
    }
}