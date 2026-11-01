package cn.jianyun.workplan.module.base.views.webdav;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import androidx.core.os.BundleKt;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavHostController;
import cn.jianyun.workplan.main.Router;
import cn.jianyun.workplan.main.RouterKt;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.module.base.model.WebDAVUser;
import cn.jianyun.workplan.module.base.router.WebDAVRouter;
import cn.jianyun.workplan.module.base.vm.WebDAVUserViewModel;
import cn.jianyun.workplan.ui.component.form.ButtonViewKt;
import cn.jianyun.workplan.ui.component.form.GroupViewKt;
import cn.jianyun.workplan.ui.component.nav.BoxViewKt;
import cn.jianyun.workplan.ui.component.nav.HeaderViewKt;
import cn.jianyun.workplan.ui.component.nav.IconFont;
import cn.jianyun.workplan.ui.component.nav.IconViewKt;
import cn.jianyun.workplan.ui.component.nav.NavItemViewKt;
import cn.jianyun.workplan.ui.component.nav.PartTitleViewKt;
import cn.jianyun.workplan.ui.theme.ColorKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
import cn.jianyun.workplan.util.MyWebdavTool;
import com.alibaba.fastjson2.JSON;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WebDAVUserManageView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"WebDAVUserManageView", "", "navHostController", "Landroidx/navigation/NavHostController;", "(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class WebDAVUserManageViewKt {
    public static final void WebDAVUserManageView(final NavHostController navHostController, Composer composer, final int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        Composer composerStartRestartGroup = composer.startRestartGroup(1266794472);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(WebDAVUserManageView)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1266794472, i, -1, "cn.jianyun.workplan.module.base.views.webdav.WebDAVUserManageView (WebDAVUserManageView.kt:39)");
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
        ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) WebDAVUserViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        final WebDAVUserViewModel webDAVUserViewModel = (WebDAVUserViewModel) viewModel;
        webDAVUserViewModel.tryReload();
        HeaderViewKt.PageView(navHostController, "云备份账号", ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1623871861, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserManageViewKt.WebDAVUserManageView.1
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
                        ComposerKt.traceEventStart(-1623871861, i2, -1, "cn.jianyun.workplan.module.base.views.webdav.WebDAVUserManageView.<anonymous> (WebDAVUserManageView.kt:43)");
                    }
                    final WebDAVUserViewModel webDAVUserViewModel2 = webDAVUserViewModel;
                    BoxViewKt.m6888HeaderIcon53ZIcWk(IconFont.info2, 0.0f, 0L, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserManageViewKt.WebDAVUserManageView.1.1
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
                            webDAVUserViewModel2.setFormType(new FormType("doc", null, null, 6, null));
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
        }), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1779852403, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserManageViewKt.WebDAVUserManageView.2
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
                        ComposerKt.traceEventStart(-1779852403, i2, -1, "cn.jianyun.workplan.module.base.views.webdav.WebDAVUserManageView.<anonymous> (WebDAVUserManageView.kt:47)");
                    }
                    composer2.startReplaceableGroup(1880228986);
                    List<WebDAVUser> datalist = webDAVUserViewModel.getDatalist();
                    final NavHostController navHostController2 = navHostController;
                    for (final WebDAVUser webDAVUser : datalist) {
                        GroupViewKt.m6850GroupViewfIyqwc(ClickableKt.m249clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserManageViewKt$WebDAVUserManageView$2$1$1
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
                                RouterKt.navigateTo$default(navHostController2, WebDAVRouter.UserEdit.INSTANCE.getRoute(), BundleKt.bundleOf(TuplesKt.to("model", JSON.toJSONString(webDAVUser))), null, null, 12, null);
                            }
                        }, 7, null), false, false, 0.0f, 0.0f, 0.0f, Dp.m6097constructorimpl(15), 0.0f, ComposableLambdaKt.composableLambda(composer2, -1053738965, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserManageViewKt$WebDAVUserManageView$2$1$2
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
                                        ComposerKt.traceEventStart(-1053738965, i3, -1, "cn.jianyun.workplan.module.base.views.webdav.WebDAVUserManageView.<anonymous>.<anonymous>.<anonymous> (WebDAVUserManageView.kt:51)");
                                    }
                                    final WebDAVUser webDAVUser2 = webDAVUser;
                                    final NavHostController navHostController3 = navHostController2;
                                    BoxViewKt.m6895TwoColumnViewdjqsMU(null, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer3, 1064768740, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserManageViewKt$WebDAVUserManageView$2$1$2.1
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
                                                    ComposerKt.traceEventStart(1064768740, i4, -1, "cn.jianyun.workplan.module.base.views.webdav.WebDAVUserManageView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WebDAVUserManageView.kt:52)");
                                                }
                                                final WebDAVUser webDAVUser3 = webDAVUser2;
                                                composer4.startReplaceableGroup(-483455358);
                                                ComposerKt.sourceInformation(composer4, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                                composer4.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer4, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer4);
                                                Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer4)), composer4, 0);
                                                composer4.startReplaceableGroup(2058660585);
                                                ComposerKt.sourceInformationMarkerStart(composer4, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                BoxViewKt.m6898VerticalRowdjqsMU(null, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer4, -1731238216, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserManageViewKt$WebDAVUserManageView$2$1$2$1$1$1
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
                                                                ComposerKt.traceEventStart(-1731238216, i5, -1, "cn.jianyun.workplan.module.base.views.webdav.WebDAVUserManageView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WebDAVUserManageView.kt:54)");
                                                            }
                                                            NavItemViewKt.m6911AppLogoVieworJrPs(Dp.m6097constructorimpl(16), MyWebdavTool.INSTANCE.getWebDAVIcon(webDAVUser3.getPlatform()), composer5, 6, 0);
                                                            CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(2), composer5, 6, 0);
                                                            TextKt.m2471Text4IGK_g(webDAVUser3.getPlatform(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 0, 0, 131070);
                                                            CommonUIKt.m6944BlankkHDZbjc(0.0f, composer5, 0, 1);
                                                            PartTitleViewKt.m6915TagViewo4cevVk((String) CommonToolKt.ifv(webDAVUser3.getBind(), "已连接", "已断开"), 0L, false, 0.0f, false, ((Color) CommonToolKt.ifv(webDAVUser3.getBind(), Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()))).m3765unboximpl(), false, null, composer5, 0, MediaPlayer.MEDIA_PLAYER_OPTION_AUDIO_DECODER_ERROR);
                                                            composer5.startReplaceableGroup(-1060011062);
                                                            if (webDAVUser3.getMasterNode()) {
                                                                CommonUIKt.m6944BlankkHDZbjc(0.0f, composer5, 0, 1);
                                                                PartTitleViewKt.m6915TagViewo4cevVk("主节点", 0L, false, 0.0f, false, 0L, true, null, composer5, 1572870, 190);
                                                            }
                                                            composer5.endReplaceableGroup();
                                                            if (webDAVUser3.getCloud()) {
                                                                CommonUIKt.m6944BlankkHDZbjc(0.0f, composer5, 0, 1);
                                                                IconViewKt.m6909IconViewRidXid8(IconFont.cloud2, TextUnitKt.getSp(12), Color.INSTANCE.m3785getGray0d7_KjU(), false, null, composer5, 438, 24);
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer5.skipToGroupEnd();
                                                    }
                                                }), composer4, 3072, 7);
                                                TextKt.m2471Text4IGK_g(webDAVUser3.getUsername(), (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3072, 0, 131062);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                composer4.endReplaceableGroup();
                                                composer4.endNode();
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                long primaryColor = ColorKt.getPrimaryColor();
                                                final NavHostController navHostController4 = navHostController3;
                                                final WebDAVUser webDAVUser4 = webDAVUser2;
                                                PartTitleViewKt.m6915TagViewo4cevVk("查看", 0L, false, 0.0f, true, primaryColor, false, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserManageViewKt.WebDAVUserManageView.2.1.2.1.2
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
                                                        RouterKt.navigateTo$default(navHostController4, Router.WebDAV.INSTANCE.getRoute(), BundleKt.bundleOf(TuplesKt.to("model", JSON.toJSONString(webDAVUser4))), null, null, 12, null);
                                                    }
                                                }, composer4, 221190, 78);
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
                        }), composer2, 102236160, 190);
                    }
                    composer2.endReplaceableGroup();
                    final NavHostController navHostController3 = navHostController;
                    ButtonViewKt.m6815LongCancelButtonvHmCa5Y("添加", 0.0f, 0L, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserManageViewKt.WebDAVUserManageView.2.2
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
                            RouterKt.navigateTo$default(navHostController3, WebDAVRouter.UserEdit.INSTANCE.getRoute(), BundleKt.bundleOf(TuplesKt.to("model", JSON.toJSONString(new WebDAVUser(null, null, null, null, null, null, null, false, false, 0, false, null, false, 8191, null)))), null, null, 12, null);
                        }
                    }, composer2, 6, 6);
                    if (webDAVUserViewModel.getFormType().isForm("doc")) {
                        WebDAVUserDocViewKt.WebDAVUserDocView(webDAVUserViewModel, composer2, 8);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 25016, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserManageViewKt.WebDAVUserManageView.3
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
                WebDAVUserManageViewKt.WebDAVUserManageView(navHostController, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }
}