package cn.jianyun.workplan.ui.component.form.picker;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FWheelPickerContentScope.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J-\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u001eH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcn/jianyun/workplan/ui/component/form/picker/WheelPickerNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "state", "Lcn/jianyun/workplan/ui/component/form/picker/FWheelPickerState;", "(Lcn/jianyun/workplan/ui/component/form/picker/FWheelPickerState;)V", "isVertical", "", "()Ljava/lang/Boolean;", "setVertical", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "itemSizePx", "", "getItemSizePx", "()Ljava/lang/Integer;", "setItemSizePx", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "reverseLayout", "getReverseLayout", "setReverseLayout", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "consumed", "available", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class WheelPickerNestedScrollConnection implements NestedScrollConnection {
    private Boolean isVertical;
    private Integer itemSizePx;
    private Boolean reverseLayout;
    private final FWheelPickerState state;

    public WheelPickerNestedScrollConnection(FWheelPickerState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
    }

    /* JADX INFO: renamed from: isVertical, reason: from getter */
    public final Boolean getIsVertical() {
        return this.isVertical;
    }

    public final void setVertical(Boolean bool) {
        this.isVertical = bool;
    }

    public final Integer getItemSizePx() {
        return this.itemSizePx;
    }

    public final void setItemSizePx(Integer num) {
        this.itemSizePx = num;
    }

    public final Boolean getReverseLayout() {
        return this.reverseLayout;
    }

    public final void setReverseLayout(Boolean bool) {
        this.reverseLayout = bool;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo405onPostScrollDzOQY0M(long consumed, long available, int source) {
        this.state.synchronizeCurrentIndexSnapshot$app_release();
        return super.mo405onPostScrollDzOQY0M(consumed, available, source);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public Object mo646onPreFlingQWom1Mo(long j, Continuation<? super Velocity> continuation) throws Throwable {
        WheelPickerNestedScrollConnection$onPreFling$1 wheelPickerNestedScrollConnection$onPreFling$1;
        if (continuation instanceof WheelPickerNestedScrollConnection$onPreFling$1) {
            wheelPickerNestedScrollConnection$onPreFling$1 = (WheelPickerNestedScrollConnection$onPreFling$1) continuation;
            if ((wheelPickerNestedScrollConnection$onPreFling$1.label & Integer.MIN_VALUE) != 0) {
                wheelPickerNestedScrollConnection$onPreFling$1.label -= Integer.MIN_VALUE;
            } else {
                wheelPickerNestedScrollConnection$onPreFling$1 = new WheelPickerNestedScrollConnection$onPreFling$1(this, continuation);
            }
        } else {
            wheelPickerNestedScrollConnection$onPreFling$1 = new WheelPickerNestedScrollConnection$onPreFling$1(this, continuation);
        }
        Object objMo646onPreFlingQWom1Mo = wheelPickerNestedScrollConnection$onPreFling$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = wheelPickerNestedScrollConnection$onPreFling$1.label;
        if (i != 0) {
            if (i == 1 || i == 2) {
                j = wheelPickerNestedScrollConnection$onPreFling$1.J$0;
                ResultKt.throwOnFailure(objMo646onPreFlingQWom1Mo);
                return Velocity.m6323boximpl(j);
            }
            if (i == 3) {
                ResultKt.throwOnFailure(objMo646onPreFlingQWom1Mo);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objMo646onPreFlingQWom1Mo);
        int iSynchronizeCurrentIndexSnapshot$app_release = this.state.synchronizeCurrentIndexSnapshot$app_release();
        if (iSynchronizeCurrentIndexSnapshot$app_release >= 0) {
            Boolean bool = this.isVertical;
            Intrinsics.checkNotNull(bool);
            boolean zBooleanValue = bool.booleanValue();
            Integer num = this.itemSizePx;
            Intrinsics.checkNotNull(num);
            int iIntValue = num.intValue();
            DecayAnimationSpec decayAnimationSpecExponentialDecay$default = DecayAnimationSpecKt.exponentialDecay$default(2.0f, 0.0f, 2, null);
            Boolean bool2 = this.reverseLayout;
            Intrinsics.checkNotNull(bool2);
            int iM6871flingItemCounteWPteA = FWheelPickerContentScopeKt.m6871flingItemCounteWPteA(j, zBooleanValue, iIntValue, decayAnimationSpecExponentialDecay$default, bool2.booleanValue());
            if (Math.abs(iM6871flingItemCounteWPteA) > 0) {
                wheelPickerNestedScrollConnection$onPreFling$1.J$0 = j;
                wheelPickerNestedScrollConnection$onPreFling$1.label = 1;
                if (this.state.animateScrollToIndex(iSynchronizeCurrentIndexSnapshot$app_release - iM6871flingItemCounteWPteA, wheelPickerNestedScrollConnection$onPreFling$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                FWheelPickerState fWheelPickerState = this.state;
                wheelPickerNestedScrollConnection$onPreFling$1.J$0 = j;
                wheelPickerNestedScrollConnection$onPreFling$1.label = 2;
                if (fWheelPickerState.animateScrollToIndex(iSynchronizeCurrentIndexSnapshot$app_release, wheelPickerNestedScrollConnection$onPreFling$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Velocity.m6323boximpl(j);
        }
        wheelPickerNestedScrollConnection$onPreFling$1.label = 3;
        objMo646onPreFlingQWom1Mo = super.mo646onPreFlingQWom1Mo(j, wheelPickerNestedScrollConnection$onPreFling$1);
        return objMo646onPreFlingQWom1Mo == coroutine_suspended ? coroutine_suspended : objMo646onPreFlingQWom1Mo;
    }
}