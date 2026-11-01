package cn.jianyun.workplan.widget.config;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
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
import androidx.compose.ui.unit.TextUnitKt;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavHostController;
import cn.jianyun.workplan.module.base.vm.BaseViewModel;
import cn.jianyun.workplan.ui.component.form.ButtonViewKt;
import cn.jianyun.workplan.ui.component.form.FormItemKt;
import cn.jianyun.workplan.ui.component.form.GroupViewKt;
import cn.jianyun.workplan.ui.component.nav.BoxViewKt;
import cn.jianyun.workplan.ui.component.nav.HeaderViewKt;
import cn.jianyun.workplan.util.CommonUIKt;
import cn.jianyun.workplan.util.SelectDO;
import cn.jianyun.workplan.util.SelectUtil;
import cn.jianyun.workplan.widget.DefaultWidgetConfig;
import cn.jianyun.workplan.widget.MyAppWidgetReceiver;
import cn.jianyun.workplan.widget.WidgetConfig;
import java.util.List;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: WidgetConfigView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"WidgetConfigView", "", "navHostController", "Landroidx/navigation/NavHostController;", "(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class WidgetConfigViewKt {
    public static final void WidgetConfigView(final NavHostController navHostController, Composer composer, final int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        Composer composerStartRestartGroup = composer.startRestartGroup(1829357282);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(WidgetConfigView)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1829357282, i, -1, "cn.jianyun.workplan.widget.config.WidgetConfigView (WidgetConfigView.kt:59)");
        }
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
        ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) WidgetConfigViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        final WidgetConfigViewModel widgetConfigViewModel = (WidgetConfigViewModel) viewModel;
        BaseViewModel.tryReload$default(widgetConfigViewModel, null, 1, null);
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        final Context context = (Context) objConsume;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<WidgetConfig>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$widgetConfig$2$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final WidgetConfig invoke() {
                    return widgetConfigViewModel.getWidgetConfig();
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final State state = (State) objRememberedValue;
        HeaderViewKt.PageView(navHostController, "桌面小组件", null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 576285533, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt.WidgetConfigView.1
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
                final Context context2;
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(576285533, i2, -1, "cn.jianyun.workplan.widget.config.WidgetConfigView.<anonymous> (WidgetConfigView.kt:71)");
                    }
                    final State<WidgetConfig> state2 = state;
                    final WidgetConfigViewModel widgetConfigViewModel2 = widgetConfigViewModel;
                    Context context3 = context;
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
                    BoxViewKt.m6891LeadingHintViewRuDwNsA("桌面小组件样式设置", 0.0f, 0L, 0L, null, composer2, 6, 30);
                    GroupViewKt.m6850GroupViewfIyqwc(null, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer2, 1103411894, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$1
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
                                    ComposerKt.traceEventStart(1103411894, i3, -1, "cn.jianyun.workplan.widget.config.WidgetConfigView.<anonymous>.<anonymous>.<anonymous> (WidgetConfigView.kt:76)");
                                }
                                boolean showRemark = WidgetConfigViewKt.WidgetConfigView$lambda$1(state2).getShowRemark();
                                final WidgetConfigViewModel widgetConfigViewModel3 = widgetConfigViewModel2;
                                FormItemKt.SwitchItemView("显示备注", showRemark, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$1.1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                        invoke(bool.booleanValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(boolean z) {
                                        WidgetConfigViewModel widgetConfigViewModel4 = widgetConfigViewModel3;
                                        WidgetConfig widgetConfig = widgetConfigViewModel4.getWidgetConfig();
                                        widgetConfigViewModel4.setWidgetConfig(widgetConfig.copy((16744447 & 1) != 0 ? widgetConfig.headerBg : null, (16744447 & 2) != 0 ? widgetConfig.headerTextColor : null, (16744447 & 4) != 0 ? widgetConfig.bgColor : null, (16744447 & 8) != 0 ? widgetConfig.textColor : null, (16744447 & 16) != 0 ? widgetConfig.tintColor : null, (16744447 & 32) != 0 ? widgetConfig.markColor : null, (16744447 & 64) != 0 ? widgetConfig.darkHeaderBg : null, (16744447 & 128) != 0 ? widgetConfig.darkHeaderTextColor : null, (16744447 & 256) != 0 ? widgetConfig.darkBgColor : null, (16744447 & 512) != 0 ? widgetConfig.darkTextColor : null, (16744447 & 1024) != 0 ? widgetConfig.darkTintColor : null, (16744447 & 2048) != 0 ? widgetConfig.darkMarkColor : null, (16744447 & 4096) != 0 ? widgetConfig.headerOpacity : 0.0f, (16744447 & 8192) != 0 ? widgetConfig.opacity : 0.0f, (16744447 & 16384) != 0 ? widgetConfig.mondayFirst : false, (16744447 & 32768) != 0 ? widgetConfig.showRemark : z, (16744447 & 65536) != 0 ? widgetConfig.showBeginTime : false, (16744447 & 131072) != 0 ? widgetConfig.showEndTime : false, (16744447 & 262144) != 0 ? widgetConfig.showLunar : false, (16744447 & 524288) != 0 ? widgetConfig.showLine : false, (16744447 & 1048576) != 0 ? widgetConfig.showFestival : false, (16744447 & 2097152) != 0 ? widgetConfig.dateFontSize : null, (16744447 & 4194304) != 0 ? widgetConfig.workFontSize : null, (16744447 & 8388608) != 0 ? widgetConfig.timeFontSize : null));
                                    }
                                }, composer3, 6);
                                boolean showBeginTime = WidgetConfigViewKt.WidgetConfigView$lambda$1(state2).getShowBeginTime();
                                final WidgetConfigViewModel widgetConfigViewModel4 = widgetConfigViewModel2;
                                FormItemKt.SwitchItemView("显示上班时间", showBeginTime, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$1.2
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                        invoke(bool.booleanValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(boolean z) {
                                        WidgetConfigViewModel widgetConfigViewModel5 = widgetConfigViewModel4;
                                        WidgetConfig widgetConfig = widgetConfigViewModel5.getWidgetConfig();
                                        widgetConfigViewModel5.setWidgetConfig(widgetConfig.copy((16744447 & 1) != 0 ? widgetConfig.headerBg : null, (16744447 & 2) != 0 ? widgetConfig.headerTextColor : null, (16744447 & 4) != 0 ? widgetConfig.bgColor : null, (16744447 & 8) != 0 ? widgetConfig.textColor : null, (16744447 & 16) != 0 ? widgetConfig.tintColor : null, (16744447 & 32) != 0 ? widgetConfig.markColor : null, (16744447 & 64) != 0 ? widgetConfig.darkHeaderBg : null, (16744447 & 128) != 0 ? widgetConfig.darkHeaderTextColor : null, (16744447 & 256) != 0 ? widgetConfig.darkBgColor : null, (16744447 & 512) != 0 ? widgetConfig.darkTextColor : null, (16744447 & 1024) != 0 ? widgetConfig.darkTintColor : null, (16744447 & 2048) != 0 ? widgetConfig.darkMarkColor : null, (16744447 & 4096) != 0 ? widgetConfig.headerOpacity : 0.0f, (16744447 & 8192) != 0 ? widgetConfig.opacity : 0.0f, (16744447 & 16384) != 0 ? widgetConfig.mondayFirst : false, (16744447 & 32768) != 0 ? widgetConfig.showRemark : false, (16744447 & 65536) != 0 ? widgetConfig.showBeginTime : z, (16744447 & 131072) != 0 ? widgetConfig.showEndTime : false, (16744447 & 262144) != 0 ? widgetConfig.showLunar : false, (16744447 & 524288) != 0 ? widgetConfig.showLine : false, (16744447 & 1048576) != 0 ? widgetConfig.showFestival : false, (16744447 & 2097152) != 0 ? widgetConfig.dateFontSize : null, (16744447 & 4194304) != 0 ? widgetConfig.workFontSize : null, (16744447 & 8388608) != 0 ? widgetConfig.timeFontSize : null));
                                    }
                                }, composer3, 6);
                                boolean showEndTime = WidgetConfigViewKt.WidgetConfigView$lambda$1(state2).getShowEndTime();
                                final WidgetConfigViewModel widgetConfigViewModel5 = widgetConfigViewModel2;
                                FormItemKt.SwitchItemView("显示下班时间", showEndTime, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$1.3
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                        invoke(bool.booleanValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(boolean z) {
                                        WidgetConfigViewModel widgetConfigViewModel6 = widgetConfigViewModel5;
                                        WidgetConfig widgetConfig = widgetConfigViewModel6.getWidgetConfig();
                                        widgetConfigViewModel6.setWidgetConfig(widgetConfig.copy((16744447 & 1) != 0 ? widgetConfig.headerBg : null, (16744447 & 2) != 0 ? widgetConfig.headerTextColor : null, (16744447 & 4) != 0 ? widgetConfig.bgColor : null, (16744447 & 8) != 0 ? widgetConfig.textColor : null, (16744447 & 16) != 0 ? widgetConfig.tintColor : null, (16744447 & 32) != 0 ? widgetConfig.markColor : null, (16744447 & 64) != 0 ? widgetConfig.darkHeaderBg : null, (16744447 & 128) != 0 ? widgetConfig.darkHeaderTextColor : null, (16744447 & 256) != 0 ? widgetConfig.darkBgColor : null, (16744447 & 512) != 0 ? widgetConfig.darkTextColor : null, (16744447 & 1024) != 0 ? widgetConfig.darkTintColor : null, (16744447 & 2048) != 0 ? widgetConfig.darkMarkColor : null, (16744447 & 4096) != 0 ? widgetConfig.headerOpacity : 0.0f, (16744447 & 8192) != 0 ? widgetConfig.opacity : 0.0f, (16744447 & 16384) != 0 ? widgetConfig.mondayFirst : false, (16744447 & 32768) != 0 ? widgetConfig.showRemark : false, (16744447 & 65536) != 0 ? widgetConfig.showBeginTime : false, (16744447 & 131072) != 0 ? widgetConfig.showEndTime : z, (16744447 & 262144) != 0 ? widgetConfig.showLunar : false, (16744447 & 524288) != 0 ? widgetConfig.showLine : false, (16744447 & 1048576) != 0 ? widgetConfig.showFestival : false, (16744447 & 2097152) != 0 ? widgetConfig.dateFontSize : null, (16744447 & 4194304) != 0 ? widgetConfig.workFontSize : null, (16744447 & 8388608) != 0 ? widgetConfig.timeFontSize : null));
                                    }
                                }, composer3, 6);
                                String dateFontSize = WidgetConfigViewKt.WidgetConfigView$lambda$1(state2).getDateFontSize();
                                final WidgetConfigViewModel widgetConfigViewModel6 = widgetConfigViewModel2;
                                Function1<String, Unit> function1 = new Function1<String, Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$1.4
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
                                        WidgetConfigViewModel widgetConfigViewModel7 = widgetConfigViewModel6;
                                        WidgetConfig widgetConfig = widgetConfigViewModel7.getWidgetConfig();
                                        widgetConfigViewModel7.setWidgetConfig(widgetConfig.copy((16744447 & 1) != 0 ? widgetConfig.headerBg : null, (16744447 & 2) != 0 ? widgetConfig.headerTextColor : null, (16744447 & 4) != 0 ? widgetConfig.bgColor : null, (16744447 & 8) != 0 ? widgetConfig.textColor : null, (16744447 & 16) != 0 ? widgetConfig.tintColor : null, (16744447 & 32) != 0 ? widgetConfig.markColor : null, (16744447 & 64) != 0 ? widgetConfig.darkHeaderBg : null, (16744447 & 128) != 0 ? widgetConfig.darkHeaderTextColor : null, (16744447 & 256) != 0 ? widgetConfig.darkBgColor : null, (16744447 & 512) != 0 ? widgetConfig.darkTextColor : null, (16744447 & 1024) != 0 ? widgetConfig.darkTintColor : null, (16744447 & 2048) != 0 ? widgetConfig.darkMarkColor : null, (16744447 & 4096) != 0 ? widgetConfig.headerOpacity : 0.0f, (16744447 & 8192) != 0 ? widgetConfig.opacity : 0.0f, (16744447 & 16384) != 0 ? widgetConfig.mondayFirst : false, (16744447 & 32768) != 0 ? widgetConfig.showRemark : false, (16744447 & 65536) != 0 ? widgetConfig.showBeginTime : false, (16744447 & 131072) != 0 ? widgetConfig.showEndTime : false, (16744447 & 262144) != 0 ? widgetConfig.showLunar : false, (16744447 & 524288) != 0 ? widgetConfig.showLine : false, (16744447 & 1048576) != 0 ? widgetConfig.showFestival : false, (16744447 & 2097152) != 0 ? widgetConfig.dateFontSize : it, (16744447 & 4194304) != 0 ? widgetConfig.workFontSize : null, (16744447 & 8388608) != 0 ? widgetConfig.timeFontSize : null));
                                    }
                                };
                                List<SelectDO> CHOOSE_FONT_SIZES = SelectUtil.CHOOSE_FONT_SIZES;
                                Intrinsics.checkNotNullExpressionValue(CHOOSE_FONT_SIZES, "CHOOSE_FONT_SIZES");
                                FormItemKt.SelectItemView("日期字号", false, false, false, dateFontSize, function1, CHOOSE_FONT_SIZES, composer3, 2097158, 14);
                                String workFontSize = WidgetConfigViewKt.WidgetConfigView$lambda$1(state2).getWorkFontSize();
                                final WidgetConfigViewModel widgetConfigViewModel7 = widgetConfigViewModel2;
                                Function1<String, Unit> function2 = new Function1<String, Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$1.5
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
                                        WidgetConfigViewModel widgetConfigViewModel8 = widgetConfigViewModel7;
                                        WidgetConfig widgetConfig = widgetConfigViewModel8.getWidgetConfig();
                                        widgetConfigViewModel8.setWidgetConfig(widgetConfig.copy((16744447 & 1) != 0 ? widgetConfig.headerBg : null, (16744447 & 2) != 0 ? widgetConfig.headerTextColor : null, (16744447 & 4) != 0 ? widgetConfig.bgColor : null, (16744447 & 8) != 0 ? widgetConfig.textColor : null, (16744447 & 16) != 0 ? widgetConfig.tintColor : null, (16744447 & 32) != 0 ? widgetConfig.markColor : null, (16744447 & 64) != 0 ? widgetConfig.darkHeaderBg : null, (16744447 & 128) != 0 ? widgetConfig.darkHeaderTextColor : null, (16744447 & 256) != 0 ? widgetConfig.darkBgColor : null, (16744447 & 512) != 0 ? widgetConfig.darkTextColor : null, (16744447 & 1024) != 0 ? widgetConfig.darkTintColor : null, (16744447 & 2048) != 0 ? widgetConfig.darkMarkColor : null, (16744447 & 4096) != 0 ? widgetConfig.headerOpacity : 0.0f, (16744447 & 8192) != 0 ? widgetConfig.opacity : 0.0f, (16744447 & 16384) != 0 ? widgetConfig.mondayFirst : false, (16744447 & 32768) != 0 ? widgetConfig.showRemark : false, (16744447 & 65536) != 0 ? widgetConfig.showBeginTime : false, (16744447 & 131072) != 0 ? widgetConfig.showEndTime : false, (16744447 & 262144) != 0 ? widgetConfig.showLunar : false, (16744447 & 524288) != 0 ? widgetConfig.showLine : false, (16744447 & 1048576) != 0 ? widgetConfig.showFestival : false, (16744447 & 2097152) != 0 ? widgetConfig.dateFontSize : null, (16744447 & 4194304) != 0 ? widgetConfig.workFontSize : it, (16744447 & 8388608) != 0 ? widgetConfig.timeFontSize : null));
                                    }
                                };
                                List<SelectDO> CHOOSE_FONT_SIZES2 = SelectUtil.CHOOSE_FONT_SIZES;
                                Intrinsics.checkNotNullExpressionValue(CHOOSE_FONT_SIZES2, "CHOOSE_FONT_SIZES");
                                FormItemKt.SelectItemView("班次字号", false, false, false, workFontSize, function2, CHOOSE_FONT_SIZES2, composer3, 2097158, 14);
                                String timeFontSize = WidgetConfigViewKt.WidgetConfigView$lambda$1(state2).getTimeFontSize();
                                final WidgetConfigViewModel widgetConfigViewModel8 = widgetConfigViewModel2;
                                Function1<String, Unit> function3 = new Function1<String, Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$1.6
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
                                        WidgetConfigViewModel widgetConfigViewModel9 = widgetConfigViewModel8;
                                        WidgetConfig widgetConfig = widgetConfigViewModel9.getWidgetConfig();
                                        widgetConfigViewModel9.setWidgetConfig(widgetConfig.copy((16744447 & 1) != 0 ? widgetConfig.headerBg : null, (16744447 & 2) != 0 ? widgetConfig.headerTextColor : null, (16744447 & 4) != 0 ? widgetConfig.bgColor : null, (16744447 & 8) != 0 ? widgetConfig.textColor : null, (16744447 & 16) != 0 ? widgetConfig.tintColor : null, (16744447 & 32) != 0 ? widgetConfig.markColor : null, (16744447 & 64) != 0 ? widgetConfig.darkHeaderBg : null, (16744447 & 128) != 0 ? widgetConfig.darkHeaderTextColor : null, (16744447 & 256) != 0 ? widgetConfig.darkBgColor : null, (16744447 & 512) != 0 ? widgetConfig.darkTextColor : null, (16744447 & 1024) != 0 ? widgetConfig.darkTintColor : null, (16744447 & 2048) != 0 ? widgetConfig.darkMarkColor : null, (16744447 & 4096) != 0 ? widgetConfig.headerOpacity : 0.0f, (16744447 & 8192) != 0 ? widgetConfig.opacity : 0.0f, (16744447 & 16384) != 0 ? widgetConfig.mondayFirst : false, (16744447 & 32768) != 0 ? widgetConfig.showRemark : false, (16744447 & 65536) != 0 ? widgetConfig.showBeginTime : false, (16744447 & 131072) != 0 ? widgetConfig.showEndTime : false, (16744447 & 262144) != 0 ? widgetConfig.showLunar : false, (16744447 & 524288) != 0 ? widgetConfig.showLine : false, (16744447 & 1048576) != 0 ? widgetConfig.showFestival : false, (16744447 & 2097152) != 0 ? widgetConfig.dateFontSize : null, (16744447 & 4194304) != 0 ? widgetConfig.workFontSize : null, (16744447 & 8388608) != 0 ? widgetConfig.timeFontSize : it));
                                    }
                                };
                                List<SelectDO> CHOOSE_FONT_SIZES3 = SelectUtil.CHOOSE_FONT_SIZES;
                                Intrinsics.checkNotNullExpressionValue(CHOOSE_FONT_SIZES3, "CHOOSE_FONT_SIZES");
                                FormItemKt.SelectItemView("时间字号", false, false, false, timeFontSize, function3, CHOOSE_FONT_SIZES3, composer3, 2097158, 14);
                                float headerOpacity = WidgetConfigViewKt.WidgetConfigView$lambda$1(state2).getHeaderOpacity();
                                final WidgetConfigViewModel widgetConfigViewModel9 = widgetConfigViewModel2;
                                FormItemKt.FloatAdderView("标题背景透明度", headerOpacity, 0, false, 0.0f, 0.0f, 0.0f, new Function1<Float, Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$1.7
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Float f2) {
                                        invoke(f2.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(float f2) {
                                        WidgetConfigViewModel widgetConfigViewModel10 = widgetConfigViewModel9;
                                        WidgetConfig widgetConfig = widgetConfigViewModel10.getWidgetConfig();
                                        widgetConfigViewModel10.setWidgetConfig(widgetConfig.copy((16744447 & 1) != 0 ? widgetConfig.headerBg : null, (16744447 & 2) != 0 ? widgetConfig.headerTextColor : null, (16744447 & 4) != 0 ? widgetConfig.bgColor : null, (16744447 & 8) != 0 ? widgetConfig.textColor : null, (16744447 & 16) != 0 ? widgetConfig.tintColor : null, (16744447 & 32) != 0 ? widgetConfig.markColor : null, (16744447 & 64) != 0 ? widgetConfig.darkHeaderBg : null, (16744447 & 128) != 0 ? widgetConfig.darkHeaderTextColor : null, (16744447 & 256) != 0 ? widgetConfig.darkBgColor : null, (16744447 & 512) != 0 ? widgetConfig.darkTextColor : null, (16744447 & 1024) != 0 ? widgetConfig.darkTintColor : null, (16744447 & 2048) != 0 ? widgetConfig.darkMarkColor : null, (16744447 & 4096) != 0 ? widgetConfig.headerOpacity : f2, (16744447 & 8192) != 0 ? widgetConfig.opacity : 0.0f, (16744447 & 16384) != 0 ? widgetConfig.mondayFirst : false, (16744447 & 32768) != 0 ? widgetConfig.showRemark : false, (16744447 & 65536) != 0 ? widgetConfig.showBeginTime : false, (16744447 & 131072) != 0 ? widgetConfig.showEndTime : false, (16744447 & 262144) != 0 ? widgetConfig.showLunar : false, (16744447 & 524288) != 0 ? widgetConfig.showLine : false, (16744447 & 1048576) != 0 ? widgetConfig.showFestival : false, (16744447 & 2097152) != 0 ? widgetConfig.dateFontSize : null, (16744447 & 4194304) != 0 ? widgetConfig.workFontSize : null, (16744447 & 8388608) != 0 ? widgetConfig.timeFontSize : null));
                                    }
                                }, composer3, 6, 124);
                                float opacity = WidgetConfigViewKt.WidgetConfigView$lambda$1(state2).getOpacity();
                                final WidgetConfigViewModel widgetConfigViewModel10 = widgetConfigViewModel2;
                                FormItemKt.FloatAdderView("日历背景透明度", opacity, 0, false, 0.0f, 0.0f, 0.0f, new Function1<Float, Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$1.8
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Float f2) {
                                        invoke(f2.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(float f2) {
                                        WidgetConfigViewModel widgetConfigViewModel11 = widgetConfigViewModel10;
                                        WidgetConfig widgetConfig = widgetConfigViewModel11.getWidgetConfig();
                                        widgetConfigViewModel11.setWidgetConfig(widgetConfig.copy((16744447 & 1) != 0 ? widgetConfig.headerBg : null, (16744447 & 2) != 0 ? widgetConfig.headerTextColor : null, (16744447 & 4) != 0 ? widgetConfig.bgColor : null, (16744447 & 8) != 0 ? widgetConfig.textColor : null, (16744447 & 16) != 0 ? widgetConfig.tintColor : null, (16744447 & 32) != 0 ? widgetConfig.markColor : null, (16744447 & 64) != 0 ? widgetConfig.darkHeaderBg : null, (16744447 & 128) != 0 ? widgetConfig.darkHeaderTextColor : null, (16744447 & 256) != 0 ? widgetConfig.darkBgColor : null, (16744447 & 512) != 0 ? widgetConfig.darkTextColor : null, (16744447 & 1024) != 0 ? widgetConfig.darkTintColor : null, (16744447 & 2048) != 0 ? widgetConfig.darkMarkColor : null, (16744447 & 4096) != 0 ? widgetConfig.headerOpacity : 0.0f, (16744447 & 8192) != 0 ? widgetConfig.opacity : f2, (16744447 & 16384) != 0 ? widgetConfig.mondayFirst : false, (16744447 & 32768) != 0 ? widgetConfig.showRemark : false, (16744447 & 65536) != 0 ? widgetConfig.showBeginTime : false, (16744447 & 131072) != 0 ? widgetConfig.showEndTime : false, (16744447 & 262144) != 0 ? widgetConfig.showLunar : false, (16744447 & 524288) != 0 ? widgetConfig.showLine : false, (16744447 & 1048576) != 0 ? widgetConfig.showFestival : false, (16744447 & 2097152) != 0 ? widgetConfig.dateFontSize : null, (16744447 & 4194304) != 0 ? widgetConfig.workFontSize : null, (16744447 & 8388608) != 0 ? widgetConfig.timeFontSize : null));
                                    }
                                }, composer3, 6, 124);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 100663296, 255);
                    GroupViewKt.m6850GroupViewfIyqwc(null, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer2, -1279544993, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$2
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
                                    ComposerKt.traceEventStart(-1279544993, i3, -1, "cn.jianyun.workplan.widget.config.WidgetConfigView.<anonymous>.<anonymous>.<anonymous> (WidgetConfigView.kt:109)");
                                }
                                String headerBg = WidgetConfigViewKt.WidgetConfigView$lambda$1(state2).getHeaderBg();
                                final WidgetConfigViewModel widgetConfigViewModel3 = widgetConfigViewModel2;
                                FormItemKt.ColorSelectItemView("标题背景色", headerBg, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$2.1
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
                                        WidgetConfigViewModel widgetConfigViewModel4 = widgetConfigViewModel3;
                                        WidgetConfig widgetConfig = widgetConfigViewModel4.getWidgetConfig();
                                        widgetConfigViewModel4.setWidgetConfig(widgetConfig.copy((16744447 & 1) != 0 ? widgetConfig.headerBg : it, (16744447 & 2) != 0 ? widgetConfig.headerTextColor : null, (16744447 & 4) != 0 ? widgetConfig.bgColor : null, (16744447 & 8) != 0 ? widgetConfig.textColor : null, (16744447 & 16) != 0 ? widgetConfig.tintColor : null, (16744447 & 32) != 0 ? widgetConfig.markColor : null, (16744447 & 64) != 0 ? widgetConfig.darkHeaderBg : null, (16744447 & 128) != 0 ? widgetConfig.darkHeaderTextColor : null, (16744447 & 256) != 0 ? widgetConfig.darkBgColor : null, (16744447 & 512) != 0 ? widgetConfig.darkTextColor : null, (16744447 & 1024) != 0 ? widgetConfig.darkTintColor : null, (16744447 & 2048) != 0 ? widgetConfig.darkMarkColor : null, (16744447 & 4096) != 0 ? widgetConfig.headerOpacity : 0.0f, (16744447 & 8192) != 0 ? widgetConfig.opacity : 0.0f, (16744447 & 16384) != 0 ? widgetConfig.mondayFirst : false, (16744447 & 32768) != 0 ? widgetConfig.showRemark : false, (16744447 & 65536) != 0 ? widgetConfig.showBeginTime : false, (16744447 & 131072) != 0 ? widgetConfig.showEndTime : false, (16744447 & 262144) != 0 ? widgetConfig.showLunar : false, (16744447 & 524288) != 0 ? widgetConfig.showLine : false, (16744447 & 1048576) != 0 ? widgetConfig.showFestival : false, (16744447 & 2097152) != 0 ? widgetConfig.dateFontSize : null, (16744447 & 4194304) != 0 ? widgetConfig.workFontSize : null, (16744447 & 8388608) != 0 ? widgetConfig.timeFontSize : null));
                                    }
                                }, composer3, 6);
                                String headerTextColor = WidgetConfigViewKt.WidgetConfigView$lambda$1(state2).getHeaderTextColor();
                                final WidgetConfigViewModel widgetConfigViewModel4 = widgetConfigViewModel2;
                                FormItemKt.ColorSelectItemView("标题文字色", headerTextColor, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$2.2
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
                                        WidgetConfigViewModel widgetConfigViewModel5 = widgetConfigViewModel4;
                                        WidgetConfig widgetConfig = widgetConfigViewModel5.getWidgetConfig();
                                        widgetConfigViewModel5.setWidgetConfig(widgetConfig.copy((16744447 & 1) != 0 ? widgetConfig.headerBg : null, (16744447 & 2) != 0 ? widgetConfig.headerTextColor : it, (16744447 & 4) != 0 ? widgetConfig.bgColor : null, (16744447 & 8) != 0 ? widgetConfig.textColor : null, (16744447 & 16) != 0 ? widgetConfig.tintColor : null, (16744447 & 32) != 0 ? widgetConfig.markColor : null, (16744447 & 64) != 0 ? widgetConfig.darkHeaderBg : null, (16744447 & 128) != 0 ? widgetConfig.darkHeaderTextColor : null, (16744447 & 256) != 0 ? widgetConfig.darkBgColor : null, (16744447 & 512) != 0 ? widgetConfig.darkTextColor : null, (16744447 & 1024) != 0 ? widgetConfig.darkTintColor : null, (16744447 & 2048) != 0 ? widgetConfig.darkMarkColor : null, (16744447 & 4096) != 0 ? widgetConfig.headerOpacity : 0.0f, (16744447 & 8192) != 0 ? widgetConfig.opacity : 0.0f, (16744447 & 16384) != 0 ? widgetConfig.mondayFirst : false, (16744447 & 32768) != 0 ? widgetConfig.showRemark : false, (16744447 & 65536) != 0 ? widgetConfig.showBeginTime : false, (16744447 & 131072) != 0 ? widgetConfig.showEndTime : false, (16744447 & 262144) != 0 ? widgetConfig.showLunar : false, (16744447 & 524288) != 0 ? widgetConfig.showLine : false, (16744447 & 1048576) != 0 ? widgetConfig.showFestival : false, (16744447 & 2097152) != 0 ? widgetConfig.dateFontSize : null, (16744447 & 4194304) != 0 ? widgetConfig.workFontSize : null, (16744447 & 8388608) != 0 ? widgetConfig.timeFontSize : null));
                                    }
                                }, composer3, 6);
                                String bgColor = WidgetConfigViewKt.WidgetConfigView$lambda$1(state2).getBgColor();
                                final WidgetConfigViewModel widgetConfigViewModel5 = widgetConfigViewModel2;
                                FormItemKt.ColorSelectItemView("日历背景色", bgColor, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$2.3
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
                                        WidgetConfigViewModel widgetConfigViewModel6 = widgetConfigViewModel5;
                                        WidgetConfig widgetConfig = widgetConfigViewModel6.getWidgetConfig();
                                        widgetConfigViewModel6.setWidgetConfig(widgetConfig.copy((16744447 & 1) != 0 ? widgetConfig.headerBg : null, (16744447 & 2) != 0 ? widgetConfig.headerTextColor : null, (16744447 & 4) != 0 ? widgetConfig.bgColor : it, (16744447 & 8) != 0 ? widgetConfig.textColor : null, (16744447 & 16) != 0 ? widgetConfig.tintColor : null, (16744447 & 32) != 0 ? widgetConfig.markColor : null, (16744447 & 64) != 0 ? widgetConfig.darkHeaderBg : null, (16744447 & 128) != 0 ? widgetConfig.darkHeaderTextColor : null, (16744447 & 256) != 0 ? widgetConfig.darkBgColor : null, (16744447 & 512) != 0 ? widgetConfig.darkTextColor : null, (16744447 & 1024) != 0 ? widgetConfig.darkTintColor : null, (16744447 & 2048) != 0 ? widgetConfig.darkMarkColor : null, (16744447 & 4096) != 0 ? widgetConfig.headerOpacity : 0.0f, (16744447 & 8192) != 0 ? widgetConfig.opacity : 0.0f, (16744447 & 16384) != 0 ? widgetConfig.mondayFirst : false, (16744447 & 32768) != 0 ? widgetConfig.showRemark : false, (16744447 & 65536) != 0 ? widgetConfig.showBeginTime : false, (16744447 & 131072) != 0 ? widgetConfig.showEndTime : false, (16744447 & 262144) != 0 ? widgetConfig.showLunar : false, (16744447 & 524288) != 0 ? widgetConfig.showLine : false, (16744447 & 1048576) != 0 ? widgetConfig.showFestival : false, (16744447 & 2097152) != 0 ? widgetConfig.dateFontSize : null, (16744447 & 4194304) != 0 ? widgetConfig.workFontSize : null, (16744447 & 8388608) != 0 ? widgetConfig.timeFontSize : null));
                                    }
                                }, composer3, 6);
                                String textColor = WidgetConfigViewKt.WidgetConfigView$lambda$1(state2).getTextColor();
                                final WidgetConfigViewModel widgetConfigViewModel6 = widgetConfigViewModel2;
                                FormItemKt.ColorSelectItemView("日历文字颜色", textColor, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$2.4
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
                                        WidgetConfigViewModel widgetConfigViewModel7 = widgetConfigViewModel6;
                                        WidgetConfig widgetConfig = widgetConfigViewModel7.getWidgetConfig();
                                        widgetConfigViewModel7.setWidgetConfig(widgetConfig.copy((16744447 & 1) != 0 ? widgetConfig.headerBg : null, (16744447 & 2) != 0 ? widgetConfig.headerTextColor : null, (16744447 & 4) != 0 ? widgetConfig.bgColor : null, (16744447 & 8) != 0 ? widgetConfig.textColor : it, (16744447 & 16) != 0 ? widgetConfig.tintColor : null, (16744447 & 32) != 0 ? widgetConfig.markColor : null, (16744447 & 64) != 0 ? widgetConfig.darkHeaderBg : null, (16744447 & 128) != 0 ? widgetConfig.darkHeaderTextColor : null, (16744447 & 256) != 0 ? widgetConfig.darkBgColor : null, (16744447 & 512) != 0 ? widgetConfig.darkTextColor : null, (16744447 & 1024) != 0 ? widgetConfig.darkTintColor : null, (16744447 & 2048) != 0 ? widgetConfig.darkMarkColor : null, (16744447 & 4096) != 0 ? widgetConfig.headerOpacity : 0.0f, (16744447 & 8192) != 0 ? widgetConfig.opacity : 0.0f, (16744447 & 16384) != 0 ? widgetConfig.mondayFirst : false, (16744447 & 32768) != 0 ? widgetConfig.showRemark : false, (16744447 & 65536) != 0 ? widgetConfig.showBeginTime : false, (16744447 & 131072) != 0 ? widgetConfig.showEndTime : false, (16744447 & 262144) != 0 ? widgetConfig.showLunar : false, (16744447 & 524288) != 0 ? widgetConfig.showLine : false, (16744447 & 1048576) != 0 ? widgetConfig.showFestival : false, (16744447 & 2097152) != 0 ? widgetConfig.dateFontSize : null, (16744447 & 4194304) != 0 ? widgetConfig.workFontSize : null, (16744447 & 8388608) != 0 ? widgetConfig.timeFontSize : null));
                                    }
                                }, composer3, 6);
                                String tintColor = WidgetConfigViewKt.WidgetConfigView$lambda$1(state2).getTintColor();
                                final WidgetConfigViewModel widgetConfigViewModel7 = widgetConfigViewModel2;
                                FormItemKt.ColorSelectItemView("农历颜色", tintColor, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$2.5
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
                                        WidgetConfigViewModel widgetConfigViewModel8 = widgetConfigViewModel7;
                                        WidgetConfig widgetConfig = widgetConfigViewModel8.getWidgetConfig();
                                        widgetConfigViewModel8.setWidgetConfig(widgetConfig.copy((16744447 & 1) != 0 ? widgetConfig.headerBg : null, (16744447 & 2) != 0 ? widgetConfig.headerTextColor : null, (16744447 & 4) != 0 ? widgetConfig.bgColor : null, (16744447 & 8) != 0 ? widgetConfig.textColor : null, (16744447 & 16) != 0 ? widgetConfig.tintColor : it, (16744447 & 32) != 0 ? widgetConfig.markColor : null, (16744447 & 64) != 0 ? widgetConfig.darkHeaderBg : null, (16744447 & 128) != 0 ? widgetConfig.darkHeaderTextColor : null, (16744447 & 256) != 0 ? widgetConfig.darkBgColor : null, (16744447 & 512) != 0 ? widgetConfig.darkTextColor : null, (16744447 & 1024) != 0 ? widgetConfig.darkTintColor : null, (16744447 & 2048) != 0 ? widgetConfig.darkMarkColor : null, (16744447 & 4096) != 0 ? widgetConfig.headerOpacity : 0.0f, (16744447 & 8192) != 0 ? widgetConfig.opacity : 0.0f, (16744447 & 16384) != 0 ? widgetConfig.mondayFirst : false, (16744447 & 32768) != 0 ? widgetConfig.showRemark : false, (16744447 & 65536) != 0 ? widgetConfig.showBeginTime : false, (16744447 & 131072) != 0 ? widgetConfig.showEndTime : false, (16744447 & 262144) != 0 ? widgetConfig.showLunar : false, (16744447 & 524288) != 0 ? widgetConfig.showLine : false, (16744447 & 1048576) != 0 ? widgetConfig.showFestival : false, (16744447 & 2097152) != 0 ? widgetConfig.dateFontSize : null, (16744447 & 4194304) != 0 ? widgetConfig.workFontSize : null, (16744447 & 8388608) != 0 ? widgetConfig.timeFontSize : null));
                                    }
                                }, composer3, 6);
                                String markColor = WidgetConfigViewKt.WidgetConfigView$lambda$1(state2).getMarkColor();
                                final WidgetConfigViewModel widgetConfigViewModel8 = widgetConfigViewModel2;
                                FormItemKt.ColorSelectItemView("备注颜色", markColor, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$2.6
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
                                        WidgetConfigViewModel widgetConfigViewModel9 = widgetConfigViewModel8;
                                        WidgetConfig widgetConfig = widgetConfigViewModel9.getWidgetConfig();
                                        widgetConfigViewModel9.setWidgetConfig(widgetConfig.copy((16744447 & 1) != 0 ? widgetConfig.headerBg : null, (16744447 & 2) != 0 ? widgetConfig.headerTextColor : null, (16744447 & 4) != 0 ? widgetConfig.bgColor : null, (16744447 & 8) != 0 ? widgetConfig.textColor : null, (16744447 & 16) != 0 ? widgetConfig.tintColor : null, (16744447 & 32) != 0 ? widgetConfig.markColor : it, (16744447 & 64) != 0 ? widgetConfig.darkHeaderBg : null, (16744447 & 128) != 0 ? widgetConfig.darkHeaderTextColor : null, (16744447 & 256) != 0 ? widgetConfig.darkBgColor : null, (16744447 & 512) != 0 ? widgetConfig.darkTextColor : null, (16744447 & 1024) != 0 ? widgetConfig.darkTintColor : null, (16744447 & 2048) != 0 ? widgetConfig.darkMarkColor : null, (16744447 & 4096) != 0 ? widgetConfig.headerOpacity : 0.0f, (16744447 & 8192) != 0 ? widgetConfig.opacity : 0.0f, (16744447 & 16384) != 0 ? widgetConfig.mondayFirst : false, (16744447 & 32768) != 0 ? widgetConfig.showRemark : false, (16744447 & 65536) != 0 ? widgetConfig.showBeginTime : false, (16744447 & 131072) != 0 ? widgetConfig.showEndTime : false, (16744447 & 262144) != 0 ? widgetConfig.showLunar : false, (16744447 & 524288) != 0 ? widgetConfig.showLine : false, (16744447 & 1048576) != 0 ? widgetConfig.showFestival : false, (16744447 & 2097152) != 0 ? widgetConfig.dateFontSize : null, (16744447 & 4194304) != 0 ? widgetConfig.workFontSize : null, (16744447 & 8388608) != 0 ? widgetConfig.timeFontSize : null));
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
                    BoxViewKt.m6891LeadingHintViewRuDwNsA("暗黑模式配色", 0.0f, 0L, 0L, null, composer2, 6, 30);
                    GroupViewKt.m6850GroupViewfIyqwc(null, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer2, 431733374, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$3
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
                                    ComposerKt.traceEventStart(431733374, i3, -1, "cn.jianyun.workplan.widget.config.WidgetConfigView.<anonymous>.<anonymous>.<anonymous> (WidgetConfigView.kt:132)");
                                }
                                String darkHeaderBg = WidgetConfigViewKt.WidgetConfigView$lambda$1(state2).getDarkHeaderBg();
                                final WidgetConfigViewModel widgetConfigViewModel3 = widgetConfigViewModel2;
                                FormItemKt.ColorSelectItemView("暗黑标题背景色", darkHeaderBg, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$3.1
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
                                        WidgetConfigViewModel widgetConfigViewModel4 = widgetConfigViewModel3;
                                        WidgetConfig widgetConfig = widgetConfigViewModel4.getWidgetConfig();
                                        widgetConfigViewModel4.setWidgetConfig(widgetConfig.copy((16744447 & 1) != 0 ? widgetConfig.headerBg : null, (16744447 & 2) != 0 ? widgetConfig.headerTextColor : null, (16744447 & 4) != 0 ? widgetConfig.bgColor : null, (16744447 & 8) != 0 ? widgetConfig.textColor : null, (16744447 & 16) != 0 ? widgetConfig.tintColor : null, (16744447 & 32) != 0 ? widgetConfig.markColor : null, (16744447 & 64) != 0 ? widgetConfig.darkHeaderBg : it, (16744447 & 128) != 0 ? widgetConfig.darkHeaderTextColor : null, (16744447 & 256) != 0 ? widgetConfig.darkBgColor : null, (16744447 & 512) != 0 ? widgetConfig.darkTextColor : null, (16744447 & 1024) != 0 ? widgetConfig.darkTintColor : null, (16744447 & 2048) != 0 ? widgetConfig.darkMarkColor : null, (16744447 & 4096) != 0 ? widgetConfig.headerOpacity : 0.0f, (16744447 & 8192) != 0 ? widgetConfig.opacity : 0.0f, (16744447 & 16384) != 0 ? widgetConfig.mondayFirst : false, (16744447 & 32768) != 0 ? widgetConfig.showRemark : false, (16744447 & 65536) != 0 ? widgetConfig.showBeginTime : false, (16744447 & 131072) != 0 ? widgetConfig.showEndTime : false, (16744447 & 262144) != 0 ? widgetConfig.showLunar : false, (16744447 & 524288) != 0 ? widgetConfig.showLine : false, (16744447 & 1048576) != 0 ? widgetConfig.showFestival : false, (16744447 & 2097152) != 0 ? widgetConfig.dateFontSize : null, (16744447 & 4194304) != 0 ? widgetConfig.workFontSize : null, (16744447 & 8388608) != 0 ? widgetConfig.timeFontSize : null));
                                    }
                                }, composer3, 6);
                                String darkHeaderTextColor = WidgetConfigViewKt.WidgetConfigView$lambda$1(state2).getDarkHeaderTextColor();
                                final WidgetConfigViewModel widgetConfigViewModel4 = widgetConfigViewModel2;
                                FormItemKt.ColorSelectItemView("暗黑标题文字色", darkHeaderTextColor, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$3.2
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
                                        WidgetConfigViewModel widgetConfigViewModel5 = widgetConfigViewModel4;
                                        WidgetConfig widgetConfig = widgetConfigViewModel5.getWidgetConfig();
                                        widgetConfigViewModel5.setWidgetConfig(widgetConfig.copy((16744447 & 1) != 0 ? widgetConfig.headerBg : null, (16744447 & 2) != 0 ? widgetConfig.headerTextColor : null, (16744447 & 4) != 0 ? widgetConfig.bgColor : null, (16744447 & 8) != 0 ? widgetConfig.textColor : null, (16744447 & 16) != 0 ? widgetConfig.tintColor : null, (16744447 & 32) != 0 ? widgetConfig.markColor : null, (16744447 & 64) != 0 ? widgetConfig.darkHeaderBg : null, (16744447 & 128) != 0 ? widgetConfig.darkHeaderTextColor : it, (16744447 & 256) != 0 ? widgetConfig.darkBgColor : null, (16744447 & 512) != 0 ? widgetConfig.darkTextColor : null, (16744447 & 1024) != 0 ? widgetConfig.darkTintColor : null, (16744447 & 2048) != 0 ? widgetConfig.darkMarkColor : null, (16744447 & 4096) != 0 ? widgetConfig.headerOpacity : 0.0f, (16744447 & 8192) != 0 ? widgetConfig.opacity : 0.0f, (16744447 & 16384) != 0 ? widgetConfig.mondayFirst : false, (16744447 & 32768) != 0 ? widgetConfig.showRemark : false, (16744447 & 65536) != 0 ? widgetConfig.showBeginTime : false, (16744447 & 131072) != 0 ? widgetConfig.showEndTime : false, (16744447 & 262144) != 0 ? widgetConfig.showLunar : false, (16744447 & 524288) != 0 ? widgetConfig.showLine : false, (16744447 & 1048576) != 0 ? widgetConfig.showFestival : false, (16744447 & 2097152) != 0 ? widgetConfig.dateFontSize : null, (16744447 & 4194304) != 0 ? widgetConfig.workFontSize : null, (16744447 & 8388608) != 0 ? widgetConfig.timeFontSize : null));
                                    }
                                }, composer3, 6);
                                String darkBgColor = WidgetConfigViewKt.WidgetConfigView$lambda$1(state2).getDarkBgColor();
                                final WidgetConfigViewModel widgetConfigViewModel5 = widgetConfigViewModel2;
                                FormItemKt.ColorSelectItemView("暗黑日历背景色", darkBgColor, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$3.3
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
                                        WidgetConfigViewModel widgetConfigViewModel6 = widgetConfigViewModel5;
                                        WidgetConfig widgetConfig = widgetConfigViewModel6.getWidgetConfig();
                                        widgetConfigViewModel6.setWidgetConfig(widgetConfig.copy((16744447 & 1) != 0 ? widgetConfig.headerBg : null, (16744447 & 2) != 0 ? widgetConfig.headerTextColor : null, (16744447 & 4) != 0 ? widgetConfig.bgColor : null, (16744447 & 8) != 0 ? widgetConfig.textColor : null, (16744447 & 16) != 0 ? widgetConfig.tintColor : null, (16744447 & 32) != 0 ? widgetConfig.markColor : null, (16744447 & 64) != 0 ? widgetConfig.darkHeaderBg : null, (16744447 & 128) != 0 ? widgetConfig.darkHeaderTextColor : null, (16744447 & 256) != 0 ? widgetConfig.darkBgColor : it, (16744447 & 512) != 0 ? widgetConfig.darkTextColor : null, (16744447 & 1024) != 0 ? widgetConfig.darkTintColor : null, (16744447 & 2048) != 0 ? widgetConfig.darkMarkColor : null, (16744447 & 4096) != 0 ? widgetConfig.headerOpacity : 0.0f, (16744447 & 8192) != 0 ? widgetConfig.opacity : 0.0f, (16744447 & 16384) != 0 ? widgetConfig.mondayFirst : false, (16744447 & 32768) != 0 ? widgetConfig.showRemark : false, (16744447 & 65536) != 0 ? widgetConfig.showBeginTime : false, (16744447 & 131072) != 0 ? widgetConfig.showEndTime : false, (16744447 & 262144) != 0 ? widgetConfig.showLunar : false, (16744447 & 524288) != 0 ? widgetConfig.showLine : false, (16744447 & 1048576) != 0 ? widgetConfig.showFestival : false, (16744447 & 2097152) != 0 ? widgetConfig.dateFontSize : null, (16744447 & 4194304) != 0 ? widgetConfig.workFontSize : null, (16744447 & 8388608) != 0 ? widgetConfig.timeFontSize : null));
                                    }
                                }, composer3, 6);
                                String darkTextColor = WidgetConfigViewKt.WidgetConfigView$lambda$1(state2).getDarkTextColor();
                                final WidgetConfigViewModel widgetConfigViewModel6 = widgetConfigViewModel2;
                                FormItemKt.ColorSelectItemView("暗黑日历文字色", darkTextColor, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$3.4
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
                                        WidgetConfigViewModel widgetConfigViewModel7 = widgetConfigViewModel6;
                                        WidgetConfig widgetConfig = widgetConfigViewModel7.getWidgetConfig();
                                        widgetConfigViewModel7.setWidgetConfig(widgetConfig.copy((16744447 & 1) != 0 ? widgetConfig.headerBg : null, (16744447 & 2) != 0 ? widgetConfig.headerTextColor : null, (16744447 & 4) != 0 ? widgetConfig.bgColor : null, (16744447 & 8) != 0 ? widgetConfig.textColor : null, (16744447 & 16) != 0 ? widgetConfig.tintColor : null, (16744447 & 32) != 0 ? widgetConfig.markColor : null, (16744447 & 64) != 0 ? widgetConfig.darkHeaderBg : null, (16744447 & 128) != 0 ? widgetConfig.darkHeaderTextColor : null, (16744447 & 256) != 0 ? widgetConfig.darkBgColor : null, (16744447 & 512) != 0 ? widgetConfig.darkTextColor : it, (16744447 & 1024) != 0 ? widgetConfig.darkTintColor : null, (16744447 & 2048) != 0 ? widgetConfig.darkMarkColor : null, (16744447 & 4096) != 0 ? widgetConfig.headerOpacity : 0.0f, (16744447 & 8192) != 0 ? widgetConfig.opacity : 0.0f, (16744447 & 16384) != 0 ? widgetConfig.mondayFirst : false, (16744447 & 32768) != 0 ? widgetConfig.showRemark : false, (16744447 & 65536) != 0 ? widgetConfig.showBeginTime : false, (16744447 & 131072) != 0 ? widgetConfig.showEndTime : false, (16744447 & 262144) != 0 ? widgetConfig.showLunar : false, (16744447 & 524288) != 0 ? widgetConfig.showLine : false, (16744447 & 1048576) != 0 ? widgetConfig.showFestival : false, (16744447 & 2097152) != 0 ? widgetConfig.dateFontSize : null, (16744447 & 4194304) != 0 ? widgetConfig.workFontSize : null, (16744447 & 8388608) != 0 ? widgetConfig.timeFontSize : null));
                                    }
                                }, composer3, 6);
                                String darkTintColor = WidgetConfigViewKt.WidgetConfigView$lambda$1(state2).getDarkTintColor();
                                final WidgetConfigViewModel widgetConfigViewModel7 = widgetConfigViewModel2;
                                FormItemKt.ColorSelectItemView("暗黑农历颜色", darkTintColor, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$3.5
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
                                        WidgetConfigViewModel widgetConfigViewModel8 = widgetConfigViewModel7;
                                        WidgetConfig widgetConfig = widgetConfigViewModel8.getWidgetConfig();
                                        widgetConfigViewModel8.setWidgetConfig(widgetConfig.copy((16744447 & 1) != 0 ? widgetConfig.headerBg : null, (16744447 & 2) != 0 ? widgetConfig.headerTextColor : null, (16744447 & 4) != 0 ? widgetConfig.bgColor : null, (16744447 & 8) != 0 ? widgetConfig.textColor : null, (16744447 & 16) != 0 ? widgetConfig.tintColor : null, (16744447 & 32) != 0 ? widgetConfig.markColor : null, (16744447 & 64) != 0 ? widgetConfig.darkHeaderBg : null, (16744447 & 128) != 0 ? widgetConfig.darkHeaderTextColor : null, (16744447 & 256) != 0 ? widgetConfig.darkBgColor : null, (16744447 & 512) != 0 ? widgetConfig.darkTextColor : null, (16744447 & 1024) != 0 ? widgetConfig.darkTintColor : it, (16744447 & 2048) != 0 ? widgetConfig.darkMarkColor : null, (16744447 & 4096) != 0 ? widgetConfig.headerOpacity : 0.0f, (16744447 & 8192) != 0 ? widgetConfig.opacity : 0.0f, (16744447 & 16384) != 0 ? widgetConfig.mondayFirst : false, (16744447 & 32768) != 0 ? widgetConfig.showRemark : false, (16744447 & 65536) != 0 ? widgetConfig.showBeginTime : false, (16744447 & 131072) != 0 ? widgetConfig.showEndTime : false, (16744447 & 262144) != 0 ? widgetConfig.showLunar : false, (16744447 & 524288) != 0 ? widgetConfig.showLine : false, (16744447 & 1048576) != 0 ? widgetConfig.showFestival : false, (16744447 & 2097152) != 0 ? widgetConfig.dateFontSize : null, (16744447 & 4194304) != 0 ? widgetConfig.workFontSize : null, (16744447 & 8388608) != 0 ? widgetConfig.timeFontSize : null));
                                    }
                                }, composer3, 6);
                                String darkMarkColor = WidgetConfigViewKt.WidgetConfigView$lambda$1(state2).getDarkMarkColor();
                                final WidgetConfigViewModel widgetConfigViewModel8 = widgetConfigViewModel2;
                                FormItemKt.ColorSelectItemView("暗黑备注颜色", darkMarkColor, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$3.6
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
                                        WidgetConfigViewModel widgetConfigViewModel9 = widgetConfigViewModel8;
                                        WidgetConfig widgetConfig = widgetConfigViewModel9.getWidgetConfig();
                                        widgetConfigViewModel9.setWidgetConfig(widgetConfig.copy((16744447 & 1) != 0 ? widgetConfig.headerBg : null, (16744447 & 2) != 0 ? widgetConfig.headerTextColor : null, (16744447 & 4) != 0 ? widgetConfig.bgColor : null, (16744447 & 8) != 0 ? widgetConfig.textColor : null, (16744447 & 16) != 0 ? widgetConfig.tintColor : null, (16744447 & 32) != 0 ? widgetConfig.markColor : null, (16744447 & 64) != 0 ? widgetConfig.darkHeaderBg : null, (16744447 & 128) != 0 ? widgetConfig.darkHeaderTextColor : null, (16744447 & 256) != 0 ? widgetConfig.darkBgColor : null, (16744447 & 512) != 0 ? widgetConfig.darkTextColor : null, (16744447 & 1024) != 0 ? widgetConfig.darkTintColor : null, (16744447 & 2048) != 0 ? widgetConfig.darkMarkColor : it, (16744447 & 4096) != 0 ? widgetConfig.headerOpacity : 0.0f, (16744447 & 8192) != 0 ? widgetConfig.opacity : 0.0f, (16744447 & 16384) != 0 ? widgetConfig.mondayFirst : false, (16744447 & 32768) != 0 ? widgetConfig.showRemark : false, (16744447 & 65536) != 0 ? widgetConfig.showBeginTime : false, (16744447 & 131072) != 0 ? widgetConfig.showEndTime : false, (16744447 & 262144) != 0 ? widgetConfig.showLunar : false, (16744447 & 524288) != 0 ? widgetConfig.showLine : false, (16744447 & 1048576) != 0 ? widgetConfig.showFestival : false, (16744447 & 2097152) != 0 ? widgetConfig.dateFontSize : null, (16744447 & 4194304) != 0 ? widgetConfig.workFontSize : null, (16744447 & 8388608) != 0 ? widgetConfig.timeFontSize : null));
                                    }
                                }, composer3, 6);
                                final WidgetConfigViewModel widgetConfigViewModel9 = widgetConfigViewModel2;
                                BoxViewKt.m6876CenterRowdjqsMU(null, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer3, 791865845, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$3.7
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
                                                ComposerKt.traceEventStart(791865845, i4, -1, "cn.jianyun.workplan.widget.config.WidgetConfigView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WidgetConfigView.kt:152)");
                                            }
                                            long sp = TextUnitKt.getSp(12);
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            final WidgetConfigViewModel widgetConfigViewModel10 = widgetConfigViewModel9;
                                            TextKt.m2471Text4IGK_g("恢复默认配色", ClickableKt.m249clickableXHw0xAI$default(companion2, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt.WidgetConfigView.1.1.3.7.1
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
                                                    widgetConfigViewModel10.setWidgetConfig(new DefaultWidgetConfig(null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 16383, null).toWidgetConfig());
                                                }
                                            }, 7, null), 0L, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3078, 0, 131060);
                                            CommonUIKt.m6944BlankkHDZbjc(0.0f, composer4, 0, 1);
                                            long sp2 = TextUnitKt.getSp(12);
                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                            final WidgetConfigViewModel widgetConfigViewModel11 = widgetConfigViewModel9;
                                            TextKt.m2471Text4IGK_g("白色字体", ClickableKt.m249clickableXHw0xAI$default(companion3, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt.WidgetConfigView.1.1.3.7.2
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
                                                    WidgetConfigViewModel widgetConfigViewModel12 = widgetConfigViewModel11;
                                                    WidgetConfig widgetConfig = widgetConfigViewModel12.getWidgetConfig();
                                                    widgetConfigViewModel12.setWidgetConfig(widgetConfig.copy((16744447 & 1) != 0 ? widgetConfig.headerBg : null, (16744447 & 2) != 0 ? widgetConfig.headerTextColor : "#FFFFFF", (16744447 & 4) != 0 ? widgetConfig.bgColor : null, (16744447 & 8) != 0 ? widgetConfig.textColor : "#FFFFFF", (16744447 & 16) != 0 ? widgetConfig.tintColor : "#FFFFFF", (16744447 & 32) != 0 ? widgetConfig.markColor : "#FFFFFF", (16744447 & 64) != 0 ? widgetConfig.darkHeaderBg : null, (16744447 & 128) != 0 ? widgetConfig.darkHeaderTextColor : "#FFFFFF", (16744447 & 256) != 0 ? widgetConfig.darkBgColor : null, (16744447 & 512) != 0 ? widgetConfig.darkTextColor : "#FFFFFF", (16744447 & 1024) != 0 ? widgetConfig.darkTintColor : "#FFFFFF", (16744447 & 2048) != 0 ? widgetConfig.darkMarkColor : "#FFFFFF", (16744447 & 4096) != 0 ? widgetConfig.headerOpacity : 0.0f, (16744447 & 8192) != 0 ? widgetConfig.opacity : 0.0f, (16744447 & 16384) != 0 ? widgetConfig.mondayFirst : false, (16744447 & 32768) != 0 ? widgetConfig.showRemark : false, (16744447 & 65536) != 0 ? widgetConfig.showBeginTime : false, (16744447 & 131072) != 0 ? widgetConfig.showEndTime : false, (16744447 & 262144) != 0 ? widgetConfig.showLunar : false, (16744447 & 524288) != 0 ? widgetConfig.showLine : false, (16744447 & 1048576) != 0 ? widgetConfig.showFestival : false, (16744447 & 2097152) != 0 ? widgetConfig.dateFontSize : null, (16744447 & 4194304) != 0 ? widgetConfig.workFontSize : null, (16744447 & 8388608) != 0 ? widgetConfig.timeFontSize : null));
                                                }
                                            }, 7, null), 0L, sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3078, 0, 131060);
                                            CommonUIKt.m6944BlankkHDZbjc(0.0f, composer4, 0, 1);
                                            long sp3 = TextUnitKt.getSp(12);
                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                            final WidgetConfigViewModel widgetConfigViewModel12 = widgetConfigViewModel9;
                                            TextKt.m2471Text4IGK_g("黑色字体", ClickableKt.m249clickableXHw0xAI$default(companion4, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt.WidgetConfigView.1.1.3.7.3
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
                                                    WidgetConfigViewModel widgetConfigViewModel13 = widgetConfigViewModel12;
                                                    WidgetConfig widgetConfig = widgetConfigViewModel13.getWidgetConfig();
                                                    widgetConfigViewModel13.setWidgetConfig(widgetConfig.copy((16744447 & 1) != 0 ? widgetConfig.headerBg : null, (16744447 & 2) != 0 ? widgetConfig.headerTextColor : "#111111", (16744447 & 4) != 0 ? widgetConfig.bgColor : null, (16744447 & 8) != 0 ? widgetConfig.textColor : "#111111", (16744447 & 16) != 0 ? widgetConfig.tintColor : "#111111", (16744447 & 32) != 0 ? widgetConfig.markColor : "#111111", (16744447 & 64) != 0 ? widgetConfig.darkHeaderBg : null, (16744447 & 128) != 0 ? widgetConfig.darkHeaderTextColor : "#111111", (16744447 & 256) != 0 ? widgetConfig.darkBgColor : null, (16744447 & 512) != 0 ? widgetConfig.darkTextColor : "#111111", (16744447 & 1024) != 0 ? widgetConfig.darkTintColor : "#111111", (16744447 & 2048) != 0 ? widgetConfig.darkMarkColor : "#111111", (16744447 & 4096) != 0 ? widgetConfig.headerOpacity : 0.0f, (16744447 & 8192) != 0 ? widgetConfig.opacity : 0.0f, (16744447 & 16384) != 0 ? widgetConfig.mondayFirst : false, (16744447 & 32768) != 0 ? widgetConfig.showRemark : false, (16744447 & 65536) != 0 ? widgetConfig.showBeginTime : false, (16744447 & 131072) != 0 ? widgetConfig.showEndTime : false, (16744447 & 262144) != 0 ? widgetConfig.showLunar : false, (16744447 & 524288) != 0 ? widgetConfig.showLine : false, (16744447 & 1048576) != 0 ? widgetConfig.showFestival : false, (16744447 & 2097152) != 0 ? widgetConfig.dateFontSize : null, (16744447 & 4194304) != 0 ? widgetConfig.workFontSize : null, (16744447 & 8388608) != 0 ? widgetConfig.timeFontSize : null));
                                                }
                                            }, 7, null), 0L, sp3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3078, 0, 131060);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, 3072, 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 100663296, 255);
                    ButtonViewKt.LongOkButton("保存并刷新桌面小组件", new Function0<Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$4
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
                            widgetConfigViewModel2.save();
                        }
                    }, composer2, 6, 0);
                    composer2.startReplaceableGroup(-1110199148);
                    if (Build.VERSION.SDK_INT >= 34) {
                        CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                        context2 = context3;
                        ButtonViewKt.m6815LongCancelButtonvHmCa5Y("开启闹钟权限，可优化小组件更新", 0.0f, 0L, new Function0<Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$5
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
                                context2.startActivity(new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM"));
                            }
                        }, composer2, 6, 6);
                    } else {
                        context2 = context3;
                    }
                    composer2.endReplaceableGroup();
                    CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                    GroupViewKt.m6850GroupViewfIyqwc(null, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer2, 2143011741, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$6
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
                                    ComposerKt.traceEventStart(2143011741, i3, -1, "cn.jianyun.workplan.widget.config.WidgetConfigView.<anonymous>.<anonymous>.<anonymous> (WidgetConfigView.kt:198)");
                                }
                                GroupViewKt.m6847BlockViewG5g98fw("该功能只针对部分厂商设备，如果你的设备点击后仍然没有桌面小组件，请在手机桌面自行添加小组件", 0.0f, TextUnitKt.getSp(13), 0L, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | 0).getTertiary(), new Function0<Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$6.1
                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }
                                }, composer3, 196998, 10);
                                final WidgetConfigViewModel widgetConfigViewModel3 = widgetConfigViewModel2;
                                final Context context4 = context2;
                                ButtonViewKt.LongPrivateButton("添加一个小组件到桌面", new Function0<Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$6.2
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
                                        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(widgetConfigViewModel3), null, null, new AnonymousClass1(context4, null), 3, null);
                                    }

                                    /* JADX INFO: renamed from: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$6$2$1, reason: invalid class name */
                                    /* JADX INFO: compiled from: WidgetConfigView.kt */
                                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                    @DebugMetadata(c = "cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$6$2$1", f = "WidgetConfigView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                                    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        final /* synthetic */ Context $context;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        AnonymousClass1(Context context, Continuation<? super AnonymousClass1> continuation) {
                                            super(2, continuation);
                                            this.$context = context;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                            return new AnonymousClass1(this.$context, continuation);
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
                                                Object systemService = this.$context.getSystemService((Class<Object>) AppWidgetManager.class);
                                                Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService…idgetManager::class.java)");
                                                AppWidgetManager appWidgetManager = (AppWidgetManager) systemService;
                                                ComponentName componentName = new ComponentName(this.$context, (Class<?>) MyAppWidgetReceiver.class);
                                                if (appWidgetManager.isRequestPinAppWidgetSupported()) {
                                                    Intent component = new Intent().setComponent(componentName);
                                                    Intrinsics.checkNotNullExpressionValue(component, "Intent()\n               ….setComponent(myProvider)");
                                                    try {
                                                        appWidgetManager.requestPinAppWidget(componentName, null, PendingIntent.getBroadcast(this.$context, 0, component, 67108864));
                                                    } catch (Exception unused) {
                                                    }
                                                }
                                                return Unit.INSTANCE;
                                            }
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                    }
                                }, composer3, 6, 0);
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
                    GroupViewKt.m6847BlockViewG5g98fw("温馨提示:\n1.桌面小组件可以长按后拖拽改变高度\n2.点击小组件标题栏「本月」文字，可以强制刷新小组件数据\n3.如果小组件一直不更新，试试删除后重新添加\n4.由于安卓厂商太多，小组件添加形式各有差异，请自行探索自己的设备如何添加桌面小组件（部分设备在小组件添加页面最底部有一行很小的字，点击进去就可以看到了）", 0.0f, 0L, TextUnitKt.getSp(11), 0L, new Function0<Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt$WidgetConfigView$1$1$7
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }
                    }, composer2, 199686, 22);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.widget.config.WidgetConfigViewKt.WidgetConfigView.2
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
                WidgetConfigViewKt.WidgetConfigView(navHostController, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WidgetConfig WidgetConfigView$lambda$1(State<WidgetConfig> state) {
        return state.getValue();
    }
}