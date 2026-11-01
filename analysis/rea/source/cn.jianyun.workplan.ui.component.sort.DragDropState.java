package cn.jianyun.workplan.ui.component.sort;

import android.content.Context;
import android.media.AudioManager;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import com.bykv.vk.component.ttvideo.player.MediaFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: DragDropState.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\u0010\fJ\u0006\u0010@\u001a\u00020\u001bJ\u001b\u0010A\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020Cø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bD\u0010EJ\u0006\u0010F\u001a\u00020\u000bJ\u001b\u0010G\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020Cø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bH\u0010ER\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R/\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u001b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u001a\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010\"\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u001a\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0016\u0010(\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0012R\u0014\u0010*\u001a\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001eR\"\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R/\u00100\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00108B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010\u001a\u001a\u0004\b1\u0010\u0012\"\u0004\b2\u00103R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R/\u00105\u001a\u0004\u0018\u00010\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\n8@@BX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010\u001a\u001a\u0004\b6\u0010\u0016\"\u0004\b7\u0010\u0018R6\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020:092\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020:09@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006I"}, d2 = {"Lcn/jianyun/workplan/ui/component/sort/DragDropState;", "", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "context", "Landroid/content/Context;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "onSwap", "Lkotlin/Function2;", "", "", "(Landroidx/compose/foundation/lazy/LazyListState;Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function2;)V", "getContext", "()Landroid/content/Context;", "currentElement", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "getCurrentElement", "()Landroidx/compose/foundation/lazy/LazyListItemInfo;", "<set-?>", "currentIndexOfDraggedItem", "getCurrentIndexOfDraggedItem", "()Ljava/lang/Integer;", "setCurrentIndexOfDraggedItem", "(Ljava/lang/Integer;)V", "currentIndexOfDraggedItem$delegate", "Landroidx/compose/runtime/MutableState;", "", "draggedDistance", "getDraggedDistance", "()F", "setDraggedDistance", "(F)V", "draggedDistance$delegate", "draggingItemInitialOffset", "getDraggingItemInitialOffset", "()I", "setDraggingItemInitialOffset", "(I)V", "draggingItemInitialOffset$delegate", "draggingItemLayoutInfo", "getDraggingItemLayoutInfo", "draggingItemOffset", "getDraggingItemOffset$app_release", "initialOffsets", "Lkotlin/Pair;", "getInitialOffsets", "()Lkotlin/Pair;", "initiallyDraggedElement", "getInitiallyDraggedElement", "setInitiallyDraggedElement", "(Landroidx/compose/foundation/lazy/LazyListItemInfo;)V", "initiallyDraggedElement$delegate", "previousIndexOfDraggedItem", "getPreviousIndexOfDraggedItem$app_release", "setPreviousIndexOfDraggedItem", "previousIndexOfDraggedItem$delegate", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "previousItemOffset", "getPreviousItemOffset$app_release", "()Landroidx/compose/animation/core/Animatable;", "getState", "()Landroidx/compose/foundation/lazy/LazyListState;", "checkForOverScroll", "onDrag", "offset", "Landroidx/compose/ui/geometry/Offset;", "onDrag-k-4lQ0M", "(J)V", "onDragInterrupted", "onDragStart", "onDragStart-k-4lQ0M", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DragDropState {
    public static final int $stable = 8;
    private final Context context;

    /* JADX INFO: renamed from: currentIndexOfDraggedItem$delegate, reason: from kotlin metadata */
    private final MutableState currentIndexOfDraggedItem;

    /* JADX INFO: renamed from: draggedDistance$delegate, reason: from kotlin metadata */
    private final MutableState draggedDistance;

    /* JADX INFO: renamed from: draggingItemInitialOffset$delegate, reason: from kotlin metadata */
    private final MutableState draggingItemInitialOffset;

    /* JADX INFO: renamed from: initiallyDraggedElement$delegate, reason: from kotlin metadata */
    private final MutableState initiallyDraggedElement;
    private final Function2<Integer, Integer, Unit> onSwap;

    /* JADX INFO: renamed from: previousIndexOfDraggedItem$delegate, reason: from kotlin metadata */
    private final MutableState previousIndexOfDraggedItem;
    private Animatable<Float, AnimationVector1D> previousItemOffset;
    private final CoroutineScope scope;
    private final LazyListState state;

    /* JADX WARN: Multi-variable type inference failed */
    public DragDropState(LazyListState state, Context context, CoroutineScope scope, Function2<? super Integer, ? super Integer, Unit> onSwap) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onSwap, "onSwap");
        this.state = state;
        this.context = context;
        this.scope = scope;
        this.onSwap = onSwap;
        this.draggedDistance = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
        this.draggingItemInitialOffset = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.previousIndexOfDraggedItem = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.previousItemOffset = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.initiallyDraggedElement = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentIndexOfDraggedItem = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public final LazyListState getState() {
        return this.state;
    }

    public final Context getContext() {
        return this.context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float getDraggedDistance() {
        return ((Number) this.draggedDistance.getValue()).floatValue();
    }

    private final void setDraggedDistance(float f2) {
        this.draggedDistance.setValue(Float.valueOf(f2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int getDraggingItemInitialOffset() {
        return ((Number) this.draggingItemInitialOffset.getValue()).intValue();
    }

    private final void setDraggingItemInitialOffset(int i) {
        this.draggingItemInitialOffset.setValue(Integer.valueOf(i));
    }

    public final float getDraggingItemOffset$app_release() {
        LazyListItemInfo draggingItemLayoutInfo = getDraggingItemLayoutInfo();
        if (draggingItemLayoutInfo != null) {
            return (getDraggingItemInitialOffset() + getDraggedDistance()) - draggingItemLayoutInfo.getOffset();
        }
        return 0.0f;
    }

    private final LazyListItemInfo getDraggingItemLayoutInfo() {
        Object next;
        Iterator<T> it = this.state.getLayoutInfo().getVisibleItemsInfo().iterator();
        while (it.hasNext()) {
            next = it.next();
            int index = ((LazyListItemInfo) next).getIndex();
            Integer currentIndexOfDraggedItem = getCurrentIndexOfDraggedItem();
            if (currentIndexOfDraggedItem != null && index == currentIndexOfDraggedItem.intValue()) {
                return (LazyListItemInfo) next;
            }
        }
        next = null;
        return (LazyListItemInfo) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPreviousIndexOfDraggedItem(Integer num) {
        this.previousIndexOfDraggedItem.setValue(num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Integer getPreviousIndexOfDraggedItem$app_release() {
        return (Integer) this.previousIndexOfDraggedItem.getValue();
    }

    public final Animatable<Float, AnimationVector1D> getPreviousItemOffset$app_release() {
        return this.previousItemOffset;
    }

    private final LazyListItemInfo getInitiallyDraggedElement() {
        return (LazyListItemInfo) this.initiallyDraggedElement.getValue();
    }

    private final void setInitiallyDraggedElement(LazyListItemInfo lazyListItemInfo) {
        this.initiallyDraggedElement.setValue(lazyListItemInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Integer getCurrentIndexOfDraggedItem() {
        return (Integer) this.currentIndexOfDraggedItem.getValue();
    }

    public final void setCurrentIndexOfDraggedItem(Integer num) {
        this.currentIndexOfDraggedItem.setValue(num);
    }

    private final Pair<Integer, Integer> getInitialOffsets() {
        LazyListItemInfo initiallyDraggedElement = getInitiallyDraggedElement();
        if (initiallyDraggedElement != null) {
            return new Pair<>(Integer.valueOf(initiallyDraggedElement.getOffset()), Integer.valueOf(RememberDragDropStateKt.getOffsetEnd(initiallyDraggedElement)));
        }
        return null;
    }

    private final LazyListItemInfo getCurrentElement() {
        Integer currentIndexOfDraggedItem = getCurrentIndexOfDraggedItem();
        if (currentIndexOfDraggedItem == null) {
            return null;
        }
        return RememberDragDropStateKt.getVisibleItemInfoFor(this.state, currentIndexOfDraggedItem.intValue());
    }

    /* JADX INFO: renamed from: onDragStart-k-4lQ0M, reason: not valid java name */
    public final void m6929onDragStartk4lQ0M(long offset) {
        Object next;
        int offset2;
        int offset3;
        int iM3515getYimpl;
        Iterator<T> it = this.state.getLayoutInfo().getVisibleItemsInfo().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) next;
            offset2 = lazyListItemInfo.getOffset();
            offset3 = lazyListItemInfo.getOffset() + lazyListItemInfo.getSize();
            iM3515getYimpl = (int) Offset.m3515getYimpl(offset);
        } while (!(offset2 <= iM3515getYimpl && iM3515getYimpl <= offset3));
        LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) next;
        if (lazyListItemInfo2 != null) {
            Object systemService = this.context.getSystemService(MediaFormat.KEY_AUDIO);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            ((AudioManager) systemService).playSoundEffect(0, 1.0f);
            setCurrentIndexOfDraggedItem(Integer.valueOf(lazyListItemInfo2.getIndex()));
            setInitiallyDraggedElement(lazyListItemInfo2);
            setDraggingItemInitialOffset(lazyListItemInfo2.getOffset());
        }
    }

    public final void onDragInterrupted() {
        if (getCurrentIndexOfDraggedItem() != null) {
            setPreviousIndexOfDraggedItem(getCurrentIndexOfDraggedItem());
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AnonymousClass1(null), 3, null);
        }
        setDraggingItemInitialOffset(0);
        setDraggedDistance(0.0f);
        setCurrentIndexOfDraggedItem(null);
        setInitiallyDraggedElement(null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.ui.component.sort.DragDropState$onDragInterrupted$1, reason: invalid class name */
    /* JADX INFO: compiled from: DragDropState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.ui.component.sort.DragDropState$onDragInterrupted$1", f = "DragDropState.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DragDropState.this.new AnonymousClass1(continuation);
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
                this.label = 1;
                if (DragDropState.this.getPreviousItemOffset$app_release().snapTo(Boxing.boxFloat(0.0f), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            DragDropState.this.setPreviousIndexOfDraggedItem(null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: onDrag-k-4lQ0M, reason: not valid java name */
    public final void m6928onDragk4lQ0M(long offset) {
        Object next;
        LazyListItemInfo lazyListItemInfo;
        setDraggedDistance(getDraggedDistance() + Offset.m3515getYimpl(offset));
        Pair<Integer, Integer> initialOffsets = getInitialOffsets();
        if (initialOffsets != null) {
            int iIntValue = initialOffsets.component1().intValue();
            int iIntValue2 = initialOffsets.component2().intValue();
            float draggedDistance = iIntValue + getDraggedDistance();
            float draggedDistance2 = iIntValue2 + getDraggedDistance();
            LazyListItemInfo currentElement = getCurrentElement();
            if (currentElement != null) {
                List<LazyListItemInfo> visibleItemsInfo = this.state.getLayoutInfo().getVisibleItemsInfo();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = visibleItemsInfo.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next2 = it.next();
                    LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) next2;
                    if (!(((float) RememberDragDropStateKt.getOffsetEnd(lazyListItemInfo2)) < draggedDistance || ((float) lazyListItemInfo2.getOffset()) > draggedDistance2 || currentElement.getIndex() == lazyListItemInfo2.getIndex())) {
                        arrayList.add(next2);
                    }
                }
                Iterator it2 = arrayList.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        lazyListItemInfo = (LazyListItemInfo) next;
                    }
                } while (!(draggedDistance - ((float) currentElement.getOffset()) <= 0.0f ? draggedDistance < ((float) lazyListItemInfo.getOffset()) : draggedDistance2 > ((float) RememberDragDropStateKt.getOffsetEnd(lazyListItemInfo))));
                LazyListItemInfo lazyListItemInfo3 = (LazyListItemInfo) next;
                if (lazyListItemInfo3 != null) {
                    Integer currentIndexOfDraggedItem = getCurrentIndexOfDraggedItem();
                    if (currentIndexOfDraggedItem != null) {
                        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new DragDropState$onDrag$1$1$3$1$1(this, currentIndexOfDraggedItem.intValue(), lazyListItemInfo3, null), 3, null);
                    }
                    setCurrentIndexOfDraggedItem(Integer.valueOf(lazyListItemInfo3.getIndex()));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0045 A[PHI: r0
      0x0045: PHI (r0v11 java.lang.Float) = (r0v10 java.lang.Float), (r0v13 java.lang.Float) binds: [B:18:0x006c, B:10:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    public final float checkForOverScroll() {
        Float fValueOf;
        LazyListItemInfo initiallyDraggedElement = getInitiallyDraggedElement();
        if (initiallyDraggedElement == null) {
            return 0.0f;
        }
        float offset = initiallyDraggedElement.getOffset() + getDraggedDistance();
        float offsetEnd = RememberDragDropStateKt.getOffsetEnd(initiallyDraggedElement) + getDraggedDistance();
        Float f2 = null;
        if (getDraggedDistance() > 0.0f) {
            fValueOf = Float.valueOf(offsetEnd - this.state.getLayoutInfo().getViewportEndOffset());
            if (fValueOf.floatValue() > 0.0f) {
                f2 = fValueOf;
            }
        } else if (getDraggedDistance() < 0.0f) {
            fValueOf = Float.valueOf(offset - this.state.getLayoutInfo().getViewportStartOffset());
            if (fValueOf.floatValue() < 0.0f) {
                f2 = fValueOf;
            }
        }
        if (f2 != null) {
            return f2.floatValue();
        }
        return 0.0f;
    }
}