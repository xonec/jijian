package cn.jianyun.workplan.ui.component.form.picker;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FWheelPickerContentScope.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcn/jianyun/workplan/ui/component/form/picker/WheelPickerContentScopeImpl;", "Lcn/jianyun/workplan/ui/component/form/picker/FWheelPickerContentScope;", "state", "Lcn/jianyun/workplan/ui/component/form/picker/FWheelPickerState;", "(Lcn/jianyun/workplan/ui/component/form/picker/FWheelPickerState;)V", "getState", "()Lcn/jianyun/workplan/ui/component/form/picker/FWheelPickerState;", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class WheelPickerContentScopeImpl implements FWheelPickerContentScope {
    private final FWheelPickerState state;

    public WheelPickerContentScopeImpl(FWheelPickerState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
    }

    @Override // cn.jianyun.workplan.ui.component.form.picker.FWheelPickerContentScope
    public FWheelPickerState getState() {
        return this.state;
    }
}