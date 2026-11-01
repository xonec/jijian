package cn.jianyun.workplan.ui.component.sort;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: compiled from: DragDropColumn.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ax\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u000727\u0010\t\u001a3\u0012\u0004\u0012\u00020\u000b\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"DragDropColumn", "", ExifInterface.GPS_DIRECTION_TRUE, "", "items", "", "onSwap", "Lkotlin/Function2;", "", "itemContent", "Lkotlin/Function3;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Lkotlin/ParameterName;", "name", "item", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DragDropColumnKt {
    public static final <T> void DragDropColumn(final List<? extends T> items, final Function2<? super Integer, ? super Integer, Unit> onSwap, final Function5<? super LazyItemScope, ? super T, ? super Boolean, ? super Composer, ? super Integer, Unit> itemContent, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(onSwap, "onSwap");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-188091557);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DragDropColumn)P(1,2)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-188091557, i, -1, "cn.jianyun.workplan.ui.component.sort.DragDropColumn (DragDropColumn.kt:24)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
        composerStartRestartGroup.startReplaceableGroup(773894976);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            objRememberedValue2 = compositionScopedCoroutineScopeCanceller;
        }
        composerStartRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean zChanged = composerStartRestartGroup.changed(onSwap);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = (Function2) new Function2<Integer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.sort.DragDropColumnKt$DragDropColumn$dragDropState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
                    invoke(num.intValue(), num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i2, int i3) {
                    onSwap.invoke(Integer.valueOf(i2), Integer.valueOf(i3));
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final DragDropState dragDropStateRememberDragDropState = RememberDragDropStateKt.rememberDragDropState(lazyListStateRememberLazyListState, (Function2) objRememberedValue3, composerStartRestartGroup, 0);
        LazyDslKt.LazyColumn(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, dragDropStateRememberDragDropState, new AnonymousClass1(dragDropStateRememberDragDropState, mutableState, coroutineScope, null)), lazyListStateRememberLazyListState, null, false, Arrangement.INSTANCE.m476spacedBy0680j_4(Dp.m6097constructorimpl(8)), null, null, false, new Function1<LazyListScope, Unit>() { // from class: cn.jianyun.workplan.ui.component.sort.DragDropColumnKt.DragDropColumn.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                invoke2(lazyListScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LazyListScope LazyColumn) {
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                final List<T> list = items;
                final DragDropState dragDropState = dragDropStateRememberDragDropState;
                final Function5<LazyItemScope, T, Boolean, Composer, Integer, Unit> function5 = itemContent;
                final int i2 = i;
                LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: cn.jianyun.workplan.ui.component.sort.DragDropColumnKt$DragDropColumn$2$invoke$$inlined$itemsIndexed$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i3) {
                        list.get(i3);
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.sort.DragDropColumnKt$DragDropColumn$2$invoke$$inlined$itemsIndexed$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer2, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer2, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(final LazyItemScope lazyItemScope, int i3, Composer composer2, int i4) {
                        int i5;
                        ComposerKt.sourceInformation(composer2, "C183@8439L26:LazyDsl.kt#428nma");
                        if ((i4 & 14) == 0) {
                            i5 = i4 | (composer2.changed(lazyItemScope) ? 4 : 2);
                        } else {
                            i5 = i4;
                        }
                        if ((i4 & 112) == 0) {
                            i5 |= composer2.changed(i3) ? 32 : 16;
                        }
                        if ((i5 & 731) == 146 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1091073711, i5, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:183)");
                        }
                        final Object obj = list.get(i3);
                        final int i6 = (i5 & 112) | (i5 & 14);
                        DragDropState dragDropState2 = dragDropState;
                        final Function5 function6 = function5;
                        final int i7 = i2;
                        RememberDragDropStateKt.DraggableItem(lazyItemScope, dragDropState2, i3, null, ComposableLambdaKt.composableLambda(composer2, -1040125989, true, new Function4<ColumnScope, Boolean, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.sort.DragDropColumnKt$DragDropColumn$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(4);
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Boolean bool, Composer composer3, Integer num) {
                                invoke(columnScope, bool.booleanValue(), composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            public final void invoke(ColumnScope DraggableItem, boolean z, Composer composer3, int i8) {
                                Intrinsics.checkNotNullParameter(DraggableItem, "$this$DraggableItem");
                                if ((i8 & 112) == 0) {
                                    i8 |= composer3.changed(z) ? 32 : 16;
                                }
                                if ((i8 & 721) != 144 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1040125989, i8, -1, "cn.jianyun.workplan.ui.component.sort.DragDropColumn.<anonymous>.<anonymous>.<anonymous> (DragDropColumn.kt:78)");
                                    }
                                    Function5<LazyItemScope, T, Boolean, Composer, Integer, Unit> function7 = function6;
                                    LazyItemScope lazyItemScope2 = lazyItemScope;
                                    T t = obj;
                                    int i9 = i6;
                                    int i10 = i7;
                                    composer3.startReplaceableGroup(-483455358);
                                    ComposerKt.sourceInformation(composer3, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                    composer3.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer3);
                                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(composer3, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    function7.invoke(lazyItemScope2, t, Boolean.valueOf(z), composer3, Integer.valueOf(((i9 >> 3) & 112) | (i9 & 14) | ((i8 << 3) & 896) | ((i10 << 3) & 7168)));
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, (i6 & 14) | 24640 | ((i6 << 3) & 896), 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
        }, composerStartRestartGroup, CpioConstants.C_ISBLK, 236);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.sort.DragDropColumnKt.DragDropColumn.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                DragDropColumnKt.DragDropColumn(items, onSwap, itemContent, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job DragDropColumn$lambda$1(MutableState<Job> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DragDropColumn$lambda$2(MutableState<Job> mutableState, Job job) {
        mutableState.setValue(job);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.ui.component.sort.DragDropColumnKt$DragDropColumn$1, reason: invalid class name */
    /* JADX INFO: compiled from: DragDropColumn.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.ui.component.sort.DragDropColumnKt$DragDropColumn$1", f = "DragDropColumn.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DragDropState $dragDropState;
        final /* synthetic */ MutableState<Job> $overscrollJob$delegate;
        final /* synthetic */ CoroutineScope $scope;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DragDropState dragDropState, MutableState<Job> mutableState, CoroutineScope coroutineScope, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$dragDropState = dragDropState;
            this.$overscrollJob$delegate = mutableState;
            this.$scope = coroutineScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$dragDropState, this.$overscrollJob$delegate, this.$scope, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                final DragDropState dragDropState = this.$dragDropState;
                Function1<Offset, Unit> function1 = new Function1<Offset, Unit>() { // from class: cn.jianyun.workplan.ui.component.sort.DragDropColumnKt.DragDropColumn.1.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                        m6926invokek4lQ0M(offset.getPackedValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                    public final void m6926invokek4lQ0M(long j) {
                        dragDropState.m6929onDragStartk4lQ0M(j);
                    }
                };
                final DragDropState dragDropState2 = this.$dragDropState;
                final MutableState<Job> mutableState = this.$overscrollJob$delegate;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.sort.DragDropColumnKt.DragDropColumn.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        dragDropState2.onDragInterrupted();
                        Job jobDragDropColumn$lambda$1 = DragDropColumnKt.DragDropColumn$lambda$1(mutableState);
                        if (jobDragDropColumn$lambda$1 != null) {
                            Job.DefaultImpls.cancel$default(jobDragDropColumn$lambda$1, (CancellationException) null, 1, (Object) null);
                        }
                    }
                };
                final DragDropState dragDropState3 = this.$dragDropState;
                final MutableState<Job> mutableState2 = this.$overscrollJob$delegate;
                Function0<Unit> function2 = new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.sort.DragDropColumnKt.DragDropColumn.1.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        dragDropState3.onDragInterrupted();
                        Job jobDragDropColumn$lambda$1 = DragDropColumnKt.DragDropColumn$lambda$1(mutableState2);
                        if (jobDragDropColumn$lambda$1 != null) {
                            Job.DefaultImpls.cancel$default(jobDragDropColumn$lambda$1, (CancellationException) null, 1, (Object) null);
                        }
                    }
                };
                final DragDropState dragDropState4 = this.$dragDropState;
                final MutableState<Job> mutableState3 = this.$overscrollJob$delegate;
                final CoroutineScope coroutineScope = this.$scope;
                this.label = 1;
                if (DragGestureDetectorKt.detectDragGesturesAfterLongPress(pointerInputScope, function1, function0, function2, new Function2<PointerInputChange, Offset, Unit>() { // from class: cn.jianyun.workplan.ui.component.sort.DragDropColumnKt.DragDropColumn.1.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
                        m6927invokeUv8p0NA(pointerInputChange, offset.getPackedValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-Uv8p0NA, reason: not valid java name */
                    public final void m6927invokeUv8p0NA(PointerInputChange change, long j) {
                        Intrinsics.checkNotNullParameter(change, "change");
                        change.consume();
                        dragDropState4.m6928onDragk4lQ0M(j);
                        Job jobDragDropColumn$lambda$1 = DragDropColumnKt.DragDropColumn$lambda$1(mutableState3);
                        if (jobDragDropColumn$lambda$1 != null && jobDragDropColumn$lambda$1.isActive()) {
                            return;
                        }
                        Float fValueOf = Float.valueOf(dragDropState4.checkForOverScroll());
                        if (!(!(fValueOf.floatValue() == 0.0f))) {
                            fValueOf = null;
                        }
                        if (fValueOf != null) {
                            DragDropColumnKt.DragDropColumn$lambda$2(mutableState3, BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new DragDropColumnKt$DragDropColumn$1$4$2$1(dragDropState4, fValueOf.floatValue(), null), 3, null));
                            return;
                        }
                        Job jobDragDropColumn$lambda$2 = DragDropColumnKt.DragDropColumn$lambda$1(mutableState3);
                        if (jobDragDropColumn$lambda$2 != null) {
                            Job.DefaultImpls.cancel$default(jobDragDropColumn$lambda$2, (CancellationException) null, 1, (Object) null);
                        }
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }
}