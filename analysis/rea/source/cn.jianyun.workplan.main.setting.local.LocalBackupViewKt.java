package cn.jianyun.workplan.main.setting.local;

import android.net.Uri;
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
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavHostController;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.model.LocalBackupConfig;
import cn.jianyun.workplan.module.base.vm.BaseViewModel;
import cn.jianyun.workplan.ui.component.form.ButtonViewKt;
import cn.jianyun.workplan.ui.component.form.DialogViewKt;
import cn.jianyun.workplan.ui.component.form.GroupViewKt;
import cn.jianyun.workplan.ui.component.nav.BoxViewKt;
import cn.jianyun.workplan.ui.component.nav.HeaderViewKt;
import cn.jianyun.workplan.util.CommonUIKt;
import cn.jianyun.workplan.util.MyFileUtil;
import com.darkrockstudios.libraries.mpfilepicker.AndroidFilePickerKt;
import com.meishu.sdk.core.MSAdConfig;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: LocalBackupView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"LocalBackupView", "", "navHostController", "Landroidx/navigation/NavHostController;", "(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LocalBackupViewKt {
    public static final void LocalBackupView(final NavHostController navHostController, Composer composer, final int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        Composer composerStartRestartGroup = composer.startRestartGroup(1024995822);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LocalBackupView)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1024995822, i, -1, "cn.jianyun.workplan.main.setting.local.LocalBackupView (LocalBackupView.kt:31)");
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
        ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) LocalBackupViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        final LocalBackupViewModel localBackupViewModel = (LocalBackupViewModel) viewModel;
        BaseViewModel.tryReload$default(localBackupViewModel, null, 1, null);
        HeaderViewKt.PageView(navHostController, "本地备份", null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1674709101, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.setting.local.LocalBackupViewKt.LocalBackupView.1
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
                        ComposerKt.traceEventStart(-1674709101, i2, -1, "cn.jianyun.workplan.main.setting.local.LocalBackupView.<anonymous> (LocalBackupView.kt:34)");
                    }
                    if (!Intrinsics.areEqual(localBackupViewModel.getLocalBackupConfig().getPath(), "")) {
                        composer2.startReplaceableGroup(-1536571948);
                        BoxViewKt.m6891LeadingHintViewRuDwNsA("本地备份目录", 0.0f, 0L, 0L, null, composer2, 6, 30);
                        float f2 = 15;
                        float fM6097constructorimpl = Dp.m6097constructorimpl(f2);
                        float fM6097constructorimpl2 = Dp.m6097constructorimpl(f2);
                        final LocalBackupViewModel localBackupViewModel2 = localBackupViewModel;
                        GroupViewKt.m6851SettingGroupViewfIyqwc(null, false, false, 0.0f, 0.0f, fM6097constructorimpl, fM6097constructorimpl2, 0.0f, ComposableLambdaKt.composableLambda(composer2, 1225857495, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.setting.local.LocalBackupViewKt.LocalBackupView.1.1
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                if ((i3 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1225857495, i3, -1, "cn.jianyun.workplan.main.setting.local.LocalBackupView.<anonymous>.<anonymous> (LocalBackupView.kt:37)");
                                }
                                TextKt.m2471Text4IGK_g(MyFileUtil.INSTANCE.readDirRelativePath(localBackupViewModel2.getLocalPath()), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 102432768, 159);
                        CommonUIKt.m6950LinkTexthfI1UA("恭喜，你已经成功设置好本地备份目录，即便app卸载，你依然可以从此目录恢复数据，记得勤备份喔", 0.0f, 0L, 0L, null, composer2, 6, 30);
                        CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                        CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                        final LocalBackupViewModel localBackupViewModel3 = localBackupViewModel;
                        BoxViewKt.m6877CenterSmallTipTextBazWgJc("切换备份目录", 0L, 0.0f, new Function0<Unit>() { // from class: cn.jianyun.workplan.main.setting.local.LocalBackupViewKt.LocalBackupView.1.2
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
                                localBackupViewModel3.setFormType(new FormType("toggleTip", null, null, 6, null));
                            }
                        }, composer2, 6, 6);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(-1536570679);
                        float f3 = 15;
                        GroupViewKt.m6850GroupViewfIyqwc(null, false, false, 0.0f, 0.0f, Dp.m6097constructorimpl(f3), Dp.m6097constructorimpl(f3), 0.0f, ComposableSingletons$LocalBackupViewKt.INSTANCE.m6693getLambda1$app_release(), composer2, 102432768, 159);
                        final LocalBackupViewModel localBackupViewModel4 = localBackupViewModel;
                        ButtonViewKt.m6815LongCancelButtonvHmCa5Y("选择备份目录", 0.0f, 0L, new Function0<Unit>() { // from class: cn.jianyun.workplan.main.setting.local.LocalBackupViewKt.LocalBackupView.1.3
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
                                localBackupViewModel4.setFormType(new FormType("pickDir", null, null, 6, null));
                            }
                        }, composer2, 6, 6);
                        composer2.endReplaceableGroup();
                    }
                    composer2.startReplaceableGroup(-1536570110);
                    if (localBackupViewModel.getFormType().isForm("toggleTip")) {
                        final LocalBackupViewModel localBackupViewModel5 = localBackupViewModel;
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: cn.jianyun.workplan.main.setting.local.LocalBackupViewKt.LocalBackupView.1.4
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
                                localBackupViewModel5.setFormType(new FormType("pickDir", null, null, 6, null));
                            }
                        };
                        final LocalBackupViewModel localBackupViewModel6 = localBackupViewModel;
                        DialogViewKt.ConfirmDialog("真的要切换吗？这样会导致历史备份目录下备份文件失效喔", null, null, function0, new Function0<Unit>() { // from class: cn.jianyun.workplan.main.setting.local.LocalBackupViewKt.LocalBackupView.1.5
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
                                localBackupViewModel6.resetForm();
                            }
                        }, composer2, 6, 6);
                    }
                    composer2.endReplaceableGroup();
                    boolean zIsForm = localBackupViewModel.getFormType().isForm("pickDir");
                    final LocalBackupViewModel localBackupViewModel7 = localBackupViewModel;
                    AndroidFilePickerKt.DirectoryPicker(zIsForm, null, null, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.main.setting.local.LocalBackupViewKt.LocalBackupView.1.6
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
                            localBackupViewModel7.setFormType(new FormType(null, null, null, 7, null));
                            if (str != null) {
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(localBackupViewModel7), null, null, new C01941(localBackupViewModel7, str, null), 3, null);
                            }
                        }

                        /* JADX INFO: renamed from: cn.jianyun.workplan.main.setting.local.LocalBackupViewKt$LocalBackupView$1$6$1, reason: invalid class name and collision with other inner class name */
                        /* JADX INFO: compiled from: LocalBackupView.kt */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        @DebugMetadata(c = "cn.jianyun.workplan.main.setting.local.LocalBackupViewKt$LocalBackupView$1$6$1", f = "LocalBackupView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                        static final class C01941 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ String $path;
                            final /* synthetic */ LocalBackupViewModel $viewModel;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C01941(LocalBackupViewModel localBackupViewModel, String str, Continuation<? super C01941> continuation) {
                                super(2, continuation);
                                this.$viewModel = localBackupViewModel;
                                this.$path = str;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new C01941(this.$viewModel, this.$path, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((C01941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) throws Throwable {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    this.$viewModel.getBaseRepository().getContext().getContentResolver().takePersistableUriPermission(Uri.parse(this.$path), 3);
                                    this.$viewModel.setLocalBackupConfig(new LocalBackupConfig(this.$path, true, MSAdConfig.GENDER_FEMALE));
                                    this.$viewModel.setLocalPath(this.$path);
                                    this.$viewModel.saveLocalInfo();
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                    }, composer2, 0, 6);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.setting.local.LocalBackupViewKt.LocalBackupView.2
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
                LocalBackupViewKt.LocalBackupView(navHostController, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }
}