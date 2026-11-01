package cn.jianyun.workplan.module.schedule.views.project;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavHostController;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.module.schedule.model.ScheduleProject;
import cn.jianyun.workplan.module.schedule.vm.ScheduleProjectViewModel;
import cn.jianyun.workplan.ui.component.form.ButtonViewKt;
import cn.jianyun.workplan.ui.component.form.FormItemKt;
import cn.jianyun.workplan.ui.component.nav.BoxViewKt;
import cn.jianyun.workplan.ui.component.nav.HeaderViewKt;
import cn.jianyun.workplan.ui.component.nav.PartTitleViewKt;
import cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt;
import cn.jianyun.workplan.util.CommonUIKt;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: ScheduleProjectManagerView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"ScheduleProjectManagerView", "", "navHostController", "Landroidx/navigation/NavHostController;", "(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ScheduleProjectManagerViewKt {
    /* JADX WARN: Type inference failed for: r1v13, types: [T, androidx.lifecycle.ViewModel] */
    public static final void ScheduleProjectManagerView(final NavHostController navHostController, Composer composer, final int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        Composer composerStartRestartGroup = composer.startRestartGroup(1096699562);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ScheduleProjectManagerView)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1096699562, i, -1, "cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerView (ScheduleProjectManagerView.kt:34)");
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        composerStartRestartGroup.startReplaceableGroup(1890788296);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(hiltViewModel)P(1)*42@1793L7,47@1936L47,48@1995L54:HiltViewModel.kt#9mcars");
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModelProvider.Factory factoryCreateHiltViewModelFactory = HiltViewModelKt.createHiltViewModelFactory(current, composerStartRestartGroup, 8);
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67");
        if (current instanceof HasDefaultViewModelProviderFactory) {
            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
        }
        ?? ViewModel = ViewModelKt.viewModel((Class<??>) ScheduleProjectViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        objectRef.element = ViewModel;
        HeaderViewKt.m6904PageWithFooterView0vH8DBg(navHostController, "项目管理", null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1706071677, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt.ScheduleProjectManagerView.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1706071677, i2, -1, "cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerView.<anonymous> (ScheduleProjectManagerView.kt:41)");
                    }
                    if (objectRef.element.getDatalist().size() > 1) {
                        composer2.startReplaceableGroup(-1876357470);
                        final Ref.ObjectRef<ScheduleProjectViewModel> objectRef2 = objectRef;
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt.ScheduleProjectManagerView.1.1
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
                                objectRef2.element.setEditItem(new ScheduleProject(null, null, null, null, 0, 0, false, null, null, null, null, 0, null, 8191, null));
                                objectRef2.element.setFormType(FormType.Companion.add$default(FormType.INSTANCE, null, 1, null));
                            }
                        };
                        final Ref.ObjectRef<ScheduleProjectViewModel> objectRef3 = objectRef;
                        ButtonViewKt.m6816OkAndCancelButtonGroup1yyLQnY("添加项目", "项目排序", 0.0f, 0.0f, function0, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt.ScheduleProjectManagerView.1.2
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
                                objectRef3.element.setFormType(FormType.INSTANCE.sort());
                            }
                        }, composer2, 54, 12);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(-1876357135);
                        final Ref.ObjectRef<ScheduleProjectViewModel> objectRef4 = objectRef;
                        ButtonViewKt.LongOkButton("添加项目", new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt.ScheduleProjectManagerView.1.3
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
                                objectRef4.element.setEditItem(new ScheduleProject(null, null, null, null, 0, 0, false, null, null, null, null, 0, null, 8191, null));
                                objectRef4.element.setFormType(FormType.Companion.add$default(FormType.INSTANCE, null, 1, null));
                            }
                        }, composer2, 6, 0);
                        composer2.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1899064129, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt.ScheduleProjectManagerView.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                char c2;
                if ((i2 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1899064129, i2, -1, "cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerView.<anonymous> (ScheduleProjectManagerView.kt:57)");
                }
                if (objectRef.element.getDatalist().isEmpty()) {
                    composer2.startReplaceableGroup(-1876356893);
                    BoxViewKt.m6880EmptyDataView6BXD4ec("暂无项目", 0L, 0L, null, composer2, 6, 14);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(-1876356827);
                    List<ScheduleProject> datalist = objectRef.element.getDatalist();
                    final Ref.ObjectRef<ScheduleProjectViewModel> objectRef2 = objectRef;
                    for (final ScheduleProject scheduleProject : datalist) {
                        SwipeRowViewKt.SwipeDeleteView(false, scheduleProject.getUuid(), new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$1
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
                                objectRef2.element.setEditItem(scheduleProject);
                                objectRef2.element.setFormType(new FormType("detail", null, null, 6, null));
                            }
                        }, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$2
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
                                if (objectRef2.element.getDatalist().size() == 1) {
                                    objectRef2.element.toast("至少保留一个项目");
                                } else {
                                    objectRef2.element.setEditItem(scheduleProject);
                                    objectRef2.element.doDelete();
                                }
                            }
                        }, "删除项目，会把项目下所有排班数据级联删除，确定还要继续吗？", ComposableLambdaKt.composableLambda(composer2, 498815256, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(498815256, i3, -1, "cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerView.<anonymous>.<anonymous>.<anonymous> (ScheduleProjectManagerView.kt:75)");
                                    }
                                    Modifier modifierM567padding3ABfNKs = PaddingKt.m567padding3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(15));
                                    final ScheduleProject scheduleProject2 = scheduleProject;
                                    final Ref.ObjectRef<ScheduleProjectViewModel> objectRef3 = objectRef2;
                                    composer3.startReplaceableGroup(-483455358);
                                    ComposerKt.sourceInformation(composer3, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                    composer3.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM567padding3ABfNKs);
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
                                    BoxViewKt.m6898VerticalRowdjqsMU(null, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer3, 1239905476, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$3$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i4) {
                                            if ((i4 & 11) != 2 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1239905476, i4, -1, "cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScheduleProjectManagerView.kt:77)");
                                                }
                                                TextKt.m2471Text4IGK_g(scheduleProject2.getName(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 0, 0, 131070);
                                                CommonUIKt.m6944BlankkHDZbjc(0.0f, composer4, 0, 1);
                                                if (Intrinsics.areEqual(scheduleProject2.getUuid(), objectRef3.element.getCurrentProjectId())) {
                                                    PartTitleViewKt.m6915TagViewo4cevVk("当前项目", 0L, false, 0.0f, false, 0L, false, null, composer4, 6, MediaPlayer.MEDIA_PLAYER_ADAPTIVE_WORK_AROUND_MODE);
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), composer3, 3072, 7);
                                    BoxViewKt.m6892OnlySmallTipText8TGbp0M(scheduleProject2.getGmtCreate(), 0, 0L, 0L, 0.0f, null, composer3, 0, 62);
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
                        }), composer2, 221184, 1);
                    }
                    composer2.endReplaceableGroup();
                }
                composer2.startReplaceableGroup(-1876355752);
                if (objectRef.element.getFormType().isAdd() || objectRef.element.getFormType().isUpdate()) {
                    String name = objectRef.element.getEditItem().getName();
                    final Ref.ObjectRef<ScheduleProjectViewModel> objectRef3 = objectRef;
                    Function1<String, Boolean> function1 = new Function1<String, Boolean>() { // from class: cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt.ScheduleProjectManagerView.2.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(String it) {
                            boolean z;
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (Intrinsics.areEqual(it, "")) {
                                z = false;
                            } else {
                                ScheduleProjectViewModel scheduleProjectViewModel = objectRef3.element;
                                ScheduleProject editItem = objectRef3.element.getEditItem();
                                scheduleProjectViewModel.setEditItem(editItem.copy((8189 & 1) != 0 ? editItem.uuid : null, (8189 & 2) != 0 ? editItem.name : it, (8189 & 4) != 0 ? editItem.remark : null, (8189 & 8) != 0 ? editItem.userId : null, (8189 & 16) != 0 ? editItem.ordinal : 0, (8189 & 32) != 0 ? editItem.state : 0, (8189 & 64) != 0 ? editItem.alarm : false, (8189 & 128) != 0 ? editItem.gmtCreate : null, (8189 & 256) != 0 ? editItem.extField1 : null, (8189 & 512) != 0 ? editItem.extField2 : null, (8189 & 1024) != 0 ? editItem.extField3 : null, (8189 & 2048) != 0 ? editItem.cc : 0, (8189 & 4096) != 0 ? editItem.cid : null));
                                objectRef3.element.save();
                                z = true;
                            }
                            return Boolean.valueOf(z);
                        }
                    };
                    final Ref.ObjectRef<ScheduleProjectViewModel> objectRef4 = objectRef;
                    c2 = 2;
                    FormItemKt.m6845ShowInputDialogJDHDdL8(name, null, false, 0, 0, null, 0, 0.0f, null, false, null, function1, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt.ScheduleProjectManagerView.2.3
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
                            objectRef4.element.resetForm();
                        }
                    }, composer2, 805306368, 0, 1534);
                } else {
                    c2 = 2;
                }
                composer2.endReplaceableGroup();
                
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0116: INVOKE (r14v0 ?? I:??[OBJECT, ARRAY]), (-1876355116 int) INTERFACE call: androidx.compose.runtime.Composer.startReplaceableGroup(int):void A[MD:(int):void (m)] in method: cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt.ScheduleProjectManagerView.2.invoke(androidx.compose.runtime.Composer, int):void, file: classes2.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r14v0 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 630
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt.AnonymousClass2.invoke(androidx.compose.runtime.Composer, int):void");
            }
        }), composerStartRestartGroup, 12779576, 92);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt.ScheduleProjectManagerView.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                ScheduleProjectManagerViewKt.ScheduleProjectManagerView(navHostController, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }
}