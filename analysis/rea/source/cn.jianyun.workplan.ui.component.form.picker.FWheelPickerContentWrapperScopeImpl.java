package cn.jianyun.workplan.ui.component.form.picker;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.adgain.sdk.base.models.AdConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FWheelPickerContentScope.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0017¢\u0006\u0002\u0010\u0017RG\u0010\u0005\u001a-\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0002\b\f¢\u0006\u0002\b\rX\u0086.¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcn/jianyun/workplan/ui/component/form/picker/FWheelPickerContentWrapperScopeImpl;", "Lcn/jianyun/workplan/ui/component/form/picker/FWheelPickerContentWrapperScope;", "contentScope", "Lcn/jianyun/workplan/ui/component/form/picker/FWheelPickerContentScope;", "(Lcn/jianyun/workplan/ui/component/form/picker/FWheelPickerContentScope;)V", "content", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", AdConstants.index, "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "getContent", "()Lkotlin/jvm/functions/Function4;", "setContent", "(Lkotlin/jvm/functions/Function4;)V", "Lkotlin/jvm/functions/Function4;", "state", "Lcn/jianyun/workplan/ui/component/form/picker/FWheelPickerState;", "getState", "()Lcn/jianyun/workplan/ui/component/form/picker/FWheelPickerState;", "(ILandroidx/compose/runtime/Composer;I)V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class FWheelPickerContentWrapperScopeImpl implements FWheelPickerContentWrapperScope {
    public Function4<? super FWheelPickerContentScope, ? super Integer, ? super Composer, ? super Integer, Unit> content;
    private final FWheelPickerContentScope contentScope;

    public FWheelPickerContentWrapperScopeImpl(FWheelPickerContentScope contentScope) {
        Intrinsics.checkNotNullParameter(contentScope, "contentScope");
        this.contentScope = contentScope;
    }

    public final Function4<FWheelPickerContentScope, Integer, Composer, Integer, Unit> getContent() {
        Function4 function4 = this.content;
        if (function4 != null) {
            return function4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("content");
        return null;
    }

    public final void setContent(Function4<? super FWheelPickerContentScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4) {
        Intrinsics.checkNotNullParameter(function4, "<set-?>");
        this.content = function4;
    }

    @Override // cn.jianyun.workplan.ui.component.form.picker.FWheelPickerContentWrapperScope
    public FWheelPickerState getState() {
        return this.contentScope.getState();
    }

    @Override // cn.jianyun.workplan.ui.component.form.picker.FWheelPickerContentWrapperScope
    public void content(final int i, Composer composer, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-737109889);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(content)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-737109889, i2, -1, "cn.jianyun.workplan.ui.component.form.picker.FWheelPickerContentWrapperScopeImpl.content (FWheelPickerContentScope.kt:310)");
        }
        getContent().invoke(this.contentScope, Integer.valueOf(i), composerStartRestartGroup, Integer.valueOf((i2 << 3) & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.picker.FWheelPickerContentWrapperScopeImpl.content.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                FWheelPickerContentWrapperScopeImpl.this.content(i, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }
}