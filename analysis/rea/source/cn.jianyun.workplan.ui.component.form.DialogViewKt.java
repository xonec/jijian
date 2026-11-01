package cn.jianyun.workplan.ui.component.form;

import android.content.res.Configuration;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
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
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.profileinstaller.ProfileVerifier;
import cn.jianyun.workplan.main.Router;
import cn.jianyun.workplan.main.base.PrivatePolicyKt;
import cn.jianyun.workplan.main.base.UserPolicyKt;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.ui.component.nav.BoxViewKt;
import cn.jianyun.workplan.ui.component.nav.HeaderViewKt;
import cn.jianyun.workplan.ui.component.nav.PartTitleViewKt;
import cn.jianyun.workplan.ui.component.sort.TestSortViewKt;
import cn.jianyun.workplan.ui.theme.ColorKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
import cn.jianyun.workplan.util.SelectDO;
import cn.jianyun.workplan.util.SelectUtil;
import cn.jianyun.workplan.util.WeekTool;
import cn.jianyun.workplan.vm.AppViewModel;
import com.bykv.vk.component.ttvideo.player.MediaFormat;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import com.thegrizzlylabs.sardineandroid.util.SardineUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: compiled from: DialogView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\u001a}\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001aE\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010\u0016\u001a3\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010\u0018\u001a.\u0010\u0019\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\u001a\u001a\u0017\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u001d\u001a8\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\u001f\u001a3\u0010 \u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0007¢\u0006\u0002\u0010%\u001ah\u0010&\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0#2\u001b\b\u0002\u0010)\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010*¢\u0006\u0002\b\t2\u0018\u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030#\u0012\u0004\u0012\u00020\u00010*2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010,\u001a/\u0010-\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010/\u001a7\u00100\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u0002022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u00103\u001aK\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u0002022\f\u00106\u001a\b\u0012\u0004\u0012\u0002020#2\u0018\u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002020#\u0012\u0004\u0012\u00020\u00010*2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u00108\u001a\u001b\u00109\u001a\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010:\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006;"}, d2 = {"BottomDialogView", "", "title", "", "lazy", "", "tip", "rightTool", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "cancelable", MediaFormat.KEY_HEIGHT, "Landroidx/compose/ui/unit/Dp;", "onDismiss", "content", "BottomDialogView-eHTjO5g", "(Ljava/lang/String;ZLjava/lang/String;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ConfirmDialog", "okLabel", "cancelLabel", "okAction", "cancelAction", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "DeleteDialog", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "FullDialog", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "LoadingDialog", "label", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "SelfDialog", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "SheetDialog", "onDismissRequest", "sheets", "", "Lcn/jianyun/workplan/ui/component/form/SheetModel;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "SortDialogView", "options", "Lcn/jianyun/workplan/util/SelectDO;", "renderAction", "Lkotlin/Function1;", "onChange", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "TipDialog", "message", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "UpdateIntroDialog", "seconds", "", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "WeekChooseDialog", "totalWeeks", "fixWeeks", "dismissAction", "(ILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "WelcomeDialog", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DialogViewKt {
    public static final void SheetDialog(final String str, final Function0<Unit> onDismissRequest, final List<SheetModel> sheets, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(sheets, "sheets");
        Composer composerStartRestartGroup = composer.startRestartGroup(-425077917);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SheetDialog)P(2)");
        if ((i2 & 1) != 0) {
            str = "";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-425077917, i, -1, "cn.jianyun.workplan.ui.component.form.SheetDialog (DialogView.kt:80)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-286339474);
        if (SheetDialog$lambda$1(mutableState)) {
            composerStartRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onDismissRequest);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$SheetDialog$1$1$1
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
                        DialogViewKt.SheetDialog$lambda$2(mutableState, false);
                        onDismissRequest.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidAlertDialog_androidKt.AlertDialog((Function0) objRememberedValue2, ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(20))), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1186938646, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$SheetDialog$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1186938646, i3, -1, "cn.jianyun.workplan.ui.component.form.SheetDialog.<anonymous>.<anonymous> (DialogView.kt:91)");
                        }
                        final String str2 = str;
                        final int i4 = i;
                        final List<SheetModel> list = sheets;
                        GroupViewKt.m6850GroupViewfIyqwc(null, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer2, -314387271, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$SheetDialog$1$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i5) {
                                boolean z;
                                int i6 = 2;
                                if ((i5 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-314387271, i5, -1, "cn.jianyun.workplan.ui.component.form.SheetDialog.<anonymous>.<anonymous>.<anonymous> (DialogView.kt:92)");
                                    }
                                    composer3.startReplaceableGroup(1465208010);
                                    int i7 = 10;
                                    boolean z2 = false;
                                    if (!Intrinsics.areEqual(str2, "")) {
                                        CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(5), composer3, 6, 0);
                                        BoxViewKt.m6891LeadingHintViewRuDwNsA(str2, 0.0f, 0L, 0L, null, composer3, i4 & 14, 30);
                                        CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(10), composer3, 6, 0);
                                    }
                                    composer3.endReplaceableGroup();
                                    for (final SheetModel sheetModel : list) {
                                        if (sheetModel.getShown()) {
                                            boolean z3 = z2;
                                            z = z3;
                                            TextKt.m2471Text4IGK_g(sheetModel.getName(), SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(PaddingKt.m569paddingVpY3zN4$default(SizeKt.m602height3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(8)), false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$SheetDialog$1$2$1$1$1
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
                                                    sheetModel.getAction().invoke();
                                                }
                                            }, 7, null), Dp.m6097constructorimpl(48)), Dp.m6097constructorimpl(i7), 0.0f, i6, null), 0.0f, 1, null), null, z3, 3, null), sheetModel.m6858getColor0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(i7), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 6, 130040);
                                        } else {
                                            z = z2;
                                        }
                                        i7 = i7;
                                        z2 = z;
                                        i6 = i6;
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
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composerStartRestartGroup, 3072, 4);
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
        final String str2 = str;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.SheetDialog.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                DialogViewKt.SheetDialog(str2, onDismissRequest, sheets, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    private static final boolean SheetDialog$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SheetDialog$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void SelfDialog(boolean z, final Function0<Unit> onDismiss, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        boolean z2;
        final int i3;
        final boolean z3;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1308685695);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SelfDialog)P(!1,2)");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 14) == 0) {
            z2 = z;
            i3 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
            z3 = i4 != 0 ? false : z2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1308685695, i3, -1, "cn.jianyun.workplan.ui.component.form.SelfDialog (DialogView.kt:119)");
            }
            DialogProperties dialogProperties = new DialogProperties(false, false, null, false, false, 23, null);
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(onDismiss);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$SelfDialog$1$1
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
                        onDismiss.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidAlertDialog_androidKt.AlertDialog((Function0) objRememberedValue, companion, dialogProperties, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1100837303, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.SelfDialog.2
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

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1100837303, i5, -1, "cn.jianyun.workplan.ui.component.form.SelfDialog.<anonymous> (DialogView.kt:124)");
                        }
                        float f2 = 20;
                        Modifier modifierM567padding3ABfNKs = PaddingKt.m567padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6097constructorimpl(f2));
                        Object objValueOf = Boolean.valueOf(z3);
                        final Function0<Unit> function0 = onDismiss;
                        final boolean z4 = z3;
                        composer2.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        boolean zChanged2 = composer2.changed(objValueOf) | composer2.changed(function0);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$SelfDialog$2$1$1
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
                                    if (z4) {
                                        function0.invoke();
                                    }
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifierTap = ButtonViewKt.tap(modifierM567padding3ABfNKs, (Function0) objRememberedValue2);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        Function2<Composer, Integer, Unit> function2 = content;
                        int i6 = i3;
                        composer2.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierTap);
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
                        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierM567padding3ABfNKs2 = PaddingKt.m567padding3ABfNKs(BackgroundKt.m214backgroundbw27NRU$default(ClipKt.clip(ButtonViewKt.tap(Modifier.INSTANCE, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$SelfDialog$2$2$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        }), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(f2))), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getSurface(), null, 2, null), Dp.m6097constructorimpl(f2));
                        composer2.startReplaceableGroup(-483455358);
                        ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM567padding3ABfNKs2);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composer2);
                        Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer2, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        function2.invoke(composer2, Integer.valueOf((i6 >> 6) & 14));
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
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
            }), composerStartRestartGroup, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z3 = z2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final boolean z4 = z3;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.SelfDialog.3
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

            public final void invoke(Composer composer2, int i5) {
                DialogViewKt.SelfDialog(z4, onDismiss, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    public static final void FullDialog(final Function0<Unit> onDismiss, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        final int i2;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-371206426);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(FullDialog)P(1)");
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onDismiss) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-371206426, i2, -1, "cn.jianyun.workplan.ui.component.form.FullDialog (DialogView.kt:150)");
            }
            DialogProperties dialogProperties = new DialogProperties(false, false, null, false, false, 23, null);
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(onDismiss);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$FullDialog$1$1
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
                        onDismiss.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidAlertDialog_androidKt.AlertDialog((Function0) objRememberedValue, companion, dialogProperties, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1755063888, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.FullDialog.2
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

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1755063888, i3, -1, "cn.jianyun.workplan.ui.component.form.FullDialog.<anonymous> (DialogView.kt:155)");
                        }
                        Modifier modifierTap = ButtonViewKt.tap(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getSurface(), null, 2, null), new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.FullDialog.2.1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        });
                        Alignment topStart = Alignment.INSTANCE.getTopStart();
                        Function2<Composer, Integer, Unit> function2 = content;
                        int i4 = i2;
                        composer2.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topStart, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierTap);
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
                        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierM567padding3ABfNKs = PaddingKt.m567padding3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(20));
                        composer2.startReplaceableGroup(-483455358);
                        ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM567padding3ABfNKs);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composer2);
                        Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer2, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        function2.invoke(composer2, Integer.valueOf((i4 >> 3) & 14));
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
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
            }), composerStartRestartGroup, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.FullDialog.3
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

            public final void invoke(Composer composer2, int i3) {
                DialogViewKt.FullDialog(onDismiss, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    public static final void DeleteDialog(String str, final Function0<Unit> okAction, final Function0<Unit> cancelAction, Composer composer, final int i, final int i2) {
        String str2;
        int i3;
        Intrinsics.checkNotNullParameter(okAction, "okAction");
        Intrinsics.checkNotNullParameter(cancelAction, "cancelAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1242244597);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DeleteDialog)P(2,1)");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            str2 = str;
        } else if ((i & 14) == 0) {
            str2 = str;
            i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(okAction) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(cancelAction) ? 256 : 128;
        }
        final int i5 = i3;
        if ((i5 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
            final String str3 = i4 != 0 ? "真的要删除吗?" : str2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1242244597, i5, -1, "cn.jianyun.workplan.ui.component.form.DeleteDialog (DialogView.kt:172)");
            }
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(cancelAction);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$DeleteDialog$1$1
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
                        cancelAction.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            String str4 = str3;
            AndroidAlertDialog_androidKt.m1570AlertDialogOix01E0((Function0) objRememberedValue, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 146247341, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.DeleteDialog.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(146247341, i6, -1, "cn.jianyun.workplan.ui.component.form.DeleteDialog.<anonymous> (DialogView.kt:176)");
                    }
                    float fM6097constructorimpl = Dp.m6097constructorimpl(5);
                    long sp = TextUnitKt.getSp(16);
                    long error = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getError();
                    final Function0<Unit> function0 = okAction;
                    composer2.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                    boolean zChanged2 = composer2.changed(function0);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$DeleteDialog$2$1$1
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
                                function0.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    CommonUIKt.m6950LinkTexthfI1UA("确定", fM6097constructorimpl, sp, error, (Function0) objRememberedValue2, composer2, 438, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -438524309, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.DeleteDialog.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-438524309, i6, -1, "cn.jianyun.workplan.ui.component.form.DeleteDialog.<anonymous> (DialogView.kt:180)");
                    }
                    float fM6097constructorimpl = Dp.m6097constructorimpl(5);
                    long sp = TextUnitKt.getSp(16);
                    final Function0<Unit> function0 = cancelAction;
                    composer2.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                    boolean zChanged2 = composer2.changed(function0);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$DeleteDialog$3$1$1
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
                                function0.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    CommonUIKt.m6949GrayLinkText53ZIcWk("取消", fM6097constructorimpl, sp, (Function0) objRememberedValue2, composer2, 438, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), null, ComposableSingletons$DialogViewKt.INSTANCE.m6818getLambda2$app_release(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1315681784, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.DeleteDialog.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1315681784, i6, -1, "cn.jianyun.workplan.ui.component.form.DeleteDialog.<anonymous> (DialogView.kt:189)");
                    }
                    TextKt.m2471Text4IGK_g(str3, (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(25), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i5 & 14) | 3072, 6, 130038);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), null, 0L, 0L, 0L, 0L, 0.0f, null, composerStartRestartGroup, 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str2 = str4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final String str5 = str2;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.DeleteDialog.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i6) {
                DialogViewKt.DeleteDialog(str5, okAction, cancelAction, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Code duplicated, block: B:38:0x007b  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:43:0x0088  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x009e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:77:0x015a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0165  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public static final void ConfirmDialog(final String title, String str, String str2, final Function0<Unit> okAction, final Function0<Unit> cancelAction, Composer composer, final int i, final int i2) {
        final int i3;
        String str3;
        int i4;
        String str4;
        int i5;
        int i6;
        int i7;
        final String str5;
        final String str6;
        boolean zChanged;
        Object objRememberedValue;
        final String str7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(okAction, "okAction");
        Intrinsics.checkNotNullParameter(cancelAction, "cancelAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-130570244);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ConfirmDialog)P(4,3,1,2)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 112) == 0) {
                str3 = str;
                i3 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    str4 = str2;
                    if (composerStartRestartGroup.changed(str4)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    if (composerStartRestartGroup.changedInstance(okAction)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                if ((i2 & 16) != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                } else if ((57344 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(cancelAction)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((46811 & i3) == 9362 || !composerStartRestartGroup.getSkipping()) {
                    if (i8 != 0) {
                        str5 = "确定";
                    } else {
                        str5 = str3;
                    }
                    if (i4 != 0) {
                        str6 = "取消";
                    } else {
                        str6 = str4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-130570244, i3, -1, "cn.jianyun.workplan.ui.component.form.ConfirmDialog (DialogView.kt:196)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(cancelAction);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$ConfirmDialog$1$1
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
                                cancelAction.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -284837820, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.ConfirmDialog.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i9) {
                            if ((i9 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-284837820, i9, -1, "cn.jianyun.workplan.ui.component.form.ConfirmDialog.<anonymous> (DialogView.kt:200)");
                            }
                            String str8 = str5;
                            float fM6097constructorimpl = Dp.m6097constructorimpl(5);
                            long sp = TextUnitKt.getSp(16);
                            long themeColor = ColorKt.getThemeColor();
                            final Function0<Unit> function0 = okAction;
                            composer2.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                            boolean zChanged2 = composer2.changed(function0);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$ConfirmDialog$2$1$1
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
                                        function0.invoke();
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            CommonUIKt.m6950LinkTexthfI1UA(str8, fM6097constructorimpl, sp, themeColor, (Function0) objRememberedValue2, composer2, ((i3 >> 3) & 14) | 3504, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 141716678, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.ConfirmDialog.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i9) {
                            if ((i9 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(141716678, i9, -1, "cn.jianyun.workplan.ui.component.form.ConfirmDialog.<anonymous> (DialogView.kt:204)");
                            }
                            String str8 = str6;
                            float fM6097constructorimpl = Dp.m6097constructorimpl(5);
                            long sp = TextUnitKt.getSp(16);
                            final Function0<Unit> function0 = cancelAction;
                            composer2.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                            boolean zChanged2 = composer2.changed(function0);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$ConfirmDialog$3$1$1
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
                                        function0.invoke();
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            CommonUIKt.m6949GrayLinkText53ZIcWk(str8, fM6097constructorimpl, sp, (Function0) objRememberedValue2, composer2, ((i3 >> 6) & 14) | 432, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    Function2<Composer, Integer, Unit> function2M6820getLambda4$app_release = ComposableSingletons$DialogViewKt.INSTANCE.m6820getLambda4$app_release();
                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1365935223, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.ConfirmDialog.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i9) {
                            if ((i9 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1365935223, i9, -1, "cn.jianyun.workplan.ui.component.form.ConfirmDialog.<anonymous> (DialogView.kt:213)");
                            }
                            TextKt.m2471Text4IGK_g(title, (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(30), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i3 & 14) | 3072, 6, 130038);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    str7 = str6;
                    String str8 = str5;
                    AndroidAlertDialog_androidKt.m1570AlertDialogOix01E0((Function0) objRememberedValue, composableLambda, null, composableLambda2, null, function2M6820getLambda4$app_release, composableLambda3, null, 0L, 0L, 0L, 0L, 0.0f, null, composerStartRestartGroup, 1772592, 0, 16276);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str3 = str8;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    str7 = str4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final String str9 = str3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.ConfirmDialog.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i9) {
                        DialogViewKt.ConfirmDialog(title, str9, str7, okAction, cancelAction, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
            str4 = str2;
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(okAction)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i2 & 16) != 0) {
                i3 |= CpioConstants.C_ISBLK;
            } else if ((57344 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(cancelAction)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((46811 & i3) == 9362) {
                if (i8 != 0) {
                    str5 = "确定";
                } else {
                    str5 = str3;
                }
                if (i4 != 0) {
                    str6 = "取消";
                } else {
                    str6 = str4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-130570244, i3, -1, "cn.jianyun.workplan.ui.component.form.ConfirmDialog (DialogView.kt:196)");
                }
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(cancelAction);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$ConfirmDialog$1$1
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
                            cancelAction.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$ConfirmDialog$1$1
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
                            cancelAction.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -284837820, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.ConfirmDialog.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i9) {
                        if ((i9 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-284837820, i9, -1, "cn.jianyun.workplan.ui.component.form.ConfirmDialog.<anonymous> (DialogView.kt:200)");
                        }
                        String str10 = str5;
                        float fM6097constructorimpl = Dp.m6097constructorimpl(5);
                        long sp = TextUnitKt.getSp(16);
                        long themeColor = ColorKt.getThemeColor();
                        final Function0<Unit> function0 = okAction;
                        composer2.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                        boolean zChanged2 = composer2.changed(function0);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$ConfirmDialog$2$1$1
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
                                    function0.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        CommonUIKt.m6950LinkTexthfI1UA(str10, fM6097constructorimpl, sp, themeColor, (Function0) objRememberedValue2, composer2, ((i3 >> 3) & 14) | 3504, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 141716678, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.ConfirmDialog.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i9) {
                        if ((i9 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(141716678, i9, -1, "cn.jianyun.workplan.ui.component.form.ConfirmDialog.<anonymous> (DialogView.kt:204)");
                        }
                        String str10 = str6;
                        float fM6097constructorimpl = Dp.m6097constructorimpl(5);
                        long sp = TextUnitKt.getSp(16);
                        final Function0<Unit> function0 = cancelAction;
                        composer2.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                        boolean zChanged2 = composer2.changed(function0);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$ConfirmDialog$3$1$1
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
                                    function0.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        CommonUIKt.m6949GrayLinkText53ZIcWk(str10, fM6097constructorimpl, sp, (Function0) objRememberedValue2, composer2, ((i3 >> 6) & 14) | 432, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                Function2<Composer, Integer, Unit> function2M6820getLambda4$app_release2 = ComposableSingletons$DialogViewKt.INSTANCE.m6820getLambda4$app_release();
                ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1365935223, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.ConfirmDialog.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i9) {
                        if ((i9 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1365935223, i9, -1, "cn.jianyun.workplan.ui.component.form.ConfirmDialog.<anonymous> (DialogView.kt:213)");
                        }
                        TextKt.m2471Text4IGK_g(title, (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(30), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i3 & 14) | 3072, 6, 130038);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                str7 = str6;
                String str10 = str5;
                AndroidAlertDialog_androidKt.m1570AlertDialogOix01E0((Function0) objRememberedValue, composableLambda4, null, composableLambda5, null, function2M6820getLambda4$app_release2, composableLambda6, null, 0L, 0L, 0L, 0L, 0.0f, null, composerStartRestartGroup, 1772592, 0, 16276);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str3 = str10;
            } else {
                if (i8 != 0) {
                    str5 = "确定";
                } else {
                    str5 = str3;
                }
                if (i4 != 0) {
                    str6 = "取消";
                } else {
                    str6 = str4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-130570244, i3, -1, "cn.jianyun.workplan.ui.component.form.ConfirmDialog (DialogView.kt:196)");
                }
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(cancelAction);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$ConfirmDialog$1$1
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
                            cancelAction.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$ConfirmDialog$1$1
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
                            cancelAction.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -284837820, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.ConfirmDialog.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i9) {
                        if ((i9 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-284837820, i9, -1, "cn.jianyun.workplan.ui.component.form.ConfirmDialog.<anonymous> (DialogView.kt:200)");
                        }
                        String str11 = str5;
                        float fM6097constructorimpl = Dp.m6097constructorimpl(5);
                        long sp = TextUnitKt.getSp(16);
                        long themeColor = ColorKt.getThemeColor();
                        final Function0<Unit> function0 = okAction;
                        composer2.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                        boolean zChanged2 = composer2.changed(function0);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$ConfirmDialog$2$1$1
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
                                    function0.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        CommonUIKt.m6950LinkTexthfI1UA(str11, fM6097constructorimpl, sp, themeColor, (Function0) objRememberedValue2, composer2, ((i3 >> 3) & 14) | 3504, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 141716678, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.ConfirmDialog.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i9) {
                        if ((i9 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(141716678, i9, -1, "cn.jianyun.workplan.ui.component.form.ConfirmDialog.<anonymous> (DialogView.kt:204)");
                        }
                        String str11 = str6;
                        float fM6097constructorimpl = Dp.m6097constructorimpl(5);
                        long sp = TextUnitKt.getSp(16);
                        final Function0<Unit> function0 = cancelAction;
                        composer2.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                        boolean zChanged2 = composer2.changed(function0);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$ConfirmDialog$3$1$1
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
                                    function0.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        CommonUIKt.m6949GrayLinkText53ZIcWk(str11, fM6097constructorimpl, sp, (Function0) objRememberedValue2, composer2, ((i3 >> 6) & 14) | 432, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                Function2<Composer, Integer, Unit> function2M6820getLambda4$app_release3 = ComposableSingletons$DialogViewKt.INSTANCE.m6820getLambda4$app_release();
                ComposableLambda composableLambda9 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1365935223, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.ConfirmDialog.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i9) {
                        if ((i9 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1365935223, i9, -1, "cn.jianyun.workplan.ui.component.form.ConfirmDialog.<anonymous> (DialogView.kt:213)");
                        }
                        TextKt.m2471Text4IGK_g(title, (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(30), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i3 & 14) | 3072, 6, 130038);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                str7 = str6;
                String str11 = str5;
                AndroidAlertDialog_androidKt.m1570AlertDialogOix01E0((Function0) objRememberedValue, composableLambda7, null, composableLambda8, null, function2M6820getLambda4$app_release3, composableLambda9, null, 0L, 0L, 0L, 0L, 0.0f, null, composerStartRestartGroup, 1772592, 0, 16276);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str3 = str11;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final String str12 = str3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.ConfirmDialog.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i9) {
                    DialogViewKt.ConfirmDialog(title, str12, str7, okAction, cancelAction, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        str3 = str;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                str4 = str2;
                if (composerStartRestartGroup.changed(str4)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(okAction)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i2 & 16) != 0) {
                i3 |= CpioConstants.C_ISBLK;
            } else if ((57344 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(cancelAction)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((46811 & i3) == 9362) {
                if (i8 != 0) {
                    str5 = "确定";
                } else {
                    str5 = str3;
                }
                if (i4 != 0) {
                    str6 = "取消";
                } else {
                    str6 = str4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-130570244, i3, -1, "cn.jianyun.workplan.ui.component.form.ConfirmDialog (DialogView.kt:196)");
                }
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(cancelAction);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$ConfirmDialog$1$1
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
                            cancelAction.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$ConfirmDialog$1$1
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
                            cancelAction.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ComposableLambda composableLambda10 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -284837820, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.ConfirmDialog.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i9) {
                        if ((i9 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-284837820, i9, -1, "cn.jianyun.workplan.ui.component.form.ConfirmDialog.<anonymous> (DialogView.kt:200)");
                        }
                        String str13 = str5;
                        float fM6097constructorimpl = Dp.m6097constructorimpl(5);
                        long sp = TextUnitKt.getSp(16);
                        long themeColor = ColorKt.getThemeColor();
                        final Function0<Unit> function0 = okAction;
                        composer2.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                        boolean zChanged2 = composer2.changed(function0);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$ConfirmDialog$2$1$1
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
                                    function0.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        CommonUIKt.m6950LinkTexthfI1UA(str13, fM6097constructorimpl, sp, themeColor, (Function0) objRememberedValue2, composer2, ((i3 >> 3) & 14) | 3504, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                ComposableLambda composableLambda11 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 141716678, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.ConfirmDialog.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i9) {
                        if ((i9 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(141716678, i9, -1, "cn.jianyun.workplan.ui.component.form.ConfirmDialog.<anonymous> (DialogView.kt:204)");
                        }
                        String str13 = str6;
                        float fM6097constructorimpl = Dp.m6097constructorimpl(5);
                        long sp = TextUnitKt.getSp(16);
                        final Function0<Unit> function0 = cancelAction;
                        composer2.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                        boolean zChanged2 = composer2.changed(function0);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$ConfirmDialog$3$1$1
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
                                    function0.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        CommonUIKt.m6949GrayLinkText53ZIcWk(str13, fM6097constructorimpl, sp, (Function0) objRememberedValue2, composer2, ((i3 >> 6) & 14) | 432, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                Function2<Composer, Integer, Unit> function2M6820getLambda4$app_release4 = ComposableSingletons$DialogViewKt.INSTANCE.m6820getLambda4$app_release();
                ComposableLambda composableLambda12 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1365935223, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.ConfirmDialog.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i9) {
                        if ((i9 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1365935223, i9, -1, "cn.jianyun.workplan.ui.component.form.ConfirmDialog.<anonymous> (DialogView.kt:213)");
                        }
                        TextKt.m2471Text4IGK_g(title, (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(30), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i3 & 14) | 3072, 6, 130038);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                str7 = str6;
                String str13 = str5;
                AndroidAlertDialog_androidKt.m1570AlertDialogOix01E0((Function0) objRememberedValue, composableLambda10, null, composableLambda11, null, function2M6820getLambda4$app_release4, composableLambda12, null, 0L, 0L, 0L, 0L, 0.0f, null, composerStartRestartGroup, 1772592, 0, 16276);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str3 = str13;
            } else {
                if (i8 != 0) {
                    str5 = "确定";
                } else {
                    str5 = str3;
                }
                if (i4 != 0) {
                    str6 = "取消";
                } else {
                    str6 = str4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-130570244, i3, -1, "cn.jianyun.workplan.ui.component.form.ConfirmDialog (DialogView.kt:196)");
                }
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(cancelAction);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$ConfirmDialog$1$1
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
                            cancelAction.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$ConfirmDialog$1$1
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
                            cancelAction.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ComposableLambda composableLambda13 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -284837820, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.ConfirmDialog.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i9) {
                        if ((i9 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-284837820, i9, -1, "cn.jianyun.workplan.ui.component.form.ConfirmDialog.<anonymous> (DialogView.kt:200)");
                        }
                        String str14 = str5;
                        float fM6097constructorimpl = Dp.m6097constructorimpl(5);
                        long sp = TextUnitKt.getSp(16);
                        long themeColor = ColorKt.getThemeColor();
                        final Function0<Unit> function0 = okAction;
                        composer2.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                        boolean zChanged2 = composer2.changed(function0);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$ConfirmDialog$2$1$1
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
                                    function0.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        CommonUIKt.m6950LinkTexthfI1UA(str14, fM6097constructorimpl, sp, themeColor, (Function0) objRememberedValue2, composer2, ((i3 >> 3) & 14) | 3504, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                ComposableLambda composableLambda14 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 141716678, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.ConfirmDialog.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i9) {
                        if ((i9 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(141716678, i9, -1, "cn.jianyun.workplan.ui.component.form.ConfirmDialog.<anonymous> (DialogView.kt:204)");
                        }
                        String str14 = str6;
                        float fM6097constructorimpl = Dp.m6097constructorimpl(5);
                        long sp = TextUnitKt.getSp(16);
                        final Function0<Unit> function0 = cancelAction;
                        composer2.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                        boolean zChanged2 = composer2.changed(function0);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$ConfirmDialog$3$1$1
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
                                    function0.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        CommonUIKt.m6949GrayLinkText53ZIcWk(str14, fM6097constructorimpl, sp, (Function0) objRememberedValue2, composer2, ((i3 >> 6) & 14) | 432, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                Function2<Composer, Integer, Unit> function2M6820getLambda4$app_release5 = ComposableSingletons$DialogViewKt.INSTANCE.m6820getLambda4$app_release();
                ComposableLambda composableLambda15 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1365935223, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.ConfirmDialog.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i9) {
                        if ((i9 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1365935223, i9, -1, "cn.jianyun.workplan.ui.component.form.ConfirmDialog.<anonymous> (DialogView.kt:213)");
                        }
                        TextKt.m2471Text4IGK_g(title, (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(30), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i3 & 14) | 3072, 6, 130038);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                str7 = str6;
                String str14 = str5;
                AndroidAlertDialog_androidKt.m1570AlertDialogOix01E0((Function0) objRememberedValue, composableLambda13, null, composableLambda14, null, function2M6820getLambda4$app_release5, composableLambda15, null, 0L, 0L, 0L, 0L, 0.0f, null, composerStartRestartGroup, 1772592, 0, 16276);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str3 = str14;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final String str15 = str3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.ConfirmDialog.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i9) {
                    DialogViewKt.ConfirmDialog(title, str15, str7, okAction, cancelAction, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
        str4 = str2;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (composerStartRestartGroup.changedInstance(okAction)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i2 & 16) != 0) {
            i3 |= CpioConstants.C_ISBLK;
        } else if ((57344 & i) == 0) {
            if (composerStartRestartGroup.changedInstance(cancelAction)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        if ((46811 & i3) == 9362) {
            if (i8 != 0) {
                str5 = "确定";
            } else {
                str5 = str3;
            }
            if (i4 != 0) {
                str6 = "取消";
            } else {
                str6 = str4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-130570244, i3, -1, "cn.jianyun.workplan.ui.component.form.ConfirmDialog (DialogView.kt:196)");
            }
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            zChanged = composerStartRestartGroup.changed(cancelAction);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$ConfirmDialog$1$1
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
                        cancelAction.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$ConfirmDialog$1$1
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
                        cancelAction.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ComposableLambda composableLambda16 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -284837820, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.ConfirmDialog.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i9) {
                    if ((i9 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-284837820, i9, -1, "cn.jianyun.workplan.ui.component.form.ConfirmDialog.<anonymous> (DialogView.kt:200)");
                    }
                    String str16 = str5;
                    float fM6097constructorimpl = Dp.m6097constructorimpl(5);
                    long sp = TextUnitKt.getSp(16);
                    long themeColor = ColorKt.getThemeColor();
                    final Function0<Unit> function0 = okAction;
                    composer2.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                    boolean zChanged2 = composer2.changed(function0);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$ConfirmDialog$2$1$1
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
                                function0.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    CommonUIKt.m6950LinkTexthfI1UA(str16, fM6097constructorimpl, sp, themeColor, (Function0) objRememberedValue2, composer2, ((i3 >> 3) & 14) | 3504, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            ComposableLambda composableLambda17 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 141716678, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.ConfirmDialog.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i9) {
                    if ((i9 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(141716678, i9, -1, "cn.jianyun.workplan.ui.component.form.ConfirmDialog.<anonymous> (DialogView.kt:204)");
                    }
                    String str16 = str6;
                    float fM6097constructorimpl = Dp.m6097constructorimpl(5);
                    long sp = TextUnitKt.getSp(16);
                    final Function0<Unit> function0 = cancelAction;
                    composer2.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                    boolean zChanged2 = composer2.changed(function0);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$ConfirmDialog$3$1$1
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
                                function0.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    CommonUIKt.m6949GrayLinkText53ZIcWk(str16, fM6097constructorimpl, sp, (Function0) objRememberedValue2, composer2, ((i3 >> 6) & 14) | 432, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            Function2<Composer, Integer, Unit> function2M6820getLambda4$app_release6 = ComposableSingletons$DialogViewKt.INSTANCE.m6820getLambda4$app_release();
            ComposableLambda composableLambda18 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1365935223, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.ConfirmDialog.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i9) {
                    if ((i9 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1365935223, i9, -1, "cn.jianyun.workplan.ui.component.form.ConfirmDialog.<anonymous> (DialogView.kt:213)");
                    }
                    TextKt.m2471Text4IGK_g(title, (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(30), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i3 & 14) | 3072, 6, 130038);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            str7 = str6;
            String str16 = str5;
            AndroidAlertDialog_androidKt.m1570AlertDialogOix01E0((Function0) objRememberedValue, composableLambda16, null, composableLambda17, null, function2M6820getLambda4$app_release6, composableLambda18, null, 0L, 0L, 0L, 0L, 0.0f, null, composerStartRestartGroup, 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str3 = str16;
        } else {
            if (i8 != 0) {
                str5 = "确定";
            } else {
                str5 = str3;
            }
            if (i4 != 0) {
                str6 = "取消";
            } else {
                str6 = str4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-130570244, i3, -1, "cn.jianyun.workplan.ui.component.form.ConfirmDialog (DialogView.kt:196)");
            }
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            zChanged = composerStartRestartGroup.changed(cancelAction);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$ConfirmDialog$1$1
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
                        cancelAction.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$ConfirmDialog$1$1
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
                        cancelAction.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ComposableLambda composableLambda19 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -284837820, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.ConfirmDialog.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i9) {
                    if ((i9 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-284837820, i9, -1, "cn.jianyun.workplan.ui.component.form.ConfirmDialog.<anonymous> (DialogView.kt:200)");
                    }
                    String str17 = str5;
                    float fM6097constructorimpl = Dp.m6097constructorimpl(5);
                    long sp = TextUnitKt.getSp(16);
                    long themeColor = ColorKt.getThemeColor();
                    final Function0<Unit> function0 = okAction;
                    composer2.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                    boolean zChanged2 = composer2.changed(function0);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$ConfirmDialog$2$1$1
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
                                function0.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    CommonUIKt.m6950LinkTexthfI1UA(str17, fM6097constructorimpl, sp, themeColor, (Function0) objRememberedValue2, composer2, ((i3 >> 3) & 14) | 3504, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            ComposableLambda composableLambda110 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 141716678, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.ConfirmDialog.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i9) {
                    if ((i9 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(141716678, i9, -1, "cn.jianyun.workplan.ui.component.form.ConfirmDialog.<anonymous> (DialogView.kt:204)");
                    }
                    String str17 = str6;
                    float fM6097constructorimpl = Dp.m6097constructorimpl(5);
                    long sp = TextUnitKt.getSp(16);
                    final Function0<Unit> function0 = cancelAction;
                    composer2.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                    boolean zChanged2 = composer2.changed(function0);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$ConfirmDialog$3$1$1
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
                                function0.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    CommonUIKt.m6949GrayLinkText53ZIcWk(str17, fM6097constructorimpl, sp, (Function0) objRememberedValue2, composer2, ((i3 >> 6) & 14) | 432, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            Function2<Composer, Integer, Unit> function2M6820getLambda4$app_release7 = ComposableSingletons$DialogViewKt.INSTANCE.m6820getLambda4$app_release();
            ComposableLambda composableLambda111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1365935223, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.ConfirmDialog.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i9) {
                    if ((i9 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1365935223, i9, -1, "cn.jianyun.workplan.ui.component.form.ConfirmDialog.<anonymous> (DialogView.kt:213)");
                    }
                    TextKt.m2471Text4IGK_g(title, (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(30), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i3 & 14) | 3072, 6, 130038);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            str7 = str6;
            String str17 = str5;
            AndroidAlertDialog_androidKt.m1570AlertDialogOix01E0((Function0) objRememberedValue, composableLambda19, null, composableLambda110, null, function2M6820getLambda4$app_release7, composableLambda111, null, 0L, 0L, 0L, 0L, 0.0f, null, composerStartRestartGroup, 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str3 = str17;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final String str18 = str3;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.ConfirmDialog.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i9) {
                DialogViewKt.ConfirmDialog(title, str18, str7, okAction, cancelAction, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:44:0x0085  */
    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0102  */
    /* JADX WARN: Code duplicated, block: B:56:0x010d  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void TipDialog(String str, String str2, final Function0<Unit> cancelAction, Composer composer, final int i, final int i2) {
        String str3;
        int i3;
        String str4;
        int i4;
        final int i5;
        final String str5;
        final String str6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(cancelAction, "cancelAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1981586902);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TipDialog)P(2,1)");
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            str3 = str;
        } else if ((i & 14) == 0) {
            str3 = str;
            i3 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 112) == 0) {
                str4 = str2;
                i3 |= composerStartRestartGroup.changed(str4) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
            } else if ((i & 896) == 0) {
                if (composerStartRestartGroup.changedInstance(cancelAction)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            i5 = i3;
            if ((i5 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i6 != 0) {
                    str5 = "温馨提示";
                } else {
                    str5 = str3;
                }
                if (i7 != 0) {
                    str6 = "这里是内容";
                } else {
                    str6 = str4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1981586902, i5, -1, "cn.jianyun.workplan.ui.component.form.TipDialog (DialogView.kt:221)");
                }
                String str7 = str6;
                AndroidAlertDialog_androidKt.m1570AlertDialogOix01E0(new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.TipDialog.1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 962245858, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.TipDialog.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i8) {
                        if ((i8 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(962245858, i8, -1, "cn.jianyun.workplan.ui.component.form.TipDialog.<anonymous> (DialogView.kt:226)");
                        }
                        float fM6097constructorimpl = Dp.m6097constructorimpl(5);
                        long sp = TextUnitKt.getSp(16);
                        long error = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getError();
                        final Function0<Unit> function0 = cancelAction;
                        composer2.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                        boolean zChanged = composer2.changed(function0);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$TipDialog$2$1$1
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
                                    function0.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        CommonUIKt.m6950LinkTexthfI1UA("我知道了", fM6097constructorimpl, sp, error, (Function0) objRememberedValue, composer2, 438, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), PaddingKt.m569paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6097constructorimpl(20), 0.0f, 2, null), null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1156395358, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.TipDialog.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i8) {
                        if ((i8 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1156395358, i8, -1, "cn.jianyun.workplan.ui.component.form.TipDialog.<anonymous> (DialogView.kt:230)");
                        }
                        TextKt.m2471Text4IGK_g(str5, (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (14 & i5) | 199680, 0, 131030);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2016292739, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.TipDialog.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i8) {
                        if ((i8 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2016292739, i8, -1, "cn.jianyun.workplan.ui.component.form.TipDialog.<anonymous> (DialogView.kt:232)");
                        }
                        TextKt.m2471Text4IGK_g(str6, (Modifier) null, 0L, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(22), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ((i5 >> 3) & 14) | 3072, 6, 130038);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), null, 0L, 0L, 0L, 0L, 0.0f, null, composerStartRestartGroup, 1772982, 0, 16272);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str4 = str7;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                str5 = str3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final String str8 = str5;
            final String str9 = str4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.TipDialog.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    DialogViewKt.TipDialog(str8, str9, cancelAction, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        str4 = str2;
        if ((i2 & 4) != 0) {
            i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
        } else if ((i & 896) == 0) {
            if (composerStartRestartGroup.changedInstance(cancelAction)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        i5 = i3;
        if ((i5 & 731) == 146) {
            if (i6 != 0) {
                str5 = "温馨提示";
            } else {
                str5 = str3;
            }
            if (i7 != 0) {
                str6 = "这里是内容";
            } else {
                str6 = str4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1981586902, i5, -1, "cn.jianyun.workplan.ui.component.form.TipDialog (DialogView.kt:221)");
            }
            String str10 = str6;
            AndroidAlertDialog_androidKt.m1570AlertDialogOix01E0(new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.TipDialog.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 962245858, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.TipDialog.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    if ((i8 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(962245858, i8, -1, "cn.jianyun.workplan.ui.component.form.TipDialog.<anonymous> (DialogView.kt:226)");
                    }
                    float fM6097constructorimpl = Dp.m6097constructorimpl(5);
                    long sp = TextUnitKt.getSp(16);
                    long error = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getError();
                    final Function0<Unit> function0 = cancelAction;
                    composer2.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                    boolean zChanged = composer2.changed(function0);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$TipDialog$2$1$1
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
                                function0.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    CommonUIKt.m6950LinkTexthfI1UA("我知道了", fM6097constructorimpl, sp, error, (Function0) objRememberedValue, composer2, 438, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), PaddingKt.m569paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6097constructorimpl(20), 0.0f, 2, null), null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1156395358, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.TipDialog.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    if ((i8 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1156395358, i8, -1, "cn.jianyun.workplan.ui.component.form.TipDialog.<anonymous> (DialogView.kt:230)");
                    }
                    TextKt.m2471Text4IGK_g(str5, (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (14 & i5) | 199680, 0, 131030);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2016292739, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.TipDialog.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    if ((i8 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2016292739, i8, -1, "cn.jianyun.workplan.ui.component.form.TipDialog.<anonymous> (DialogView.kt:232)");
                    }
                    TextKt.m2471Text4IGK_g(str6, (Modifier) null, 0L, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(22), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ((i5 >> 3) & 14) | 3072, 6, 130038);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), null, 0L, 0L, 0L, 0L, 0.0f, null, composerStartRestartGroup, 1772982, 0, 16272);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str4 = str10;
        } else {
            if (i6 != 0) {
                str5 = "温馨提示";
            } else {
                str5 = str3;
            }
            if (i7 != 0) {
                str6 = "这里是内容";
            } else {
                str6 = str4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1981586902, i5, -1, "cn.jianyun.workplan.ui.component.form.TipDialog (DialogView.kt:221)");
            }
            String str11 = str6;
            AndroidAlertDialog_androidKt.m1570AlertDialogOix01E0(new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.TipDialog.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 962245858, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.TipDialog.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    if ((i8 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(962245858, i8, -1, "cn.jianyun.workplan.ui.component.form.TipDialog.<anonymous> (DialogView.kt:226)");
                    }
                    float fM6097constructorimpl = Dp.m6097constructorimpl(5);
                    long sp = TextUnitKt.getSp(16);
                    long error = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getError();
                    final Function0<Unit> function0 = cancelAction;
                    composer2.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                    boolean zChanged = composer2.changed(function0);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$TipDialog$2$1$1
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
                                function0.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    CommonUIKt.m6950LinkTexthfI1UA("我知道了", fM6097constructorimpl, sp, error, (Function0) objRememberedValue, composer2, 438, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), PaddingKt.m569paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6097constructorimpl(20), 0.0f, 2, null), null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1156395358, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.TipDialog.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    if ((i8 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1156395358, i8, -1, "cn.jianyun.workplan.ui.component.form.TipDialog.<anonymous> (DialogView.kt:230)");
                    }
                    TextKt.m2471Text4IGK_g(str5, (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (14 & i5) | 199680, 0, 131030);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2016292739, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.TipDialog.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    if ((i8 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2016292739, i8, -1, "cn.jianyun.workplan.ui.component.form.TipDialog.<anonymous> (DialogView.kt:232)");
                    }
                    TextKt.m2471Text4IGK_g(str6, (Modifier) null, 0L, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(22), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ((i5 >> 3) & 14) | 3072, 6, 130038);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), null, 0L, 0L, 0L, 0L, 0.0f, null, composerStartRestartGroup, 1772982, 0, 16272);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str4 = str11;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final String str12 = str5;
        final String str13 = str4;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.TipDialog.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i8) {
                DialogViewKt.TipDialog(str12, str13, cancelAction, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    public static final void WelcomeDialog(final Function0<Unit> okAction, Composer composer, final int i) {
        final int i2;
        Intrinsics.checkNotNullParameter(okAction, "okAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1595767441);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(WelcomeDialog)");
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(okAction) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1595767441, i2, -1, "cn.jianyun.workplan.ui.component.form.WelcomeDialog (DialogView.kt:239)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FormType("", null, null, 6, null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final MutableState mutableState = (MutableState) objRememberedValue;
            AndroidAlertDialog_androidKt.AlertDialog(new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.WelcomeDialog.1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    System.exit(1);
                }
            }, PaddingKt.m567padding3ABfNKs(SizeKt.fillMaxWidth(BackgroundKt.m214backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(20))), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground(), null, 2, null), 0.99f), Dp.m6097constructorimpl(10)), new DialogProperties(false, false, (SecureFlagPolicy) null, 4, (DefaultConstructorMarker) null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -193288441, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.WelcomeDialog.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-193288441, i3, -1, "cn.jianyun.workplan.ui.component.form.WelcomeDialog.<anonymous> (DialogView.kt:256)");
                        }
                        if (!Intrinsics.areEqual(DialogViewKt.WelcomeDialog$lambda$10(mutableState).getType(), Router.PrivatePolicy.INSTANCE.getRoute())) {
                            if (Intrinsics.areEqual(DialogViewKt.WelcomeDialog$lambda$10(mutableState).getType(), Router.UserPolicy.INSTANCE.getRoute())) {
                                composer2.startReplaceableGroup(445577558);
                                Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6097constructorimpl(500)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getBackground(), null, 2, null);
                                final MutableState<FormType> mutableState2 = mutableState;
                                composer2.startReplaceableGroup(-483455358);
                                ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM214backgroundbw27NRU$default);
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
                                composer2.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                boolean zChanged = composer2.changed(mutableState2);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$WelcomeDialog$2$2$1$1
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
                                            mutableState2.setValue(new FormType(null, null, null, 7, null));
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                HeaderViewKt.HeaderView("用户使用协议", (Function0) objRememberedValue2, null, composer2, 6, 4);
                                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Modifier.INSTANCE, ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                                composer2.startReplaceableGroup(-483455358);
                                ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierVerticalScroll$default);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composer2);
                                Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(composer2, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                UserPolicyKt.UserPolicyView(composer2, 0);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            } else {
                                composer2.startReplaceableGroup(445578065);
                                final Function0<Unit> function0 = okAction;
                                final MutableState<FormType> mutableState3 = mutableState;
                                composer2.startReplaceableGroup(-483455358);
                                ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor3);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM3285constructorimpl3 = Updater.m3285constructorimpl(composer2);
                                Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyColumnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3285constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(composer2, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(-483455358);
                                ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion2);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor4);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM3285constructorimpl4 = Updater.m3285constructorimpl(composer2);
                                Updater.m3292setimpl(composerM3285constructorimpl4, measurePolicyColumnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3292setimpl(composerM3285constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3285constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    composerM3285constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM3285constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(composer2, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                                TextKt.m2471Text4IGK_g("你好", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getPrimary(), TextUnitKt.getSp(22), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(35), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3078, 6, 130034);
                                TextKt.m2471Text4IGK_g("很高兴看到你下载极简排班，为了保护您的隐私和个人信息，在你使用APP前请认真阅读以下协议:", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(26), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 6, 6, 130042);
                                CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(5), composer2, 6, 0);
                                long themeColor = ColorKt.getThemeColor();
                                long sp = TextUnitKt.getSp(26);
                                TextDecoration underline = TextDecoration.INSTANCE.getUnderline();
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                composer2.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                boolean zChanged2 = composer2.changed(mutableState3);
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$WelcomeDialog$2$3$1$1$1
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
                                            MutableState<FormType> mutableState4 = mutableState3;
                                            mutableState4.setValue(FormType.copy$default(DialogViewKt.WelcomeDialog$lambda$10(mutableState4), Router.UserPolicy.INSTANCE.getRoute(), null, null, 6, null));
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                composer2.endReplaceableGroup();
                                TextKt.m2471Text4IGK_g("用户使用协议", ClickableKt.m249clickableXHw0xAI$default(companion3, false, null, null, (Function0) objRememberedValue3, 7, null), themeColor, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, underline, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 100663686, 6, 129784);
                                CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(2), composer2, 6, 0);
                                long themeColor2 = ColorKt.getThemeColor();
                                long sp2 = TextUnitKt.getSp(26);
                                TextDecoration underline2 = TextDecoration.INSTANCE.getUnderline();
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                composer2.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                boolean zChanged3 = composer2.changed(mutableState3);
                                Object objRememberedValue4 = composer2.rememberedValue();
                                if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$WelcomeDialog$2$3$1$2$1
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
                                            MutableState<FormType> mutableState4 = mutableState3;
                                            mutableState4.setValue(FormType.copy$default(DialogViewKt.WelcomeDialog$lambda$10(mutableState4), Router.PrivatePolicy.INSTANCE.getRoute(), null, null, 6, null));
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue4);
                                }
                                composer2.endReplaceableGroup();
                                TextKt.m2471Text4IGK_g("App隐私政策", ClickableKt.m249clickableXHw0xAI$default(companion4, false, null, null, (Function0) objRememberedValue4, 7, null), themeColor2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, underline2, (TextAlign) null, sp2, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 100663686, 6, 129784);
                                CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                                TextKt.m2471Text4IGK_g("如果你点击下方的「同意」按钮表示你愿意遵循以上协议，最后祝你使用愉快！", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(26), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 6, 6, 130042);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                                composer2.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                boolean zChanged4 = composer2.changed(function0);
                                Object objRememberedValue5 = composer2.rememberedValue();
                                if (zChanged4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$WelcomeDialog$2$3$2$1
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
                                            function0.invoke();
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue5);
                                }
                                composer2.endReplaceableGroup();
                                ButtonViewKt.m6816OkAndCancelButtonGroup1yyLQnY("同意", "不同意", 0.0f, 0.0f, (Function0) objRememberedValue5, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$WelcomeDialog$2$3$3
                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        System.exit(1);
                                    }
                                }, composer2, 196662, 12);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                        } else {
                            composer2.startReplaceableGroup(445577000);
                            Modifier modifierM214backgroundbw27NRU$default2 = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6097constructorimpl(500)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getBackground(), null, 2, null);
                            final MutableState<FormType> mutableState4 = mutableState;
                            composer2.startReplaceableGroup(-483455358);
                            ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                            MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM214backgroundbw27NRU$default2);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor5);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM3285constructorimpl5 = Updater.m3285constructorimpl(composer2);
                            Updater.m3292setimpl(composerM3285constructorimpl5, measurePolicyColumnMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3292setimpl(composerM3285constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3285constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                composerM3285constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                composerM3285constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                            }
                            function3ModifierMaterializerOf5.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(composer2, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                            boolean zChanged5 = composer2.changed(mutableState4);
                            Object objRememberedValue6 = composer2.rememberedValue();
                            if (zChanged5 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue6 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$WelcomeDialog$2$1$1$1
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
                                        mutableState4.setValue(new FormType(null, null, null, 7, null));
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue6);
                            }
                            composer2.endReplaceableGroup();
                            HeaderViewKt.HeaderView("App隐私政策", (Function0) objRememberedValue6, null, composer2, 6, 4);
                            Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(Modifier.INSTANCE, ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                            composer2.startReplaceableGroup(-483455358);
                            ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                            MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierVerticalScroll$default2);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor6);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM3285constructorimpl6 = Updater.m3285constructorimpl(composer2);
                            Updater.m3292setimpl(composerM3285constructorimpl6, measurePolicyColumnMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3292setimpl(composerM3285constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3285constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                composerM3285constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                composerM3285constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                            }
                            function3ModifierMaterializerOf6.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(composer2, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance6 = ColumnScopeInstance.INSTANCE;
                            PrivatePolicyKt.PrivatePolicyView(composer2, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
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
            }), composerStartRestartGroup, 3462, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.WelcomeDialog.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                DialogViewKt.WelcomeDialog(okAction, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FormType WelcomeDialog$lambda$10(MutableState<FormType> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public static final void LoadingDialog(final String str, Composer composer, final int i, final int i2) {
        final int i3;
        int i4;
        final float fM6097constructorimpl;
        ViewModelStoreOwner current;
        CreationExtras.Empty defaultViewModelCreationExtras;
        ViewModel viewModel;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-764208056);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LoadingDialog)");
        int i5 = i2 & 1;
        if (i5 == 0) {
            if ((i & 14) == 0) {
                i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            if ((i3 & 11) == 2 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    str = "";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-764208056, i3, -1, "cn.jianyun.workplan.ui.component.form.LoadingDialog (DialogView.kt:321)");
                }
                fM6097constructorimpl = Dp.m6097constructorimpl(2);
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
                viewModel = ViewModelKt.viewModel((Class<ViewModel>) AppViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (((AppViewModel) viewModel).getBaseRepository().getLoading()) {
                    AndroidAlertDialog_androidKt.AlertDialog(new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.LoadingDialog.1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }
                    }, SizeKt.m621width3ABfNKs(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(20))), Dp.m6097constructorimpl(100)), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1608700823, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.LoadingDialog.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i6) {
                            if ((i6 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1608700823, i6, -1, "cn.jianyun.workplan.ui.component.form.LoadingDialog.<anonymous> (DialogView.kt:331)");
                                }
                                float f2 = 100;
                                Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f2)), Dp.m6097constructorimpl(f2)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getSurface(), null, 2, null);
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                float f3 = fM6097constructorimpl;
                                String str2 = str;
                                int i7 = i3;
                                composer2.startReplaceableGroup(-483455358);
                                ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                                composer2.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM214backgroundbw27NRU$default);
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
                                float f4 = 20;
                                ProgressIndicatorKt.m2090CircularProgressIndicatorLxG7B9w(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f4)), Dp.m6097constructorimpl(f4)), ColorKt.getThemeColor(), f3, 0L, 0, composer2, 438, 24);
                                composer2.startReplaceableGroup(1526082516);
                                if (!Intrinsics.areEqual(str2, "")) {
                                    TextKt.m2471Text4IGK_g(str2, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getTertiary(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i7 & 14) | 3072, 0, 131058);
                                }
                                composer2.endReplaceableGroup();
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
                    }), composerStartRestartGroup, 3078, 4);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.LoadingDialog.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    DialogViewKt.LoadingDialog(str, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i4 = i | 6;
        i3 = i4;
        if ((i3 & 11) == 2) {
            if (i5 != 0) {
                str = "";
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-764208056, i3, -1, "cn.jianyun.workplan.ui.component.form.LoadingDialog (DialogView.kt:321)");
            }
            fM6097constructorimpl = Dp.m6097constructorimpl(2);
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
            viewModel = ViewModelKt.viewModel((Class<ViewModel>) AppViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory2, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (((AppViewModel) viewModel).getBaseRepository().getLoading()) {
                AndroidAlertDialog_androidKt.AlertDialog(new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.LoadingDialog.1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }, SizeKt.m621width3ABfNKs(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(20))), Dp.m6097constructorimpl(100)), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1608700823, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.LoadingDialog.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1608700823, i6, -1, "cn.jianyun.workplan.ui.component.form.LoadingDialog.<anonymous> (DialogView.kt:331)");
                            }
                            float f2 = 100;
                            Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f2)), Dp.m6097constructorimpl(f2)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getSurface(), null, 2, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            float f3 = fM6097constructorimpl;
                            String str2 = str;
                            int i7 = i3;
                            composer2.startReplaceableGroup(-483455358);
                            ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                            composer2.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM214backgroundbw27NRU$default);
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
                            float f4 = 20;
                            ProgressIndicatorKt.m2090CircularProgressIndicatorLxG7B9w(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f4)), Dp.m6097constructorimpl(f4)), ColorKt.getThemeColor(), f3, 0L, 0, composer2, 438, 24);
                            composer2.startReplaceableGroup(1526082516);
                            if (!Intrinsics.areEqual(str2, "")) {
                                TextKt.m2471Text4IGK_g(str2, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getTertiary(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i7 & 14) | 3072, 0, 131058);
                            }
                            composer2.endReplaceableGroup();
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
                }), composerStartRestartGroup, 3078, 4);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i5 != 0) {
                str = "";
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-764208056, i3, -1, "cn.jianyun.workplan.ui.component.form.LoadingDialog (DialogView.kt:321)");
            }
            fM6097constructorimpl = Dp.m6097constructorimpl(2);
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
            viewModel = ViewModelKt.viewModel((Class<ViewModel>) AppViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory3, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (((AppViewModel) viewModel).getBaseRepository().getLoading()) {
                AndroidAlertDialog_androidKt.AlertDialog(new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.LoadingDialog.1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }, SizeKt.m621width3ABfNKs(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(20))), Dp.m6097constructorimpl(100)), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1608700823, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.LoadingDialog.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1608700823, i6, -1, "cn.jianyun.workplan.ui.component.form.LoadingDialog.<anonymous> (DialogView.kt:331)");
                            }
                            float f2 = 100;
                            Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f2)), Dp.m6097constructorimpl(f2)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getSurface(), null, 2, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            float f3 = fM6097constructorimpl;
                            String str2 = str;
                            int i7 = i3;
                            composer2.startReplaceableGroup(-483455358);
                            ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                            composer2.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM214backgroundbw27NRU$default);
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
                            float f4 = 20;
                            ProgressIndicatorKt.m2090CircularProgressIndicatorLxG7B9w(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f4)), Dp.m6097constructorimpl(f4)), ColorKt.getThemeColor(), f3, 0L, 0, composer2, 438, 24);
                            composer2.startReplaceableGroup(1526082516);
                            if (!Intrinsics.areEqual(str2, "")) {
                                TextKt.m2471Text4IGK_g(str2, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getTertiary(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i7 & 14) | 3072, 0, 131058);
                            }
                            composer2.endReplaceableGroup();
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
                }), composerStartRestartGroup, 3078, 4);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.LoadingDialog.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i6) {
                DialogViewKt.LoadingDialog(str, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.util.List] */
    public static final void WeekChooseDialog(final int i, final List<Integer> fixWeeks, final Function1<? super List<Integer>, Unit> onChange, final Function0<Unit> dismissAction, Composer composer, final int i2) {
        Intrinsics.checkNotNullParameter(fixWeeks, "fixWeeks");
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        Intrinsics.checkNotNullParameter(dismissAction, "dismissAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(498030848);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(WeekChooseDialog)P(3,1,2)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(498030848, i2, -1, "cn.jianyun.workplan.ui.component.form.WeekChooseDialog (DialogView.kt:358)");
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = SelectUtil.initWithUnit("", "", 1, i);
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        T t = objRememberedValue;
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            SnapshotStateList snapshotStateListMutableStateListOf = SnapshotStateKt.mutableStateListOf();
            composerStartRestartGroup.updateRememberedValue(snapshotStateListMutableStateListOf);
            t = snapshotStateListMutableStateListOf;
        }
        composerStartRestartGroup.endReplaceableGroup();
        objectRef2.element = t;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new AnonymousClass1(objectRef2, fixWeeks, (MutableState) objRememberedValue2, null), composerStartRestartGroup, 70);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean zChanged = composerStartRestartGroup.changed(dismissAction);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$WeekChooseDialog$2$1
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
                    dismissAction.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        AndroidAlertDialog_androidKt.AlertDialog((Function0) objRememberedValue3, ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(20))), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1484794102, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.WeekChooseDialog.3
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

            public final void invoke(Composer composer2, int i3) {
                if ((i3 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1484794102, i3, -1, "cn.jianyun.workplan.ui.component.form.WeekChooseDialog.<anonymous> (DialogView.kt:414)");
                }
                Modifier modifierClip = ClipKt.clip(BackgroundKt.m214backgroundbw27NRU$default(PaddingKt.m567padding3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(0)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getSurfaceVariant(), null, 2, null), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(20)));
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                final Function0<Unit> function0 = dismissAction;
                final Ref.ObjectRef<SnapshotStateList<String>> objectRef3 = objectRef2;
                final Ref.ObjectRef<List<SelectDO>> objectRef4 = objectRef;
                final int i4 = i;
                final Function1<List<Integer>, Unit> function1 = onChange;
                composer2.startReplaceableGroup(-483455358);
                ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                composer2.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierClip);
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
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                composer2.startReplaceableGroup(693286680);
                ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composer2);
                Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                float f2 = 10;
                TextKt.m2471Text4IGK_g("选择周数", PaddingKt.m567padding3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f2)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 54, 0, 131068);
                SnapshotStateList<String> snapshotStateList = objectRef3.element;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(snapshotStateList, 10));
                Iterator<String> it = snapshotStateList.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(it.next())));
                }
                String weekInfo = WeekTool.getWeekInfo(arrayList, "");
                Intrinsics.checkNotNullExpressionValue(weekInfo, "getWeekInfo(choosedWeeks.map{it.toInt()}, \"\")");
                TextKt.m2471Text4IGK_g(weekInfo, PaddingKt.m567padding3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f2)), 0L, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 131060);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                LazyGridDslKt.LazyVerticalGrid(new GridCells.Fixed(6), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, false, null, null, null, false, new Function1<LazyGridScope, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$WeekChooseDialog$3$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LazyGridScope lazyGridScope) {
                        invoke2(lazyGridScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(LazyGridScope LazyVerticalGrid) {
                        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
                        int size = objectRef4.element.size();
                        final Ref.ObjectRef<List<SelectDO>> objectRef5 = objectRef4;
                        final Ref.ObjectRef<SnapshotStateList<String>> objectRef6 = objectRef3;
                        LazyGridScope.items$default(LazyVerticalGrid, size, null, null, null, ComposableLambdaKt.composableLambdaInstance(326395243, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$WeekChooseDialog$3$1$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(4);
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer3, Integer num2) {
                                invoke(lazyGridItemScope, num.intValue(), composer3, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(LazyGridItemScope items, int i5, Composer composer3, int i6) {
                                int i7;
                                Intrinsics.checkNotNullParameter(items, "$this$items");
                                if ((i6 & 112) == 0) {
                                    i7 = (composer3.changed(i5) ? 32 : 16) | i6;
                                } else {
                                    i7 = i6;
                                }
                                if ((i7 & 721) != 144 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(326395243, i6, -1, "cn.jianyun.workplan.ui.component.form.WeekChooseDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DialogView.kt:431)");
                                    }
                                    final String str = objectRef5.element.get(i5).value;
                                    Modifier modifierM567padding3ABfNKs = PaddingKt.m567padding3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(6));
                                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                    Ref.ObjectRef<List<SelectDO>> objectRef7 = objectRef5;
                                    final Ref.ObjectRef<SnapshotStateList<String>> objectRef8 = objectRef6;
                                    composer3.startReplaceableGroup(693286680);
                                    ComposerKt.sourceInformation(composer3, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(center, Alignment.INSTANCE.getTop(), composer3, 6);
                                    composer3.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM567padding3ABfNKs);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3285constructorimpl3 = Updater.m3285constructorimpl(composer3);
                                    Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3285constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                    String label = objectRef7.element.get(i5).label;
                                    Modifier modifierM249clickableXHw0xAI$default = ClickableKt.m249clickableXHw0xAI$default(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(16)), false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$WeekChooseDialog$3$1$2$1$1$1
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
                                            if (objectRef8.element.contains(str)) {
                                                objectRef8.element.remove(str);
                                                return;
                                            }
                                            SnapshotStateList<String> snapshotStateList2 = objectRef8.element;
                                            String value = str;
                                            Intrinsics.checkNotNullExpressionValue(value, "value");
                                            snapshotStateList2.add(value);
                                        }
                                    }, 7, null);
                                    composer3.startReplaceableGroup(1689930239);
                                    long themeColor = objectRef8.element.contains(str) ? ColorKt.getThemeColor() : MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | 0).getBackground();
                                    composer3.endReplaceableGroup();
                                    float f3 = 32;
                                    Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(BackgroundKt.m214backgroundbw27NRU$default(modifierM249clickableXHw0xAI$default, themeColor, null, 2, null), Dp.m6097constructorimpl(f3)), Dp.m6097constructorimpl(f3)), null, false, 3, null);
                                    long sp = TextUnitKt.getSp(13);
                                    long sp2 = TextUnitKt.getSp(13);
                                    composer3.startReplaceableGroup(1689930617);
                                    long jM3792getWhite0d7_KjU = objectRef8.element.contains(str) ? Color.INSTANCE.m3792getWhite0d7_KjU() : MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | 0).getPrimary();
                                    composer3.endReplaceableGroup();
                                    Intrinsics.checkNotNullExpressionValue(label, "label");
                                    TextKt.m2471Text4IGK_g(label, modifierWrapContentSize$default, jM3792getWhite0d7_KjU, sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3072, 6, 130032);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), 14, null);
                    }
                }, composer2, 48, TarConstants.XSTAR_MAGIC_OFFSET);
                Modifier modifierM569paddingVpY3zN4$default = PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(f2), 1, null);
                composer2.startReplaceableGroup(693286680);
                ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM569paddingVpY3zN4$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM3285constructorimpl3 = Updater.m3285constructorimpl(composer2);
                Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3285constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                CommonUIKt.m6949GrayLinkText53ZIcWk("全部", 0.0f, 0L, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$WeekChooseDialog$3$1$3$1
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
                        DialogViewKt.WeekChooseDialog$make(objectRef3, i4, 3);
                    }
                }, composer2, 6, 6);
                CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                CommonUIKt.m6949GrayLinkText53ZIcWk("单周", 0.0f, 0L, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$WeekChooseDialog$3$1$3$2
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
                        DialogViewKt.WeekChooseDialog$make(objectRef3, i4, 1);
                    }
                }, composer2, 6, 6);
                CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                CommonUIKt.m6949GrayLinkText53ZIcWk("双周", 0.0f, 0L, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$WeekChooseDialog$3$1$3$3
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
                        DialogViewKt.WeekChooseDialog$make(objectRef3, i4, 2);
                    }
                }, composer2, 6, 6);
                CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                CommonUIKt.m6949GrayLinkText53ZIcWk("清空", 0.0f, 0L, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$WeekChooseDialog$3$1$3$4
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
                        DialogViewKt.WeekChooseDialog$make(objectRef3, i4, 0);
                    }
                }, composer2, 6, 6);
                CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                CommonUIKt.m6949GrayLinkText53ZIcWk("反选", 0.0f, 0L, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$WeekChooseDialog$3$1$3$5
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
                        DialogViewKt.WeekChooseDialog$make(objectRef3, i4, -1);
                    }
                }, composer2, 6, 6);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                boolean zChanged2 = composer2.changed(function0);
                Object objRememberedValue4 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$WeekChooseDialog$3$1$4$1
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
                            function0.invoke();
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceableGroup();
                FormItemKt.BottomConfirmButtonGroup((Function0) objRememberedValue4, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$WeekChooseDialog$3$1$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                        Function1<List<Integer>, Unit> function2 = function1;
                        SnapshotStateList<String> snapshotStateList2 = objectRef3.element;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(snapshotStateList2, 10));
                        Iterator<String> it2 = snapshotStateList2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(Integer.valueOf(Integer.parseInt(it2.next())));
                        }
                        function2.invoke(CollectionsKt.sorted(arrayList2));
                    }
                }, composer2, 0);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composerStartRestartGroup, 3072, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.WeekChooseDialog.4
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

            public final void invoke(Composer composer2, int i3) {
                DialogViewKt.WeekChooseDialog(i, fixWeeks, onChange, dismissAction, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean WeekChooseDialog$lambda$14(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WeekChooseDialog$lambda$15(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WeekChooseDialog$make(Ref.ObjectRef<SnapshotStateList<String>> objectRef, int i, int i2) {
        if (i2 == 0) {
            objectRef.element.clear();
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (1 <= i) {
            int i3 = 1;
            while (true) {
                String strValueOf = String.valueOf(i3);
                if (i2 != -1) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                arrayList.add(strValueOf);
                            }
                        } else if (i3 % 2 == 0) {
                            arrayList.add(strValueOf);
                        }
                    } else if (i3 % 2 == 1) {
                        arrayList.add(strValueOf);
                    }
                } else if (!objectRef.element.contains(strValueOf)) {
                    arrayList.add(strValueOf);
                }
                if (i3 == i) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        objectRef.element.clear();
        objectRef.element.addAll(arrayList);
    }

    public static final void SortDialogView(final String title, final List<? extends SelectDO> options, Function3<? super String, ? super Composer, ? super Integer, Unit> function3, final Function1<? super List<String>, Unit> onChange, final Function0<Unit> onDismiss, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-668543563);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SortDialogView)P(4,2,3)");
        Function3<? super String, ? super Composer, ? super Integer, Unit> function4 = (i2 & 4) != 0 ? null : function3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-668543563, i, -1, "cn.jianyun.workplan.ui.component.form.SortDialogView (DialogView.kt:493)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(options, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final MutableState mutableState = (MutableState) objRememberedValue;
        float fM6097constructorimpl = Dp.m6097constructorimpl(500);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean zChanged = composerStartRestartGroup.changed(onDismiss);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$SortDialogView$1$1
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
                    onDismiss.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final Function3<? super String, ? super Composer, ? super Integer, Unit> function5 = function4;
        m6840BottomDialogVieweHTjO5g(title, false, "先长按列表项，然后拖动即可排序", null, false, fM6097constructorimpl, (Function0) objRememberedValue2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 737522505, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.SortDialogView.2
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

            public final void invoke(Composer composer2, int i3) {
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(737522505, i3, -1, "cn.jianyun.workplan.ui.component.form.SortDialogView.<anonymous> (DialogView.kt:500)");
                    }
                    Modifier modifierM602height3ABfNKs = SizeKt.m602height3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(UnixStat.DEFAULT_FILE_PERM));
                    Function3<String, Composer, Integer, Unit> function6 = function5;
                    final MutableState<List<SelectDO>> mutableState2 = mutableState;
                    int i4 = i;
                    composer2.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM602height3ABfNKs);
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
                    List listSortDialogView$lambda$18 = DialogViewKt.SortDialogView$lambda$18(mutableState2);
                    composer2.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                    boolean zChanged2 = composer2.changed(mutableState2);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = (Function1) new Function1<List<? extends SelectDO>, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$SortDialogView$2$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends SelectDO> list) {
                                invoke2(list);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(List<? extends SelectDO> it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState2.setValue(it);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    TestSortViewKt.DragNDropItemsList(listSortDialogView$lambda$18, function6, (Function1) objRememberedValue3, composer2, ((i4 >> 3) & 112) | 8, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    float fM6097constructorimpl2 = Dp.m6097constructorimpl(10);
                    final Function1<List<String>, Unit> function1 = onChange;
                    final MutableState<List<SelectDO>> mutableState3 = mutableState;
                    composer2.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    boolean zChanged3 = composer2.changed(function1) | composer2.changed(mutableState3);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$SortDialogView$2$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                Function1<List<String>, Unit> function2 = function1;
                                List listSortDialogView$lambda$19 = DialogViewKt.SortDialogView$lambda$18(mutableState3);
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortDialogView$lambda$19, 10));
                                Iterator it = listSortDialogView$lambda$19.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((SelectDO) it.next()).value);
                                }
                                function2.invoke(arrayList);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    Function0 function0 = (Function0) objRememberedValue4;
                    final Function0<Unit> function2 = onDismiss;
                    composer2.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                    boolean zChanged4 = composer2.changed(function2);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (zChanged4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$SortDialogView$2$3$1
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
                                function2.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    composer2.endReplaceableGroup();
                    ButtonViewKt.m6816OkAndCancelButtonGroup1yyLQnY(null, null, fM6097constructorimpl2, 0.0f, function0, (Function0) objRememberedValue5, composer2, MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 11);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, (i & 14) | 12779904, 26);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Function3<? super String, ? super Composer, ? super Integer, Unit> function6 = function4;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.SortDialogView.3
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

            public final void invoke(Composer composer2, int i3) {
                DialogViewKt.SortDialogView(title, options, function6, onChange, onDismiss, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<SelectDO> SortDialogView$lambda$18(MutableState<List<SelectDO>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:37:0x0077  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x009f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:66:0x0103  */
    /* JADX WARN: Code duplicated, block: B:69:0x0191  */
    /* JADX WARN: Code duplicated, block: B:74:0x019d  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    public static final void UpdateIntroDialog(String str, final String message, int i, final Function0<Unit> okAction, Composer composer, final int i2, final int i3) {
        String str2;
        int i4;
        int i5;
        int i6;
        String str3;
        int i7;
        Object objRememberedValue;
        final MutableState mutableState;
        boolean zChanged;
        DialogViewKt$UpdateIntroDialog$1$1 dialogViewKt$UpdateIntroDialog$1$1RememberedValue;
        final int i8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(okAction, "okAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1196582357);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(UpdateIntroDialog)P(3!1,2)");
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            str2 = str;
        } else if ((i2 & 14) == 0) {
            str2 = str;
            i4 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i2;
        } else {
            str2 = str;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(message) ? 32 : 16;
        }
        int i10 = i3 & 4;
        if (i10 == 0) {
            if ((i2 & 896) == 0) {
                i5 = i;
                i4 |= composerStartRestartGroup.changed(i5) ? 256 : 128;
            }
            if ((i3 & 8) != 0) {
                i4 |= 3072;
            } else if ((i2 & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(okAction)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            if ((i4 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i9 != 0) {
                    str3 = "更新说明";
                } else {
                    str3 = str2;
                }
                if (i10 != 0) {
                    i7 = 10;
                } else {
                    i7 = i5;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1196582357, i4, -1, "cn.jianyun.workplan.ui.component.form.UpdateIntroDialog (DialogView.kt:517)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i7), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(mutableState);
                dialogViewKt$UpdateIntroDialog$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || dialogViewKt$UpdateIntroDialog$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    dialogViewKt$UpdateIntroDialog$1$1RememberedValue = new DialogViewKt$UpdateIntroDialog$1$1(mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(dialogViewKt$UpdateIntroDialog$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) dialogViewKt$UpdateIntroDialog$1$1RememberedValue, composerStartRestartGroup, 70);
                final String str4 = str3;
                final int i11 = i4;
                AndroidAlertDialog_androidKt.AlertDialog(new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.UpdateIntroDialog.2
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }, PaddingKt.m569paddingVpY3zN4$default(SizeKt.fillMaxWidth(BackgroundKt.m214backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(20))), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground(), null, 2, null), 0.98f), Dp.m6097constructorimpl(6), 0.0f, 2, null), new DialogProperties(false, false, (SecureFlagPolicy) null, 4, (DefaultConstructorMarker) null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2111621685, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.UpdateIntroDialog.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i12) {
                        String str5;
                        if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2111621685, i12, -1, "cn.jianyun.workplan.ui.component.form.UpdateIntroDialog.<anonymous> (DialogView.kt:545)");
                            }
                            Modifier modifierM568paddingVpY3zN4 = PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(Modifier.INSTANCE, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getBackground(), null, 2, null), Dp.m6097constructorimpl(18), Dp.m6097constructorimpl(16));
                            String str6 = str4;
                            int i13 = i11;
                            String str7 = message;
                            final MutableState<Integer> mutableState2 = mutableState;
                            final Function0<Unit> function0 = okAction;
                            composer2.startReplaceableGroup(-483455358);
                            ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN4);
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
                            TextKt.m2471Text4IGK_g(str6, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getPrimary(), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i13 & 14) | 199680, 0, 131026);
                            CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(10), composer2, 6, 0);
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6097constructorimpl(MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_DEMUXER_STALL)), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                            composer2.startReplaceableGroup(-483455358);
                            ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierVerticalScroll$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composer2);
                            Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(composer2, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            TextKt.m2471Text4IGK_g(str7, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getPrimary(), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(26), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ((i13 >> 3) & 14) | 3072, 6, 130034);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(14), composer2, 6, 0);
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                            composer2.startReplaceableGroup(693286680);
                            ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, Alignment.INSTANCE.getTop(), composer2, 6);
                            composer2.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor3);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM3285constructorimpl3 = Updater.m3285constructorimpl(composer2);
                            Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3285constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            if (DialogViewKt.UpdateIntroDialog$lambda$22(mutableState2) > 0) {
                                str5 = "请先阅读 " + DialogViewKt.UpdateIntroDialog$lambda$22(mutableState2) + SardineUtil.CUSTOM_NAMESPACE_PREFIX;
                            } else {
                                str5 = "我知道了";
                            }
                            float fM6097constructorimpl = Dp.m6097constructorimpl(6);
                            long sp = TextUnitKt.getSp(16);
                            long jM3765unboximpl = ((Color) CommonToolKt.ifv(DialogViewKt.UpdateIntroDialog$lambda$22(mutableState2) > 0, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl();
                            composer2.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                            boolean zChanged2 = composer2.changed(mutableState2) | composer2.changed(function0);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$UpdateIntroDialog$3$1$2$1$1
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
                                        if (DialogViewKt.UpdateIntroDialog$lambda$22(mutableState2) == 0) {
                                            function0.invoke();
                                        }
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            CommonUIKt.m6950LinkTexthfI1UA(str5, fM6097constructorimpl, sp, jM3765unboximpl, (Function0) objRememberedValue2, composer2, 432, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
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
                }), composerStartRestartGroup, 3462, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i8 = i7;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                str3 = str2;
                i8 = i5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final String str5 = str3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.UpdateIntroDialog.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i12) {
                    DialogViewKt.UpdateIntroDialog(str5, message, i8, okAction, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
        i4 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
        i5 = i;
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 7168) == 0) {
            if (composerStartRestartGroup.changedInstance(okAction)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i4 |= i6;
        }
        if ((i4 & 5851) == 1170) {
            if (i9 != 0) {
                str3 = "更新说明";
            } else {
                str3 = str2;
            }
            if (i10 != 0) {
                i7 = 10;
            } else {
                i7 = i5;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1196582357, i4, -1, "cn.jianyun.workplan.ui.component.form.UpdateIntroDialog (DialogView.kt:517)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i7), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            Unit unit2 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            zChanged = composerStartRestartGroup.changed(mutableState);
            dialogViewKt$UpdateIntroDialog$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                dialogViewKt$UpdateIntroDialog$1$1RememberedValue = new DialogViewKt$UpdateIntroDialog$1$1(mutableState, null);
                composerStartRestartGroup.updateRememberedValue(dialogViewKt$UpdateIntroDialog$1$1RememberedValue);
            } else {
                dialogViewKt$UpdateIntroDialog$1$1RememberedValue = new DialogViewKt$UpdateIntroDialog$1$1(mutableState, null);
                composerStartRestartGroup.updateRememberedValue(dialogViewKt$UpdateIntroDialog$1$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) dialogViewKt$UpdateIntroDialog$1$1RememberedValue, composerStartRestartGroup, 70);
            final String str6 = str3;
            final int i12 = i4;
            AndroidAlertDialog_androidKt.AlertDialog(new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.UpdateIntroDialog.2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, PaddingKt.m569paddingVpY3zN4$default(SizeKt.fillMaxWidth(BackgroundKt.m214backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(20))), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground(), null, 2, null), 0.98f), Dp.m6097constructorimpl(6), 0.0f, 2, null), new DialogProperties(false, false, (SecureFlagPolicy) null, 4, (DefaultConstructorMarker) null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2111621685, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.UpdateIntroDialog.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i13) {
                    String str7;
                    if ((i13 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2111621685, i13, -1, "cn.jianyun.workplan.ui.component.form.UpdateIntroDialog.<anonymous> (DialogView.kt:545)");
                        }
                        Modifier modifierM568paddingVpY3zN4 = PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(Modifier.INSTANCE, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getBackground(), null, 2, null), Dp.m6097constructorimpl(18), Dp.m6097constructorimpl(16));
                        String str8 = str6;
                        int i14 = i12;
                        String str9 = message;
                        final MutableState<Integer> mutableState2 = mutableState;
                        final Function0<Unit> function0 = okAction;
                        composer2.startReplaceableGroup(-483455358);
                        ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN4);
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
                        TextKt.m2471Text4IGK_g(str8, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getPrimary(), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i14 & 14) | 199680, 0, 131026);
                        CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(10), composer2, 6, 0);
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6097constructorimpl(MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_DEMUXER_STALL)), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                        composer2.startReplaceableGroup(-483455358);
                        ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierVerticalScroll$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composer2);
                        Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer2, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        TextKt.m2471Text4IGK_g(str9, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getPrimary(), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(26), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ((i14 >> 3) & 14) | 3072, 6, 130034);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(14), composer2, 6, 0);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                        composer2.startReplaceableGroup(693286680);
                        ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, Alignment.INSTANCE.getTop(), composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3285constructorimpl3 = Updater.m3285constructorimpl(composer2);
                        Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3285constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        if (DialogViewKt.UpdateIntroDialog$lambda$22(mutableState2) > 0) {
                            str7 = "请先阅读 " + DialogViewKt.UpdateIntroDialog$lambda$22(mutableState2) + SardineUtil.CUSTOM_NAMESPACE_PREFIX;
                        } else {
                            str7 = "我知道了";
                        }
                        float fM6097constructorimpl = Dp.m6097constructorimpl(6);
                        long sp = TextUnitKt.getSp(16);
                        long jM3765unboximpl = ((Color) CommonToolKt.ifv(DialogViewKt.UpdateIntroDialog$lambda$22(mutableState2) > 0, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl();
                        composer2.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        boolean zChanged2 = composer2.changed(mutableState2) | composer2.changed(function0);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$UpdateIntroDialog$3$1$2$1$1
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
                                    if (DialogViewKt.UpdateIntroDialog$lambda$22(mutableState2) == 0) {
                                        function0.invoke();
                                    }
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        CommonUIKt.m6950LinkTexthfI1UA(str7, fM6097constructorimpl, sp, jM3765unboximpl, (Function0) objRememberedValue2, composer2, 432, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
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
            }), composerStartRestartGroup, 3462, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i8 = i7;
        } else {
            if (i9 != 0) {
                str3 = "更新说明";
            } else {
                str3 = str2;
            }
            if (i10 != 0) {
                i7 = 10;
            } else {
                i7 = i5;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1196582357, i4, -1, "cn.jianyun.workplan.ui.component.form.UpdateIntroDialog (DialogView.kt:517)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i7), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            Unit unit3 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            zChanged = composerStartRestartGroup.changed(mutableState);
            dialogViewKt$UpdateIntroDialog$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                dialogViewKt$UpdateIntroDialog$1$1RememberedValue = new DialogViewKt$UpdateIntroDialog$1$1(mutableState, null);
                composerStartRestartGroup.updateRememberedValue(dialogViewKt$UpdateIntroDialog$1$1RememberedValue);
            } else {
                dialogViewKt$UpdateIntroDialog$1$1RememberedValue = new DialogViewKt$UpdateIntroDialog$1$1(mutableState, null);
                composerStartRestartGroup.updateRememberedValue(dialogViewKt$UpdateIntroDialog$1$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) dialogViewKt$UpdateIntroDialog$1$1RememberedValue, composerStartRestartGroup, 70);
            final String str7 = str3;
            final int i13 = i4;
            AndroidAlertDialog_androidKt.AlertDialog(new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.UpdateIntroDialog.2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, PaddingKt.m569paddingVpY3zN4$default(SizeKt.fillMaxWidth(BackgroundKt.m214backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(20))), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground(), null, 2, null), 0.98f), Dp.m6097constructorimpl(6), 0.0f, 2, null), new DialogProperties(false, false, (SecureFlagPolicy) null, 4, (DefaultConstructorMarker) null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2111621685, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.UpdateIntroDialog.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i14) {
                    String str8;
                    if ((i14 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2111621685, i14, -1, "cn.jianyun.workplan.ui.component.form.UpdateIntroDialog.<anonymous> (DialogView.kt:545)");
                        }
                        Modifier modifierM568paddingVpY3zN4 = PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(Modifier.INSTANCE, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getBackground(), null, 2, null), Dp.m6097constructorimpl(18), Dp.m6097constructorimpl(16));
                        String str9 = str7;
                        int i15 = i13;
                        String str10 = message;
                        final MutableState<Integer> mutableState2 = mutableState;
                        final Function0<Unit> function0 = okAction;
                        composer2.startReplaceableGroup(-483455358);
                        ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN4);
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
                        TextKt.m2471Text4IGK_g(str9, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getPrimary(), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i15 & 14) | 199680, 0, 131026);
                        CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(10), composer2, 6, 0);
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6097constructorimpl(MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_DEMUXER_STALL)), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                        composer2.startReplaceableGroup(-483455358);
                        ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierVerticalScroll$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composer2);
                        Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer2, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        TextKt.m2471Text4IGK_g(str10, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getPrimary(), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(26), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ((i15 >> 3) & 14) | 3072, 6, 130034);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(14), composer2, 6, 0);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                        composer2.startReplaceableGroup(693286680);
                        ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, Alignment.INSTANCE.getTop(), composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3285constructorimpl3 = Updater.m3285constructorimpl(composer2);
                        Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3285constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        if (DialogViewKt.UpdateIntroDialog$lambda$22(mutableState2) > 0) {
                            str8 = "请先阅读 " + DialogViewKt.UpdateIntroDialog$lambda$22(mutableState2) + SardineUtil.CUSTOM_NAMESPACE_PREFIX;
                        } else {
                            str8 = "我知道了";
                        }
                        float fM6097constructorimpl = Dp.m6097constructorimpl(6);
                        long sp = TextUnitKt.getSp(16);
                        long jM3765unboximpl = ((Color) CommonToolKt.ifv(DialogViewKt.UpdateIntroDialog$lambda$22(mutableState2) > 0, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl();
                        composer2.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        boolean zChanged2 = composer2.changed(mutableState2) | composer2.changed(function0);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt$UpdateIntroDialog$3$1$2$1$1
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
                                    if (DialogViewKt.UpdateIntroDialog$lambda$22(mutableState2) == 0) {
                                        function0.invoke();
                                    }
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        CommonUIKt.m6950LinkTexthfI1UA(str8, fM6097constructorimpl, sp, jM3765unboximpl, (Function0) objRememberedValue2, composer2, 432, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
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
            }), composerStartRestartGroup, 3462, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i8 = i7;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final String str8 = str3;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.DialogViewKt.UpdateIntroDialog.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i14) {
                DialogViewKt.UpdateIntroDialog(str8, message, i8, okAction, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int UpdateIntroDialog$lambda$22(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UpdateIntroDialog$lambda$23(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0136  */
    /* JADX WARN: Code duplicated, block: B:101:0x013a  */
    /* JADX WARN: Code duplicated, block: B:104:0x013f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0142  */
    /* JADX WARN: Code duplicated, block: B:107:0x0146  */
    /* JADX WARN: Code duplicated, block: B:108:0x0150  */
    /* JADX WARN: Code duplicated, block: B:111:0x0158  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:119:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:124:0x020e  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x007d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0081  */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:43:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:51:0x009f  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00da  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:85:0x0100  */
    /* JADX WARN: Code duplicated, block: B:86:0x0103  */
    /* JADX WARN: Code duplicated, block: B:89:0x010f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0123 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0125  */
    /* JADX WARN: Code duplicated, block: B:95:0x0129  */
    /* JADX WARN: Code duplicated, block: B:97:0x012d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0132  */
    /* JADX INFO: renamed from: BottomDialogView-eHTjO5g, reason: not valid java name */
    public static final void m6840BottomDialogVieweHTjO5g(final String title, boolean z, String str, Function2<? super Composer, ? super Integer, Unit> function2, boolean z2, float f2, final Function0<Unit> onDismiss, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        String str2;
        int i5;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function3;
        int i7;
        int i8;
        boolean z3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z4;
        String str3;
        Function2<? super Composer, ? super Integer, Unit> function4;
        boolean z5;
        float fM6097constructorimpl;
        boolean zChanged;
        Object objRememberedValue;
        Composer composer2;
        final float f3;
        final boolean z6;
        final String str4;
        final Function2<? super Composer, ? super Integer, Unit> function5;
        final boolean z7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1050934881);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BottomDialogView)P(7,3,6,5!1,2:c#ui.unit.Dp,4)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 == 0) {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    str2 = str;
                    if (composerStartRestartGroup.changed(str2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 7168) == 0) {
                        function3 = function2;
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((57344 & i) == 0) {
                            z3 = z2;
                            if (composerStartRestartGroup.changed(z3)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 32;
                        if (i10 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & 458752) == 0) {
                            if (composerStartRestartGroup.changed(f2)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((i2 & 64) != 0) {
                            if ((i & 3670016) == 0) {
                                if (composerStartRestartGroup.changedInstance(onDismiss)) {
                                    i12 = 1048576;
                                } else {
                                    i12 = 524288;
                                }
                            }
                            if ((i2 & 128) != 0) {
                                if ((29360128 & i) == 0) {
                                    if (composerStartRestartGroup.changedInstance(content)) {
                                        i13 = 8388608;
                                    } else {
                                        i13 = 4194304;
                                    }
                                }
                                if ((23967451 & i3) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                                    if (i14 != 0) {
                                        z4 = false;
                                    } else {
                                        z4 = z;
                                    }
                                    if (i4 != 0) {
                                        str3 = "";
                                    } else {
                                        str3 = str2;
                                    }
                                    if (i6 != 0) {
                                        function4 = null;
                                    } el

... [truncated: exceeds 400000 bytes, total 4342315 bytes]