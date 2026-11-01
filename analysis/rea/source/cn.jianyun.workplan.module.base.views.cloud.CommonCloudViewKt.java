package cn.jianyun.workplan.module.base.views.cloud;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import cn.jianyun.workplan.main.Router;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.module.base.vm.BaseCloudViewModel;
import cn.jianyun.workplan.ui.component.form.ButtonViewKt;
import cn.jianyun.workplan.ui.component.form.DialogViewKt;
import cn.jianyun.workplan.ui.component.nav.BoxViewKt;
import cn.jianyun.workplan.ui.component.nav.HeaderViewKt;
import cn.jianyun.workplan.ui.component.nav.IconFont;
import com.darkrockstudios.libraries.mpfilepicker.AndroidFilePickerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CommonCloudView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"CommonCloudView", "", "navHostController", "Landroidx/navigation/NavHostController;", "baseCloudViewModel", "Lcn/jianyun/workplan/module/base/vm/BaseCloudViewModel;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/navigation/NavHostController;Lcn/jianyun/workplan/module/base/vm/BaseCloudViewModel;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CommonCloudViewKt {
    public static final void CommonCloudView(final NavHostController navHostController, final BaseCloudViewModel baseCloudViewModel, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        Intrinsics.checkNotNullParameter(baseCloudViewModel, "baseCloudViewModel");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1488737952);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CommonCloudView)P(2)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1488737952, i, -1, "cn.jianyun.workplan.module.base.views.cloud.CommonCloudView (CommonCloudView.kt:21)");
        }
        HeaderViewKt.m6904PageWithFooterView0vH8DBg(navHostController, null, ComposableSingletons$CommonCloudViewKt.INSTANCE.m6710getLambda1$app_release(), ComposableSingletons$CommonCloudViewKt.INSTANCE.m6711getLambda2$app_release(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 502175463, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.base.views.cloud.CommonCloudViewKt.CommonCloudView.1
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
                        ComposerKt.traceEventStart(502175463, i2, -1, "cn.jianyun.workplan.module.base.views.cloud.CommonCloudView.<anonymous> (CommonCloudView.kt:32)");
                    }
                    if (baseCloudViewModel.isValid()) {
                        if (baseCloudViewModel.hasData()) {
                            composer2.startReplaceableGroup(-1839313040);
                            final BaseCloudViewModel baseCloudViewModel2 = baseCloudViewModel;
                            composer2.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                            boolean zChanged = composer2.changed(baseCloudViewModel2);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.module.base.views.cloud.CommonCloudViewKt$CommonCloudView$1$1$1
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
                                        baseCloudViewModel2.doBackup();
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            Function0 function0 = (Function0) objRememberedValue;
                            final BaseCloudViewModel baseCloudViewModel3 = baseCloudViewModel;
                            composer2.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                            boolean zChanged2 = composer2.changed(baseCloudViewModel3);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.module.base.views.cloud.CommonCloudViewKt$CommonCloudView$1$2$1
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
                                        baseCloudViewModel3.setFormType(FormType.Companion.clear$default(FormType.INSTANCE, null, null, 3, null));
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            ButtonViewKt.m6816OkAndCancelButtonGroup1yyLQnY("全量备份", "清空备份", 0.0f, 0.0f, function0, (Function0) objRememberedValue2, composer2, 54, 12);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(-1839312760);
                            final BaseCloudViewModel baseCloudViewModel4 = baseCloudViewModel;
                            composer2.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                            boolean zChanged3 = composer2.changed(baseCloudViewModel4);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.module.base.views.cloud.CommonCloudViewKt$CommonCloudView$1$3$1
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
                                        baseCloudViewModel4.doBackup();
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceableGroup();
                            ButtonViewKt.LongOkButton("全量备份", (Function0) objRememberedValue3, composer2, 6, 0);
                            composer2.endReplaceableGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 592235753, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.base.views.cloud.CommonCloudViewKt.CommonCloudView.2
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
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(592235753, i2, -1, "cn.jianyun.workplan.module.base.views.cloud.CommonCloudView.<anonymous> (CommonCloudView.kt:47)");
                    }
                    if (Intrinsics.areEqual(baseCloudViewModel.getBackType(), "local")) {
                        composer2.startReplaceableGroup(-1839312566);
                        if (Intrinsics.areEqual(baseCloudViewModel.getLocalPath(), "")) {
                            composer2.startReplaceableGroup(-1839312514);
                            final BaseCloudViewModel baseCloudViewModel2 = baseCloudViewModel;
                            composer2.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                            boolean zChanged = composer2.changed(baseCloudViewModel2);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.module.base.views.cloud.CommonCloudViewKt$CommonCloudView$2$1$1
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
                                        baseCloudViewModel2.setFormType(new FormType("chooseDir", null, null, 6, null));
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            BoxViewKt.m6881EmptyIconDataViewjxWH9Kg("点击设置本地备份目录", IconFont.cloud, 0L, 0L, (Function0) objRememberedValue, composer2, 54, 12);
                            boolean zIsForm = baseCloudViewModel.getFormType().isForm("chooseDir");
                            final BaseCloudViewModel baseCloudViewModel3 = baseCloudViewModel;
                            composer2.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                            boolean zChanged2 = composer2.changed(baseCloudViewModel3);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = (Function1) new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.base.views.cloud.CommonCloudViewKt$CommonCloudView$2$2$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(String str) {
                                        invoke2(str);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(String str) {
                                        if (str != null) {
                                            baseCloudViewModel3.saveLocalData(str);
                                        }
                                        baseCloudViewModel3.setFormType(new FormType(null, null, null, 7, null));
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            AndroidFilePickerKt.DirectoryPicker(zIsForm, null, null, (Function1) objRememberedValue2, composer2, 0, 6);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(-1839311987);
                            if (baseCloudViewModel.getDatalist().isEmpty()) {
                                composer2.startReplaceableGroup(-1839311928);
                                BoxViewKt.m6881EmptyIconDataViewjxWH9Kg("暂无本地备份数据", 0, 0L, 0L, null, composer2, 6, 30);
                                composer2.endReplaceableGroup();
                            } else {
                                composer2.startReplaceableGroup(-1839311838);
                                content.invoke(composer2, Integer.valueOf((i >> 6) & 14));
                                composer2.endReplaceableGroup();
                            }
                            composer2.endReplaceableGroup();
                        }
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(-1839311752);
                        if (!baseCloudViewModel.getWebDavUser().getBind()) {
                            composer2.startReplaceableGroup(-1839311699);
                            final NavHostController navHostController2 = navHostController;
                            BoxViewKt.m6881EmptyIconDataViewjxWH9Kg("点击绑定云备份账号", IconFont.cloud, 0L, 0L, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.base.views.cloud.CommonCloudViewKt.CommonCloudView.2.3
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
                                    NavController.navigate$default(navHostController2, Router.WebDAVManage.INSTANCE.getRoute(), null, null, 6, null);
                                }
                            }, composer2, 54, 12);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(-1839311474);
                            if (baseCloudViewModel.getCloudDatalist().isEmpty()) {
                                composer2.startReplaceableGroup(-1839311410);
                                BoxViewKt.m6881EmptyIconDataViewjxWH9Kg("暂无云备份数据", IconFont.cloud3, 0L, 0L, null, composer2, 54, 28);
                                composer2.endReplaceableGroup();
                            } else {
                                composer2.startReplaceableGroup(-1839311299);
                                content.invoke(composer2, Integer.valueOf((i >> 6) & 14));
                                composer2.endReplaceableGroup();
                            }
                            composer2.endReplaceableGroup();
                        }
                        composer2.endReplaceableGroup();
                    }
                    if (baseCloudViewModel.getFormType().isClear()) {
                        String message = baseCloudViewModel.getFormType().getMessage();
                        final BaseCloudViewModel baseCloudViewModel4 = baseCloudViewModel;
                        composer2.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                        boolean zChanged3 = composer2.changed(baseCloudViewModel4);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.module.base.views.cloud.CommonCloudViewKt$CommonCloudView$2$4$1
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
                                    baseCloudViewModel4.cleanBackup();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceableGroup();
                        Function0 function0 = (Function0) objRememberedValue3;
                        final BaseCloudViewModel baseCloudViewModel5 = baseCloudViewModel;
                        composer2.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                        boolean zChanged4 = composer2.changed(baseCloudViewModel5);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.module.base.views.cloud.CommonCloudViewKt$CommonCloudView$2$5$1
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
                                    baseCloudViewModel5.resetForm();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        composer2.endReplaceableGroup();
                        DialogViewKt.DeleteDialog(message, function0, (Function0) objRememberedValue4, composer2, 0, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 12782984, 82);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.base.views.cloud.CommonCloudViewKt.CommonCloudView.3
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
                CommonCloudViewKt.CommonCloudView(navHostController, baseCloudViewModel, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }
}