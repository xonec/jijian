package cn.jianyun.workplan.module.schedule.views.main;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import cn.jianyun.workplan.module.schedule.model.ScheduleProject;
import cn.jianyun.workplan.module.schedule.route.ScheduleRouter;
import cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel;
import cn.jianyun.workplan.ui.component.form.DialogViewKt;
import cn.jianyun.workplan.ui.component.form.GroupViewKt;
import cn.jianyun.workplan.ui.component.nav.BoxViewKt;
import cn.jianyun.workplan.ui.component.nav.HeaderViewKt;
import cn.jianyun.workplan.ui.component.nav.PartTitleViewKt;
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

/* JADX INFO: compiled from: BottomProjectChooseView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"BottomProjectChooseView", "", "nav", "Landroidx/navigation/NavHostController;", "viewModel", "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;", "(Landroidx/navigation/NavHostController;Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BottomProjectChooseViewKt {
    public static final void BottomProjectChooseView(final NavHostController nav, final ScheduleMasterViewModel viewModel, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(nav, "nav");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(379345507);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BottomProjectChooseView)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(379345507, i, -1, "cn.jianyun.workplan.module.schedule.views.main.BottomProjectChooseView (BottomProjectChooseView.kt:21)");
        }
        DialogViewKt.m6840BottomDialogVieweHTjO5g("选择排班项目", true, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1519404107, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.BottomProjectChooseViewKt.BottomProjectChooseView.1
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
                        ComposerKt.traceEventStart(1519404107, i2, -1, "cn.jianyun.workplan.module.schedule.views.main.BottomProjectChooseView.<anonymous> (BottomProjectChooseView.kt:23)");
                    }
                    final NavHostController navHostController = nav;
                    BoxViewKt.m6893SmallLinkTextPZHvWI("管理", 0.0f, 0L, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.BottomProjectChooseViewKt.BottomProjectChooseView.1.1
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
                            NavController.navigate$default(navHostController, ScheduleRouter.ProjectManage.INSTANCE.getRoute(), null, null, 6, null);
                        }
                    }, composer2, 6, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), false, Dp.m6097constructorimpl(500), new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.BottomProjectChooseViewKt.BottomProjectChooseView.2
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
                viewModel.resetForm();
            }
        }, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 739691087, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.BottomProjectChooseViewKt.BottomProjectChooseView.3
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
                        ComposerKt.traceEventStart(739691087, i2, -1, "cn.jianyun.workplan.module.schedule.views.main.BottomProjectChooseView.<anonymous> (BottomProjectChooseView.kt:29)");
                    }
                    List<ScheduleProject> projectList = viewModel.getProjectList();
                    final ScheduleMasterViewModel scheduleMasterViewModel = viewModel;
                    HeaderViewKt.m6902ListDataViewosbwsH8(projectList, null, 0.0f, false, null, ComposableLambdaKt.composableLambda(composer2, -564055934, true, new Function3<ScheduleProject, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.BottomProjectChooseViewKt.BottomProjectChooseView.3.1
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ScheduleProject scheduleProject, Composer composer3, Integer num) {
                            invoke(scheduleProject, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(final ScheduleProject it, Composer composer3, int i3) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-564055934, i3, -1, "cn.jianyun.workplan.module.schedule.views.main.BottomProjectChooseView.<anonymous>.<anonymous> (BottomProjectChooseView.kt:30)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            final ScheduleMasterViewModel scheduleMasterViewModel2 = scheduleMasterViewModel;
                            Modifier modifierM249clickableXHw0xAI$default = ClickableKt.m249clickableXHw0xAI$default(companion, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.BottomProjectChooseViewKt.BottomProjectChooseView.3.1.1
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
                                    if (Intrinsics.areEqual(it.getUuid(), scheduleMasterViewModel2.getCurrentProjectId())) {
                                        scheduleMasterViewModel2.resetForm();
                                    } else {
                                        scheduleMasterViewModel2.changeProject(it);
                                    }
                                }
                            }, 7, null);
                            final ScheduleMasterViewModel scheduleMasterViewModel3 = scheduleMasterViewModel;
                            GroupViewKt.m6850GroupViewfIyqwc(modifierM249clickableXHw0xAI$default, true, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer3, -1391062127, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.BottomProjectChooseViewKt.BottomProjectChooseView.3.1.2
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
                                            ComposerKt.traceEventStart(-1391062127, i4, -1, "cn.jianyun.workplan.module.schedule.views.main.BottomProjectChooseView.<anonymous>.<anonymous>.<anonymous> (BottomProjectChooseView.kt:38)");
                                        }
                                        float fM6097constructorimpl = Dp.m6097constructorimpl(15);
                                        final ScheduleProject scheduleProject = it;
                                        final ScheduleMasterViewModel scheduleMasterViewModel4 = scheduleMasterViewModel3;
                                        BoxViewKt.m6895TwoColumnViewdjqsMU(null, fM6097constructorimpl, 0.0f, ComposableLambdaKt.composableLambda(composer4, 221605898, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.BottomProjectChooseViewKt.BottomProjectChooseView.3.1.2.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer5, int i5) {
                                                if ((i5 & 11) != 2 || !composer5.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(221605898, i5, -1, "cn.jianyun.workplan.module.schedule.views.main.BottomProjectChooseView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomProjectChooseView.kt:39)");
                                                    }
                                                    final ScheduleProject scheduleProject2 = scheduleProject;
                                                    final ScheduleMasterViewModel scheduleMasterViewModel5 = scheduleMasterViewModel4;
                                                    BoxViewKt.m6898VerticalRowdjqsMU(null, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer5, 1034104724, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.BottomProjectChooseViewKt.BottomProjectChooseView.3.1.2.1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                            invoke(composer6, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer6, int i6) {
                                                            if ((i6 & 11) != 2 || !composer6.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1034104724, i6, -1, "cn.jianyun.workplan.module.schedule.views.main.BottomProjectChooseView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomProjectChooseView.kt:40)");
                                                                }
                                                                TextKt.m2471Text4IGK_g(scheduleProject2.getName(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer6, 0, 0, 131070);
                                                                CommonUIKt.m6944BlankkHDZbjc(0.0f, composer6, 0, 1);
                                                                if (Intrinsics.areEqual(scheduleProject2.getUuid(), scheduleMasterViewModel5.getCurrentProjectId())) {
                                                                    PartTitleViewKt.m6915TagViewo4cevVk("当前", 0L, false, 0.0f, false, 0L, false, null, composer6, 6, MediaPlayer.MEDIA_PLAYER_ADAPTIVE_WORK_AROUND_MODE);
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer6.skipToGroupEnd();
                                                        }
                                                    }), composer5, 3072, 7);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }), composer4, 3120, 5);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }), composer3, 100663344, MediaPlayer.MEDIA_PLAYER_OPTION_HW_DEC_DROP_NON_REF);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, 196616, 30);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 12782646, 20);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.BottomProjectChooseViewKt.BottomProjectChooseView.4
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
                BottomProjectChooseViewKt.BottomProjectChooseView(nav, viewModel, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }
}