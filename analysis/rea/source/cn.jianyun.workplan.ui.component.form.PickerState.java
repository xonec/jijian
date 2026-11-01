package cn.jianyun.workplan.ui.component.form;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Picker.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcn/jianyun/workplan/ui/component/form/PickerState;", "", "()V", "<set-?>", "", "selectedItem", "getSelectedItem", "()Ljava/lang/String;", "setSelectedItem", "(Ljava/lang/String;)V", "selectedItem$delegate", "Landroidx/compose/runtime/MutableState;", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PickerState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: selectedItem$delegate, reason: from kotlin metadata */
    private final MutableState selectedItem = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    public final String getSelectedItem() {
        return (String) this.selectedItem.getValue();
    }

    public final void setSelectedItem(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selectedItem.setValue(str);
    }
}