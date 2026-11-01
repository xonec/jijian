package cn.jianyun.workplan.main;

import android.content.Intent;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.main.base.PrivatePolicyKt;
import cn.jianyun.workplan.main.base.UserPolicyKt;
import cn.jianyun.workplan.main.question.QuestionViewKt;
import cn.jianyun.workplan.main.setting.local.LocalBackupViewKt;
import cn.jianyun.workplan.main.setting.notify.NotifySettingViewKt;
import cn.jianyun.workplan.main.setting.user.UserDetailViewKt;
import cn.jianyun.workplan.main.setting.vip.VipViewKt;
import cn.jianyun.workplan.module.base.router.WebDAVRouter;
import cn.jianyun.workplan.module.base.views.webdav.WebDAVUserEditViewKt;
import cn.jianyun.workplan.module.base.views.webdav.WebDAVUserManageViewKt;
import cn.jianyun.workplan.module.base.views.webdav.WebDavDataViewKt;
import cn.jianyun.workplan.module.schedule.route.ScheduleRouter;
import cn.jianyun.workplan.module.schedule.views.ScheduleMainViewKt;
import cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmEditViewKt;
import cn.jianyun.workplan.module.schedule.views.cloud.ScheduleCloudManageViewKt;
import cn.jianyun.workplan.module.schedule.views.plan.SchdulePlanEditViewKt;
import cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt;
import cn.jianyun.workplan.module.schedule.views.share.ScheduleShareViewKt;
import cn.jianyun.workplan.module.schedule.views.wechat.WechatViewKt;
import cn.jianyun.workplan.module.schedule.views.work.SchduleWorkEditViewKt;
import cn.jianyun.workplan.ui.component.form.DialogViewKt;
import cn.jianyun.workplan.ui.theme.ThemeKt;
import cn.jianyun.workplan.vm.AppSettingViewModel;
import cn.jianyun.workplan.widget.config.WidgetConfigViewKt;
import com.byazt.bry.TTDownloadField;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"MainScreen", "", "baseRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", TTDownloadField.TT_ACTIVITY, "Lcn/jianyun/workplan/main/MainActivity;", "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lcn/jianyun/workplan/main/MainActivity;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MainActivityKt {
    public static final void MainScreen(final BaseRepository baseRepository, final MainActivity activity, Composer composer, final int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(baseRepository, "baseRepository");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Composer composerStartRestartGroup = composer.startRestartGroup(1090256324);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(MainScreen)P(1)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1090256324, i, -1, "cn.jianyun.workplan.main.MainScreen (MainActivity.kt:383)");
        }
        final NavHostController navHostControllerRememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], composerStartRestartGroup, 8);
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
        ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) AppSettingViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        AppSettingViewModel appSettingViewModel = (AppSettingViewModel) viewModel;
        appSettingViewModel.tryReload();
        Intent intent = activity.getIntent();
        String stringExtra = intent != null ? intent.getStringExtra(MainActivity.EXTRA_TARGET_ROUTE) : null;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(baseRepository.hasRegist()), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final MutableState mutableState2 = (MutableState) objRememberedValue2;
        final String str = "亲爱的老用户，感谢你一直在使用极简排班。\n\n本次更新重点优化了这些内容：\n\n1. 首页日历支持左右滑动切换月份，浏览排班更顺手。\n2. 首页显示配置和小组件显示配置做了进一步拆分，调节更清晰。\n3. 统计页新增了时长统计、时长占比饼图，以及排班明细导出 Excel。\n4. 排班详情补充了休息时长、工作时长等信息，统计更准确。\n5. 小组件入口、暗黑模式、显示样式等细节都做了持续优化。\n6. 若小组件一直显示“正在加载”，可以先删除小组件，重新添加\n7. 没有班次也可以添加备注了\n\n如果你在使用过程中还有想继续优化的地方，也欢迎随时反馈。";
        EffectsKt.LaunchedEffect(stringExtra, new AnonymousClass1(stringExtra, navHostControllerRememberNavController, activity, null), composerStartRestartGroup, 64);
        EffectsKt.LaunchedEffect(Integer.valueOf(baseRepository.getRegistDay()), new AnonymousClass2(baseRepository, mutableState2, null), composerStartRestartGroup, 64);
        ThemeKt.WorkplanTheme(appSettingViewModel.getAppConfig().getDarkTheme(composerStartRestartGroup, 8), false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -709217274, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.MainActivityKt.MainScreen.3
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
                        ComposerKt.traceEventStart(-709217274, i2, -1, "cn.jianyun.workplan.main.MainScreen.<anonymous> (MainActivity.kt:427)");
                    }
                    final NavHostController navHostController = navHostControllerRememberNavController;
                    final MainActivity mainActivity = activity;
                    ScaffoldKt.m2126ScaffoldTvnljyQ(null, null, null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.composableLambda(composer2, 1628672151, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.MainActivityKt.MainScreen.3.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues it, Composer composer3, int i3) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            if ((i3 & 81) != 16 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1628672151, i3, -1, "cn.jianyun.workplan.main.MainScreen.<anonymous>.<anonymous> (MainActivity.kt:429)");
                                }
                                NavHostController navHostController2 = navHostController;
                                String route = Router.Home.INSTANCE.getRoute();
                                Modifier modifierM567padding3ABfNKs = PaddingKt.m567padding3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(0));
                                final NavHostController navHostController3 = navHostController;
                                final MainActivity mainActivity2 = mainActivity;
                                NavHostKt.NavHost(navHostController2, route, modifierM567padding3ABfNKs, null, null, null, null, null, null, new Function1<NavGraphBuilder, Unit>() { // from class: cn.jianyun.workplan.main.MainActivityKt.MainScreen.3.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(NavGraphBuilder navGraphBuilder) {
                                        invoke2(navGraphBuilder);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(NavGraphBuilder NavHost) {
                                        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
                                        String route2 = Router.Home.INSTANCE.getRoute();
                                        final NavHostController navHostController4 = navHostController3;
                                        final MainActivity mainActivity3 = mainActivity2;
                                        NavGraphBuilderKt.composable$default(NavHost, route2, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(687117557, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.MainActivityKt.MainScreen.3.1.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer4, Integer num) {
                                                invoke(animatedContentScope, navBackStackEntry, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it2, Composer composer4, int i4) {
                                                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                                Intrinsics.checkNotNullParameter(it2, "it");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(687117557, i4, -1, "cn.jianyun.workplan.main.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:435)");
                                                }
                                                MainViewKt.MainView(navHostController4, mainActivity3, composer4, 72);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), 126, null);
                                        String route3 = Router.Schedule.INSTANCE.getRoute();
                                        final NavHostController navHostController5 = navHostController3;
                                        final MainActivity mainActivity4 = mainActivity2;
                                        NavGraphBuilderKt.composable$default(NavHost, route3, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1112485406, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.MainActivityKt.MainScreen.3.1.1.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer4, Integer num) {
                                                invoke(animatedContentScope, navBackStackEntry, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it2, Composer composer4, int i4) {
                                                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                                Intrinsics.checkNotNullParameter(it2, "it");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1112485406, i4, -1, "cn.jianyun.workplan.main.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:442)");
                                                }
                                                ScheduleMainViewKt.ScheduleMainView(navHostController5, mainActivity4, composer4, 72);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), 126, null);
                                        String route4 = ScheduleRouter.ProjectManage.INSTANCE.getRoute();
                                        final NavHostController navHostController6 = navHostController3;
                                        NavGraphBuilderKt.composable$default(NavHost, route4, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1770868285, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.MainActivityKt.MainScreen.3.1.1.3
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer4, Integer num) {
                                                invoke(animatedContentScope, navBackStackEntry, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it2, Composer composer4, int i4) {
                                                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                                Intrinsics.checkNotNullParameter(it2, "it");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1770868285, i4, -1, "cn.jianyun.workplan.main.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:445)");
                                                }
                                                ScheduleProjectManagerViewKt.ScheduleProjectManagerView(navHostController6, composer4, 8);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), 126, null);
                                        String route5 = ScheduleRouter.WorkEdit.INSTANCE.getRoute();
                                        final NavHostController navHostController7 = navHostController3;
                                        NavGraphBuilderKt.composable$default(NavHost, route5, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1865716132, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.MainActivityKt.MainScreen.3.1.1.4
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer4, Integer num) {
                                                invoke(animatedContentScope, navBackStackEntry, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(AnimatedContentScope composable, NavBackStackEntry entry, Composer composer4, int i4) {
                                                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                                Intrinsics.checkNotNullParameter(entry, "entry");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1865716132, i4, -1, "cn.jianyun.workplan.main.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:448)");
                                                }
                                                SchduleWorkEditViewKt.ScheduleWorkEditView(navHostController7, entry.getArguments(), composer4, 72);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), 126, null);
                                        String route6 = ScheduleRouter.PlanEdit.INSTANCE.getRoute();
                                        final NavHostController navHostController8 = navHostController3;
                                        NavGraphBuilderKt.composable$default(NavHost, route6, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1207333253, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.MainActivityKt.MainScreen.3.1.1.5
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer4, Integer num) {
                                                invoke(animatedContentScope, navBackStackEntry, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(AnimatedContentScope composable, NavBackStackEntry entry, Composer composer4, int i4) {
                                                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                                Intrinsics.checkNotNullParameter(entry, "entry");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1207333253, i4, -1, "cn.jianyun.workplan.main.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:451)");
                                                }
                                                SchdulePlanEditViewKt.SchedulePlanEditView(navHostController8, entry.getArguments(), composer4, 72);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), 126, null);
                                        String route7 = ScheduleRouter.AlarmEdit.INSTANCE.getRoute();
                                        final NavHostController navHostController9 = navHostController3;
                                        NavGraphBuilderKt.composable$default(NavHost, route7, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-548950374, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.MainActivityKt.MainScreen.3.1.1.6
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer4, Integer num) {
                                                invoke(animatedContentScope, navBackStackEntry, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(AnimatedContentScope composable, NavBackStackEntry entry, Composer composer4, int i4) {
                                                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                                Intrinsics.checkNotNullParameter(entry, "entry");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-548950374, i4, -1, "cn.jianyun.workplan.main.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:454)");
                                                }
                                                ScheduleAlarmEditViewKt.ScheduleAlarmEditView(navHostController9, entry.getArguments(), composer4, 72);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), 126, null);
                                        String route8 = ScheduleRouter.CloudManage.INSTANCE.getRoute();
                                        final NavHostController navHostController10 = navHostController3;
                                        NavGraphBuilderKt.composable$default(NavHost, route8, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(109432505, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.MainActivityKt.MainScreen.3.1.1.7
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer4, Integer num) {
                                                invoke(animatedContentScope, navBackStackEntry, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it2, Composer composer4, int i4) {
                                                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                                Intrinsics.checkNotNullParameter(it2, "it");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(109432505, i4, -1, "cn.jianyun.workplan.main.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:458)");
                                                }
                                                ScheduleCloudManageViewKt.ScheduleCloudManageView(navHostController10, composer4, 8);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), 126, null);
                                        String route9 = ScheduleRouter.ShareData.INSTANCE.getRoute();
                                        final NavHostController navHostController11 = navHostController3;
                                        NavGraphBuilderKt.composable$default(NavHost, route9, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(767815384, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.MainActivityKt.MainScreen.3.1.1.8
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer4, Integer num) {
                                                invoke(animatedContentScope, navBackStackEntry, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it2, Composer composer4, int i4) {
                                                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                                Intrinsics.checkNotNullParameter(it2, "it");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(767815384, i4, -1, "cn.jianyun.workplan.main.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:462)");
                                                }
                                                ScheduleShareViewKt.ScheduleShareView(navHostController11, composer4, 8);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), 126, null);
                                        String route10 = Router.Question.INSTANCE.getRoute();
                                        final NavHostController navHostController12 = navHostController3;
                                        NavGraphBuilderKt.composable$default(NavHost, route10, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1426198263, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.MainActivityKt.MainScreen.3.1.1.9
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer4, Integer num) {
                                                invoke(animatedContentScope, navBackStackEntry, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(AnimatedContentScope composable, NavBackStackEntry entry, Composer composer4, int i4) {
                                                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                                Intrinsics.checkNotNullParameter(entry, "entry");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1426198263, i4, -1, "cn.jianyun.workplan.main.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:466)");
                                                }
                                                QuestionViewKt.QuestionView(navHostController12, entry.getArguments(), composer4, 72);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), 126, null);
                                        String route11 = Router.UserPolicy.INSTANCE.getRoute();
                                        final NavHostController navHostController13 = navHostController3;
                                        NavGraphBuilderKt.composable$default(NavHost, route11, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(2084581142, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.MainActivityKt.MainScreen.3.1.1.10
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer4, Integer num) {
                                                invoke(animatedContentScope, navBackStackEntry, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it2, Composer composer4, int i4) {
                                                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                                Intrinsics.checkNotNullParameter(it2, "it");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(2084581142, i4, -1, "cn.jianyun.workplan.main.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:470)");
                                                }
                                                UserPolicyKt.UserPolicy(navHostController13, composer4, 8);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), 126, null);
                                        String route12 = Router.Wechat.INSTANCE.getRoute();
                                        final NavHostController navHostController14 = navHostController3;
                                        NavGraphBuilderKt.composable$default(NavHost, route12, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1716792712, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.MainActivityKt.MainScreen.3.1.1.11
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer4, Integer num) {
                                                invoke(animatedContentScope, navBackStackEntry, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it2, Composer composer4, int i4) {
                                                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                                Intrinsics.checkNotNullParameter(it2, "it");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1716792712, i4, -1, "cn.jianyun.workplan.main.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:474)");
                                                }
                                                WechatViewKt.WechatView(navHostController14, composer4, 8);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), 126, null);
                                        String route13 = Router.Widget.INSTANCE.getRoute();
                                        final NavHostController navHostController15 = navHostController3;
                                        NavGraphBuilderKt.composable$default(NavHost, route13, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1919791705, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.MainActivityKt.MainScreen.3.1.1.12
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer4, Integer num) {
                                                invoke(animatedContentScope, navBackStackEntry, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it2, Composer composer4, int i4) {
                                                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                                Intrinsics.checkNotNullParameter(it2, "it");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1919791705, i4, -1, "cn.jianyun.workplan.main.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:478)");
                                                }
                                                WidgetConfigViewKt.WidgetConfigView(navHostController15, composer4, 8);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), 126, null);
                                        String route14 = Router.PrivatePolicy.INSTANCE.getRoute();
                                        final NavHostController navHostController16 = navHostController3;
                                        NavGraphBuilderKt.composable$default(NavHost, route14, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1261408826, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.MainActivityKt.MainScreen.3.1.1.13
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer4, Integer num) {
                                                invoke(animatedContentScope, navBackStackEntry, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it2, Composer composer4, int i4) {
                                                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                                Intrinsics.checkNotNullParameter(it2, "it");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1261408826, i4, -1, "cn.jianyun.workplan.main.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:482)");
                                                }
                                                PrivatePolicyKt.PrivatePolicy(navHostController16, composer4, 8);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), 126, null);
                                        String route15 = Router.UserDetail.INSTANCE.getRoute();
                                        final NavHostController navHostController17 = navHostController3;
                                        NavGraphBuilderKt.composable$default(NavHost, route15, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-603025947, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.MainActivityKt.MainScreen.3.1.1.14
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer4, Integer num) {
                                                invoke(animatedContentScope, navBackStackEntry, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it2, Composer composer4, int i4) {
                                                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                                Intrinsics.checkNotNullParameter(it2, "it");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-603025947, i4, -1, "cn.jianyun.workplan.main.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:486)");
                                                }
                                                UserDetailViewKt.UserDetailView(navHostController17, composer4, 8);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), 126, null);
                                        String route16 = Router.WebDAV.INSTANCE.getRoute();
                                        final NavHostController navHostController18 = navHostController3;
                                        NavGraphBuilderKt.composable$default(NavHost, route16, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(55356932, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.MainActivityKt.MainScreen.3.1.1.15
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer4, Integer num) {
                                                invoke(animatedContentScope, navBackStackEntry, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(AnimatedContentScope composable, NavBackStackEntry entry, Composer composer4, int i4) {
                                                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                                Intrinsics.checkNotNullParameter(entry, "entry");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(55356932, i4, -1, "cn.jianyun.workplan.main.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:490)");
                                                }
                                                WebDavDataViewKt.WebDavDataView(navHostController18, entry.getArguments(), composer4, 72);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), 126, null);
                                        String route17 = Router.WebDAVManage.INSTANCE.getRoute();
                                        final NavHostController navHostController19 = navHostController3;
                                        NavGraphBuilderKt.composable$default(NavHost, route17, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(713739811, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.MainActivityKt.MainScreen.3.1.1.16
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer4, Integer num) {
                                                invoke(animatedContentScope, navBackStackEntry, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it2, Composer composer4, int i4) {
                                                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                                Intrinsics.checkNotNullParameter(it2, "it");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(713739811, i4, -1, "cn.jianyun.workplan.main.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:494)");
                                                }
                                                WebDAVUserManageViewKt.WebDAVUserManageView(navHostController19, composer4, 8);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), 126, null);
                                        String route18 = WebDAVRouter.UserEdit.INSTANCE.getRoute();
                                        final NavHostController navHostController20 = navHostController3;
                                        NavGraphBuilderKt.composable$default(NavHost, route18, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1372122690, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.MainActivityKt.MainScreen.3.1.1.17
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer4, Integer num) {
                                                invoke(animatedContentScope, navBackStackEntry, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(AnimatedContentScope composable, NavBackStackEntry entry, Composer composer4, int i4) {
                                                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                                Intrinsics.checkNotNullParameter(entry, "entry");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1372122690, i4, -1, "cn.jianyun.workplan.main.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:498)");
                                                }
                                                WebDAVUserEditViewKt.WebDAVUserEditView(navHostController20, entry.getArguments(), composer4, 72);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), 126, null);
                                        String route19 = Router.LocalBackup.INSTANCE.getRoute();
                                        final NavHostController navHostController21 = navHostController3;
                                        NavGraphBuilderKt.composable$default(NavHost, route19, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(2030505569, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.MainActivityKt.MainScreen.3.1.1.18
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer4, Integer num) {
                                                invoke(animatedContentScope, navBackStackEntry, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it2, Composer composer4, int i4) {
                                                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                                Intrinsics.checkNotNullParameter(it2, "it");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(2030505569, i4, -1, "cn.jianyun.workplan.main.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:502)");
                                                }
                                                LocalBackupViewKt.LocalBackupView(navHostController21, composer4, 8);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), 126, null);
                                        String route20 = Router.NotifySetting.INSTANCE.getRoute();
                                        final NavHostController navHostController22 = navHostController3;
                                        NavGraphBuilderKt.composable$default(NavHost, route20, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1606078848, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.MainActivityKt.MainScreen.3.1.1.19
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer4, Integer num) {
                                                invoke(animatedContentScope, navBackStackEntry, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it2, Composer composer4, int i4) {
                                                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                                Intrinsics.checkNotNullParameter(it2, "it");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1606078848, i4, -1, "cn.jianyun.workplan.main.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:506)");
                                                }
                                                NotifySettingViewKt.NotifySettingView(navHostController22, composer4, 8);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), 126, null);
                                        String route21 = Router.Vip.INSTANCE.getRoute();
                                        final NavHostController navHostController23 = navHostController3;
                                        final MainActivity mainActivity5 = mainActivity2;
                                        NavGraphBuilderKt.composable$default(NavHost, route21, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-947695969, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.MainActivityKt.MainScreen.3.1.1.20
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer4, Integer num) {
                                                invoke(animatedContentScope, navBackStackEntry, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it2, Composer composer4, int i4) {
                                                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                                Intrinsics.checkNotNullParameter(it2, "it");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-947695969, i4, -1, "cn.jianyun.workplan.main.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:510)");
                                                }
                                                VipViewKt.VipPage(navHostController23, mainActivity5, composer4, 72);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), 126, null);
                                    }
                                }, composer3, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_RETRANSMISSION_TIME_MS, TarConstants.SPARSELEN_GNU_SPARSE);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 805306368, 511);
                    composer2.startReplaceableGroup(1123035267);
                    if (!MainActivityKt.MainScreen$lambda$1(mutableState)) {
                        final BaseRepository baseRepository2 = baseRepository;
                        final MutableState<Boolean> mutableState3 = mutableState;
                        DialogViewKt.WelcomeDialog(new Function0<Unit>() { // from class: cn.jianyun.workplan.main.MainActivityKt.MainScreen.3.2
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
                                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new AnonymousClass1(baseRepository2, mutableState3, null), 3, null);
                            }

                            /* JADX INFO: renamed from: cn.jianyun.workplan.main.MainActivityKt$MainScreen$3$2$1, reason: invalid class name */
                            /* JADX INFO: compiled from: MainActivity.kt */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            @DebugMetadata(c = "cn.jianyun.workplan.main.MainActivityKt$MainScreen$3$2$1", f = "MainActivity.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_SIDX_VIDEO_WINDOW_SIZE}, m = "invokeSuspend", n = {}, s = {})
                            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ BaseRepository $baseRepository;
                                final /* synthetic */ MutableState<Boolean> $hasRegist$delegate;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass1(BaseRepository baseRepository, MutableState<Boolean> mutableState, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$baseRepository = baseRepository;
                                    this.$hasRegist$delegate = mutableState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$baseRepository, this.$hasRegist$delegate, continuation);
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
                                        MainActivityKt.MainScreen$lambda$2(this.$hasRegist$delegate, true);
                                        this.label = 1;
                                        if (this.$baseRepository.makeRegist(this) == coroutine_suspended) {
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
                        }, composer2, 0);
                    }
                    composer2.endReplaceableGroup();
                    if (MainActivityKt.MainScreen$lambda$4(mutableState2)) {
                        String str2 = str;
                        final BaseRepository baseRepository3 = baseRepository;
                        final MutableState<Boolean> mutableState4 = mutableState2;
                        DialogViewKt.UpdateIntroDialog(null, str2, 0, new Function0<Unit>() { // from class: cn.jianyun.workplan.main.MainActivityKt.MainScreen.3.3
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
                                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new AnonymousClass1(baseRepository3, mutableState4, null), 3, null);
                            }

                            /* JADX INFO: renamed from: cn.jianyun.workplan.main.MainActivityKt$MainScreen$3$3$1, reason: invalid class name */
                            /* JADX INFO: compiled from: MainActivity.kt */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            @DebugMetadata(c = "cn.jianyun.workplan.main.MainActivityKt$MainScreen$3$3$1", f = "MainActivity.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_DEMUXER_VIDEO_STACK_SIZE}, m = "invokeSuspend", n = {}, s = {})
                            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ BaseRepository $baseRepository;
                                final /* synthetic */ MutableState<Boolean> $showUpdateIntro$delegate;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass1(BaseRepository baseRepository, MutableState<Boolean> mutableState, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$baseRepository = baseRepository;
                                    this.$showUpdateIntro$delegate = mutableState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$baseRepository, this.$showUpdateIntro$delegate, continuation);
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
                                        if (this.$baseRepository.cacheBoolean(MainActivity.UPDATE_INTRO_KEY, true, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    MainActivityKt.MainScreen$lambda$5(this.$showUpdateIntro$delegate, false);
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composer2, MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 1);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.MainActivityKt.MainScreen.4
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
                MainActivityKt.MainScreen(baseRepository, activity, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MainScreen$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MainScreen$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MainScreen$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MainScreen$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.main.MainActivityKt$MainScreen$1, reason: invalid class name */
    /* JADX INFO: compiled from: MainActivity.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.main.MainActivityKt$MainScreen$1", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MainActivity $activity;
        final /* synthetic */ NavHostController $navController;
        final /* synthetic */ String $targetRoute;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, NavHostController navHostController, MainActivity mainActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$targetRoute = str;
            this.$navController = navHostController;
            this.$activity = mainActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$targetRoute, this.$navController, this.$activity, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.$targetRoute;
                if (!(str == null || str.length() == 0)) {
                    NavController.navigate$default(this.$navController, this.$targetRoute, null, null, 6, null);
                    Intent intent = this.$activity.getIntent();
                    if (intent != null) {
                        intent.removeExtra(MainActivity.EXTRA_TARGET_ROUTE);
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.main.MainActivityKt$MainScreen$2, reason: invalid class name */
    /* JADX INFO: compiled from: MainActivity.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.main.MainActivityKt$MainScreen$2", f = "MainActivity.kt", i = {}, l = {422, 423}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BaseRepository $baseRepository;
        final /* synthetic */ MutableState<Boolean> $showUpdateIntro$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(BaseRepository baseRepository, MutableState<Boolean> mutableState, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$baseRepository = baseRepository;
            this.$showUpdateIntro$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$baseRepository, this.$showUpdateIntro$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                MainActivityKt.MainScreen$lambda$5(this.$showUpdateIntro$delegate, !((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.$baseRepository.getRegistDay(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((Number) obj).intValue() > 0) {
                this.label = 2;
                obj = this.$baseRepository.booleanCache(MainActivity.UPDATE_INTRO_KEY, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                MainActivityKt.MainScreen$lambda$5(this.$showUpdateIntro$delegate, !((Boolean) obj).booleanValue());
            }
            return Unit.INSTANCE;
        }
    }
}