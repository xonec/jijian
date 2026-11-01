package cn.jianyun.workplan.module.schedule.vm;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.lifecycle.ViewModelKt;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.module.base.vm.BaseViewModel;
import cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao;
import cn.jianyun.workplan.module.schedule.model.ScheduleConfig;
import cn.jianyun.workplan.util.CommonToolKt;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ScheduleConfigViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u0003H\u0016J\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\nJ\b\u0010!\u001a\u00020\u001dH\u0016J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0014\u0010$\u001a\u00020\u001d2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u0018\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000f¨\u0006'"}, d2 = {"Lcn/jianyun/workplan/module/schedule/vm/ScheduleConfigViewModel;", "Lcn/jianyun/workplan/module/base/vm/BaseViewModel;", "baseRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "dao", "Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;", "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;)V", "getBaseRepository", "()Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "<set-?>", "Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;", "editItem", "getEditItem", "()Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;", "setEditItem", "(Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;)V", "editItem$delegate", "Landroidx/compose/runtime/MutableState;", "", "isDelete", "()Z", "setDelete", "(Z)V", "isDelete$delegate", "savedItem", "getSavedItem", "setSavedItem", "savedItem$delegate", "cancelEdit", "", "getRepository", "initModel", "model", "reload", "reloadData", "dataChanged", "save", "onDismiss", "Lkotlin/Function0;", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ScheduleConfigViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private final BaseRepository baseRepository;
    private final ScheduleConfigDao dao;

    /* JADX INFO: renamed from: editItem$delegate, reason: from kotlin metadata */
    private final MutableState editItem;

    /* JADX INFO: renamed from: isDelete$delegate, reason: from kotlin metadata */
    private final MutableState isDelete;

    /* JADX INFO: renamed from: savedItem$delegate, reason: from kotlin metadata */
    private final MutableState savedItem;

    public final BaseRepository getBaseRepository() {
        return this.baseRepository;
    }

    @Inject
    public ScheduleConfigViewModel(BaseRepository baseRepository, ScheduleConfigDao dao) {
        Intrinsics.checkNotNullParameter(baseRepository, "baseRepository");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.baseRepository = baseRepository;
        this.dao = dao;
        this.isDelete = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        int i = 0;
        String str16 = null;
        int i2 = 67108863;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.savedItem = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new ScheduleConfig(str, str2, str3, str4, str5, str6, str7, z, z2, z3, z4, z5, z6, z7, z8, z9, str8, str9, str10, str11, str12, str13, str14, str15, i, str16, i2, defaultConstructorMarker), null, 2, null);
        this.editItem = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new ScheduleConfig(str, str2, str3, str4, str5, str6, str7, z, z2, z3, z4, z5, z6, z7, z8, z9, str8, str9, str10, str11, str12, str13, str14, str15, i, str16, i2, defaultConstructorMarker), null, 2, null);
        setCurrentPage("ScheduleConfigView");
        reload();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDelete() {
        return ((Boolean) this.isDelete.getValue()).booleanValue();
    }

    public final void setDelete(boolean z) {
        this.isDelete.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ScheduleConfig getSavedItem() {
        return (ScheduleConfig) this.savedItem.getValue();
    }

    public final void setSavedItem(ScheduleConfig scheduleConfig) {
        Intrinsics.checkNotNullParameter(scheduleConfig, "<set-?>");
        this.savedItem.setValue(scheduleConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ScheduleConfig getEditItem() {
        return (ScheduleConfig) this.editItem.getValue();
    }

    public final void setEditItem(ScheduleConfig scheduleConfig) {
        Intrinsics.checkNotNullParameter(scheduleConfig, "<set-?>");
        this.editItem.setValue(scheduleConfig);
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseViewModel
    public BaseRepository getRepository() {
        return this.baseRepository;
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleConfigViewModel$reload$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleConfigViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleConfigViewModel$reload$1", f = "ScheduleConfigViewModel.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleConfigViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            ScheduleConfigViewModel scheduleConfigViewModel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScheduleConfigViewModel scheduleConfigViewModel2 = ScheduleConfigViewModel.this;
                this.L$0 = scheduleConfigViewModel2;
                this.label = 1;
                obj2 = scheduleConfigViewModel2.dao.get(this);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleConfigViewModel = scheduleConfigViewModel2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                scheduleConfigViewModel = (ScheduleConfigViewModel) this.L$0;
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
            }
            scheduleConfigViewModel.setSavedItem((ScheduleConfig) obj2);
            ScheduleConfigViewModel scheduleConfigViewModel3 = ScheduleConfigViewModel.this;
            ScheduleConfig savedItem = scheduleConfigViewModel3.getSavedItem();
            scheduleConfigViewModel3.setEditItem(savedItem.copy((67108863 & 1) != 0 ? savedItem.uuid : null, (67108863 & 2) != 0 ? savedItem.autoDay : null, (67108863 & 4) != 0 ? savedItem.beginDay : null, (67108863 & 8) != 0 ? savedItem.dateFontSize : null, (67108863 & 16) != 0 ? savedItem.workFontSize : null, (67108863 & 32) != 0 ? savedItem.timeFontSize : null, (67108863 & 64) != 0 ? savedItem.workRadius : null, (67108863 & 128) != 0 ? savedItem.showLunar : false, (67108863 & 256) != 0 ? savedItem.showFestival : false, (67108863 & 512) != 0 ? savedItem.showBeginTime : false, (67108863 & 1024) != 0 ? savedItem.showEndTime : false, (67108863 & 2048) != 0 ? savedItem.showHLine : false, (67108863 & 4096) != 0 ? savedItem.fillCalendar : false, (67108863 & 8192) != 0 ? savedItem.showRemark : false, (67108863 & 16384) != 0 ? savedItem.showStat : false, (67108863 & 32768) != 0 ? savedItem.protectMode : false, (67108863 & 65536) != 0 ? savedItem.extField1 : null, (67108863 & 131072) != 0 ? savedItem.extField2 : null, (67108863 & 262144) != 0 ? savedItem.extField3 : null, (67108863 & 524288) != 0 ? savedItem.extField4 : null, (67108863 & 1048576) != 0 ? savedItem.extField5 : null, (67108863 & 2097152) != 0 ? savedItem.projectUuid : null, (67108863 & 4194304) != 0 ? savedItem.remark : null, (67108863 & 8388608) != 0 ? savedItem.gmtCreate : null, (67108863 & 16777216) != 0 ? savedItem.cc : 0, (67108863 & 33554432) != 0 ? savedItem.cid : null));
            CommonToolKt.mlog(" init config...", ScheduleConfigViewModel.this.getEditItem());
            return Unit.INSTANCE;
        }
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseViewModel
    public void reload() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseViewModel
    public void reloadData(boolean dataChanged) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    public final void initModel(ScheduleConfig model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (getInited()) {
            return;
        }
        setInited(true);
        setEditItem(model);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleConfigViewModel$save$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleConfigViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleConfigViewModel$save$1", f = "ScheduleConfigViewModel.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $onDismiss;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$onDismiss = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleConfigViewModel.this.new AnonymousClass1(this.$onDismiss, continuation);
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
                String strIsValid = ScheduleConfigViewModel.this.getEditItem().isValid();
                if (CommonToolKt.isOk(strIsValid)) {
                    if (ScheduleConfigViewModel.this.getEditItem().isAdd()) {
                        ScheduleConfigViewModel.this.getEditItem().setUuid(CommonToolKt.uuid());
                    }
                    this.label = 1;
                    if (ScheduleConfigViewModel.this.dao.set(ScheduleConfigViewModel.this.getEditItem(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    ScheduleConfigViewModel.this.getBaseRepository().toast(strIsValid);
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ScheduleConfigViewModel scheduleConfigViewModel = ScheduleConfigViewModel.this;
            ScheduleConfig editItem = scheduleConfigViewModel.getEditItem();
            scheduleConfigViewModel.setSavedItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
            ScheduleConfigViewModel.this.getBaseRepository().toast("设置成功");
            ScheduleConfigViewModel.this.getBaseRepository().reload();
            this.$onDismiss.invoke();
            return Unit.INSTANCE;
        }
    }

    public final void save(Function0<Unit> onDismiss) {
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(onDismiss, null), 3, null);
    }

    public final void cancelEdit() {
        ScheduleConfig savedItem = getSavedItem();
        setEditItem(savedItem.copy((67108863 & 1) != 0 ? savedItem.uuid : null, (67108863 & 2) != 0 ? savedItem.autoDay : null, (67108863 & 4) != 0 ? savedItem.beginDay : null, (67108863 & 8) != 0 ? savedItem.dateFontSize : null, (67108863 & 16) != 0 ? savedItem.workFontSize : null, (67108863 & 32) != 0 ? savedItem.timeFontSize : null, (67108863 & 64) != 0 ? savedItem.workRadius : null, (67108863 & 128) != 0 ? savedItem.showLunar : false, (67108863 & 256) != 0 ? savedItem.showFestival : false, (67108863 & 512) != 0 ? savedItem.showBeginTime : false, (67108863 & 1024) != 0 ? savedItem.showEndTime : false, (67108863 & 2048) != 0 ? savedItem.showHLine : false, (67108863 & 4096) != 0 ? savedItem.fillCalendar : false, (67108863 & 8192) != 0 ? savedItem.showRemark : false, (67108863 & 16384) != 0 ? savedItem.showStat : false, (67108863 & 32768) != 0 ? savedItem.protectMode : false, (67108863 & 65536) != 0 ? savedItem.extField1 : null, (67108863 & 131072) != 0 ? savedItem.extField2 : null, (67108863 & 262144) != 0 ? savedItem.extField3 : null, (67108863 & 524288) != 0 ? savedItem.extField4 : null, (67108863 & 1048576) != 0 ? savedItem.extField5 : null, (67108863 & 2097152) != 0 ? savedItem.projectUuid : null, (67108863 & 4194304) != 0 ? savedItem.remark : null, (67108863 & 8388608) != 0 ? savedItem.gmtCreate : null, (67108863 & 16777216) != 0 ? savedItem.cc : 0, (67108863 & 33554432) != 0 ? savedItem.cid : null));
    }
}