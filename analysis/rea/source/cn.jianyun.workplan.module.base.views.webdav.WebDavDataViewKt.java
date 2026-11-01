package cn.jianyun.workplan.module.base.views.webdav;

import android.os.Bundle;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavHostController;
import cn.jianyun.workplan.module.base.model.WebDAVUser;
import cn.jianyun.workplan.ui.component.form.GroupViewKt;
import cn.jianyun.workplan.ui.component.nav.BoxViewKt;
import cn.jianyun.workplan.ui.component.nav.HeaderViewKt;
import cn.jianyun.workplan.ui.component.nav.IconFont;
import cn.jianyun.workplan.ui.component.nav.IconViewKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
import cn.jianyun.workplan.util.MyWebdavTool;
import com.alibaba.fastjson2.JSON;
import com.thegrizzlylabs.sardineandroid.DavResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: WebDavDataView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"WebDavDataView", "", "navHostController", "Landroidx/navigation/NavHostController;", "arguments", "Landroid/os/Bundle;", "(Landroidx/navigation/NavHostController;Landroid/os/Bundle;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class WebDavDataViewKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, androidx.lifecycle.ViewModel] */
    public static final void WebDavDataView(final NavHostController navHostController, final Bundle bundle, Composer composer, final int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        Composer composerStartRestartGroup = composer.startRestartGroup(-988512184);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(WebDavDataView)P(1)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-988512184, i, -1, "cn.jianyun.workplan.module.base.views.webdav.WebDavDataView (WebDavDataView.kt:47)");
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
        ?? ViewModel = ViewModelKt.viewModel((Class<??>) WebDavViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        objectRef.element = ViewModel;
        WebDAVUser editInfo = (WebDAVUser) JSON.parseObject(bundle != null ? bundle.getString("model") : null, WebDAVUser.class);
        WebDavViewModel webDavViewModel = (WebDavViewModel) objectRef.element;
        Intrinsics.checkNotNullExpressionValue(editInfo, "editInfo");
        webDavViewModel.initModel(editInfo);
        HeaderViewKt.PageView(navHostController, "我的文件", null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDavDataViewKt.WebDavDataView.1
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
                if (objectRef.element.isRootPath()) {
                    CommonToolKt.goBack$default(navHostController, null, 2, null);
                } else {
                    objectRef.element.loadData(MyWebdavTool.INSTANCE.getParentPath(objectRef.element.getCurrentPath()));
                }
            }
        }, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1084305795, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDavDataViewKt.WebDavDataView.2
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
                        ComposerKt.traceEventStart(1084305795, i2, -1, "cn.jianyun.workplan.module.base.views.webdav.WebDavDataView.<anonymous> (WebDavDataView.kt:61)");
                    }
                    BoxViewKt.m6894SmallTipTextEx1dzz4(String.valueOf(objectRef.element.getCurrentPath()), 0L, 0.0f, 0.0f, null, null, composer2, 0, 62);
                    if (Intrinsics.areEqual(objectRef.element.getMsg(), "")) {
                        composer2.startReplaceableGroup(1318873914);
                        List<DavResource> files = objectRef.element.getFiles();
                        final Ref.ObjectRef<WebDavViewModel> objectRef2 = objectRef;
                        for (final DavResource davResource : files) {
                            GroupViewKt.m6850GroupViewfIyqwc(ClickableKt.m249clickableXHw0xAI$default(Modifier.INSTANCE, davResource.isDirectory(), null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDavDataViewKt$WebDavDataView$2$1$1
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
                                    if (Intrinsics.areEqual(davResource.getPath(), objectRef2.element.getParentPath())) {
                                        WebDavViewModel webDavViewModel2 = objectRef2.element;
                                        MyWebdavTool myWebdavTool = MyWebdavTool.INSTANCE;
                                        String path = davResource.getPath();
                                        Intrinsics.checkNotNullExpressionValue(path, "it.path");
                                        webDavViewModel2.loadData(myWebdavTool.getParentPath(path));
                                        return;
                                    }
                                    WebDavViewModel webDavViewModel3 = objectRef2.element;
                                    String path2 = davResource.getPath();
                                    Intrinsics.checkNotNullExpressionValue(path2, "it.path");
                                    webDavViewModel3.loadData(path2);
                                }
                            }, 6, null), false, false, 0.0f, 0.0f, 0.0f, Dp.m6097constructorimpl(15), 0.0f, ComposableLambdaKt.composableLambda(composer2, -290207321, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDavDataViewKt$WebDavDataView$2$1$2
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
                                            ComposerKt.traceEventStart(-290207321, i3, -1, "cn.jianyun.workplan.module.base.views.webdav.WebDavDataView.<anonymous>.<anonymous>.<anonymous> (WebDavDataView.kt:72)");
                                        }
                                        if (Intrinsics.areEqual(davResource.getPath(), objectRef2.element.getParentPath())) {
                                            composer3.startReplaceableGroup(1239707613);
                                            BoxViewKt.m6898VerticalRowdjqsMU(null, 0.0f, 0.0f, ComposableSingletons$WebDavDataViewKt.INSTANCE.m6712getLambda1$app_release(), composer3, 3072, 7);
                                            String path = davResource.getPath();
                                            Intrinsics.checkNotNullExpressionValue(path, "it.path");
                                            BoxViewKt.m6892OnlySmallTipText8TGbp0M(path, 0, 0L, 0L, 0.0f, null, composer3, 0, 62);
                                            composer3.endReplaceableGroup();
                                        } else {
                                            composer3.startReplaceableGroup(1239707976);
                                            final DavResource davResource2 = davResource;
                                            BoxViewKt.m6898VerticalRowdjqsMU(null, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer3, 276366337, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDavDataViewKt$WebDavDataView$2$1$2.1
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
                                                            ComposerKt.traceEventStart(276366337, i4, -1, "cn.jianyun.workplan.module.base.views.webdav.WebDavDataView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WebDavDataView.kt:82)");
                                                        }
                                                        IconViewKt.m6909IconViewRidXid8(((Number) CommonToolKt.ifv(davResource2.isDirectory(), Integer.valueOf(IconFont.folder), Integer.valueOf(IconFont.file))).intValue(), TextUnitKt.getSp(16), CommonToolKt.focusColor(davResource2.isDirectory(), null, composer4, 0, 2), false, null, composer4, 48, 24);
                                                        CommonUIKt.m6944BlankkHDZbjc(0.0f, composer4, 0, 1);
                                                        String name = davResource2.getName();
                                                        Intrinsics.checkNotNullExpressionValue(name, "it.name");
                                                        IconViewKt.m6908FocusTexta5Y_hM(name, davResource2.isDirectory(), 0L, composer4, 0, 4);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer4.skipToGroupEnd();
                                                }
                                            }), composer3, 3072, 7);
                                            String path2 = davResource.getPath();
                                            Intrinsics.checkNotNullExpressionValue(path2, "it.path");
                                            BoxViewKt.m6892OnlySmallTipText8TGbp0M(path2, 0, 0L, 0L, 0.0f, null, composer3, 0, 62);
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
                            }), composer2, 102236160, 190);
                        }
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(1318875625);
                        BoxViewKt.m6880EmptyDataView6BXD4ec(objectRef.element.getMsg(), 0L, 0L, null, composer2, 0, 14);
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
        }), composerStartRestartGroup, 24632, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDavDataViewKt.WebDavDataView.3
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
                WebDavDataViewKt.WebDavDataView(navHostController, bundle, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }
}