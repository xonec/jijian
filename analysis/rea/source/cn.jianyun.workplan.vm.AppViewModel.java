package cn.jianyun.workplan.vm;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.lifecycle.ViewModel;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.model.FormType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcn/jianyun/workplan/vm/AppViewModel;", "Landroidx/lifecycle/ViewModel;", "baseRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;)V", "getBaseRepository", "()Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "<set-?>", "Lcn/jianyun/workplan/model/FormType;", "formType", "getFormType", "()Lcn/jianyun/workplan/model/FormType;", "setFormType", "(Lcn/jianyun/workplan/model/FormType;)V", "formType$delegate", "Landroidx/compose/runtime/MutableState;", "isForm", "", "type", "", "toast", "", "msg", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AppViewModel extends ViewModel {
    public static final int $stable = 8;
    private final BaseRepository baseRepository;

    /* JADX INFO: renamed from: formType$delegate, reason: from kotlin metadata */
    private final MutableState formType;

    public final BaseRepository getBaseRepository() {
        return this.baseRepository;
    }

    @Inject
    public AppViewModel(BaseRepository baseRepository) {
        Intrinsics.checkNotNullParameter(baseRepository, "baseRepository");
        this.baseRepository = baseRepository;
        this.formType = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FormType(null, null, null, 7, null), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FormType getFormType() {
        return (FormType) this.formType.getValue();
    }

    public final void setFormType(FormType formType) {
        Intrinsics.checkNotNullParameter(formType, "<set-?>");
        this.formType.setValue(formType);
    }

    public final boolean isForm(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return Intrinsics.areEqual(getFormType().getType(), type);
    }

    public final void toast(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.baseRepository.toast(msg);
    }
}