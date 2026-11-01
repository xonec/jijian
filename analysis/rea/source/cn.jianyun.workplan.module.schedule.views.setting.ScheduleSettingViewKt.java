package cn.jianyun.workplan.module.schedule.views.setting;

import android.content.Intent;
import android.net.Uri;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
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
import androidx.compose.ui.unit.TextUnitKt;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import cn.jianyun.workplan.main.MainActivity;
import cn.jianyun.workplan.main.Router;
import cn.jianyun.workplan.main.setting.local.LocalBackupViewModel;
import cn.jianyun.workplan.main.setting.user.LoginDialogKt;
import cn.jianyun.workplan.model.AppConfigModel;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.module.base.vm.BaseViewModel;
import cn.jianyun.workplan.module.schedule.route.ScheduleRouter;
import cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel;
import cn.jianyun.workplan.ui.component.form.DialogViewKt;
import cn.jianyun.workplan.ui.component.form.FormItemKt;
import cn.jianyun.workplan.ui.component.form.GroupViewKt;
import cn.jianyun.workplan.ui.component.nav.BoxViewKt;
import cn.jianyun.workplan.ui.component.nav.HeaderViewKt;
import cn.jianyun.workplan.ui.component.nav.NavItemViewKt;
import cn.jianyun.workplan.ui.component.nav.PartTitleViewKt;
import cn.jianyun.workplan.ui.theme.ColorKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
import cn.jianyun.workplan.util.SelectDO;
import cn.jianyun.workplan.util.SelectUtil;
import cn.jianyun.workplan.vm.AppSettingViewModel;
import com.byazt.bry.TTDownloadField;
import com.bykv.vk.component.ttvideo.player.C;
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

/* JADX INFO: compiled from: ScheduleSettingView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"ScheduleSettingView", "", "navHostController", "Landroidx/navigation/NavHostController;", TTDownloadField.TT_ACTIVITY, "Lcn/jianyun/workplan/main/MainActivity;", "(Landroidx/navigation/NavHostController;Lcn/jianyun/workplan/main/MainActivity;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ScheduleSettingViewKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v12, types: [T, androidx.lifecycle.ViewModel] */
    /* JADX WARN: Type inference failed for: r9v5, types: [T, androidx.lifecycle.ViewModel] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void ScheduleSettingView(final NavHostController navHostController, final MainActivity activity, Composer composer, final int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        CreationExtras.Empty defaultViewModelCreationExtras2;
        CreationExtras.Empty defaultViewModelCreationExtras3;
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Composer composerStartRestartGroup = composer.startRestartGroup(-866909243);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ScheduleSettingView)P(1)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-866909243, i, -1, "cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingView (ScheduleSettingView.kt:53)");
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
        ?? ViewModel = ViewModelKt.viewModel((Class<??>) AppSettingViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        objectRef.element = ViewModel;
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        composerStartRestartGroup.startReplaceableGroup(1890788296);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(hiltViewModel)P(1)*42@1793L7,47@1936L47,48@1995L54:HiltViewModel.kt#9mcars");
        ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
        if (current2 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModelProvider.Factory factoryCreateHiltViewModelFactory2 = HiltViewModelKt.createHiltViewModelFactory(current2, composerStartRestartGroup, 8);
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67");
        if (current2 instanceof HasDefaultViewModelProviderFactory) {
            defaultViewModelCreationExtras2 = ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras2 = CreationExtras.Empty.INSTANCE;
        }
        ?? ViewModel2 = ViewModelKt.viewModel((Class<??>) ScheduleMasterViewModel.class, current2, (String) null, factoryCreateHiltViewModelFactory2, defaultViewModelCreationExtras2, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        objectRef2.element = ViewModel2;
        composerStartRestartGroup.startReplaceableGroup(1890788296);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(hiltViewModel)P(1)*42@1793L7,47@1936L47,48@1995L54:HiltViewModel.kt#9mcars");
        ViewModelStoreOwner current3 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
        if (current3 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModelProvider.Factory factoryCreateHiltViewModelFactory3 = HiltViewModelKt.createHiltViewModelFactory(current3, composerStartRestartGroup, 8);
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67");
        if (current3 instanceof HasDefaultViewModelProviderFactory) {
            defaultViewModelCreationExtras3 = ((HasDefaultViewModelProviderFactory) current3).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras3 = CreationExtras.Empty.INSTANCE;
        }
        ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) LocalBackupViewModel.class, current3, (String) null, factoryCreateHiltViewModelFactory3, defaultViewModelCreationExtras3, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        final LocalBackupViewModel localBackupViewModel = (LocalBackupViewModel) viewModel;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final MutableState mutableState = (MutableState) objRememberedValue;
        BaseViewModel.tryReload$default(localBackupViewModel, null, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        HeaderViewKt.SimpleSubAppPageView(null, null, "排班设置", ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1697044446, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingViewKt$ScheduleSettingView$1$1
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
                        ComposerKt.traceEventStart(-1697044446, i2, -1, "cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingView.<anonymous>.<anonymous> (ScheduleSettingView.kt:80)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    final Ref.ObjectRef<ScheduleMasterViewModel> objectRef3 = objectRef2;
                    final NavHostController navHostController2 = navHostController;
                    final Ref.ObjectRef<AppSettingViewModel> objectRef4 = objectRef;
                    Modifier modifierM249clickableXHw0xAI$default = ClickableKt.m249clickableXHw0xAI$default(companion2, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingViewKt$ScheduleSettingView$1$1.1
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
                            if (objectRef3.element.getBaseRepository().isLogin()) {
                                CommonUIKt.toPage$default(navHostController2, Router.UserDetail.INSTANCE.getRoute(), null, 4, null);
                            } else {
                                objectRef4.element.setFormType(new FormType("login", null, null, 6, null));
                            }
                        }
                    }, 7, null);
                    final Ref.ObjectRef<ScheduleMasterViewModel> objectRef5 = objectRef2;
                    GroupViewKt.m6851SettingGroupViewfIyqwc(modifierM249clickableXHw0xAI$default, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer2, -159037749, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingViewKt$ScheduleSettingView$1$1.2
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
                                    ComposerKt.traceEventStart(-159037749, i3, -1, "cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingView.<anonymous>.<anonymous>.<anonymous> (ScheduleSettingView.kt:90)");
                                }
                                if (!objectRef5.element.getBaseRepository().isLogin()) {
                                    composer3.startReplaceableGroup(-552764756);
                                    BoxViewKt.m6876CenterRowdjqsMU(null, Dp.m6097constructorimpl(10), 0.0f, ComposableSingletons$ScheduleSettingViewKt.INSTANCE.m6751getLambda1$app_release(), composer3, 3120, 5);
                                    composer3.endReplaceableGroup();
                                } else {
                                    composer3.startReplaceableGroup(-552765488);
                                    float fM6097constructorimpl = Dp.m6097constructorimpl(10);
                                    final Ref.ObjectRef<ScheduleMasterViewModel> objectRef6 = objectRef5;
                                    BoxViewKt.m6898VerticalRowdjqsMU(null, 0.0f, fM6097constructorimpl, ComposableLambdaKt.composableLambda(composer3, -497217252, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingViewKt.ScheduleSettingView.1.1.2.1
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
                                                    ComposerKt.traceEventStart(-497217252, i4, -1, "cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScheduleSettingView.kt:92)");
                                                }
                                                NavItemViewKt.m6911AppLogoVieworJrPs(Dp.m6097constructorimpl(40), 0, composer4, 6, 2);
                                                CommonUIKt.m6944BlankkHDZbjc(0.0f, composer4, 0, 1);
                                                Ref.ObjectRef<ScheduleMasterViewModel> objectRef7 = objectRef6;
                                                composer4.startReplaceableGroup(-483455358);
                                                ComposerKt.sourceInformation(composer4, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                                composer4.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer4, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion3);
                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor2);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composer4);
                                                Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                    composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                    composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                }
                                                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer4)), composer4, 0);
                                                composer4.startReplaceableGroup(2058660585);
                                                ComposerKt.sourceInformationMarkerStart(composer4, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                TextKt.m2471Text4IGK_g(objectRef7.element.getBaseRepository().getLoginUser().showName(), (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(13), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3072, 6, 130038);
                                                CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(2), composer4, 6, 0);
                                                composer4.startReplaceableGroup(693286680);
                                                ComposerKt.sourceInformation(composer4, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer4, 0);
                                                composer4.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer4, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion4);
                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor3);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM3285constructorimpl3 = Updater.m3285constructorimpl(composer4);
                                                Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (composerM3285constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                    composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                    composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                }
                                                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer4)), composer4, 0);
                                                composer4.startReplaceableGroup(2058660585);
                                                ComposerKt.sourceInformationMarkerStart(composer4, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                PartTitleViewKt.m6915TagViewo4cevVk((String) CommonToolKt.ifv(objectRef7.element.getBaseRepository().isRealVip(), objectRef7.element.getBaseRepository().getLoginUser().getVipName(), "普通用户"), 0L, false, 0.0f, false, ((Color) CommonToolKt.ifv(objectRef7.element.getBaseRepository().isRealVip(), Color.m3745boximpl(ColorKt.getVipColor()), Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()))).m3765unboximpl(), true, null, composer4, 1572864, 158);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                composer4.endReplaceableGroup();
                                                composer4.endNode();
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                composer4.endReplaceableGroup();
                                                composer4.endNode();
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), composer3, 3456, 3);
                                    composer3.endReplaceableGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 100663296, MediaPlayer.MEDIA_PLAYER_ADAPTIVE_WORK_AROUND_MODE);
                    composer2.startReplaceableGroup(-1011029721);
                    if (!objectRef.element.getBaseRepository().isRealVip()) {
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        final NavHostController navHostController3 = navHostController;
                        GroupViewKt.m6851SettingGroupViewfIyqwc(ClickableKt.m249clickableXHw0xAI$default(companion3, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingViewKt$ScheduleSettingView$1$1.3
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
                                CommonUIKt.toVipPage(navHostController3);
                            }
                        }, 7, null), false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ComposableSingletons$ScheduleSettingViewKt.INSTANCE.m6752getLambda2$app_release(), composer2, 100663296, MediaPlayer.MEDIA_PLAYER_ADAPTIVE_WORK_AROUND_MODE);
                    }
                    composer2.endReplaceableGroup();
                    final LocalBackupViewModel localBackupViewModel2 = localBackupViewModel;
                    final NavHostController navHostController4 = navHostController;
                    GroupViewKt.m6851SettingGroupViewfIyqwc(null, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer2, 2090953794, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingViewKt$ScheduleSettingView$1$1.4
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
                                    ComposerKt.traceEventStart(2090953794, i3, -1, "cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingView.<anonymous>.<anonymous>.<anonymous> (ScheduleSettingView.kt:119)");
                                }
                                final NavHostController navHostController5 = navHostController4;
                                FormItemKt.LinkItemView("我的排班项目", new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingViewKt.ScheduleSettingView.1.1.4.1
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
                                        NavController.navigate$default(navHostController5, ScheduleRouter.ProjectManage.INSTANCE.getRoute(), null, null, 6, null);
                                    }
                                }, composer3, 6);
                                final NavHostController navHostController6 = navHostController4;
                                FormItemKt.LinkItemView("本地备份设置", new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingViewKt.ScheduleSettingView.1.1.4.2
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
                                        NavController.navigate$default(navHostController6, Router.LocalBackup.INSTANCE.getRoute(), null, null, 6, null);
                                    }
                                }, composer3, 6);
                                final NavHostController navHostController7 = navHostController4;
                                FormItemKt.LinkItemView("分享与导入排班", new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingViewKt.ScheduleSettingView.1.1.4.3
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
                                        NavController.navigate$default(navHostController7, ScheduleRouter.ShareData.INSTANCE.getRoute(), null, null, 6, null);
                                    }
                                }, composer3, 6);
                                if (!Intrinsics.areEqual(localBackupViewModel2.getLocalPath(), "")) {
                                    final NavHostController navHostController8 = navHostController4;
                                    FormItemKt.LinkItemView("本地备份与恢复", new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingViewKt.ScheduleSettingView.1.1.4.4
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
                                            NavController.navigate$default(navHostController8, ScheduleRouter.CloudManage.INSTANCE.getRoute(), null, null, 6, null);
                                        }
                                    }, composer3, 6);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 100663296, 255);
                    final Ref.ObjectRef<AppSettingViewModel> objectRef6 = objectRef;
                    final MutableState<Boolean> mutableState2 = mutableState;
                    final NavHostController navHostController5 = navHostController;
                    GroupViewKt.m6851SettingGroupViewfIyqwc(null, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer2, 1254158851, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingViewKt$ScheduleSettingView$1$1.5
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
                                    ComposerKt.traceEventStart(1254158851, i3, -1, "cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingView.<anonymous>.<anonymous>.<anonymous> (ScheduleSettingView.kt:140)");
                                }
                                String appTheme = objectRef6.element.getAppConfig().getAppTheme();
                                final Ref.ObjectRef<AppSettingViewModel> objectRef7 = objectRef6;
                                Function1<String, Unit> function1 = new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingViewKt.ScheduleSettingView.1.1.5.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(String str) {
                                        invoke2(str);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(String it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        objectRef7.element.setAppConfig(AppConfigModel.copy$default(objectRef7.element.getAppConfig(), false, null, null, null, it, 15, null));
                                        objectRef7.element.makeChanged();
                                    }
                                };
                                List<SelectDO> THEMES = SelectUtil.THEMES;
                                Intrinsics.checkNotNullExpressionValue(THEMES, "THEMES");
                                FormItemKt.SelectItemView("APP风格", false, false, false, appTheme, function1, THEMES, composer3, 2097158, 14);
                                final NavHostController navHostController6 = navHostController5;
                                FormItemKt.LinkItemView("桌面小组件配置", new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingViewKt.ScheduleSettingView.1.1.5.2
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
                                        NavController.navigate$default(navHostController6, Router.Widget.INSTANCE.getRoute(), null, null, 6, null);
                                    }
                                }, composer3, 6);
                                final NavHostController navHostController7 = navHostController5;
                                FormItemKt.LinkItemView("导入小程序排班", new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingViewKt.ScheduleSettingView.1.1.5.3
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
                                        NavController.navigate$default(navHostController7, Router.Wechat.INSTANCE.getRoute(), null, null, 6, null);
                                    }
                                }, composer3, 6);
                                final MutableState<Boolean> mutableState3 = mutableState2;
                                composer3.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composer3, "CC(remember)P(1):Composables.kt#9igjgp");
                                boolean zChanged = composer3.changed(mutableState3);
                                Object objRememberedValue2 = composer3.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingViewKt$ScheduleSettingView$1$1$5$4$1
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
                                            mutableState3.setValue(true);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue2);
                                }
                                composer3.endReplaceableGroup();
                                FormItemKt.LinkItemView("本次更新说明", (Function0) objRememberedValue2, composer3, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 100663296, 255);
                    final NavHostController navHostController6 = navHostController;
                    final Ref.ObjectRef<ScheduleMasterViewModel> objectRef7 = objectRef2;
                    GroupViewKt.m6851SettingGroupViewfIyqwc(null, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer2, 417363908, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingViewKt$ScheduleSettingView$1$1.6
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
                                    ComposerKt.traceEventStart(417363908, i3, -1, "cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingView.<anonymous>.<anonymous>.<anonymous> (ScheduleSettingView.kt:160)");
                                }
                                final NavHostController navHostController7 = navHostController6;
                                FormItemKt.LinkItemView("常见问题解答", new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingViewKt.ScheduleSettingView.1.1.6.1
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
                                        NavController.navigate$default(navHostController7, Router.Question.INSTANCE.getRoute(), null, null, 6, null);
                                    }
                                }, composer3, 6);
                                final Ref.ObjectRef<ScheduleMasterViewModel> objectRef8 = objectRef7;
                                FormItemKt.LinkItemView("用户在线反馈", new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingViewKt.ScheduleSettingView.1.1.6.2
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
                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://support.qq.com/products/665579"));
                                        intent.addFlags(C.ENCODING_PCM_MU_LAW);
                                        objectRef8.element.getBaseRepository().getContext().startActivity(intent);
                                    }
                                }, composer3, 6);
                                final NavHostController navHostController8 = navHostController6;
                                FormItemKt.LinkItemView("用户使用协议", new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingViewKt.ScheduleSettingView.1.1.6.3
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
                                        NavController.navigate$default(navHostController8, Router.UserPolicy.INSTANCE.getRoute(), null, null, 6, null);
                                    }
                                }, composer3, 6);
                                final NavHostController navHostController9 = navHostController6;
                                FormItemKt.LinkItemView("应用隐私政策", new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingViewKt.ScheduleSettingView.1.1.6.4
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
                                        NavController.navigate$default(navHostController9, Router.PrivatePolicy.INSTANCE.getRoute(), null, null, 6, null);
                                    }
                                }, composer3, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 100663296, 255);
                    DialogViewKt.LoadingDialog(null, composer2, 0, 1);
                    CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                    TextKt.m2471Text4IGK_g("v3.5.0", PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6097constructorimpl(12), 7, null), Color.INSTANCE.m3785getGray0d7_KjU(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3504, 0, 130544);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 3456, 3);
        composerStartRestartGroup.startReplaceableGroup(-625804594);
        if (((AppSettingViewModel) objectRef.element).getFormType().isForm("login")) {
            LoginDialogKt.LoginDialog((AppSettingViewModel) objectRef.element, null, null, composerStartRestartGroup, 8, 6);
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(473781777);
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingViewKt$ScheduleSettingView$1$2$1
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
                        mutableState.setValue(false);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            DialogViewKt.UpdateIntroDialog(null, "亲爱的老用户，感谢你一直在使用极简排班。\n\n本次更新重点优化了这些内容：\n\n1. 首页日历支持左右滑动切换月份，浏览排班更顺手。\n2. 首页显示配置和小组件显示配置做了进一步拆分，调节更清晰。\n3. 统计页新增了时长统计、时长占比饼图，以及排班明细导出 Excel。\n4. 排班详情补充了休息时长、工作时长等信息，统计更准确。\n5. 小组件入口、暗黑模式、显示样式等细节都做了持续优化。\n6. 若小组件一直显示“正在加载”，可以先删除小组件，重新添加\n7. 没有班次也可以添加备注了\n\n如果你在使用过程中还有想继续优化的地方，也欢迎随时反馈。", 0, (Function0) objRememberedValue2, composerStartRestartGroup, MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 1);
        }
        composerStartRestartGroup.endReplaceableGroup();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingViewKt.ScheduleSettingView.2
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
                ScheduleSettingViewKt.ScheduleSettingView(navHostController, activity, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }
}