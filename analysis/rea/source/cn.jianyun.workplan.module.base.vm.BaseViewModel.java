package cn.jianyun.workplan.module.base.vm;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.lifecycle.ViewModel;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.util.CommonToolKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaseViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010(\u001a\u00020)H&J\b\u0010*\u001a\u00020+H&J\u0012\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020\u0017H&J\u0006\u0010.\u001a\u00020+J\u000e\u0010/\u001a\u00020+2\u0006\u00100\u001a\u00020\u0004J\u0010\u00101\u001a\u00020+2\b\b\u0002\u00102\u001a\u00020\u0004R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u000b\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR+\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u000b\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u00063"}, d2 = {"Lcn/jianyun/workplan/module/base/vm/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "<set-?>", "", "currentPage", "getCurrentPage", "()Ljava/lang/String;", "setCurrentPage", "(Ljava/lang/String;)V", "currentPage$delegate", "Landroidx/compose/runtime/MutableState;", "currentProjectId", "getCurrentProjectId", "setCurrentProjectId", "currentProjectId$delegate", "Lcn/jianyun/workplan/model/FormType;", "formType", "getFormType", "()Lcn/jianyun/workplan/model/FormType;", "setFormType", "(Lcn/jianyun/workplan/model/FormType;)V", "formType$delegate", "", "inited", "getInited", "()Z", "setInited", "(Z)V", "inited$delegate", "isEmpty", "setEmpty", "isEmpty$delegate", "", "oldSid", "getOldSid", "()I", "setOldSid", "(I)V", "oldSid$delegate", "getRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "reload", "", "reloadData", "dataChanged", "resetForm", "toast", "msg", "tryReload", "key", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class BaseViewModel extends ViewModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: currentPage$delegate, reason: from kotlin metadata */
    private final MutableState currentPage = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* JADX INFO: renamed from: currentProjectId$delegate, reason: from kotlin metadata */
    private final MutableState currentProjectId = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("default", null, 2, null);

    /* JADX INFO: renamed from: inited$delegate, reason: from kotlin metadata */
    private final MutableState inited = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* JADX INFO: renamed from: oldSid$delegate, reason: from kotlin metadata */
    private final MutableState oldSid = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);

    /* JADX INFO: renamed from: formType$delegate, reason: from kotlin metadata */
    private final MutableState formType = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FormType("", null, null, 6, null), null, 2, null);

    /* JADX INFO: renamed from: isEmpty$delegate, reason: from kotlin metadata */
    private final MutableState isEmpty = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);

    public abstract BaseRepository getRepository();

    public abstract void reload();

    public abstract void reloadData(boolean dataChanged);

    /* JADX WARN: Multi-variable type inference failed */
    public final String getCurrentPage() {
        return (String) this.currentPage.getValue();
    }

    public final void setCurrentPage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentPage.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getCurrentProjectId() {
        return (String) this.currentProjectId.getValue();
    }

    public final void setCurrentProjectId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentProjectId.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getInited() {
        return ((Boolean) this.inited.getValue()).booleanValue();
    }

    public final void setInited(boolean z) {
        this.inited.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getOldSid() {
        return ((Number) this.oldSid.getValue()).intValue();
    }

    public final void setOldSid(int i) {
        this.oldSid.setValue(Integer.valueOf(i));
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
    public final boolean isEmpty() {
        return ((Boolean) this.isEmpty.getValue()).booleanValue();
    }

    public final void setEmpty(boolean z) {
        this.isEmpty.setValue(Boolean.valueOf(z));
    }

    public static /* synthetic */ void tryReload$default(BaseViewModel baseViewModel, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryReload");
        }
        if ((i & 1) != 0) {
            str = "";
        }
        baseViewModel.tryReload(str);
    }

    public final void tryReload(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        setCurrentPage(key);
        boolean zIsNeedReload = getRepository().isNeedReload(getCurrentPage(), getOldSid());
        CommonToolKt.mlog("try reload page", getCurrentPage(), getRepository().getCurrentPage(), Boolean.valueOf(zIsNeedReload));
        if (zIsNeedReload) {
            setOldSid(getRepository().getSid());
            reload();
        }
    }

    public static /* synthetic */ void reloadData$default(BaseViewModel baseViewModel, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reloadData");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        baseViewModel.reloadData(z);
    }

    public final void toast(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        getRepository().toast(msg);
    }

    public final void resetForm() {
        setFormType(new FormType(null, null, null, 7, null));
    }
}