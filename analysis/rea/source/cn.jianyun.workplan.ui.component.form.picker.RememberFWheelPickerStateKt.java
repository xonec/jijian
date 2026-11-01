package cn.jianyun.workplan.ui.component.form.picker;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: rememberFWheelPickerState.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"rememberFWheelPickerState", "Lcn/jianyun/workplan/ui/component/form/picker/FWheelPickerState;", "initialIndex", "", "(ILandroidx/compose/runtime/Composer;II)Lcn/jianyun/workplan/ui/component/form/picker/FWheelPickerState;", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RememberFWheelPickerStateKt {
    public static final FWheelPickerState rememberFWheelPickerState(final int i, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(41131999);
        ComposerKt.sourceInformation(composer, "C(rememberFWheelPickerState)");
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(41131999, i2, -1, "cn.jianyun.workplan.ui.component.form.picker.rememberFWheelPickerState (rememberFWheelPickerState.kt:22)");
        }
        Object[] objArr = new Object[0];
        Saver<FWheelPickerState, ?> saver = FWheelPickerState.INSTANCE.getSaver();
        Integer numValueOf = Integer.valueOf(i);
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean zChanged = composer.changed(numValueOf);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = (Function0) new Function0<FWheelPickerState>() { // from class: cn.jianyun.workplan.ui.component.form.picker.RememberFWheelPickerStateKt$rememberFWheelPickerState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final FWheelPickerState invoke() {
                    return new FWheelPickerState(i);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        FWheelPickerState fWheelPickerState = (FWheelPickerState) RememberSaveableKt.m3372rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return fWheelPickerState;
    }
}