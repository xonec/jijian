package cn.jianyun.workplan.module.base.views.webdav;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavHostController;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.model.FormTypeKt;
import cn.jianyun.workplan.module.base.model.WebDAVUser;
import cn.jianyun.workplan.module.base.vm.WebDAVUserViewModel;
import cn.jianyun.workplan.ui.component.form.ButtonViewKt;
import cn.jianyun.workplan.ui.component.form.DialogViewKt;
import cn.jianyun.workplan.ui.component.form.FormItemKt;
import cn.jianyun.workplan.ui.component.form.GroupViewKt;
import cn.jianyun.workplan.ui.component.nav.BoxViewKt;
import cn.jianyun.workplan.ui.component.nav.HeaderViewKt;
import cn.jianyun.workplan.ui.component.nav.IconFont;
import cn.jianyun.workplan.ui.component.nav.PartTitleViewKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
import cn.jianyun.workplan.util.MyEncryptTool;
import cn.jianyun.workplan.util.MyWebdavTool;
import cn.jianyun.workplan.util.SelectDO;
import cn.jianyun.workplan.util.SelectUtil;
import com.alibaba.fastjson2.JSON;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.apache.poi.hssf.record.UnknownRecord;

/* JADX INFO: compiled from: WebDAVUserEditView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"WebDAVUserEditView", "", "navHostController", "Landroidx/navigation/NavHostController;", "arguments", "Landroid/os/Bundle;", "(Landroidx/navigation/NavHostController;Landroid/os/Bundle;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class WebDAVUserEditViewKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, androidx.lifecycle.ViewModel] */
    public static final void WebDAVUserEditView(final NavHostController navHostController, final Bundle bundle, Composer composer, final int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        Composer composerStartRestartGroup = composer.startRestartGroup(1066418472);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(WebDAVUserEditView)P(1)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1066418472, i, -1, "cn.jianyun.workplan.module.base.views.webdav.WebDAVUserEditView (WebDAVUserEditView.kt:34)");
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
        ?? ViewModel = ViewModelKt.viewModel((Class<??>) WebDAVUserViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        objectRef.element = ViewModel;
        WebDAVUser editInfo = (WebDAVUser) JSON.parseObject(bundle != null ? bundle.getString("model") : null, WebDAVUser.class);
        WebDAVUserViewModel webDAVUserViewModel = (WebDAVUserViewModel) objectRef.element;
        Intrinsics.checkNotNullExpressionValue(editInfo, "editInfo");
        webDAVUserViewModel.initModel(editInfo);
        HeaderViewKt.PageView(navHostController, CommonToolKt.ifv(Intrinsics.areEqual(editInfo.getUuid(), ""), "添加", "编辑") + "云备份", ComposableLambdaKt.composableLambda(composerStartRestartGroup, -680023131, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserEditViewKt.WebDAVUserEditView.1
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
                        ComposerKt.traceEventStart(-680023131, i2, -1, "cn.jianyun.workplan.module.base.views.webdav.WebDAVUserEditView.<anonymous> (WebDAVUserEditView.kt:44)");
                    }
                    final Ref.ObjectRef<WebDAVUserViewModel> objectRef2 = objectRef;
                    BoxViewKt.m6888HeaderIcon53ZIcWk(IconFont.info2, 0.0f, 0L, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserEditViewKt.WebDAVUserEditView.1.1
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
                            objectRef2.element.setFormType(new FormType("doc", null, null, 6, null));
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
        }), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -341735581, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserEditViewKt.WebDAVUserEditView.2
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
                        ComposerKt.traceEventStart(-341735581, i2, -1, "cn.jianyun.workplan.module.base.views.webdav.WebDAVUserEditView.<anonymous> (WebDAVUserEditView.kt:48)");
                    }
                    BoxViewKt.m6891LeadingHintViewRuDwNsA("选择云备份平台", 0.0f, 0L, 0L, null, composer2, 6, 30);
                    final Ref.ObjectRef<WebDAVUserViewModel> objectRef2 = objectRef;
                    GroupViewKt.m6850GroupViewfIyqwc(null, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer2, -1509501390, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserEditViewKt.WebDAVUserEditView.2.1
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
                                    ComposerKt.traceEventStart(-1509501390, i3, -1, "cn.jianyun.workplan.module.base.views.webdav.WebDAVUserEditView.<anonymous>.<anonymous> (WebDAVUserEditView.kt:51)");
                                }
                                CommonUIKt.m6944BlankkHDZbjc(0.0f, composer3, 0, 1);
                                String platform = objectRef2.element.getEditItem().getPlatform();
                                List<SelectDO> listInitSingleValues = SelectUtil.initSingleValues("坚果云", "GoogleDrive", "OneDrive", "DropBox", "Koofr");
                                Intrinsics.checkNotNullExpressionValue(listInitSingleValues, "initSingleValues(\"坚果云\",\"…ive\", \"DropBox\", \"Koofr\")");
                                final Ref.ObjectRef<WebDAVUserViewModel> objectRef3 = objectRef2;
                                PartTitleViewKt.m6913FlowTagView1tP8Re8(platform, false, true, true, listInitSingleValues, 0.0f, 0.0f, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserEditViewKt.WebDAVUserEditView.2.1.1
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
                                        WebDAVUserViewModel webDAVUserViewModel2 = objectRef3.element;
                                        WebDAVUser editItem = objectRef3.element.getEditItem();
                                        webDAVUserViewModel2.setEditItem(editItem.copy((8063 & 1) != 0 ? editItem.uuid : null, (8063 & 2) != 0 ? editItem.url : MyWebdavTool.INSTANCE.getWebDAVServerUrl(it), (8063 & 4) != 0 ? editItem.username : null, (8063 & 8) != 0 ? editItem.password : null, (8063 & 16) != 0 ? editItem.platform : it, (8063 & 32) != 0 ? editItem.type : null, (8063 & 64) != 0 ? editItem.defaultPath : null, (8063 & 128) != 0 ? editItem.masterNode : false, (8063 & 256) != 0 ? editItem.bind : false, (8063 & 512) != 0 ? editItem.ordinal : 0, (8063 & 1024) != 0 ? editItem.shown : false, (8063 & 2048) != 0 ? editItem.message : null, (8063 & 4096) != 0 ? editItem.cloud : false));
                                    }
                                }, composer3, 36224, 98);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 100663296, 255);
                    BoxViewKt.m6891LeadingHintViewRuDwNsA("账号信息", 0.0f, 0L, 0L, null, composer2, 6, 30);
                    final Ref.ObjectRef<WebDAVUserViewModel> objectRef3 = objectRef;
                    GroupViewKt.m6850GroupViewfIyqwc(null, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer2, -1930515813, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserEditViewKt.WebDAVUserEditView.2.2
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
                                    ComposerKt.traceEventStart(-1930515813, i3, -1, "cn.jianyun.workplan.module.base.views.webdav.WebDAVUserEditView.<anonymous>.<anonymous> (WebDAVUserEditView.kt:60)");
                                }
                                String username = objectRef3.element.getEditItem().getUsername();
                                final Ref.ObjectRef<WebDAVUserViewModel> objectRef4 = objectRef3;
                                FormItemKt.InputItemView("用户名", false, false, false, null, false, username, false, null, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserEditViewKt.WebDAVUserEditView.2.2.1
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
                                        WebDAVUserViewModel webDAVUserViewModel2 = objectRef4.element;
                                        WebDAVUser editItem = objectRef4.element.getEditItem();
                                        webDAVUserViewModel2.setEditItem(editItem.copy((8063 & 1) != 0 ? editItem.uuid : null, (8063 & 2) != 0 ? editItem.url : null, (8063 & 4) != 0 ? editItem.username : it, (8063 & 8) != 0 ? editItem.password : null, (8063 & 16) != 0 ? editItem.platform : null, (8063 & 32) != 0 ? editItem.type : null, (8063 & 64) != 0 ? editItem.defaultPath : null, (8063 & 128) != 0 ? editItem.masterNode : false, (8063 & 256) != 0 ? editItem.bind : false, (8063 & 512) != 0 ? editItem.ordinal : 0, (8063 & 1024) != 0 ? editItem.shown : false, (8063 & 2048) != 0 ? editItem.message : null, (8063 & 4096) != 0 ? editItem.cloud : false));
                                    }
                                }, composer3, 6, 446);
                                String strResolvePassword = objectRef3.element.getEditItem().resolvePassword();
                                final Ref.ObjectRef<WebDAVUserViewModel> objectRef5 = objectRef3;
                                FormItemKt.InputItemView("密码", false, true, false, null, false, strResolvePassword, false, null, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserEditViewKt.WebDAVUserEditView.2.2.2
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
                                        WebDAVUserViewModel webDAVUserViewModel2 = objectRef5.element;
                                        WebDAVUser editItem = objectRef5.element.getEditItem();
                                        String strEncrypt = MyEncryptTool.encrypt(it);
                                        Intrinsics.checkNotNullExpressionValue(strEncrypt, "encrypt(it)");
                                        webDAVUserViewModel2.setEditItem(editItem.copy((8063 & 1) != 0 ? editItem.uuid : null, (8063 & 2) != 0 ? editItem.url : null, (8063 & 4) != 0 ? editItem.username : null, (8063 & 8) != 0 ? editItem.password : strEncrypt, (8063 & 16) != 0 ? editItem.platform : null, (8063 & 32) != 0 ? editItem.type : null, (8063 & 64) != 0 ? editItem.defaultPath : null, (8063 & 128) != 0 ? editItem.masterNode : false, (8063 & 256) != 0 ? editItem.bind : false, (8063 & 512) != 0 ? editItem.ordinal : 0, (8063 & 1024) != 0 ? editItem.shown : false, (8063 & 2048) != 0 ? editItem.message : null, (8063 & 4096) != 0 ? editItem.cloud : false));
                                    }
                                }, composer3, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSION_TIME_MS, UnknownRecord.CODENAME_1BA);
                                boolean masterNode = objectRef3.element.getEditItem().getMasterNode();
                                final Ref.ObjectRef<WebDAVUserViewModel> objectRef6 = objectRef3;
                                FormItemKt.SwitchItemView("主节点", masterNode, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserEditViewKt.WebDAVUserEditView.2.2.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                        invoke(bool.booleanValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(boolean z) {
                                        WebDAVUserViewModel webDAVUserViewModel2 = objectRef6.element;
                                        WebDAVUser editItem = objectRef6.element.getEditItem();
                                        webDAVUserViewModel2.setEditItem(editItem.copy((8063 & 1) != 0 ? editItem.uuid : null, (8063 & 2) != 0 ? editItem.url : null, (8063 & 4) != 0 ? editItem.username : null, (8063 & 8) != 0 ? editItem.password : null, (8063 & 16) != 0 ? editItem.platform : null, (8063 & 32) != 0 ? editItem.type : null, (8063 & 64) != 0 ? editItem.defaultPath : null, (8063 & 128) != 0 ? editItem.masterNode : z, (8063 & 256) != 0 ? editItem.bind : false, (8063 & 512) != 0 ? editItem.ordinal : 0, (8063 & 1024) != 0 ? editItem.shown : false, (8063 & 2048) != 0 ? editItem.message : null, (8063 & 4096) != 0 ? editItem.cloud : false));
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
                    BoxViewKt.m6894SmallTipTextEx1dzz4("开发者郑重承诺，默认情况下，你们的云备份账号密码仅会存储到本地，不会上传至开发者服务器，如果觉得每次换设备都要绑定一次云备份账号，你们也可以选择将云备份账号同计划师账号绑定在一起,这样只要登录计划师账号，就可以把你们的云备份账号自动同步到本地", 0L, 0.0f, 0.0f, null, null, composer2, 6, 62);
                    final Ref.ObjectRef<WebDAVUserViewModel> objectRef4 = objectRef;
                    GroupViewKt.m6850GroupViewfIyqwc(null, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer2, 1680221178, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserEditViewKt.WebDAVUserEditView.2.3
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
                                    ComposerKt.traceEventStart(1680221178, i3, -1, "cn.jianyun.workplan.module.base.views.webdav.WebDAVUserEditView.<anonymous>.<anonymous> (WebDAVUserEditView.kt:79)");
                                }
                                boolean cloud = objectRef4.element.getEditItem().getCloud();
                                final Ref.ObjectRef<WebDAVUserViewModel> objectRef5 = objectRef4;
                                FormItemKt.SwitchItemView("是否跟计划师登录账号绑定", cloud, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserEditViewKt.WebDAVUserEditView.2.3.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                        invoke(bool.booleanValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(boolean z) {
                                        WebDAVUserViewModel webDAVUserViewModel2 = objectRef5.element;
                                        WebDAVUser editItem = objectRef5.element.getEditItem();
                                        webDAVUserViewModel2.setEditItem(editItem.copy((8063 & 1) != 0 ? editItem.uuid : null, (8063 & 2) != 0 ? editItem.url : null, (8063 & 4) != 0 ? editItem.username : null, (8063 & 8) != 0 ? editItem.password : null, (8063 & 16) != 0 ? editItem.platform : null, (8063 & 32) != 0 ? editItem.type : null, (8063 & 64) != 0 ? editItem.defaultPath : null, (8063 & 128) != 0 ? editItem.masterNode : false, (8063 & 256) != 0 ? editItem.bind : false, (8063 & 512) != 0 ? editItem.ordinal : 0, (8063 & 1024) != 0 ? editItem.shown : false, (8063 & 2048) != 0 ? editItem.message : null, (8063 & 4096) != 0 ? editItem.cloud : z));
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
                    final Ref.ObjectRef<WebDAVUserViewModel> objectRef5 = objectRef;
                    final NavHostController navHostController2 = navHostController;
                    ButtonViewKt.LongOkButton("保存", new Function0<Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserEditViewKt.WebDAVUserEditView.2.4
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
                            objectRef5.element.save(navHostController2);
                        }
                    }, composer2, 6, 0);
                    composer2.startReplaceableGroup(-2076903481);
                    if (!objectRef.element.getEditItem().isAdd()) {
                        final Ref.ObjectRef<WebDAVUserViewModel> objectRef6 = objectRef;
                        final NavHostController navHostController3 = navHostController;
                        ButtonViewKt.m6815LongCancelButtonvHmCa5Y("复制", 0.0f, 0L, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserEditViewKt.WebDAVUserEditView.2.5
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
                                objectRef6.element.copyOne(navHostController3);
                            }
                        }, composer2, 6, 6);
                    }
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(-2076903325);
                    if (!objectRef.element.getEditItem().isAdd()) {
                        CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                        final Ref.ObjectRef<WebDAVUserViewModel> objectRef7 = objectRef;
                        ButtonViewKt.LongDeleteButton(null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserEditViewKt.WebDAVUserEditView.2.6
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
                                objectRef7.element.setFormType(FormType.Companion.delete$default(FormType.INSTANCE, null, 1, null));
                            }
                        }, composer2, 0, 1);
                    }
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(-2076903152);
                    if (objectRef.element.getFormType().isForm(FormTypeKt.DELETE)) {
                        final Ref.ObjectRef<WebDAVUserViewModel> objectRef8 = objectRef;
                        final NavHostController navHostController4 = navHostController;
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserEditViewKt.WebDAVUserEditView.2.7
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
                                objectRef8.element.doDelete(navHostController4);
                            }
                        };
                        final Ref.ObjectRef<WebDAVUserViewModel> objectRef9 = objectRef;
                        DialogViewKt.DeleteDialog(null, function0, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserEditViewKt.WebDAVUserEditView.2.8
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
                                objectRef9.element.resetForm();
                            }
                        }, composer2, 0, 1);
                    }
                    composer2.endReplaceableGroup();
                    if (objectRef.element.getFormType().isForm("doc")) {
                        WebDAVUserDocViewKt.WebDAVUserDocView(objectRef.element, composer2, 8);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 24968, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserEditViewKt.WebDAVUserEditView.3
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
                WebDAVUserEditViewKt.WebDAVUserEditView(navHostController, bundle, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }
}