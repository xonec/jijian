package cn.jianyun.workplan.main.setting.notify;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavHostController;
import cn.jianyun.workplan.ui.component.form.ButtonViewKt;
import cn.jianyun.workplan.ui.component.form.FormItemKt;
import cn.jianyun.workplan.ui.component.form.GroupViewKt;
import cn.jianyun.workplan.ui.component.nav.BoxViewKt;
import cn.jianyun.workplan.ui.component.nav.HeaderViewKt;
import cn.jianyun.workplan.ui.component.nav.PanelViewKt;
import cn.jianyun.workplan.ui.theme.ColorKt;
import cn.jianyun.workplan.util.CalendarReminderUtils;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
import cn.jianyun.workplan.util.MyPermissionTool;
import cn.jianyun.workplan.util.SelectDO;
import cn.jianyun.workplan.util.SelectUtil;
import cn.jianyun.workplan.vm.AppSettingViewModel;
import com.google.accompanist.permissions.MultiplePermissionsState;
import com.google.accompanist.permissions.MultiplePermissionsStateKt;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionStatus;
import com.google.accompanist.permissions.PermissionsUtilKt;
import com.thegrizzlylabs.sardineandroid.DavPrincipal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: NotifySettingView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"NotifySettingView", "", "navHostController", "Landroidx/navigation/NavHostController;", "(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class NotifySettingViewKt {
    /* JADX WARN: Type inference failed for: r1v13, types: [T, androidx.lifecycle.ViewModel] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, com.google.accompanist.permissions.MultiplePermissionsState] */
    public static final void NotifySettingView(final NavHostController navHostController, Composer composer, final int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        Composer composerStartRestartGroup = composer.startRestartGroup(668098720);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(NotifySettingView)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(668098720, i, -1, "cn.jianyun.workplan.main.setting.notify.NotifySettingView (NotifySettingView.kt:35)");
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
        objectRef2.element = MultiplePermissionsStateKt.rememberMultiplePermissionsState(CollectionsKt.listOf((Object[]) new String[]{"android.permission.WRITE_CALENDAR", "android.permission.READ_CALENDAR"}), null, composerStartRestartGroup, 0, 2);
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        final Context context = (Context) objConsume;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final MutableState mutableState = (MutableState) objRememberedValue;
        HeaderViewKt.PageView(navHostController, "通知权限设置", null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 840915483, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.setting.notify.NotifySettingViewKt.NotifySettingView.1
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
                boolean z;
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(840915483, i2, -1, "cn.jianyun.workplan.main.setting.notify.NotifySettingView.<anonymous> (NotifySettingView.kt:48)");
                    }
                    PanelViewKt.m6912PanelView3f6hBDE("关于APP通知？", CommonToolKt.oneLine("\n            <bb>由于安卓手机品牌众多，不同手机厂商定制的安卓系统各有差异,这就会出现部分手机系统对第三方应用的服务做了一定的限制。\n            <bb>经过开发者多次试验，如果应用被完全退出，或者设备锁屏了，\n            我们App设置的本地通知大概率都不会触发（据说是为了省电），这样会导致我们设置的通知显得非常鸡肋，甚至影响用户正常工作，比如上班忘记打卡被公司扣钱。<br>\n            <bb>但是系统日历设置的通知不会出现上面的问题，这是受系统保护的，它会准时触发。\n            所以计划师所有模块的提醒将通过系统日历来实现通知，首次使用之前，\n            请点击当前页面按钮授权计划师APP访问您的日历。\n            虽然计划师APP会访问您的日历，但是我们仅会访问计划师范围内的通知数据，\n            不会读取用户任何隐私，这个您可以在日历授权的时候可以看到的\n            "), false, false, 0L, false, null, composer2, 6, 124);
                    List<PermissionState> permissions = objectRef2.element.getPermissions();
                    if (!(permissions instanceof Collection) || !permissions.isEmpty()) {
                        Iterator<T> it = permissions.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            } else if (!Intrinsics.areEqual(((PermissionState) it.next()).getStatus(), PermissionStatus.Granted.INSTANCE)) {
                                z = false;
                                break;
                            }
                        }
                    } else {
                        z = true;
                        break;
                    }
                    if (z) {
                        composer2.startReplaceableGroup(-1396241629);
                        final Ref.ObjectRef<AppSettingViewModel> objectRef3 = objectRef;
                        GroupViewKt.m6850GroupViewfIyqwc(null, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer2, -334075985, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.setting.notify.NotifySettingViewKt.NotifySettingView.1.2
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
                                        ComposerKt.traceEventStart(-334075985, i3, -1, "cn.jianyun.workplan.main.setting.notify.NotifySettingView.<anonymous>.<anonymous> (NotifySettingView.kt:63)");
                                    }
                                    String brand = objectRef3.element.getBrand();
                                    final Ref.ObjectRef<AppSettingViewModel> objectRef4 = objectRef3;
                                    Function1<String, Unit> function1 = new Function1<String, Unit>() { // from class: cn.jianyun.workplan.main.setting.notify.NotifySettingViewKt.NotifySettingView.1.2.1
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
                                        public final void invoke2(String it2) {
                                            Intrinsics.checkNotNullParameter(it2, "it");
                                            objectRef4.element.changeBrand(it2);
                                        }
                                    };
                                    List<SelectDO> listInitSingleValues = SelectUtil.initSingleValues("华为", "小米", "oppo", "vivo", "荣耀");
                                    Intrinsics.checkNotNullExpressionValue(listInitSingleValues, "initSingleValues(\"华为\", \"小米\", \"oppo\", \"vivo\", \"荣耀\")");
                                    FormItemKt.SelectItemView("手机品牌", false, false, false, brand, function1, listInitSingleValues, composer3, 2097158, 14);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 100663296, 255);
                        CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                        final Ref.ObjectRef<AppSettingViewModel> objectRef4 = objectRef;
                        final MutableState<Map<String, String>> mutableState2 = mutableState;
                        ButtonViewKt.LongOkButton("验证日历普通提醒", new Function0<Unit>() { // from class: cn.jianyun.workplan.main.setting.notify.NotifySettingViewKt.NotifySettingView.1.3
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
                                MutableState<Map<String, String>> mutableState3 = mutableState2;
                                Map<String, String> testEventData = CalendarReminderUtils.getTestEventData(objectRef4.element.getBaseRepository().getContext());
                                Intrinsics.checkNotNullExpressionValue(testEventData, "getTestEventData(viewModel.baseRepository.context)");
                                NotifySettingViewKt.NotifySettingView$lambda$2(mutableState3, testEventData);
                            }
                        }, composer2, 6, 0);
                        CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                        CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                        CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                        CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                        composer2.startReplaceableGroup(-1396240569);
                        if (!NotifySettingViewKt.NotifySettingView$lambda$1(mutableState).isEmpty()) {
                            final MutableState<Map<String, String>> mutableState3 = mutableState;
                            GroupViewKt.m6850GroupViewfIyqwc(null, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer2, -1001030156, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.setting.notify.NotifySettingViewKt.NotifySettingView.1.4
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
                                            ComposerKt.traceEventStart(-1001030156, i3, -1, "cn.jianyun.workplan.main.setting.notify.NotifySettingView.<anonymous>.<anonymous> (NotifySettingView.kt:92)");
                                        }
                                        List<String> listSorted = CollectionsKt.sorted(NotifySettingViewKt.NotifySettingView$lambda$1(mutableState3).keySet());
                                        MutableState<Map<String, String>> mutableState4 = mutableState3;
                                        for (String str : listSorted) {
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
                                            MutableState<Map<String, String>> mutableState5 = mutableState4;
                                            TextKt.m2471Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                            String str2 = (String) NotifySettingViewKt.NotifySettingView$lambda$1(mutableState5).get(str);
                                            if (str2 == null) {
                                                str2 = "";
                                            }
                                            BoxViewKt.m6892OnlySmallTipText8TGbp0M(str2, 0, 0L, ColorKt.getThemeColor(), 0.0f, null, composer3, 3072, 54);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            composer3.endReplaceableGroup();
                                            composer3.endNode();
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            mutableState4 = mutableState5;
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
                        }
                        composer2.endReplaceableGroup();
                        CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                        final Ref.ObjectRef<AppSettingViewModel> objectRef5 = objectRef;
                        GroupViewKt.m6850GroupViewfIyqwc(null, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer2, 1642256536, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.setting.notify.NotifySettingViewKt.NotifySettingView.1.5
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
                                        ComposerKt.traceEventStart(1642256536, i3, -1, "cn.jianyun.workplan.main.setting.notify.NotifySettingView.<anonymous>.<anonymous> (NotifySettingView.kt:103)");
                                    }
                                    boolean zIsOpenNotify = objectRef5.element.isOpenNotify();
                                    final Ref.ObjectRef<AppSettingViewModel> objectRef6 = objectRef5;
                                    FormItemKt.SwitchItemView("开启通知", zIsOpenNotify, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.main.setting.notify.NotifySettingViewKt.NotifySettingView.1.5.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                            invoke(bool.booleanValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(boolean z2) {
                                            objectRef6.element.changeNotifyStatus(DavPrincipal.KEY_ALL, z2);
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
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(-1396239946);
                        final Ref.ObjectRef<MultiplePermissionsState> objectRef6 = objectRef2;
                        final Ref.ObjectRef<AppSettingViewModel> objectRef7 = objectRef;
                        final Context context2 = context;
                        composer2.startReplaceableGroup(-483455358);
                        ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer2);
                        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer2, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(1035164670);
                        if (objectRef6.element.getPermissions().get(0).getStatus() instanceof PermissionStatus.Denied) {
                            ButtonViewKt.LongOkButton("授权计划师操作您的日历（更新数据）", new Function0<Unit>() { // from class: cn.jianyun.workplan.main.setting.notify.NotifySettingViewKt$NotifySettingView$1$6$1
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
                                    if (PermissionsUtilKt.getShouldShowRationale(objectRef6.element.getPermissions().get(0).getStatus())) {
                                        objectRef6.element.getPermissions().get(0).launchPermissionRequest();
                                    } else {
                                        objectRef7.element.getBaseRepository().toast("请前往系统设置页面允许计划师读写您的日历");
                                        MyPermissionTool.INSTANCE.toAppSettingPage(context2);
                                    }
                                }
                            }, composer2, 6, 0);
                        }
                        composer2.endReplaceableGroup();
                        CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                        composer2.startReplaceableGroup(-1396239276);
                        if (objectRef6.element.getPermissions().get(1).getStatus() instanceof PermissionStatus.Denied) {
                            ButtonViewKt.LongOkButton("授权计划师查询您的日历", new Function0<Unit>() { // from class: cn.jianyun.workplan.main.setting.notify.NotifySettingViewKt$NotifySettingView$1$6$2
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
                                    if (PermissionsUtilKt.getShouldShowRationale(objectRef6.element.getPermissions().get(1).getStatus())) {
                                        objectRef6.element.getPermissions().get(1).launchPermissionRequest();
                                    } else {
                                        objectRef7.element.getBaseRepository().toast("请前往系统设置页面允许计划师访问您的日历");
                                        MyPermissionTool.INSTANCE.toAppSettingPage(context2);
                                    }
                                }
                            }, composer2, 6, 0);
                        }
                        composer2.endReplaceableGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
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
        }), composerStartRestartGroup, 24632, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.setting.notify.NotifySettingViewKt.NotifySettingView.2
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
                NotifySettingViewKt.NotifySettingView(navHostController, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, String> NotifySettingView$lambda$1(MutableState<Map<String, String>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NotifySettingView$lambda$2(MutableState<Map<String, String>> mutableState, Map<String, String> map) {
        mutableState.setValue(map);
    }
}