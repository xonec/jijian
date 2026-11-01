package cn.jianyun.workplan.ui.component.form.picker;

import android.util.Log;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import com.adgain.sdk.base.models.AdConstants;
import com.alipay.sdk.m.u0.b;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: rememberFWheelPickerState.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 L2\u00020\u0001:\u0001LB\u000f\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010/\u001a\u00020\u00192\b\b\u0001\u00100\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u00101J\u0019\u00102\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0002\u00101J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000204H\u0016J\n\u00106\u001a\u0004\u0018\u000107H\u0002J\u001b\u00108\u001a\u00020\u00192\u0006\u00109\u001a\u00020\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b:\u00101J\b\u0010;\u001a\u00020\u0019H\u0002JB\u0010<\u001a\u00020\u00192\u0006\u0010=\u001a\u00020>2'\u0010?\u001a#\b\u0001\u0012\u0004\u0012\u00020A\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0006\u0012\u0004\u0018\u00010B0@¢\u0006\u0002\bCH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010DJ%\u0010E\u001a\u00020\u00192\b\b\u0001\u00100\u001a\u00020\u00032\b\b\u0002\u0010F\u001a\u00020\u001fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010GJ\u0010\u0010H\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u0003H\u0002J\b\u0010I\u001a\u00020\u0019H\u0002J\r\u0010J\u001a\u00020\u0003H\u0000¢\u0006\u0002\bKR\u001e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0007\u0010\u0004R+\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0004R+\u0010\u000f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\u0004R$\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003@BX\u0082\u000e¢\u0006\n\n\u0002\u0010\u0016\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000bR\u0011\u0010\u001c\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u001e\u001a\u00020\u001fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b%\u0010!R\u0011\u0010&\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010!R\u0014\u0010+\u001a\u00020,X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006M"}, d2 = {"Lcn/jianyun/workplan/ui/component/form/picker/FWheelPickerState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "initialIndex", "", "(I)V", b.f2259d, "_count", "set_count", "<set-?>", "_currentIndex", "get_currentIndex", "()I", "set_currentIndex", "_currentIndex$delegate", "Landroidx/compose/runtime/MutableIntState;", "_currentIndexSnapshot", "get_currentIndexSnapshot", "set_currentIndexSnapshot", "_currentIndexSnapshot$delegate", "_pendingIndex", "set_pendingIndex", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "_pendingIndexContinuation", "Lkotlin/coroutines/Continuation;", "", "currentIndex", "getCurrentIndex", "currentIndexSnapshot", "getCurrentIndexSnapshot", "debug", "", "getDebug$app_release", "()Z", "setDebug$app_release", "(Z)V", "hasPendingScroll", "getHasPendingScroll", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "isScrollInProgress", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "getLazyListState$app_release", "()Landroidx/compose/foundation/lazy/LazyListState;", "animateScrollToIndex", AdConstants.index, "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitScroll", "dispatchRawDelta", "", "delta", "mostStartItemInfo", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "notifyCountChanged", "count", "notifyCountChanged$app_release", "resumeAwaitScroll", "scroll", "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollToIndex", "pending", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCurrentIndexInternal", "synchronizeCurrentIndex", "synchronizeCurrentIndexSnapshot", "synchronizeCurrentIndexSnapshot$app_release", "Companion", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FWheelPickerState implements ScrollableState {
    private int _count;

    /* JADX INFO: renamed from: _currentIndex$delegate, reason: from kotlin metadata */
    private final MutableIntState _currentIndex;

    /* JADX INFO: renamed from: _currentIndexSnapshot$delegate, reason: from kotlin metadata */
    private final MutableIntState _currentIndexSnapshot;
    private Integer _pendingIndex;
    private Continuation<? super Unit> _pendingIndexContinuation;
    private boolean debug;
    private final LazyListState lazyListState;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Saver<FWheelPickerState, ?> Saver = ListSaverKt.listSaver(new Function2<SaverScope, FWheelPickerState, List<? extends Object>>() { // from class: cn.jianyun.workplan.ui.component.form.picker.FWheelPickerState$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        public final List<Object> invoke(SaverScope listSaver, FWheelPickerState it) {
            Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt.listOf(Integer.valueOf(it.getCurrentIndex()));
        }
    }, new Function1<List<? extends Object>, FWheelPickerState>() { // from class: cn.jianyun.workplan.ui.component.form.picker.FWheelPickerState$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        public final FWheelPickerState invoke(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Object obj = it.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            return new FWheelPickerState(((Integer) obj).intValue());
        }
    });

    /* JADX INFO: renamed from: cn.jianyun.workplan.ui.component.form.picker.FWheelPickerState$animateScrollToIndex$1, reason: invalid class name */
    /* JADX INFO: compiled from: rememberFWheelPickerState.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.ui.component.form.picker.FWheelPickerState", f = "rememberFWheelPickerState.kt", i = {0}, l = {85}, m = "animateScrollToIndex", n = {"this"}, s = {"L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FWheelPickerState.this.animateScrollToIndex(0, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.ui.component.form.picker.FWheelPickerState$awaitScroll$1, reason: invalid class name */
    /* JADX INFO: compiled from: rememberFWheelPickerState.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.ui.component.form.picker.FWheelPickerState", f = "rememberFWheelPickerState.kt", i = {0, 0}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_ALOG_WRITE_FUNC_ADDR}, m = "awaitScroll", n = {"this", AdConstants.index}, s = {"L$0", "I$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FWheelPickerState.this.awaitScroll(0, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.ui.component.form.picker.FWheelPickerState$scrollToIndex$1, reason: invalid class name */
    /* JADX INFO: compiled from: rememberFWheelPickerState.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.ui.component.form.picker.FWheelPickerState", f = "rememberFWheelPickerState.kt", i = {0, 0, 0}, l = {96, 100}, m = "scrollToIndex", n = {"this", "pending", "safeIndex"}, s = {"L$0", "Z$0", "I$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
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
            return FWheelPickerState.this.scrollToIndex(0, false, this);
        }
    }

    public FWheelPickerState() {
        this(0, 1, null);
    }

    public FWheelPickerState(int i) {
        int i2 = 0;
        this.lazyListState = new LazyListState(i2, i2, 3, null);
        this._currentIndex = SnapshotIntStateKt.mutableIntStateOf(-1);
        this._currentIndexSnapshot = SnapshotIntStateKt.mutableIntStateOf(-1);
        this._pendingIndex = Integer.valueOf(i);
    }

    public /* synthetic */ FWheelPickerState(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: getDebug$app_release, reason: from getter */
    public final boolean getDebug() {
        return this.debug;
    }

    public final void setDebug$app_release(boolean z) {
        this.debug = z;
    }

    /* JADX INFO: renamed from: getLazyListState$app_release, reason: from getter */
    public final LazyListState getLazyListState() {
        return this.lazyListState;
    }

    private final int get_currentIndex() {
        return this._currentIndex.getIntValue();
    }

    private final void set_currentIndex(int i) {
        this._currentIndex.setIntValue(i);
    }

    private final int get_currentIndexSnapshot() {
        return this._currentIndexSnapshot.getIntValue();
    }

    private final void set_currentIndexSnapshot(int i) {
        this._currentIndexSnapshot.setIntValue(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set_pendingIndex(Integer num) {
        this._pendingIndex = num;
        if (num == null) {
            resumeAwaitScroll();
        }
    }

    private final void set_count(int i) {
        this._count = RangesKt.coerceAtLeast(i, 0);
    }

    public final int getCurrentIndex() {
        return get_currentIndex();
    }

    public final int getCurrentIndexSnapshot() {
        return get_currentIndexSnapshot();
    }

    public final InteractionSource getInteractionSource() {
        return this.lazyListState.getInteractionSource();
    }

    public final boolean getHasPendingScroll() {
        return this._pendingIndex != null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object animateScrollToIndex(int i, Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        FWheelPickerState fWheelPickerState;
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
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object obj = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.debug) {
                Log.i("FWheelPicker", "animateScrollToIndex index:" + i);
            }
            int iCoerceAtLeast = RangesKt.coerceAtLeast(i, 0);
            LazyListState lazyListState = this.lazyListState;
            anonymousClass2.L$0 = this;
            anonymousClass2.label = 1;
            if (LazyListState.animateScrollToItem$default(lazyListState, iCoerceAtLeast, 0, anonymousClass2, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            fWheelPickerState = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fWheelPickerState = (FWheelPickerState) anonymousClass2.L$0;
            ResultKt.throwOnFailure(obj);
        }
        fWheelPickerState.synchronizeCurrentIndex();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object scrollToIndex$default(FWheelPickerState fWheelPickerState, int i, boolean z, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return fWheelPickerState.scrollToIndex(i, z, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object scrollToIndex(int i, boolean z, Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        int iCoerceAtLeast;
        FWheelPickerState fWheelPickerState;
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
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.debug) {
                Log.i("FWheelPicker", "scrollToIndex index:" + i + " pending:" + z);
            }
            iCoerceAtLeast = RangesKt.coerceAtLeast(i, 0);
            LazyListState lazyListState = this.lazyListState;
            anonymousClass1.L$0 = this;
            anonymousClass1.Z$0 = z;
            anonymousClass1.I$0 = iCoerceAtLeast;
            anonymousClass1.label = 1;
            if (LazyListState.scrollToItem$default(lazyListState, iCoerceAtLeast, 0, anonymousClass1, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            fWheelPickerState = this;
        } else {
            if (i2 == 1) {
                iCoerceAtLeast = anonymousClass1.I$0;
                z = anonymousClass1.Z$0;
                fWheelPickerState = (FWheelPickerState) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        fWheelPickerState.synchronizeCurrentIndex();
        if (!z) {
            return Unit.INSTANCE;
        }
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 2;
        if (fWheelPickerState.awaitScroll(iCoerceAtLeast, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object awaitScroll(final int i, Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        FWheelPickerState fWheelPickerState;
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
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (get_currentIndex() == i) {
                return Unit.INSTANCE;
            }
            if (this.debug) {
                Log.i("FWheelPicker", "awaitScroll index " + i + " start");
            }
            resumeAwaitScroll();
            set_pendingIndex(Boxing.boxInt(i));
            anonymousClass1.L$0 = this;
            anonymousClass1.I$0 = i;
            anonymousClass1.label = 1;
            AnonymousClass1 anonymousClass2 = anonymousClass1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(anonymousClass2), 1);
            cancellableContinuationImpl.initCancellability();
            CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            this._pendingIndexContinuation = cancellableContinuationImpl2;
            cancellableContinuationImpl2.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.picker.FWheelPickerState$awaitScroll$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    boolean debug = this.this$0.getDebug();
                    int i3 = i;
                    if (debug) {
                        Log.i("FWheelPicker", "awaitScroll index " + i3 + " canceled");
                    }
                    this.this$0._pendingIndexContinuation = null;
                    this.this$0.set_pendingIndex(null);
                }
            });
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(anonymousClass2);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
            fWheelPickerState = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = anonymousClass1.I$0;
            fWheelPickerState = (FWheelPickerState) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (fWheelPickerState.debug) {
            Log.i("FWheelPicker", "awaitScroll index " + i + " finish");
        }
        return Unit.INSTANCE;
    }

    private final void resumeAwaitScroll() {
        Continuation<? super Unit> continuation = this._pendingIndexContinuation;
        if (continuation != null) {
            if (this.debug) {
                Log.i("FWheelPicker", "resumeAwaitScroll pendingIndex:" + this._pendingIndex);
            }
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m7405constructorimpl(Unit.INSTANCE));
            this._pendingIndexContinuation = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object notifyCountChanged$app_release(int i, Continuation<? super Unit> continuation) throws Throwable {
        FWheelPickerState$notifyCountChanged$1 fWheelPickerState$notifyCountChanged$1;
        FWheelPickerState fWheelPickerState;
        int iIntValue;
        if (continuation instanceof FWheelPickerState$notifyCountChanged$1) {
            fWheelPickerState$notifyCountChanged$1 = (FWheelPickerState$notifyCountChanged$1) continuation;
            if ((fWheelPickerState$notifyCountChanged$1.label & Integer.MIN_VALUE) != 0) {
                fWheelPickerState$notifyCountChanged$1.label -= Integer.MIN_VALUE;
            } else {
                fWheelPickerState$notifyCountChanged$1 = new FWheelPickerState$notifyCountChanged$1(this, continuation);
            }
        } else {
            fWheelPickerState$notifyCountChanged$1 = new FWheelPickerState$notifyCountChanged$1(this, continuation);
        }
        Object obj = fWheelPickerState$notifyCountChanged$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = fWheelPickerState$notifyCountChanged$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.debug) {
                Log.i("FWheelPicker", "notifyCountChanged count:" + i + " currentIndex:" + get_currentIndex() + " pendingIndex:" + this._pendingIndex);
            }
            set_count(i);
            int i3 = i - 1;
            if (get_currentIndex() > i3) {
                setCurrentIndexInternal(i3);
            } else {
                Integer num = this._pendingIndex;
                if (num != null && i > (iIntValue = num.intValue())) {
                    fWheelPickerState$notifyCountChanged$1.L$0 = this;
                    fWheelPickerState$notifyCountChanged$1.label = 1;
                    if (scrollToIndex(iIntValue, false, fWheelPickerState$notifyCountChanged$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                fWheelPickerState = this;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fWheelPickerState = (FWheelPickerState) fWheelPickerState$notifyCountChanged$1.L$0;
        ResultKt.throwOnFailure(obj);
        if (fWheelPickerState.get_currentIndex() < 0) {
            fWheelPickerState.synchronizeCurrentIndex();
        }
        return Unit.INSTANCE;
    }

    private final void synchronizeCurrentIndex() {
        if (this.debug) {
            Log.i("FWheelPicker", "synchronizeCurrentIndex");
        }
        setCurrentIndexInternal(synchronizeCurrentIndexSnapshot$app_release());
    }

    private final void setCurrentIndexInternal(int index) {
        int iCoerceAtLeast = RangesKt.coerceAtLeast(index, -1);
        if (get_currentIndex() != iCoerceAtLeast) {
            if (this.debug) {
                Log.i("FWheelPicker", "Current index changed " + iCoerceAtLeast);
            }
            set_currentIndex(iCoerceAtLeast);
            set_currentIndexSnapshot(iCoerceAtLeast);
            Integer num = this._pendingIndex;
            if (num != null && num.intValue() == iCoerceAtLeast) {
                set_pendingIndex(null);
            }
        }
    }

    public final int synchronizeCurrentIndexSnapshot$app_release() {
        LazyListItemInfo lazyListItemInfoMostStartItemInfo = mostStartItemInfo();
        int index = lazyListItemInfoMostStartItemInfo != null ? lazyListItemInfoMostStartItemInfo.getIndex() : -1;
        set_currentIndexSnapshot(index);
        return index;
    }

    private final LazyListItemInfo mostStartItemInfo() {
        if (this._count <= 0) {
            return null;
        }
        LazyListLayoutInfo layoutInfo = this.lazyListState.getLayoutInfo();
        List<LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
        if (visibleItemsInfo.isEmpty()) {
            return null;
        }
        if (visibleItemsInfo.size() == 1) {
            return (LazyListItemInfo) CollectionsKt.first((List) visibleItemsInfo);
        }
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.first((List) visibleItemsInfo);
        return Math.abs(lazyListItemInfo.getOffset() - layoutInfo.getViewportStartOffset()) < lazyListItemInfo.getSize() / 2 ? lazyListItemInfo : visibleItemsInfo.get(1);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.lazyListState.isScrollInProgress();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) throws Throwable {
        Object objScroll = this.lazyListState.scroll(mutatePriority, function2, continuation);
        return objScroll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.lazyListState.dispatchRawDelta(delta);
    }

    /* JADX INFO: compiled from: rememberFWheelPickerState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcn/jianyun/workplan/ui/component/form/picker/FWheelPickerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Lcn/jianyun/workplan/ui/component/form/picker/FWheelPickerState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<FWheelPickerState, ?> getSaver() {
            return FWheelPickerState.Saver;
        }
    }
}