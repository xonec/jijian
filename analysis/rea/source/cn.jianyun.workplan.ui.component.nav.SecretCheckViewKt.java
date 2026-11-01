package cn.jianyun.workplan.ui.component.nav;

import android.content.res.Configuration;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import cn.jianyun.workplan.ui.component.form.ButtonViewKt;
import cn.jianyun.workplan.ui.component.form.DialogViewKt;
import cn.jianyun.workplan.ui.theme.ColorKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
import com.alipay.sdk.m.c0.d;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: SecretCheckView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0005\u001a;\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"GlobalSecretCheckView", "", "dismiss", "Lkotlin/Function0;", "ok", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SecretCheckView", "type", "", d.v, "", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SecretCheckViewKt {
    /* JADX WARN: Code duplicated, block: B:101:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:104:0x0417  */
    /* JADX WARN: Code duplicated, block: B:106:0x041f  */
    /* JADX WARN: Code duplicated, block: B:107:0x049d  */
    /* JADX WARN: Code duplicated, block: B:109:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:111:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:113:0x0543  */
    /* JADX WARN: Code duplicated, block: B:117:0x0603  */
    /* JADX WARN: Code duplicated, block: B:121:0x060d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0625  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00de  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:65:0x0161  */
    /* JADX WARN: Code duplicated, block: B:68:0x016d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0171  */
    /* JADX WARN: Code duplicated, block: B:72:0x0196  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:77:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:80:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:81:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:84:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:90:0x0342  */
    /* JADX WARN: Code duplicated, block: B:92:0x0399  */
    /* JADX WARN: Code duplicated, block: B:95:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:96:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:99:0x03ce  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v29, types: [T, androidx.lifecycle.ViewModel] */
    public static final void SecretCheckView(final String type, boolean z, final Function0<Unit> dismiss, final Function0<Unit> ok, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        final Ref.ObjectRef objectRef;
        ViewModelStoreOwner current;
        CreationExtras.Empty defaultViewModelCreationExtras;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM3285constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        String str;
        String str2;
        Alignment alignment;
        boolean z4;
        String str3;
        int currentCompositeKeyHash2;
        Function0<ComposeUiNode> constructor2;
        Composer composerM3285constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Function0<ComposeUiNode> constructor3;
        Composer composerM3285constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        Alignment alignment2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(dismiss, "dismiss");
        Intrinsics.checkNotNullParameter(ok, "ok");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1751500738);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SecretCheckView)P(3)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(type) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 112) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
            } else if ((i & 896) == 0) {
                if (composerStartRestartGroup.changedInstance(dismiss)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(ok)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i3 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1751500738, i, -1, "cn.jianyun.workplan.ui.component.nav.SecretCheckView (SecretCheckView.kt:63)");
                }
                objectRef = new Ref.ObjectRef();
                composerStartRestartGroup.startReplaceableGroup(1890788296);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(hiltViewModel)P(1)*42@1793L7,47@1936L47,48@1995L54:HiltViewModel.kt#9mcars");
                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
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
                ?? ViewModel = ViewModelKt.viewModel((Class<??>) SecretViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                objectRef.element = ViewModel;
                ((SecretViewModel) objectRef.element).initType(type);
                ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localConfiguration);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Configuration configuration = (Configuration) objConsume;
                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                str = "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo";
                str2 = "C73@3426L9:Box.kt#2w3rfo";
                alignment = null;
                BoxViewKt.m6875CenterColumndjqsMU(boxScopeInstance.align(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6097constructorimpl(Dp.m6097constructorimpl(Dp.m6097constructorimpl(Dp.m6097constructorimpl(Dp.m6097constructorimpl(configuration.screenHeightDp) - Dp.m6097constructorimpl(MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_DEMUXER_STALL)) - Dp.m6097constructorimpl(20)) - Dp.m6097constructorimpl(100)) / 2), 0.0f, 0.0f, 13, null), Alignment.INSTANCE.getTopCenter()), 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729341507, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1729341507, i7, -1, "cn.jianyun.workplan.ui.component.nav.SecretCheckView.<anonymous>.<anonymous> (SecretCheckView.kt:73)");
                            }
                            String strTypeName = objectRef.element.typeName();
                            long sp = TextUnitKt.getSp(22);
                            long jM6916typeColorWaAFU9c = objectRef.element.m6916typeColorWaAFU9c(composer2, 8);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            final Ref.ObjectRef<SecretViewModel> objectRef2 = objectRef;
                            TextKt.m2471Text4IGK_g(strTypeName, ButtonViewKt.tap(companion, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$1.1
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
                                    BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(objectRef2.element), null, null, new C02521(objectRef2, null), 3, null);
                                }

                                /* JADX INFO: renamed from: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$1$1$1, reason: invalid class name and collision with other inner class name */
                                /* JADX INFO: compiled from: SecretCheckView.kt */
                                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                @DebugMetadata(c = "cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$1$1$1", f = "SecretCheckView.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
                                static final class C02521 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    final /* synthetic */ Ref.ObjectRef<SecretViewModel> $viewModel;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C02521(Ref.ObjectRef<SecretViewModel> objectRef, Continuation<? super C02521> continuation) {
                                        super(2, continuation);
                                        this.$viewModel = objectRef;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                        return new C02521(this.$viewModel, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                        return ((C02521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) throws Throwable {
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            this.label = 1;
                                            if (this.$viewModel.element.clearMisstimes(true, this) == coroutine_suspended) {
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
                            }), jM6916typeColorWaAFU9c, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131056);
                            float f2 = 10;
                            float fM6097constructorimpl = Dp.m6097constructorimpl(f2);
                            final Ref.ObjectRef<SecretViewModel> objectRef3 = objectRef;
                            BoxViewKt.m6876CenterRowdjqsMU(null, fM6097constructorimpl, 0.0f, ComposableLambdaKt.composableLambda(composer2, -619723546, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i8) {
                                    if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-619723546, i8, -1, "cn.jianyun.workplan.ui.component.nav.SecretCheckView.<anonymous>.<anonymous>.<anonymous> (SecretCheckView.kt:79)");
                                        }
                                        for (String str4 : objectRef3.element.getSecrets()) {
                                            if (Intrinsics.areEqual(str4, "")) {
                                                composer3.startReplaceableGroup(-1241593670);
                                                TextKt.m2471Text4IGK_g("_", PaddingKt.m567padding3ABfNKs(SizeKt.m621width3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(38)), Dp.m6097constructorimpl(10)), 0L, TextUnitKt.getSp(32), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3126, 0, 131060);
                                                composer3.endReplaceableGroup();
                                            } else {
                                                composer3.startReplaceableGroup(-1241593463);
                                                TextKt.m2471Text4IGK_g(str4, PaddingKt.m567padding3ABfNKs(SizeKt.m621width3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(38)), Dp.m6097constructorimpl(10)), 0L, TextUnitKt.getSp(32), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3120, 0, 131060);
                                                composer3.endReplaceableGroup();
                                            }
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), composer2, 3120, 5);
                            composer2.startReplaceableGroup(-1662433878);
                            if (!Intrinsics.areEqual(objectRef.element.getMessage(), "")) {
                                TextKt.m2471Text4IGK_g(objectRef.element.getMessage(), PaddingKt.m567padding3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f2)), ((Color) CommonToolKt.ifv(StringsKt.contains$default((CharSequence) objectRef.element.getMessage(), (CharSequence) "成功", false, 2, (Object) null), Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(ColorKt.getDeleteColor()))).m3765unboximpl(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 131056);
                            }
                            composer2.endReplaceableGroup();
                            if (objectRef.element.getMissTimes() > 0) {
                                if (objectRef.element.getUnlockTime() > 0) {
                                    composer2.startReplaceableGroup(-1662433587);
                                    TextKt.m2471Text4IGK_g("已锁住," + objectRef.element.getLockInfo() + "后解锁", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131062);
                                    composer2.endReplaceableGroup();
                                } else {
                                    composer2.startReplaceableGroup(-1662433472);
                                    TextKt.m2471Text4IGK_g("还剩" + (objectRef.element.getMaxTimes() - objectRef.element.getMissTimes()) + "次尝试机会", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131062);
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
                }), composerStartRestartGroup, 3072, 6);
                Modifier modifierAlign = boxScopeInstance.align(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6097constructorimpl(30), 7, null), Alignment.INSTANCE.getBottomCenter());
                composerStartRestartGroup.startReplaceableGroup(1098475987);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(FlowRow)P(3,1,4,2)66@2954L113,71@3072L134:FlowLayout.kt#2w3rfo");
                z4 = false;
                MeasurePolicy measurePolicyRowMeasurementHelper = FlowLayoutKt.rowMeasurementHelper(Arrangement.INSTANCE.getStart(), Arrangement.INSTANCE.getTop(), Integer.MAX_VALUE, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                str3 = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
                ComposerKt.sourceInformation(composerStartRestartGroup, str3);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierAlign);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3285constructorimpl2 = Updater.m3285constructorimpl(composerStartRestartGroup);
                Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyRowMeasurementHelper, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 483375643, "C72@3121L9:FlowLayout.kt#2w3rfo");
                FlowRowScopeInstance flowRowScopeInstance = FlowRowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-838711335);
                for (final String str4 : ((SecretViewModel) objectRef.element).getNums()) {
                    Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.3333f), Dp.m6097constructorimpl(90)), alignment, z4, 3, alignment);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, str);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), z4, composerStartRestartGroup, z4 ? 1 : 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, str3);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, z4 ? 1 : 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierWrapContentSize$default);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3285constructorimpl3 = Updater.m3285constructorimpl(composerStartRestartGroup);
                    Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3285constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf(z4 ? 1 : 0));
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, str2);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    if (Intrinsics.areEqual(str4, "<")) {
                        composerStartRestartGroup.startReplaceableGroup(-1241592316);
                        if (z3) {
                            IconViewKt.m6909IconViewRidXid8(60000, TextUnitKt.getSp(28), 0L, false, SizeKt.wrapContentSize$default(SizeKt.m616size3ABfNKs(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(35)), false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$2$1$1$1
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
                                    objectRef.element.setMessage("");
                                    BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(objectRef.element), null, null, new AnonymousClass1(objectRef, null), 3, null);
                                    dismiss.invoke();
                                }

                                /* JADX INFO: renamed from: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$2$1$1$1$1, reason: invalid class name */
                                /* JADX INFO: compiled from: SecretCheckView.kt */
                                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                @DebugMetadata(c = "cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$2$1$1$1$1", f = "SecretCheckView.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
                                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    final /* synthetic */ Ref.ObjectRef<SecretViewModel> $viewModel;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    AnonymousClass1(Ref.ObjectRef<SecretViewModel> objectRef, Continuation<? super AnonymousClass1> continuation) {
                                        super(2, continuation);
                                        this.$viewModel = objectRef;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                        return new AnonymousClass1(this.$viewModel, continuation);
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
                                            if (this.$viewModel.element.clearSecrets(this) == coroutine_suspended) {
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
                            }, 7, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | (z4 ? 1 : 0)).getSurfaceVariant(), null, 2, null), Dp.m6097constructorimpl(70)), null, z4, 3, null), composerStartRestartGroup, 54, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        str3 = str3;
                        str = str;
                        str2 = str2;
                        if (Intrinsics.areEqual(str4, "x")) {
                            composerStartRestartGroup.startReplaceableGroup(-1241591510);
                            long sp = TextUnitKt.getSp(22);
                            Modifier modifierWrapContentSize$default2 = SizeKt.wrapContentSize$default(SizeKt.m616size3ABfNKs(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(35)), false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$2$1$1$2
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
                                    objectRef.element.tap(str4, ok);
                                }
                            }, 7, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | (z4 ? 1 : 0)).getSurfaceVariant(), null, 2, null), Dp.m6097constructorimpl(70)), null, z4, 3, null);
                            z4 = z4 ? 1 : 0;
                            IconViewKt.m6909IconViewRidXid8(IconFont.delete_bin, sp, 0L, false, modifierWrapContentSize$default2, composerStartRestartGroup, 54, 12);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-1241591025);
                            long sp2 = TextUnitKt.getSp(28);
                            Modifier modifierWrapContentSize$default3 = SizeKt.wrapContentSize$default(SizeKt.m616size3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(35)), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | (z4 ? 1 : 0)).getSurfaceVariant(), null, 2, null), false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$2$1$1$3
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
                                    objectRef.element.tap(str4, ok);
                                }
                            }, 7, null), Dp.m6097constructorimpl(70)), null, z4, 3, null);
                            alignment2 = null;
                            z4 = z4 ? 1 : 0;
                            TextKt.m2471Text4IGK_g(str4, modifierWrapContentSize$default3, 0L, sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131060);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        z4 = z4;
                        alignment = alignment2;
                        str3 = str3;
                        str = str;
                        str2 = str2;
                    }
                    alignment2 = null;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    z4 = z4;
                    alignment = alignment2;
                    str3 = str3;
                    str = str;
                    str2 = str2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                z3 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final boolean z5 = z3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt.SecretCheckView.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    SecretCheckViewKt.SecretCheckView(type, z5, dismiss, ok, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        z2 = z;
        if ((i2 & 4) != 0) {
            i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
        } else if ((i & 896) == 0) {
            if (composerStartRestartGroup.changedInstance(dismiss)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (composerStartRestartGroup.changedInstance(ok)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i3 & 5851) == 1170) {
            if (i6 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1751500738, i, -1, "cn.jianyun.workplan.ui.component.nav.SecretCheckView (SecretCheckView.kt:63)");
            }
            objectRef = new Ref.ObjectRef();
            composerStartRestartGroup.startReplaceableGroup(1890788296);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(hiltViewModel)P(1)*42@1793L7,47@1936L47,48@1995L54:HiltViewModel.kt#9mcars");
            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModelProvider.Factory factoryCreateHiltViewModelFactory2 = HiltViewModelKt.createHiltViewModelFactory(current, composerStartRestartGroup, 8);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67");
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ?? ViewModel2 = ViewModelKt.viewModel((Class<??>) SecretViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory2, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            objectRef.element = ViewModel2;
            ((SecretViewModel) objectRef.element).initType(type);
            ProvidableCompositionLocal<Configuration> localConfiguration2 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localConfiguration2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Configuration configuration2 = (Configuration) objConsume2;
            Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
            Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3285constructorimpl.getInserting()) {
                composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            } else {
                composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            str = "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo";
            str2 = "C73@3426L9:Box.kt#2w3rfo";
            alignment = null;
            BoxViewKt.m6875CenterColumndjqsMU(boxScopeInstance3.align(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6097constructorimpl(Dp.m6097constructorimpl(Dp.m6097constructorimpl(Dp.m6097constructorimpl(Dp.m6097constructorimpl(configuration2.screenHeightDp) - Dp.m6097constructorimpl(MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_DEMUXER_STALL)) - Dp.m6097constructorimpl(20)) - Dp.m6097constructorimpl(100)) / 2), 0.0f, 0.0f, 13, null), Alignment.INSTANCE.getTopCenter()), 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729341507, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1729341507, i7, -1, "cn.jianyun.workplan.ui.component.nav.SecretCheckView.<anonymous>.<anonymous> (SecretCheckView.kt:73)");
                        }
                        String strTypeName = objectRef.element.typeName();
                        long sp3 = TextUnitKt.getSp(22);
                        long jM6916typeColorWaAFU9c = objectRef.element.m6916typeColorWaAFU9c(composer2, 8);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        final Ref.ObjectRef<SecretViewModel> objectRef2 = objectRef;
                        TextKt.m2471Text4IGK_g(strTypeName, ButtonViewKt.tap(companion, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$1.1
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
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(objectRef2.element), null, null, new C02521(objectRef2, null), 3, null);
                            }

                            /* JADX INFO: renamed from: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$1$1$1, reason: invalid class name and collision with other inner class name */
                            /* JADX INFO: compiled from: SecretCheckView.kt */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            @DebugMetadata(c = "cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$1$1$1", f = "SecretCheckView.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
                            static final class C02521 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ Ref.ObjectRef<SecretViewModel> $viewModel;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C02521(Ref.ObjectRef<SecretViewModel> objectRef, Continuation<? super C02521> continuation) {
                                    super(2, continuation);
                                    this.$viewModel = objectRef;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C02521(this.$viewModel, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((C02521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) throws Throwable {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        this.label = 1;
                                        if (this.$viewModel.element.clearMisstimes(true, this) == coroutine_suspended) {
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
                        }), jM6916typeColorWaAFU9c, sp3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131056);
                        float f2 = 10;
                        float fM6097constructorimpl = Dp.m6097constructorimpl(f2);
                        final Ref.ObjectRef<SecretViewModel> objectRef3 = objectRef;
                        BoxViewKt.m6876CenterRowdjqsMU(null, fM6097constructorimpl, 0.0f, ComposableLambdaKt.composableLambda(composer2, -619723546, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-619723546, i8, -1, "cn.jianyun.workplan.ui.component.nav.SecretCheckView.<anonymous>.<anonymous>.<anonymous> (SecretCheckView.kt:79)");
                                    }
                                    for (String str5 : objectRef3.element.getSecrets()) {
                                        if (Intrinsics.areEqual(str5, "")) {
                                            composer3.startReplaceableGroup(-1241593670);
                                            TextKt.m2471Text4IGK_g("_", PaddingKt.m567padding3ABfNKs(SizeKt.m621width3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(38)), Dp.m6097constructorimpl(10)), 0L, TextUnitKt.getSp(32), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3126, 0, 131060);
                                            composer3.endReplaceableGroup();
                                        } else {
                                            composer3.startReplaceableGroup(-1241593463);
                                            TextKt.m2471Text4IGK_g(str5, PaddingKt.m567padding3ABfNKs(SizeKt.m621width3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(38)), Dp.m6097constructorimpl(10)), 0L, TextUnitKt.getSp(32), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3120, 0, 131060);
                                            composer3.endReplaceableGroup();
                                        }
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 3120, 5);
                        composer2.startReplaceableGroup(-1662433878);
                        if (!Intrinsics.areEqual(objectRef.element.getMessage(), "")) {
                            TextKt.m2471Text4IGK_g(objectRef.element.getMessage(), PaddingKt.m567padding3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f2)), ((Color) CommonToolKt.ifv(StringsKt.contains$default((CharSequence) objectRef.element.getMessage(), (CharSequence) "成功", false, 2, (Object) null), Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(ColorKt.getDeleteColor()))).m3765unboximpl(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 131056);
                        }
                        composer2.endReplaceableGroup();
                        if (objectRef.element.getMissTimes() > 0) {
                            if (objectRef.element.getUnlockTime() > 0) {
                                composer2.startReplaceableGroup(-1662433587);
                                TextKt.m2471Text4IGK_g("已锁住," + objectRef.element.getLockInfo() + "后解锁", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131062);
                                composer2.endReplaceableGroup();
                            } else {
                                composer2.startReplaceableGroup(-1662433472);
                                TextKt.m2471Text4IGK_g("还剩" + (objectRef.element.getMaxTimes() - objectRef.element.getMissTimes()) + "次尝试机会", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131062);
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
            }), composerStartRestartGroup, 3072, 6);
            Modifier modifierAlign2 = boxScopeInstance3.align(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6097constructorimpl(30), 7, null), Alignment.INSTANCE.getBottomCenter());
            composerStartRestartGroup.startReplaceableGroup(1098475987);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(FlowRow)P(3,1,4,2)66@2954L113,71@3072L134:FlowLayout.kt#2w3rfo");
            z4 = false;
            MeasurePolicy measurePolicyRowMeasurementHelper2 = FlowLayoutKt.rowMeasurementHelper(Arrangement.INSTANCE.getStart(), Arrangement.INSTANCE.getTop(), Integer.MAX_VALUE, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            str3 = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
            ComposerKt.sourceInformation(composerStartRestartGroup, str3);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierAlign2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM3285constructorimpl2 = Updater.m3285constructorimpl(composerStartRestartGroup);
            Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyRowMeasurementHelper2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3285constructorimpl2.getInserting()) {
                composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            } else {
                composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            function3ModifierMaterializerOf5.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 483375643, "C72@3121L9:FlowLayout.kt#2w3rfo");
            FlowRowScopeInstance flowRowScopeInstance2 = FlowRowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-838711335);
            while (r32.hasNext()) {
                Modifier modifierWrapContentSize$default4 = SizeKt.wrapContentSize$default(SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.3333f), Dp.m6097constructorimpl(90)), alignment, z4, 3, alignment);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composerStartRestartGroup, str);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), z4, composerStartRestartGroup, z4 ? 1 : 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, str3);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, z4 ? 1 : 0);
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierWrapContentSize$default4);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3285constructorimpl3 = Updater.m3285constructorimpl(composerStartRestartGroup);
                Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyRememberBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3285constructorimpl3.getInserting()) {
                    composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                } else {
                    composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                function3ModifierMaterializerOf6.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf(z4 ? 1 : 0));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, str2);
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                if (Intrinsics.areEqual(str4, "<")) {
                    composerStartRestartGroup.startReplaceableGroup(-1241592316);
                    if (z3) {
                        IconViewKt.m6909IconViewRidXid8(60000, TextUnitKt.getSp(28), 0L, false, SizeKt.wrapContentSize$default(SizeKt.m616size3ABfNKs(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(35)), false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$2$1$1$1
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
                                objectRef.element.setMessage("");
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(objectRef.element), null, null, new AnonymousClass1(objectRef, null), 3, null);
                                dismiss.invoke();
                            }

                            /* JADX INFO: renamed from: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$2$1$1$1$1, reason: invalid class name */
                            /* JADX INFO: compiled from: SecretCheckView.kt */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            @DebugMetadata(c = "cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$2$1$1$1$1", f = "SecretCheckView.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
                            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ Ref.ObjectRef<SecretViewModel> $viewModel;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass1(Ref.ObjectRef<SecretViewModel> objectRef, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$viewModel = objectRef;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$viewModel, continuation);
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
                                        if (this.$viewModel.element.clearSecrets(this) == coroutine_suspended) {
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
                        }, 7, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | (z4 ? 1 : 0)).getSurfaceVariant(), null, 2, null), Dp.m6097constructorimpl(70)), null, z4, 3, null), composerStartRestartGroup, 54, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    str3 = str3;
                    str = str;
                    str2 = str2;
                    if (Intrinsics.areEqual(str4, "x")) {
                        composerStartRestartGroup.startReplaceableGroup(-1241591510);
                        long sp3 = TextUnitKt.getSp(22);
                        Modifier modifierWrapContentSize$default5 = SizeKt.wrapContentSize$default(SizeKt.m616size3ABfNKs(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(35)), false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$2$1$1$2
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
                                objectRef.element.tap(str4, ok);
                            }
                        }, 7, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | (z4 ? 1 : 0)).getSurfaceVariant(), null, 2, null), Dp.m6097constructorimpl(70)), null, z4, 3, null);
                        z4 = z4 ? 1 : 0;
                        IconViewKt.m6909IconViewRidXid8(IconFont.delete_bin, sp3, 0L, false, modifierWrapContentSize$default5, composerStartRestartGroup, 54, 12);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1241591025);
                        long sp4 = TextUnitKt.getSp(28);
                        Modifier modifierWrapContentSize$default6 = SizeKt.wrapContentSize$default(SizeKt.m616size3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(35)), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | (z4 ? 1 : 0)).getSurfaceVariant(), null, 2, null), false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$2$1$1$3
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
                                objectRef.element.tap(str4, ok);
                            }
                        }, 7, null), Dp.m6097constructorimpl(70)), null, z4, 3, null);
                        alignment2 = null;
                        z4 = z4 ? 1 : 0;
                        TextKt.m2471Text4IGK_g(str4, modifierWrapContentSize$default6, 0L, sp4, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131060);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    z4 = z4;
                    alignment = alignment2;
                    str3 = str3;
                    str = str;
                    str2 = str2;
                }
                alignment2 = null;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                z4 = z4;
                alignment = alignment2;
                str3 = str3;
                str = str;
                str2 = str2;
            }
            composerStartRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i6 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1751500738, i, -1, "cn.jianyun.workplan.ui.component.nav.SecretCheckView (SecretCheckView.kt:63)");
            }
            objectRef = new Ref.ObjectRef();
            composerStartRestartGroup.startReplaceableGroup(1890788296);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(hiltViewModel)P(1)*42@1793L7,47@1936L47,48@1995L54:HiltViewModel.kt#9mcars");
            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModelProvider.Factory factoryCreateHiltViewModelFactory3 = HiltViewModelKt.createHiltViewModelFactory(current, composerStartRestartGroup, 8);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67");
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ?? ViewModel3 = ViewModelKt.viewModel((Class<??>) SecretViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory3, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            objectRef.element = ViewModel3;
            ((SecretViewModel) objectRef.element).initType(type);
            ProvidableCompositionLocal<Configuration> localConfiguration3 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume3 = composerStartRestartGroup.consume(localConfiguration3);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Configuration configuration3 = (Configuration) objConsume3;
            Modifier modifierFillMaxHeight$default3 = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
            Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3285constructorimpl.getInserting()) {
                composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            } else {
                composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf7.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
            str = "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo";
            str2 = "C73@3426L9:Box.kt#2w3rfo";
            alignment = null;
            BoxViewKt.m6875CenterColumndjqsMU(boxScopeInstance5.align(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6097constructorimpl(Dp.m6097constructorimpl(Dp.m6097constructorimpl(Dp.m6097constructorimpl(Dp.m6097constructorimpl(configuration3.screenHeightDp) - Dp.m6097constructorimpl(MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_DEMUXER_STALL)) - Dp.m6097constructorimpl(20)) - Dp.m6097constructorimpl(100)) / 2), 0.0f, 0.0f, 13, null), Alignment.INSTANCE.getTopCenter()), 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729341507, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1729341507, i7, -1, "cn.jianyun.workplan.ui.component.nav.SecretCheckView.<anonymous>.<anonymous> (SecretCheckView.kt:73)");
                        }
                        String strTypeName = objectRef.element.typeName();
                        long sp5 = TextUnitKt.getSp(22);
                        long jM6916typeColorWaAFU9c = objectRef.element.m6916typeColorWaAFU9c(composer2, 8);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        final Ref.ObjectRef<SecretViewModel> objectRef2 = objectRef;
                        TextKt.m2471Text4IGK_g(strTypeName, ButtonViewKt.tap(companion, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$1.1
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
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(objectRef2.element), null, null, new C02521(objectRef2, null), 3, null);
                            }

                            /* JADX INFO: renamed from: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$1$1$1, reason: invalid class name and collision with other inner class name */
                            /* JADX INFO: compiled from: SecretCheckView.kt */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            @DebugMetadata(c = "cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$1$1$1", f = "SecretCheckView.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
                            static final class C02521 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ Ref.ObjectRef<SecretViewModel> $viewModel;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C02521(Ref.ObjectRef<SecretViewModel> objectRef, Continuation<? super C02521> continuation) {
                                    super(2, continuation);
                                    this.$viewModel = objectRef;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C02521(this.$viewModel, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((C02521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) throws Throwable {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        this.label = 1;
                                        if (this.$viewModel.element.clearMisstimes(true, this) == coroutine_suspended) {
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
                        }), jM6916typeColorWaAFU9c, sp5, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131056);
                        float f2 = 10;
                        float fM6097constructorimpl = Dp.m6097constructorimpl(f2);
                        final Ref.ObjectRef<SecretViewModel> objectRef3 = objectRef;
                        BoxViewKt.m6876CenterRowdjqsMU(null, fM6097constructorimpl, 0.0f, ComposableLambdaKt.composableLambda(composer2, -619723546, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-619723546, i8, -1, "cn.jianyun.workplan.ui.component.nav.SecretCheckView.<anonymous>.<anonymous>.<anonymous> (SecretCheckView.kt:79)");
                                    }
                                    for (String str5 : objectRef3.element.getSecrets()) {
                                        if (Intrinsics.areEqual(str5, "")) {
                                            composer3.startReplaceableGroup(-1241593670);
                                            TextKt.m2471Text4IGK_g("_", PaddingKt.m567padding3ABfNKs(SizeKt.m621width3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(38)), Dp.m6097constructorimpl(10)), 0L, TextUnitKt.getSp(32), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3126, 0, 131060);
                                            composer3.endReplaceableGroup();
                                        } else {
                                            composer3.startReplaceableGroup(-1241593463);
                                            TextKt.m2471Text4IGK_g(str5, PaddingKt.m567padding3ABfNKs(SizeKt.m621width3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(38)), Dp.m6097constructorimpl(10)), 0L, TextUnitKt.getSp(32), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3120, 0, 131060);
                                            composer3.endReplaceableGroup();
                                        }
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 3120, 5);
                        composer2.startReplaceableGroup(-1662433878);
                        if (!Intrinsics.areEqual(objectRef.element.getMessage(), "")) {
                            TextKt.m2471Text4IGK_g(objectRef.element.getMessage(), PaddingKt.m567padding3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f2)), ((Color) CommonToolKt.ifv(StringsKt.contains$default((CharSequence) objectRef.element.getMessage(), (CharSequence) "成功", false, 2, (Object) null), Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(ColorKt.getDeleteColor()))).m3765unboximpl(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 131056);
                        }
                        composer2.endReplaceableGroup();
                        if (objectRef.element.getMissTimes() > 0) {
                            if (objectRef.element.getUnlockTime() > 0) {
                                composer2.startReplaceableGroup(-1662433587);
                                TextKt.m2471Text4IGK_g("已锁住," + objectRef.element.getLockInfo() + "后解锁", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131062);
                                composer2.endReplaceableGroup();
                            } else {
                                composer2.startReplaceableGroup(-1662433472);
                                TextKt.m2471Text4IGK_g("还剩" + (objectRef.element.getMaxTimes() - objectRef.element.getMissTimes()) + "次尝试机会", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131062);
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
            }), composerStartRestartGroup, 3072, 6);
            Modifier modifierAlign3 = boxScopeInstance5.align(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6097constructorimpl(30), 7, null), Alignment.INSTANCE.getBottomCenter());
            composerStartRestartGroup.startReplaceableGroup(1098475987);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(FlowRow)P(3,1,4,2)66@2954L113,71@3072L134:FlowLayout.kt#2w3rfo");
            z4 = false;
            MeasurePolicy measurePolicyRowMeasurementHelper3 = FlowLayoutKt.rowMeasurementHelper(Arrangement.INSTANCE.getStart(), Arrangement.INSTANCE.getTop(), Integer.MAX_VALUE, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            str3 = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
            ComposerKt.sourceInformation(composerStartRestartGroup, str3);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierAlign3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM3285constructorimpl2 = Updater.m3285constructorimpl(composerStartRestartGroup);
            Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyRowMeasurementHelper3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3285constructorimpl2.getInserting()) {
                composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            } else {
                composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            function3ModifierMaterializerOf8.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 483375643, "C72@3121L9:FlowLayout.kt#2w3rfo");
            FlowRowScopeInstance flowRowScopeInstance3 = FlowRowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-838711335);
            while (r32.hasNext()) {
                Modifier modifierWrapContentSize$default7 = SizeKt.wrapContentSize$default(SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.3333f), Dp.m6097constructorimpl(90)), alignment, z4, 3, alignment);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composerStartRestartGroup, str);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), z4, composerStartRestartGroup, z4 ? 1 : 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, str3);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, z4 ? 1 : 0);
                CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierWrapContentSize$default7);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3285constructorimpl3 = Updater.m3285constructorimpl(composerStartRestartGroup);
                Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyRememberBoxMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap9, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3285constructorimpl3.getInserting()) {
                    composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                } else {
                    composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                function3ModifierMaterializerOf9.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf(z4 ? 1 : 0));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, str2);
                BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                if (Intrinsics.areEqual(str4, "<")) {
                    composerStartRestartGroup.startReplaceableGroup(-1241592316);
                    if (z3) {
                        IconViewKt.m6909IconViewRidXid8(60000, TextUnitKt.getSp(28), 0L, false, SizeKt.wrapContentSize$default(SizeKt.m616size3ABfNKs(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(35)), false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$2$1$1$1
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
                                objectRef.element.setMessage("");
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(objectRef.element), null, null, new AnonymousClass1(objectRef, null), 3, null);
                                dismiss.invoke();
                            }

                            /* JADX INFO: renamed from: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$2$1$1$1$1, reason: invalid class name */
                            /* JADX INFO: compiled from: SecretCheckView.kt */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            @DebugMetadata(c = "cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$2$1$1$1$1", f = "SecretCheckView.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
                            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ Ref.ObjectRef<SecretViewModel> $viewModel;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass1(Ref.ObjectRef<SecretViewModel> objectRef, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$viewModel = objectRef;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$viewModel, continuation);
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
                                        if (this.$viewModel.element.clearSecrets(this) == coroutine_suspended) {
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
                        }, 7, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | (z4 ? 1 : 0)).getSurfaceVariant(), null, 2, null), Dp.m6097constructorimpl(70)), null, z4, 3, null), composerStartRestartGroup, 54, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    str3 = str3;
                    str = str;
                    str2 = str2;
                    if (Intrinsics.areEqual(str4, "x")) {
                        composerStartRestartGroup.startReplaceableGroup(-1241591510);
                        long sp5 = TextUnitKt.getSp(22);
                        Modifier modifierWrapContentSize$default8 = SizeKt.wrapContentSize$default(SizeKt.m616size3ABfNKs(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(35)), false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$2$1$1$2
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
                                objectRef.element.tap(str4, ok);
                            }
                        }, 7, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | (z4 ? 1 : 0)).getSurfaceVariant(), null, 2, null), Dp.m6097constructorimpl(70)), null, z4, 3, null);
                        z4 = z4 ? 1 : 0;
                        IconViewKt.m6909IconViewRidXid8(IconFont.delete_bin, sp5, 0L, false, modifierWrapContentSize$default8, composerStartRestartGroup, 54, 12);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1241591025);
                        long sp6 = TextUnitKt.getSp(28);
                        Modifier modifierWrapContentSize$default9 = SizeKt.wrapContentSize$default(SizeKt.m616size3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(35)), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | (z4 ? 1 : 0)).getSurfaceVariant(), null, 2, null), false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$SecretCheckView$1$2$1$1$3
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
                                objectRef.element.tap(str4, ok);
                            }
                        }, 7, null), Dp.m6097constructorimpl(70)), null, z4, 3, null);
                        alignment2 = null;
                        z4 = z4 ? 1 : 0;
                        TextKt.m2471Text4IGK_g(str4, modifierWrapContentSize$default9, 0L, sp6, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131060);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    z4 = z4;
                    alignment = alignment2;
                    str3 = str3;
                    str = str;
                    str2 = str2;
                }
                alignment2 = null;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                z4 = z4;
                alignment = alignment2;
                str3 = str3;
                str = str;
                str2 = str2;
            }
            composerStartRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final boolean z6 = z3;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt.SecretCheckView.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i7) {
                SecretCheckViewKt.SecretCheckView(type, z6, dismiss, ok, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    public static final void GlobalSecretCheckView(Function0<Unit> function0, final Function0<Unit> ok, Composer composer, final int i, final int i2) {
        Function0<Unit> function1;
        final int i3;
        final Function0<Unit> function2;
        Intrinsics.checkNotNullParameter(ok, "ok");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1736414744);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(GlobalSecretCheckView)");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            function1 = function0;
        } else if ((i & 14) == 0) {
            function1 = function0;
            i3 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            function1 = function0;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(ok) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            final Function0<Unit> function3 = i4 != 0 ? null : function1;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1736414744, i3, -1, "cn.jianyun.workplan.ui.component.nav.GlobalSecretCheckView (SecretCheckView.kt:405)");
            }
            float fM6097constructorimpl = Dp.m6097constructorimpl(0);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(function3);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$GlobalSecretCheckView$1$1
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
                        Function0<Unit> function4 = function3;
                        if (function4 != null) {
                            Intrinsics.checkNotNull(function4);
                            function4.invoke();
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            function2 = function3;
            DialogViewKt.m6840BottomDialogVieweHTjO5g("", false, null, null, false, fM6097constructorimpl, (Function0) objRememberedValue, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 986988756, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt.GlobalSecretCheckView.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(986988756, i5, -1, "cn.jianyun.workplan.ui.component.nav.GlobalSecretCheckView.<anonymous> (SecretCheckView.kt:410)");
                    }
                    final Function0<Unit> function4 = function3;
                    boolean z = function4 != null;
                    composer2.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                    boolean zChanged2 = composer2.changed(function4);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt$GlobalSecretCheckView$2$1$1
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
                                Function0<Unit> function5 = function4;
                                if (function5 != null) {
                                    Intrinsics.checkNotNull(function5);
                                    function5.invoke();
                                }
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    SecretCheckViewKt.SecretCheckView("check", z, (Function0) objRememberedValue2, ok, composer2, ((i3 << 6) & 7168) | 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, 12804102, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function2 = function1;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SecretCheckViewKt.GlobalSecretCheckView.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i5) {
                SecretCheckViewKt.GlobalSecretCheckView(function2, ok, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }
}