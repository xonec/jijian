package cn.jianyun.workplan.ui.component.form;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import androidx.autofill.HintConstants;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.CheckboxDefaults;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SwitchDefaults;
import androidx.compose.material3.SwitchKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.text.util.LocalePreferences;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.profileinstaller.ProfileVerifier;
import androidx.webkit.ProxyConfig;
import cn.jianyun.workplan.ui.android.lunar.ChineseCalendar;
import cn.jianyun.workplan.ui.android.lunar.GregorianLunarCalendarView;
import cn.jianyun.workplan.ui.component.form.picker.FWheelPickerContentScope;
import cn.jianyun.workplan.ui.component.form.picker.FWheelPickerContentScopeKt;
import cn.jianyun.workplan.ui.component.form.picker.FWheelPickerState;
import cn.jianyun.workplan.ui.component.form.picker.RememberFWheelPickerStateKt;
import cn.jianyun.workplan.ui.component.model.kt.ColorModel;
import cn.jianyun.workplan.ui.component.nav.BoxViewKt;
import cn.jianyun.workplan.ui.component.nav.IconFont;
import cn.jianyun.workplan.ui.component.nav.IconViewKt;
import cn.jianyun.workplan.ui.component.nav.PartTitleViewKt;
import cn.jianyun.workplan.ui.theme.ColorKt;
import cn.jianyun.workplan.util.ClipboardUtil;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
import cn.jianyun.workplan.util.MyDateTool;
import cn.jianyun.workplan.util.SelectDO;
import cn.jianyun.workplan.util.SelectUtil;
import cn.jianyun.workplan.vm.AppViewModel;
import cn.jianyun.workplan.vm.ColorViewModel;
import com.adgain.sdk.base.models.AdConstants;
import com.alibaba.fastjson2.JSON;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.u0.b;
import com.bykv.vk.component.ttvideo.player.C;
import com.bykv.vk.component.ttvideo.player.MediaFormat;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.logging.log4j.message.ParameterizedMessage;
import org.apache.logging.log4j.util.ProcessIdUtil;
import org.apache.xmlbeans.XmlErrorCodes;

/* JADX INFO: compiled from: FormItem.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0015\u001ac\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u0010\u000e\u001a)\u0010\u000f\u001a\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0013\u001a1\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u0010\u0015\u001a#\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0018\u001ab\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\r2\u001b\b\u0002\u0010\u001c\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r¢\u0006\u0002\b\u001dH\u0007¢\u0006\u0002\u0010\u001e\u001aW\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\"\u001a\u00020\u00032\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010$\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010%\u001aW\u0010&\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\"\u001a\u00020\u00032\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010$\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010%\u001a^\u0010'\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030*2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\r2\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u001dH\u0007¢\u0006\u0002\u0010,\u001ac\u0010-\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020.2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020.2\b\b\u0002\u0010\n\u001a\u00020.2\b\b\u0002\u0010\u000b\u001a\u00020.2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u0010/\u001aY\u00100\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u00102\u001a\u00020\b2\b\b\u0002\u0010(\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u00103\u001a}\u00104\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u00102\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u00105\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u00106\u001a\u00020\b2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030*2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u00107\u001a\u009b\u0001\u00108\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u00105\u001a\u00020\u00032\b\b\u0002\u00109\u001a\u00020\b2\b\b\u0002\u0010:\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u00106\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030*2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u0010;\u001am\u0010<\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u00032\b\b\u0002\u0010=\u001a\u00020>2\b\b\u0002\u00102\u001a\u00020\b2\b\b\u0002\u0010?\u001a\u00020@2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010A\u001a\u00020B2\b\b\u0002\u0010C\u001a\u00020D2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bE\u0010F\u001a\u001f\u0010G\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\bH\u0007¢\u0006\u0002\u0010H\u001a#\u0010I\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0018\u001a1\u0010J\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u0010\u0015\u001a]\u0010K\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010L\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\r2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020M0*2\b\b\u0002\u0010N\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010O\u001a\u001d\u0010P\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020RH\u0007¢\u0006\u0002\u0010S\u001a;\u0010T\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010U\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u0010V\u001am\u0010W\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u00032\b\b\u0002\u0010X\u001a\u00020\u00032\b\b\u0002\u0010?\u001a\u00020@2\b\b\u0002\u0010Y\u001a\u00020@2\b\b\u0002\u0010A\u001a\u00020B2\b\b\u0002\u0010Z\u001a\u00020@2\b\b\u0002\u0010C\u001a\u00020D2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b[\u0010\\\u001a[\u0010]\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010^\u001a\u00020@2\b\b\u0002\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010)\u001a\b\u0012\u0004\u0012\u00020M0*2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b_\u0010`\u001aU\u0010a\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010b\u001a\u00020@2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020M0*2\b\b\u0002\u0010^\u001a\u00020@2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bd\u0010e\u001a]\u0010f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010g\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\r2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020M0*H\u0007¢\u0006\u0002\u0010h\u001aS\u0010i\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010j\u001a\u00020\u00032\f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0007¢\u0006\u0002\u0010l\u001a?\u0010m\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\r2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020M0*H\u0007¢\u0006\u0002\u0010n\u001a7\u0010o\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010)\u001a\b\u0012\u0004\u0012\u00020M0*2\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u0010q\u001a)\u0010r\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u0010s\u001a´\u0001\u0010t\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u00105\u001a\u00020\u00032\b\b\u0002\u00102\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010:\u001a\u00020\u00032\b\b\u0002\u0010u\u001a\u00020v2\b\b\u0002\u0010?\u001a\u00020@2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030*2\u0006\u00106\u001a\u00020\b2\u0015\b\u0002\u0010w\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011¢\u0006\u0002\b\u001d2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bx\u0010y\u001a\u001d\u0010z\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010{\u001a)\u0010|\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u0010}\u001a1\u0010~\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u0010\u007f\u001aR\u0010\u0080\u0001\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u00032\b\b\u0002\u0010?\u001a\u00020@2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010C\u001a\u00020D2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a<\u0010\u0083\u0001\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010U\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u0010V\u001a2\u0010\u0084\u0001\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u0010\u0015\u001aL\u0010\u0085\u0001\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0007\u0010\u0086\u0001\u001a\u00020\b2\b\b\u0002\u00106\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010:\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0007¢\u0006\u0003\u0010\u0087\u0001\u001aM\u0010\u0088\u0001\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u00106\u001a\u00020\b2\b\b\u0002\u00102\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010:\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0007¢\u0006\u0003\u0010\u0087\u0001\u001a\u0010\u0010\u0089\u0001\u001a\u00020\u00032\u0007\u0010\u008a\u0001\u001a\u00020.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u008b\u0001"}, d2 = {"AdderView", "", "label", "", b.f2259d, "", "baseValue", "showValue", "", "step", "minValue", "maxValue", "onValueChange", "Lkotlin/Function1;", "(Ljava/lang/String;IIZIIILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "BottomConfirmButtonGroup", "onDismiss", "Lkotlin/Function0;", "onConfirm", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ColorSelectItemView", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ColorValueItemView", "onClick", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "DatePickerItemView", "readonly", "single", "selfValue", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/String;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DoublePickerItemView", "value1", "onValue1Change", "value2", "onValue2Change", "gapMinute", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;II)V", "DoublePickerItemView2", "ExtraInputItemView", "required", "options", "", "extraView", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FloatAdderView", "", "(Ljava/lang/String;FIZFFFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "InnerInputItemView", "placeholder", HintConstants.AUTOFILL_HINT_PASSWORD, "(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "InputItemView", "tip", "multiLine", "(Ljava/lang/String;ZZZLjava/lang/String;ZLjava/lang/String;ZLjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "InputNumberView", XmlErrorCodes.DECIMAL, "unit", "(Ljava/lang/String;ZZLjava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZIILjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "InputView", "align", "Landroidx/compose/ui/text/style/TextAlign;", MediaFormat.KEY_HEIGHT, "Landroidx/compose/ui/unit/Dp;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "background", "Landroidx/compose/ui/graphics/Color;", "InputView-0NY3Ugk", "(Ljava/lang/String;IZFLjava/lang/String;JJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LabelItemView", "(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;II)V", "LinkItemView", "LunarDatePickerItemView", "MultiSelectItemView", "columnCount", "Lcn/jianyun/workplan/util/SelectDO;", "maxCount", "(Ljava/lang/String;IZLjava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/util/List;ILandroidx/compose/runtime/Composer;II)V", "PasswordTextView", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "RepeatConfigItemView", "allowEmpty", "(Ljava/lang/String;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "SearchInputView", "defaultValue", "radius", "vpadding", "SearchInputView-zJIjrDA", "(Ljava/lang/String;Ljava/lang/String;FFJFJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "SegmentItemView", MediaFormat.KEY_WIDTH, "SegmentItemView-RfXq3Jk", "(Ljava/lang/String;FZLjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "SegmentPickerView", "padding", "onChange", "SegmentPickerView-JkgoBcI", "(Ljava/lang/String;FLjava/util/List;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "SelectItemView", "nav", "(Ljava/lang/String;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "SelfInputItemView", "otherText", "otherAction", "(Ljava/lang/String;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SelfSelectItemView", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "SheetButtonView", "onAction", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ShowColorPickerView", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ShowInputDialog", "keyboardType", "Landroidx/compose/ui/text/input/KeyboardType;", "selfView", "ShowInputDialog-JDHDdL8", "(Ljava/lang/String;Ljava/lang/String;ZIILjava/lang/String;IFLjava/util/List;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "ShownItemView", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "SingleSwitch", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "SwitchItemView", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "TextAreaView", "TextAreaView-LyZNIlQ", "(Ljava/lang/String;FLjava/lang/String;JLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "TimePeriodPickerItemView3", "TimePickerItemView3", "Value2ItemView", "gray", "(Ljava/lang/String;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ValueItemView", "getNoMoreThanTwoDigits", "number", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FormItemKt {
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:51:0x0170  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:59:0x01be  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    public static final void LabelItemView(final String label, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        final boolean z2;
        int i4;
        boolean z3;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM3285constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(label, "label");
        Composer composerStartRestartGroup = composer.startRestartGroup(1201798706);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LabelItemView)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(label) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 112) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1201798706, i4, -1, "cn.jianyun.workplan.ui.component.form.LabelItemView (FormItem.kt:126)");
                }
                composerStartRestartGroup.startReplaceableGroup(693286680);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                TextKt.m2471Text4IGK_g(label, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i4 & 14, 0, 131066);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(-1305696813);
                if (z3) {
                    TextKt.m2471Text4IGK_g(ProxyConfig.MATCH_ALL_SCHEMES, (Modifier) null, ColorKt.getThemeColor(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSION_TIME_MS, 0, 131066);
                }
                composer2.endReplaceableGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z2 = z3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.LabelItemView.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    FormItemKt.LabelItemView(label, z2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        z2 = z;
        i4 = i3;
        if ((i4 & 91) == 18) {
            if (i5 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1201798706, i4, -1, "cn.jianyun.workplan.ui.component.form.LabelItemView (FormItem.kt:126)");
            }
            composerStartRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion2);
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
            Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3285constructorimpl.getInserting()) {
                composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            } else {
                composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -326681643, "C92@4661L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            TextKt.m2471Text4IGK_g(label, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i4 & 14, 0, 131066);
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(-1305696813);
            if (z3) {
                TextKt.m2471Text4IGK_g(ProxyConfig.MATCH_ALL_SCHEMES, (Modifier) null, ColorKt.getThemeColor(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSION_TIME_MS, 0, 131066);
            }
            composer2.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z3;
        } else {
            if (i5 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1201798706, i4, -1, "cn.jianyun.workplan.ui.component.form.LabelItemView (FormItem.kt:126)");
            }
            composerStartRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion3);
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
            Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3285constructorimpl.getInserting()) {
                composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            } else {
                composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -326681643, "C92@4661L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            TextKt.m2471Text4IGK_g(label, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i4 & 14, 0, 131066);
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(-1305696813);
            if (z3) {
                TextKt.m2471Text4IGK_g(ProxyConfig.MATCH_ALL_SCHEMES, (Modifier) null, ColorKt.getThemeColor(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSION_TIME_MS, 0, 131066);
            }
            composer2.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.LabelItemView.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i6) {
                FormItemKt.LabelItemView(label, z2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0131  */
    /* JADX WARN: Code duplicated, block: B:101:0x0156  */
    /* JADX WARN: Code duplicated, block: B:103:0x015f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0178  */
    /* JADX WARN: Code duplicated, block: B:110:0x0181  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:115:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:118:0x0269  */
    /* JADX WARN: Code duplicated, block: B:123:0x0278  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00db  */
    /* JADX WARN: Code duplicated, block: B:74:0x00de  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:90:0x0109  */
    /* JADX WARN: Code duplicated, block: B:97:0x011e  */
    public static final void ValueItemView(final String value, boolean z, boolean z2, boolean z3, String str, final Function0<Unit> onClick, Composer composer, final int i, final int i2) {
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        int i6;
        boolean z6;
        int i7;
        int i8;
        final String str2;
        int i9;
        int i10;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        long sp;
        String str3;
        String str4;
        boolean zChanged;
        Object objRememberedValue;
        final boolean z11;
        final boolean z12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1421287826);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ValueItemView)P(5!1,2,3,4)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 112) == 0) {
                z4 = z;
                i3 |= composerStartRestartGroup.changed(z4) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    z5 = z2;
                    if (composerStartRestartGroup.changed(z5)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 7168) == 0) {
                        z6 = z3;
                        if (composerStartRestartGroup.changed(z6)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        i3 |= CpioConstants.C_ISBLK;
                        str2 = str;
                    } else {
                        str2 = str;
                        if ((i & 57344) == 0) {
                            if (composerStartRestartGroup.changed(str2)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(onClick)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                        }
                        if ((i3 & 374491) == 74898 || !composerStartRestartGroup.getSkipping()) {
                            if (i11 != 0) {
                                z7 = false;
                            } else {
                                z7 = z4;
                            }
                            if (i4 != 0) {
                                z8 = false;
                            } else {
                                z8 = z5;
                            }
                            if (i6 != 0) {
                                z9 = false;
                            } else {
                                z9 = z6;
                            }
                            if (i8 != 0) {
                                str2 = "";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                            }
                            if (!Intrinsics.areEqual(value, "请输入") || Intrinsics.areEqual(value, "请选择") || Intrinsics.areEqual(value, "无") || z9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            TextUnitKt.getSp(16);
                            if (value.length() > 30) {
                                String strSubstring = value.substring(0, 12);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                str3 = strSubstring + "...";
                                sp = TextUnitKt.getSp(15);
                            } else {
                                sp = TextUnitKt.getSp(15);
                                str3 = value;
                            }
                            if (!z10 && !Intrinsics.areEqual(str2, "")) {
                                str3 = str3 + str2;
                            }
                            if (z8 || Intrinsics.areEqual(value, "请输入")) {
                                str4 = str3;
                            } else {
                                str4 = "******";
                            }
                            Modifier modifierClip = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                            boolean z13 = !z9;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(onClick);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                        onClick.invoke();
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            boolean z14 = z7;
                            TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip, z13, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z4 = z14;
                            z11 = z8;
                            z12 = z9;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            z11 = z5;
                            z12 = z6;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final boolean z15 = z4;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.ValueItemView.2
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
                                FormItemKt.ValueItemView(value, z15, z11, z12, str2, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i10 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i3 |= i10;
                    if ((i3 & 374491) == 74898) {
                        if (i11 != 0) {
                            z7 = false;
                        } else {
                            z7 = z4;
                        }
                        if (i4 != 0) {
                            z8 = false;
                        } else {
                            z8 = z5;
                        }
                        if (i6 != 0) {
                            z9 = false;
                        } else {
                            z9 = z6;
                        }
                        if (i8 != 0) {
                            str2 = "";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                        }
                        if (Intrinsics.areEqual(value, "请输入")) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        TextUnitKt.getSp(16);
                        if (value.length() > 30) {
                            String strSubstring2 = value.substring(0, 12);
                            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                            str3 = strSubstring2 + "...";
                            sp = TextUnitKt.getSp(15);
                        } else {
                            sp = TextUnitKt.getSp(15);
                            str3 = value;
                        }
                        if (!z10) {
                            str3 = str3 + str2;
                        }
                        if (z8) {
                            str4 = str3;
                        } else {
                            str4 = str3;
                        }
                        Modifier modifierClip2 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                        boolean z16 = !z9;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(onClick);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        boolean z17 = z7;
                        TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip2, z16, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z17;
                        z11 = z8;
                        z12 = z9;
                    } else {
                        if (i11 != 0) {
                            z7 = false;
                        } else {
                            z7 = z4;
                        }
                        if (i4 != 0) {
                            z8 = false;
                        } else {
                            z8 = z5;
                        }
                        if (i6 != 0) {
                            z9 = false;
                        } else {
                            z9 = z6;
                        }
                        if (i8 != 0) {
                            str2 = "";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                        }
                        if (Intrinsics.areEqual(value, "请输入")) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        TextUnitKt.getSp(16);
                        if (value.length() > 30) {
                            String strSubstring3 = value.substring(0, 12);
                            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                            str3 = strSubstring3 + "...";
                            sp = TextUnitKt.getSp(15);
                        } else {
                            sp = TextUnitKt.getSp(15);
                            str3 = value;
                        }
                        if (!z10) {
                            str3 = str3 + str2;
                        }
                        if (z8) {
                            str4 = str3;
                        } else {
                            str4 = str3;
                        }
                        Modifier modifierClip3 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                        boolean z18 = !z9;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(onClick);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        boolean z19 = z7;
                        TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip3, z18, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z19;
                        z11 = z8;
                        z12 = z9;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final boolean z110 = z4;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.ValueItemView.2
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
                            FormItemKt.ValueItemView(value, z110, z11, z12, str2, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 3072;
                z6 = z3;
                i8 = i2 & 16;
                if (i8 != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i & 57344) == 0) {
                        if (composerStartRestartGroup.changed(str2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                }
                if ((i2 & 32) != 0) {
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(onClick)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                    }
                    if ((i3 & 374491) == 74898) {
                        if (i11 != 0) {
                            z7 = false;
                        } else {
                            z7 = z4;
                        }
                        if (i4 != 0) {
                            z8 = false;
                        } else {
                            z8 = z5;
                        }
                        if (i6 != 0) {
                            z9 = false;
                        } else {
                            z9 = z6;
                        }
                        if (i8 != 0) {
                            str2 = "";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                        }
                        if (Intrinsics.areEqual(value, "请输入")) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        TextUnitKt.getSp(16);
                        if (value.length() > 30) {
                            String strSubstring4 = value.substring(0, 12);
                            Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                            str3 = strSubstring4 + "...";
                            sp = TextUnitKt.getSp(15);
                        } else {
                            sp = TextUnitKt.getSp(15);
                            str3 = value;
                        }
                        if (!z10) {
                            str3 = str3 + str2;
                        }
                        if (z8) {
                            str4 = str3;
                        } else {
                            str4 = str3;
                        }
                        Modifier modifierClip4 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                        boolean z111 = !z9;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(onClick);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        boolean z112 = z7;
                        TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip4, z111, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z112;
                        z11 = z8;
                        z12 = z9;
                    } else {
                        if (i11 != 0) {
                            z7 = false;
                        } else {
                            z7 = z4;
                        }
                        if (i4 != 0) {
                            z8 = false;
                        } else {
                            z8 = z5;
                        }
                        if (i6 != 0) {
                            z9 = false;
                        } else {
                            z9 = z6;
                        }
                        if (i8 != 0) {
                            str2 = "";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                        }
                        if (Intrinsics.areEqual(value, "请输入")) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        TextUnitKt.getSp(16);
                        if (value.length() > 30) {
                            String strSubstring5 = value.substring(0, 12);
                            Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
                            str3 = strSubstring5 + "...";
                            sp = TextUnitKt.getSp(15);
                        } else {
                            sp = TextUnitKt.getSp(15);
                            str3 = value;
                        }
                        if (!z10) {
                            str3 = str3 + str2;
                        }
                        if (z8) {
                            str4 = str3;
                        } else {
                            str4 = str3;
                        }
                        Modifier modifierClip5 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                        boolean z113 = !z9;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(onClick);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        boolean z114 = z7;
                        TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip5, z113, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z114;
                        z11 = z8;
                        z12 = z9;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final boolean z115 = z4;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.ValueItemView.2
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
                            FormItemKt.ValueItemView(value, z115, z11, z12, str2, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i10 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i3 |= i10;
                if ((i3 & 374491) == 74898) {
                    if (i11 != 0) {
                        z7 = false;
                    } else {
                        z7 = z4;
                    }
                    if (i4 != 0) {
                        z8 = false;
                    } else {
                        z8 = z5;
                    }
                    if (i6 != 0) {
                        z9 = false;
                    } else {
                        z9 = z6;
                    }
                    if (i8 != 0) {
                        str2 = "";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                    }
                    if (Intrinsics.areEqual(value, "请输入")) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    TextUnitKt.getSp(16);
                    if (value.length() > 30) {
                        String strSubstring6 = value.substring(0, 12);
                        Intrinsics.checkNotNullExpressionValue(strSubstring6, "substring(...)");
                        str3 = strSubstring6 + "...";
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = TextUnitKt.getSp(15);
                        str3 = value;
                    }
                    if (!z10) {
                        str3 = str3 + str2;
                    }
                    if (z8) {
                        str4 = str3;
                    } else {
                        str4 = str3;
                    }
                    Modifier modifierClip6 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                    boolean z116 = !z9;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(onClick);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    boolean z117 = z7;
                    TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip6, z116, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z117;
                    z11 = z8;
                    z12 = z9;
                } else {
                    if (i11 != 0) {
                        z7 = false;
                    } else {
                        z7 = z4;
                    }
                    if (i4 != 0) {
                        z8 = false;
                    } else {
                        z8 = z5;
                    }
                    if (i6 != 0) {
                        z9 = false;
                    } else {
                        z9 = z6;
                    }
                    if (i8 != 0) {
                        str2 = "";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                    }
                    if (Intrinsics.areEqual(value, "请输入")) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    TextUnitKt.getSp(16);
                    if (value.length() > 30) {
                        String strSubstring7 = value.substring(0, 12);
                        Intrinsics.checkNotNullExpressionValue(strSubstring7, "substring(...)");
                        str3 = strSubstring7 + "...";
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = TextUnitKt.getSp(15);
                        str3 = value;
                    }
                    if (!z10) {
                        str3 = str3 + str2;
                    }
                    if (z8) {
                        str4 = str3;
                    } else {
                        str4 = str3;
                    }
                    Modifier modifierClip7 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                    boolean z118 = !z9;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(onClick);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    boolean z119 = z7;
                    TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip7, z118, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z119;
                    z11 = z8;
                    z12 = z9;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final boolean z1110 = z4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.ValueItemView.2
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
                        FormItemKt.ValueItemView(value, z1110, z11, z12, str2, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
            z5 = z2;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    z6 = z3;
                    if (composerStartRestartGroup.changed(z6)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i & 57344) == 0) {
                        if (composerStartRestartGroup.changed(str2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                }
                if ((i2 & 32) != 0) {
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(onClick)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                    }
                    if ((i3 & 374491) == 74898) {
                        if (i11 != 0) {
                            z7 = false;
                        } else {
                            z7 = z4;
                        }
                        if (i4 != 0) {
                            z8 = false;
                        } else {
                            z8 = z5;
                        }
                        if (i6 != 0) {
                            z9 = false;
                        } else {
                            z9 = z6;
                        }
                        if (i8 != 0) {
                            str2 = "";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                        }
                        if (Intrinsics.areEqual(value, "请输入")) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        TextUnitKt.getSp(16);
                        if (value.length() > 30) {
                            String strSubstring8 = value.substring(0, 12);
                            Intrinsics.checkNotNullExpressionValue(strSubstring8, "substring(...)");
                            str3 = strSubstring8 + "...";
                            sp = TextUnitKt.getSp(15);
                        } else {
                            sp = TextUnitKt.getSp(15);
                            str3 = value;
                        }
                        if (!z10) {
                            str3 = str3 + str2;
                        }
                        if (z8) {
                            str4 = str3;
                        } else {
                            str4 = str3;
                        }
                        Modifier modifierClip8 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                        boolean z1111 = !z9;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(onClick);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        boolean z1112 = z7;
                        TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip8, z1111, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z1112;
                        z11 = z8;
                        z12 = z9;
                    } else {
                        if (i11 != 0) {
                            z7 = false;
                        } else {
                            z7 = z4;
                        }
                        if (i4 != 0) {
                            z8 = false;
                        } else {
                            z8 = z5;
                        }
                        if (i6 != 0) {
                            z9 = false;
                        } else {
                            z9 = z6;
                        }
                        if (i8 != 0) {
                            str2 = "";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                        }
                        if (Intrinsics.areEqual(value, "请输入")) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        TextUnitKt.getSp(16);
                        if (value.length() > 30) {
                            String strSubstring9 = value.substring(0, 12);
                            Intrinsics.checkNotNullExpressionValue(strSubstring9, "substring(...)");
                            str3 = strSubstring9 + "...";
                            sp = TextUnitKt.getSp(15);
                        } else {
                            sp = TextUnitKt.getSp(15);
                            str3 = value;
                        }
                        if (!z10) {
                            str3 = str3 + str2;
                        }
                        if (z8) {
                            str4 = str3;
                        } else {
                            str4 = str3;
                        }
                        Modifier modifierClip9 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                        boolean z1113 = !z9;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(onClick);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        boolean z1114 = z7;
                        TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip9, z1113, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z1114;
                        z11 = z8;
                        z12 = z9;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final boolean z1115 = z4;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.ValueItemView.2
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
                            FormItemKt.ValueItemView(value, z1115, z11, z12, str2, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i10 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i3 |= i10;
                if ((i3 & 374491) == 74898) {
                    if (i11 != 0) {
                        z7 = false;
                    } else {
                        z7 = z4;
                    }
                    if (i4 != 0) {
                        z8 = false;
                    } else {
                        z8 = z5;
                    }
                    if (i6 != 0) {
                        z9 = false;
                    } else {
                        z9 = z6;
                    }
                    if (i8 != 0) {
                        str2 = "";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                    }
                    if (Intrinsics.areEqual(value, "请输入")) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    TextUnitKt.getSp(16);
                    if (value.length() > 30) {
                        String strSubstring10 = value.substring(0, 12);
                        Intrinsics.checkNotNullExpressionValue(strSubstring10, "substring(...)");
                        str3 = strSubstring10 + "...";
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = TextUnitKt.getSp(15);
                        str3 = value;
                    }
                    if (!z10) {
                        str3 = str3 + str2;
                    }
                    if (z8) {
                        str4 = str3;
                    } else {
                        str4 = str3;
                    }
                    Modifier modifierClip10 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                    boolean z1116 = !z9;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(onClick);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    boolean z1117 = z7;
                    TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip10, z1116, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z1117;
                    z11 = z8;
                    z12 = z9;
                } else {
                    if (i11 != 0) {
                        z7 = false;
                    } else {
                        z7 = z4;
                    }
                    if (i4 != 0) {
                        z8 = false;
                    } else {
                        z8 = z5;
                    }
                    if (i6 != 0) {
                        z9 = false;
                    } else {
                        z9 = z6;
                    }
                    if (i8 != 0) {
                        str2 = "";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                    }
                    if (Intrinsics.areEqual(value, "请输入")) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    TextUnitKt.getSp(16);
                    if (value.length() > 30) {
                        String strSubstring11 = value.substring(0, 12);
                        Intrinsics.checkNotNullExpressionValue(strSubstring11, "substring(...)");
                        str3 = strSubstring11 + "...";
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = TextUnitKt.getSp(15);
                        str3 = value;
                    }
                    if (!z10) {
                        str3 = str3 + str2;
                    }
                    if (z8) {
                        str4 = str3;
                    } else {
                        str4 = str3;
                    }
                    Modifier modifierClip11 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                    boolean z1118 = !z9;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(onClick);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    boolean z1119 = z7;
                    TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip11, z1118, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z1119;
                    z11 = z8;
                    z12 = z9;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final boolean z11110 = z4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.ValueItemView.2
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
                        FormItemKt.ValueItemView(value, z11110, z11, z12, str2, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            z6 = z3;
            i8 = i2 & 16;
            if (i8 != 0) {
                i3 |= CpioConstants.C_ISBLK;
                str2 = str;
            } else {
                str2 = str;
                if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changed(str2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
            }
            if ((i2 & 32) != 0) {
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(onClick)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                }
                if ((i3 & 374491) == 74898) {
                    if (i11 != 0) {
                        z7 = false;
                    } else {
                        z7 = z4;
                    }
                    if (i4 != 0) {
                        z8 = false;
                    } else {
                        z8 = z5;
                    }
                    if (i6 != 0) {
                        z9 = false;
                    } else {
                        z9 = z6;
                    }
                    if (i8 != 0) {
                        str2 = "";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                    }
                    if (Intrinsics.areEqual(value, "请输入")) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    TextUnitKt.getSp(16);
                    if (value.length() > 30) {
                        String strSubstring12 = value.substring(0, 12);
                        Intrinsics.checkNotNullExpressionValue(strSubstring12, "substring(...)");
                        str3 = strSubstring12 + "...";
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = TextUnitKt.getSp(15);
                        str3 = value;
                    }
                    if (!z10) {
                        str3 = str3 + str2;
                    }
                    if (z8) {
                        str4 = str3;
                    } else {
                        str4 = str3;
                    }
                    Modifier modifierClip12 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                    boolean z11111 = !z9;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(onClick);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    boolean z11112 = z7;
                    TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip12, z11111, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z11112;
                    z11 = z8;
                    z12 = z9;
                } else {
                    if (i11 != 0) {
                        z7 = false;
                    } else {
                        z7 = z4;
                    }
                    if (i4 != 0) {
                        z8 = false;
                    } else {
                        z8 = z5;
                    }
                    if (i6 != 0) {
                        z9 = false;
                    } else {
                        z9 = z6;
                    }
                    if (i8 != 0) {
                        str2 = "";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                    }
                    if (Intrinsics.areEqual(value, "请输入")) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    TextUnitKt.getSp(16);
                    if (value.length() > 30) {
                        String strSubstring13 = value.substring(0, 12);
                        Intrinsics.checkNotNullExpressionValue(strSubstring13, "substring(...)");
                        str3 = strSubstring13 + "...";
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = TextUnitKt.getSp(15);
                        str3 = value;
                    }
                    if (!z10) {
                        str3 = str3 + str2;
                    }
                    if (z8) {
                        str4 = str3;
                    } else {
                        str4 = str3;
                    }
                    Modifier modifierClip13 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                    boolean z11113 = !z9;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(onClick);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    boolean z11114 = z7;
                    TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip13, z11113, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z11114;
                    z11 = z8;
                    z12 = z9;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final boolean z11115 = z4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.ValueItemView.2
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
                        FormItemKt.ValueItemView(value, z11115, z11, z12, str2, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i10 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i3 |= i10;
            if ((i3 & 374491) == 74898) {
                if (i11 != 0) {
                    z7 = false;
                } else {
                    z7 = z4;
                }
                if (i4 != 0) {
                    z8 = false;
                } else {
                    z8 = z5;
                }
                if (i6 != 0) {
                    z9 = false;
                } else {
                    z9 = z6;
                }
                if (i8 != 0) {
                    str2 = "";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                }
                if (Intrinsics.areEqual(value, "请输入")) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                TextUnitKt.getSp(16);
                if (value.length() > 30) {
                    String strSubstring14 = value.substring(0, 12);
                    Intrinsics.checkNotNullExpressionValue(strSubstring14, "substring(...)");
                    str3 = strSubstring14 + "...";
                    sp = TextUnitKt.getSp(15);
                } else {
                    sp = TextUnitKt.getSp(15);
                    str3 = value;
                }
                if (!z10) {
                    str3 = str3 + str2;
                }
                if (z8) {
                    str4 = str3;
                } else {
                    str4 = str3;
                }
                Modifier modifierClip14 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                boolean z11116 = !z9;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(onClick);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                            onClick.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                            onClick.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                boolean z11117 = z7;
                TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip14, z11116, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z11117;
                z11 = z8;
                z12 = z9;
            } else {
                if (i11 != 0) {
                    z7 = false;
                } else {
                    z7 = z4;
                }
                if (i4 != 0) {
                    z8 = false;
                } else {
                    z8 = z5;
                }
                if (i6 != 0) {
                    z9 = false;
                } else {
                    z9 = z6;
                }
                if (i8 != 0) {
                    str2 = "";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                }
                if (Intrinsics.areEqual(value, "请输入")) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                TextUnitKt.getSp(16);
                if (value.length() > 30) {
                    String strSubstring15 = value.substring(0, 12);
                    Intrinsics.checkNotNullExpressionValue(strSubstring15, "substring(...)");
                    str3 = strSubstring15 + "...";
                    sp = TextUnitKt.getSp(15);
                } else {
                    sp = TextUnitKt.getSp(15);
                    str3 = value;
                }
                if (!z10) {
                    str3 = str3 + str2;
                }
                if (z8) {
                    str4 = str3;
                } else {
                    str4 = str3;
                }
                Modifier modifierClip15 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                boolean z11118 = !z9;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(onClick);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                            onClick.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                            onClick.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                boolean z11119 = z7;
                TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip15, z11118, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z11119;
                z11 = z8;
                z12 = z9;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final boolean z111110 = z4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.ValueItemView.2
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
                    FormItemKt.ValueItemView(value, z111110, z11, z12, str2, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        z4 = z;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                z5 = z2;
                if (composerStartRestartGroup.changed(z5)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    z6 = z3;
                    if (composerStartRestartGroup.changed(z6)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i & 57344) == 0) {
                        if (composerStartRestartGroup.changed(str2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                }
                if ((i2 & 32) != 0) {
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(onClick)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                    }
                    if ((i3 & 374491) == 74898) {
                        if (i11 != 0) {
                            z7 = false;
                        } else {
                            z7 = z4;
                        }
                        if (i4 != 0) {
                            z8 = false;
                        } else {
                            z8 = z5;
                        }
                        if (i6 != 0) {
                            z9 = false;
                        } else {
                            z9 = z6;
                        }
                        if (i8 != 0) {
                            str2 = "";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                        }
                        if (Intrinsics.areEqual(value, "请输入")) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        TextUnitKt.getSp(16);
                        if (value.length() > 30) {
                            String strSubstring16 = value.substring(0, 12);
                            Intrinsics.checkNotNullExpressionValue(strSubstring16, "substring(...)");
                            str3 = strSubstring16 + "...";
                            sp = TextUnitKt.getSp(15);
                        } else {
                            sp = TextUnitKt.getSp(15);
                            str3 = value;
                        }
                        if (!z10) {
                            str3 = str3 + str2;
                        }
                        if (z8) {
                            str4 = str3;
                        } else {
                            str4 = str3;
                        }
                        Modifier modifierClip16 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                        boolean z111111 = !z9;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(onClick);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        boolean z111112 = z7;
                        TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip16, z111111, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z111112;
                        z11 = z8;
                        z12 = z9;
                    } else {
                        if (i11 != 0) {
                            z7 = false;
                        } else {
                            z7 = z4;
                        }
                        if (i4 != 0) {
                            z8 = false;
                        } else {
                            z8 = z5;
                        }
                        if (i6 != 0) {
                            z9 = false;
                        } else {
                            z9 = z6;
                        }
                        if (i8 != 0) {
                            str2 = "";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                        }
                        if (Intrinsics.areEqual(value, "请输入")) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        TextUnitKt.getSp(16);
                        if (value.length() > 30) {
                            String strSubstring17 = value.substring(0, 12);
                            Intrinsics.checkNotNullExpressionValue(strSubstring17, "substring(...)");
                            str3 = strSubstring17 + "...";
                            sp = TextUnitKt.getSp(15);
                        } else {
                            sp = TextUnitKt.getSp(15);
                            str3 = value;
                        }
                        if (!z10) {
                            str3 = str3 + str2;
                        }
                        if (z8) {
                            str4 = str3;
                        } else {
                            str4 = str3;
                        }
                        Modifier modifierClip17 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                        boolean z111113 = !z9;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(onClick);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        boolean z111114 = z7;
                        TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip17, z111113, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z111114;
                        z11 = z8;
                        z12 = z9;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final boolean z111115 = z4;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.ValueItemView.2
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
                            FormItemKt.ValueItemView(value, z111115, z11, z12, str2, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i10 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i3 |= i10;
                if ((i3 & 374491) == 74898) {
                    if (i11 != 0) {
                        z7 = false;
                    } else {
                        z7 = z4;
                    }
                    if (i4 != 0) {
                        z8 = false;
                    } else {
                        z8 = z5;
                    }
                    if (i6 != 0) {
                        z9 = false;
                    } else {
                        z9 = z6;
                    }
                    if (i8 != 0) {
                        str2 = "";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                    }
                    if (Intrinsics.areEqual(value, "请输入")) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    TextUnitKt.getSp(16);
                    if (value.length() > 30) {
                        String strSubstring18 = value.substring(0, 12);
                        Intrinsics.checkNotNullExpressionValue(strSubstring18, "substring(...)");
                        str3 = strSubstring18 + "...";
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = TextUnitKt.getSp(15);
                        str3 = value;
                    }
                    if (!z10) {
                        str3 = str3 + str2;
                    }
                    if (z8) {
                        str4 = str3;
                    } else {
                        str4 = str3;
                    }
                    Modifier modifierClip18 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                    boolean z111116 = !z9;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(onClick);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    boolean z111117 = z7;
                    TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip18, z111116, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z111117;
                    z11 = z8;
                    z12 = z9;
                } else {
                    if (i11 != 0) {
                        z7 = false;
                    } else {
                        z7 = z4;
                    }
                    if (i4 != 0) {
                        z8 = false;
                    } else {
                        z8 = z5;
                    }
                    if (i6 != 0) {
                        z9 = false;
                    } else {
                        z9 = z6;
                    }
                    if (i8 != 0) {
                        str2 = "";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                    }
                    if (Intrinsics.areEqual(value, "请输入")) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    TextUnitKt.getSp(16);
                    if (value.length() > 30) {
                        String strSubstring19 = value.substring(0, 12);
                        Intrinsics.checkNotNullExpressionValue(strSubstring19, "substring(...)");
                        str3 = strSubstring19 + "...";
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = TextUnitKt.getSp(15);
                        str3 = value;
                    }
                    if (!z10) {
                        str3 = str3 + str2;
                    }
                    if (z8) {
                        str4 = str3;
                    } else {
                        str4 = str3;
                    }
                    Modifier modifierClip19 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                    boolean z111118 = !z9;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(onClick);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    boolean z111119 = z7;
                    TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip19, z111118, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z111119;
                    z11 = z8;
                    z12 = z9;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final boolean z1111110 = z4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.ValueItemView.2
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
                        FormItemKt.ValueItemView(value, z1111110, z11, z12, str2, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            z6 = z3;
            i8 = i2 & 16;
            if (i8 != 0) {
                i3 |= CpioConstants.C_ISBLK;
                str2 = str;
            } else {
                str2 = str;
                if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changed(str2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
            }
            if ((i2 & 32) != 0) {
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(onClick)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                }
                if ((i3 & 374491) == 74898) {
                    if (i11 != 0) {
                        z7 = false;
                    } else {
                        z7 = z4;
                    }
                    if (i4 != 0) {
                        z8 = false;
                    } else {
                        z8 = z5;
                    }
                    if (i6 != 0) {
                        z9 = false;
                    } else {
                        z9 = z6;
                    }
                    if (i8 != 0) {
                        str2 = "";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                    }
                    if (Intrinsics.areEqual(value, "请输入")) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    TextUnitKt.getSp(16);
                    if (value.length() > 30) {
                        String strSubstring110 = value.substring(0, 12);
                        Intrinsics.checkNotNullExpressionValue(strSubstring110, "substring(...)");
                        str3 = strSubstring110 + "...";
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = TextUnitKt.getSp(15);
                        str3 = value;
                    }
                    if (!z10) {
                        str3 = str3 + str2;
                    }
                    if (z8) {
                        str4 = str3;
                    } else {
                        str4 = str3;
                    }
                    Modifier modifierClip110 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                    boolean z1111111 = !z9;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(onClick);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    boolean z1111112 = z7;
                    TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip110, z1111111, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z1111112;
                    z11 = z8;
                    z12 = z9;
                } else {
                    if (i11 != 0) {
                        z7 = false;
                    } else {
                        z7 = z4;
                    }
                    if (i4 != 0) {
                        z8 = false;
                    } else {
                        z8 = z5;
                    }
                    if (i6 != 0) {
                        z9 = false;
                    } else {
                        z9 = z6;
                    }
                    if (i8 != 0) {
                        str2 = "";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                    }
                    if (Intrinsics.areEqual(value, "请输入")) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    TextUnitKt.getSp(16);
                    if (value.length() > 30) {
                        String strSubstring111 = value.substring(0, 12);
                        Intrinsics.checkNotNullExpressionValue(strSubstring111, "substring(...)");
                        str3 = strSubstring111 + "...";
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = TextUnitKt.getSp(15);
                        str3 = value;
                    }
                    if (!z10) {
                        str3 = str3 + str2;
                    }
                    if (z8) {
                        str4 = str3;
                    } else {
                        str4 = str3;
                    }
                    Modifier modifierClip111 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                    boolean z1111113 = !z9;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(onClick);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    boolean z1111114 = z7;
                    TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip111, z1111113, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z1111114;
                    z11 = z8;
                    z12 = z9;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final boolean z1111115 = z4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.ValueItemView.2
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
                        FormItemKt.ValueItemView(value, z1111115, z11, z12, str2, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i10 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i3 |= i10;
            if ((i3 & 374491) == 74898) {
                if (i11 != 0) {
                    z7 = false;
                } else {
                    z7 = z4;
                }
                if (i4 != 0) {
                    z8 = false;
                } else {
                    z8 = z5;
                }
                if (i6 != 0) {
                    z9 = false;
                } else {
                    z9 = z6;
                }
                if (i8 != 0) {
                    str2 = "";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                }
                if (Intrinsics.areEqual(value, "请输入")) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                TextUnitKt.getSp(16);
                if (value.length() > 30) {
                    String strSubstring112 = value.substring(0, 12);
                    Intrinsics.checkNotNullExpressionValue(strSubstring112, "substring(...)");
                    str3 = strSubstring112 + "...";
                    sp = TextUnitKt.getSp(15);
                } else {
                    sp = TextUnitKt.getSp(15);
                    str3 = value;
                }
                if (!z10) {
                    str3 = str3 + str2;
                }
                if (z8) {
                    str4 = str3;
                } else {
                    str4 = str3;
                }
                Modifier modifierClip112 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                boolean z1111116 = !z9;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(onClick);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                            onClick.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                            onClick.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                boolean z1111117 = z7;
                TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip112, z1111116, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z1111117;
                z11 = z8;
                z12 = z9;
            } else {
                if (i11 != 0) {
                    z7 = false;
                } else {
                    z7 = z4;
                }
                if (i4 != 0) {
                    z8 = false;
                } else {
                    z8 = z5;
                }
                if (i6 != 0) {
                    z9 = false;
                } else {
                    z9 = z6;
                }
                if (i8 != 0) {
                    str2 = "";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                }
                if (Intrinsics.areEqual(value, "请输入")) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                TextUnitKt.getSp(16);
                if (value.length() > 30) {
                    String strSubstring113 = value.substring(0, 12);
                    Intrinsics.checkNotNullExpressionValue(strSubstring113, "substring(...)");
                    str3 = strSubstring113 + "...";
                    sp = TextUnitKt.getSp(15);
                } else {
                    sp = TextUnitKt.getSp(15);
                    str3 = value;
                }
                if (!z10) {
                    str3 = str3 + str2;
                }
                if (z8) {
                    str4 = str3;
                } else {
                    str4 = str3;
                }
                Modifier modifierClip113 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                boolean z1111118 = !z9;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(onClick);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                            onClick.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                            onClick.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                boolean z1111119 = z7;
                TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip113, z1111118, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z1111119;
                z11 = z8;
                z12 = z9;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final boolean z11111110 = z4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.ValueItemView.2
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
                    FormItemKt.ValueItemView(value, z11111110, z11, z12, str2, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
        z5 = z2;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 7168) == 0) {
                z6 = z3;
                if (composerStartRestartGroup.changed(z6)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                i3 |= CpioConstants.C_ISBLK;
                str2 = str;
            } else {
                str2 = str;
                if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changed(str2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
            }
            if ((i2 & 32) != 0) {
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(onClick)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                }
                if ((i3 & 374491) == 74898) {
                    if (i11 != 0) {
                        z7 = false;
                    } else {
                        z7 = z4;
                    }
                    if (i4 != 0) {
                        z8 = false;
                    } else {
                        z8 = z5;
                    }
                    if (i6 != 0) {
                        z9 = false;
                    } else {
                        z9 = z6;
                    }
                    if (i8 != 0) {
                        str2 = "";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                    }
                    if (Intrinsics.areEqual(value, "请输入")) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    TextUnitKt.getSp(16);
                    if (value.length() > 30) {
                        String strSubstring114 = value.substring(0, 12);
                        Intrinsics.checkNotNullExpressionValue(strSubstring114, "substring(...)");
                        str3 = strSubstring114 + "...";
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = TextUnitKt.getSp(15);
                        str3 = value;
                    }
                    if (!z10) {
                        str3 = str3 + str2;
                    }
                    if (z8) {
                        str4 = str3;
                    } else {
                        str4 = str3;
                    }
                    Modifier modifierClip114 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                    boolean z11111111 = !z9;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(onClick);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    boolean z11111112 = z7;
                    TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip114, z11111111, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z11111112;
                    z11 = z8;
                    z12 = z9;
                } else {
                    if (i11 != 0) {
                        z7 = false;
                    } else {
                        z7 = z4;
                    }
                    if (i4 != 0) {
                        z8 = false;
                    } else {
                        z8 = z5;
                    }
                    if (i6 != 0) {
                        z9 = false;
                    } else {
                        z9 = z6;
                    }
                    if (i8 != 0) {
                        str2 = "";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                    }
                    if (Intrinsics.areEqual(value, "请输入")) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    TextUnitKt.getSp(16);
                    if (value.length() > 30) {
                        String strSubstring115 = value.substring(0, 12);
                        Intrinsics.checkNotNullExpressionValue(strSubstring115, "substring(...)");
                        str3 = strSubstring115 + "...";
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = TextUnitKt.getSp(15);
                        str3 = value;
                    }
                    if (!z10) {
                        str3 = str3 + str2;
                    }
                    if (z8) {
                        str4 = str3;
                    } else {
                        str4 = str3;
                    }
                    Modifier modifierClip115 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                    boolean z11111113 = !z9;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(onClick);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    boolean z11111114 = z7;
                    TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip115, z11111113, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z11111114;
                    z11 = z8;
                    z12 = z9;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final boolean z11111115 = z4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.ValueItemView.2
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
                        FormItemKt.ValueItemView(value, z11111115, z11, z12, str2, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i10 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i3 |= i10;
            if ((i3 & 374491) == 74898) {
                if (i11 != 0) {
                    z7 = false;
                } else {
                    z7 = z4;
                }
                if (i4 != 0) {
                    z8 = false;
                } else {
                    z8 = z5;
                }
                if (i6 != 0) {
                    z9 = false;
                } else {
                    z9 = z6;
                }
                if (i8 != 0) {
                    str2 = "";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                }
                if (Intrinsics.areEqual(value, "请输入")) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                TextUnitKt.getSp(16);
                if (value.length() > 30) {
                    String strSubstring116 = value.substring(0, 12);
                    Intrinsics.checkNotNullExpressionValue(strSubstring116, "substring(...)");
                    str3 = strSubstring116 + "...";
                    sp = TextUnitKt.getSp(15);
                } else {
                    sp = TextUnitKt.getSp(15);
                    str3 = value;
                }
                if (!z10) {
                    str3 = str3 + str2;
                }
                if (z8) {
                    str4 = str3;
                } else {
                    str4 = str3;
                }
                Modifier modifierClip116 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                boolean z11111116 = !z9;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(onClick);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                            onClick.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                            onClick.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                boolean z11111117 = z7;
                TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip116, z11111116, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z11111117;
                z11 = z8;
                z12 = z9;
            } else {
                if (i11 != 0) {
                    z7 = false;
                } else {
                    z7 = z4;
                }
                if (i4 != 0) {
                    z8 = false;
                } else {
                    z8 = z5;
                }
                if (i6 != 0) {
                    z9 = false;
                } else {
                    z9 = z6;
                }
                if (i8 != 0) {
                    str2 = "";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                }
                if (Intrinsics.areEqual(value, "请输入")) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                TextUnitKt.getSp(16);
                if (value.length() > 30) {
                    String strSubstring117 = value.substring(0, 12);
                    Intrinsics.checkNotNullExpressionValue(strSubstring117, "substring(...)");
                    str3 = strSubstring117 + "...";
                    sp = TextUnitKt.getSp(15);
                } else {
                    sp = TextUnitKt.getSp(15);
                    str3 = value;
                }
                if (!z10) {
                    str3 = str3 + str2;
                }
                if (z8) {
                    str4 = str3;
                } else {
                    str4 = str3;
                }
                Modifier modifierClip117 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                boolean z11111118 = !z9;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(onClick);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                            onClick.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                            onClick.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                boolean z11111119 = z7;
                TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip117, z11111118, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z11111119;
                z11 = z8;
                z12 = z9;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final boolean z111111110 = z4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.ValueItemView.2
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
                    FormItemKt.ValueItemView(value, z111111110, z11, z12, str2, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        z6 = z3;
        i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= CpioConstants.C_ISBLK;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 57344) == 0) {
                if (composerStartRestartGroup.changed(str2)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
        }
        if ((i2 & 32) != 0) {
            if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(onClick)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
            }
            if ((i3 & 374491) == 74898) {
                if (i11 != 0) {
                    z7 = false;
                } else {
                    z7 = z4;
                }
                if (i4 != 0) {
                    z8 = false;
                } else {
                    z8 = z5;
                }
                if (i6 != 0) {
                    z9 = false;
                } else {
                    z9 = z6;
                }
                if (i8 != 0) {
                    str2 = "";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                }
                if (Intrinsics.areEqual(value, "请输入")) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                TextUnitKt.getSp(16);
                if (value.length() > 30) {
                    String strSubstring118 = value.substring(0, 12);
                    Intrinsics.checkNotNullExpressionValue(strSubstring118, "substring(...)");
                    str3 = strSubstring118 + "...";
                    sp = TextUnitKt.getSp(15);
                } else {
                    sp = TextUnitKt.getSp(15);
                    str3 = value;
                }
                if (!z10) {
                    str3 = str3 + str2;
                }
                if (z8) {
                    str4 = str3;
                } else {
                    str4 = str3;
                }
                Modifier modifierClip118 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                boolean z111111111 = !z9;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(onClick);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                            onClick.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                            onClick.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                boolean z111111112 = z7;
                TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip118, z111111111, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z111111112;
                z11 = z8;
                z12 = z9;
            } else {
                if (i11 != 0) {
                    z7 = false;
                } else {
                    z7 = z4;
                }
                if (i4 != 0) {
                    z8 = false;
                } else {
                    z8 = z5;
                }
                if (i6 != 0) {
                    z9 = false;
                } else {
                    z9 = z6;
                }
                if (i8 != 0) {
                    str2 = "";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
                }
                if (Intrinsics.areEqual(value, "请输入")) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                TextUnitKt.getSp(16);
                if (value.length() > 30) {
                    String strSubstring119 = value.substring(0, 12);
                    Intrinsics.checkNotNullExpressionValue(strSubstring119, "substring(...)");
                    str3 = strSubstring119 + "...";
                    sp = TextUnitKt.getSp(15);
                } else {
                    sp = TextUnitKt.getSp(15);
                    str3 = value;
                }
                if (!z10) {
                    str3 = str3 + str2;
                }
                if (z8) {
                    str4 = str3;
                } else {
                    str4 = str3;
                }
                Modifier modifierClip119 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                boolean z111111113 = !z9;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(onClick);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                            onClick.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                            onClick.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                boolean z111111114 = z7;
                TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip119, z111111113, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z111111114;
                z11 = z8;
                z12 = z9;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final boolean z111111115 = z4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.ValueItemView.2
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
                    FormItemKt.ValueItemView(value, z111111115, z11, z12, str2, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i10 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i3 |= i10;
        if ((i3 & 374491) == 74898) {
            if (i11 != 0) {
                z7 = false;
            } else {
                z7 = z4;
            }
            if (i4 != 0) {
                z8 = false;
            } else {
                z8 = z5;
            }
            if (i6 != 0) {
                z9 = false;
            } else {
                z9 = z6;
            }
            if (i8 != 0) {
                str2 = "";
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
            }
            if (Intrinsics.areEqual(value, "请输入")) {
                z10 = true;
            } else {
                z10 = true;
            }
            TextUnitKt.getSp(16);
            if (value.length() > 30) {
                String strSubstring1110 = value.substring(0, 12);
                Intrinsics.checkNotNullExpressionValue(strSubstring1110, "substring(...)");
                str3 = strSubstring1110 + "...";
                sp = TextUnitKt.getSp(15);
            } else {
                sp = TextUnitKt.getSp(15);
                str3 = value;
            }
            if (!z10) {
                str3 = str3 + str2;
            }
            if (z8) {
                str4 = str3;
            } else {
                str4 = str3;
            }
            Modifier modifierClip1110 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
            boolean z111111116 = !z9;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            zChanged = composerStartRestartGroup.changed(onClick);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                        onClick.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                        onClick.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            boolean z111111117 = z7;
            TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip1110, z111111116, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z4 = z111111117;
            z11 = z8;
            z12 = z9;
        } else {
            if (i11 != 0) {
                z7 = false;
            } else {
                z7 = z4;
            }
            if (i4 != 0) {
                z8 = false;
            } else {
                z8 = z5;
            }
            if (i6 != 0) {
                z9 = false;
            } else {
                z9 = z6;
            }
            if (i8 != 0) {
                str2 = "";
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1421287826, i3, -1, "cn.jianyun.workplan.ui.component.form.ValueItemView (FormItem.kt:137)");
            }
            if (Intrinsics.areEqual(value, "请输入")) {
                z10 = true;
            } else {
                z10 = true;
            }
            TextUnitKt.getSp(16);
            if (value.length() > 30) {
                String strSubstring1111 = value.substring(0, 12);
                Intrinsics.checkNotNullExpressionValue(strSubstring1111, "substring(...)");
                str3 = strSubstring1111 + "...";
                sp = TextUnitKt.getSp(15);
            } else {
                sp = TextUnitKt.getSp(15);
                str3 = value;
            }
            if (!z10) {
                str3 = str3 + str2;
            }
            if (z8) {
                str4 = str3;
            } else {
                str4 = str3;
            }
            Modifier modifierClip1111 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
            boolean z111111118 = !z9;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            zChanged = composerStartRestartGroup.changed(onClick);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                        onClick.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$ValueItemView$1$1
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
                        onClick.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            boolean z111111119 = z7;
            TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip1111, z111111118, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z7, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122352);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z4 = z111111119;
            z11 = z8;
            z12 = z9;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final boolean z1111111110 = z4;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.ValueItemView.2
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
                FormItemKt.ValueItemView(value, z1111111110, z11, z12, str2, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0155  */
    /* JADX WARN: Code duplicated, block: B:106:0x0185  */
    /* JADX WARN: Code duplicated, block: B:108:0x018d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0241  */
    /* JADX WARN: Code duplicated, block: B:116:0x024f  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Code duplicated, block: B:53:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x010b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0117  */
    /* JADX WARN: Code duplicated, block: B:97:0x0136  */
    /* JADX WARN: Code duplicated, block: B:99:0x0139 A[ADDED_TO_REGION] */
    public static final void Value2ItemView(final String value, final boolean z, boolean z2, boolean z3, String str, final Function0<Unit> onClick, Composer composer, final int i, final int i2) {
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        int i6;
        String str2;
        int i7;
        int i8;
        boolean z6;
        boolean z7;
        boolean z8;
        String str3;
        String str4;
        boolean zChanged;
        Object objRememberedValue;
        final String str5;
        final boolean z9;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(165793566);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Value2ItemView)P(5!2,3,4)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 896) == 0) {
                z4 = z2;
                i3 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    z5 = z3;
                    if (composerStartRestartGroup.changed(z5)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((57344 & i) == 0) {
                        str2 = str;
                        if (composerStartRestartGroup.changed(str2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 32) != 0) {
                        if ((458752 & i) == 0) {
                            if (composerStartRestartGroup.changedInstance(onClick)) {
                                i8 = 131072;
                            } else {
                                i8 = 65536;
                            }
                        }
                        if ((374491 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                            if (i9 != 0) {
                                z6 = false;
                            } else {
                                z6 = z4;
                            }
                            if (i4 != 0) {
                                z7 = false;
                            } else {
                                z7 = z5;
                            }
                            if (i6 != 0) {
                                str2 = "";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(165793566, i3, -1, "cn.jianyun.workplan.ui.component.form.Value2ItemView (FormItem.kt:173)");
                            }
                            if (!Intrinsics.areEqual(value, "请输入") || Intrinsics.areEqual(value, "请选择") || z7 || z) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (value.length() > 20) {
                                String strSubstring = value.substring(0, 12);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                str3 = strSubstring + "...";
                            } else {
                                str3 = value;
                            }
                            if (!z8 || z || Intrinsics.areEqual(str2, "")) {
                                str4 = str3;
                            } else {
                                str4 = str3 + str2;
                            }
                            Modifier modifierClip = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                            boolean z10 = !z7;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(onClick);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                        onClick.invoke();
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            str5 = str2;
                            boolean z11 = z6;
                            TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip, z10, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z8, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z6, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122360);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z9 = z7;
                            z4 = z11;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            z9 = z5;
                            str5 = str2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final boolean z12 = z4;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.Value2ItemView.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i10) {
                                FormItemKt.Value2ItemView(value, z, z12, z9, str5, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i8 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i3 |= i8;
                    if ((374491 & i3) == 74898) {
                        if (i9 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                        if (i4 != 0) {
                            z7 = false;
                        } else {
                            z7 = z5;
                        }
                        if (i6 != 0) {
                            str2 = "";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(165793566, i3, -1, "cn.jianyun.workplan.ui.component.form.Value2ItemView (FormItem.kt:173)");
                        }
                        if (Intrinsics.areEqual(value, "请输入")) {
                            z8 = true;
                        } else {
                            z8 = true;
                        }
                        if (value.length() > 20) {
                            String strSubstring2 = value.substring(0, 12);
                            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                            str3 = strSubstring2 + "...";
                        } else {
                            str3 = value;
                        }
                        if (z8) {
                            str4 = str3;
                        } else {
                            str4 = str3;
                        }
                        Modifier modifierClip2 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                        boolean z13 = !z7;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(onClick);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        str5 = str2;
                        boolean z14 = z6;
                        TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip2, z13, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z8, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z6, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122360);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z9 = z7;
                        z4 = z14;
                    } else {
                        if (i9 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                        if (i4 != 0) {
                            z7 = false;
                        } else {
                            z7 = z5;
                        }
                        if (i6 != 0) {
                            str2 = "";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(165793566, i3, -1, "cn.jianyun.workplan.ui.component.form.Value2ItemView (FormItem.kt:173)");
                        }
                        if (Intrinsics.areEqual(value, "请输入")) {
                            z8 = true;
                        } else {
                            z8 = true;
                        }
                        if (value.length() > 20) {
                            String strSubstring3 = value.substring(0, 12);
                            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                            str3 = strSubstring3 + "...";
                        } else {
                            str3 = value;
                        }
                        if (z8) {
                            str4 = str3;
                        } else {
                            str4 = str3;
                        }
                        Modifier modifierClip3 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                        boolean z15 = !z7;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(onClick);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        str5 = str2;
                        boolean z16 = z6;
                        TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip3, z15, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z8, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z6, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122360);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z9 = z7;
                        z4 = z16;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final boolean z17 = z4;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.Value2ItemView.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i10) {
                            FormItemKt.Value2ItemView(value, z, z17, z9, str5, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= CpioConstants.C_ISBLK;
                str2 = str;
                if ((i2 & 32) != 0) {
                    if ((458752 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(onClick)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898) {
                        if (i9 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                        if (i4 != 0) {
                            z7 = false;
                        } else {
                            z7 = z5;
                        }
                        if (i6 != 0) {
                            str2 = "";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(165793566, i3, -1, "cn.jianyun.workplan.ui.component.form.Value2ItemView (FormItem.kt:173)");
                        }
                        if (Intrinsics.areEqual(value, "请输入")) {
                            z8 = true;
                        } else {
                            z8 = true;
                        }
                        if (value.length() > 20) {
                            String strSubstring4 = value.substring(0, 12);
                            Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                            str3 = strSubstring4 + "...";
                        } else {
                            str3 = value;
                        }
                        if (z8) {
                            str4 = str3;
                        } else {
                            str4 = str3;
                        }
                        Modifier modifierClip4 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                        boolean z18 = !z7;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(onClick);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        str5 = str2;
                        boolean z19 = z6;
                        TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip4, z18, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z8, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z6, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122360);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z9 = z7;
                        z4 = z19;
                    } else {
                        if (i9 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                        if (i4 != 0) {
                            z7 = false;
                        } else {
                            z7 = z5;
                        }
                        if (i6 != 0) {
                            str2 = "";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(165793566, i3, -1, "cn.jianyun.workplan.ui.component.form.Value2ItemView (FormItem.kt:173)");
                        }
                        if (Intrinsics.areEqual(value, "请输入")) {
                            z8 = true;
                        } else {
                            z8 = true;
                        }
                        if (value.length() > 20) {
                            String strSubstring5 = value.substring(0, 12);
                            Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
                            str3 = strSubstring5 + "...";
                        } else {
                            str3 = value;
                        }
                        if (z8) {
                            str4 = str3;
                        } else {
                            str4 = str3;
                        }
                        Modifier modifierClip5 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                        boolean z110 = !z7;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(onClick);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        str5 = str2;
                        boolean z111 = z6;
                        TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip5, z110, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z8, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z6, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122360);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z9 = z7;
                        z4 = z111;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final boolean z112 = z4;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.Value2ItemView.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i10) {
                            FormItemKt.Value2ItemView(value, z, z112, z9, str5, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i8 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i3 |= i8;
                if ((374491 & i3) == 74898) {
                    if (i9 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if (i4 != 0) {
                        z7 = false;
                    } else {
                        z7 = z5;
                    }
                    if (i6 != 0) {
                        str2 = "";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(165793566, i3, -1, "cn.jianyun.workplan.ui.component.form.Value2ItemView (FormItem.kt:173)");
                    }
                    if (Intrinsics.areEqual(value, "请输入")) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    if (value.length() > 20) {
                        String strSubstring6 = value.substring(0, 12);
                        Intrinsics.checkNotNullExpressionValue(strSubstring6, "substring(...)");
                        str3 = strSubstring6 + "...";
                    } else {
                        str3 = value;
                    }
                    if (z8) {
                        str4 = str3;
                    } else {
                        str4 = str3;
                    }
                    Modifier modifierClip6 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                    boolean z113 = !z7;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(onClick);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    str5 = str2;
                    boolean z114 = z6;
                    TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip6, z113, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z8, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z6, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122360);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z9 = z7;
                    z4 = z114;
                } else {
                    if (i9 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if (i4 != 0) {
                        z7 = false;
                    } else {
                        z7 = z5;
                    }
                    if (i6 != 0) {
                        str2 = "";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(165793566, i3, -1, "cn.jianyun.workplan.ui.component.form.Value2ItemView (FormItem.kt:173)");
                    }
                    if (Intrinsics.areEqual(value, "请输入")) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    if (value.length() > 20) {
                        String strSubstring7 = value.substring(0, 12);
                        Intrinsics.checkNotNullExpressionValue(strSubstring7, "substring(...)");
                        str3 = strSubstring7 + "...";
                    } else {
                        str3 = value;
                    }
                    if (z8) {
                        str4 = str3;
                    } else {
                        str4 = str3;
                    }
                    Modifier modifierClip7 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                    boolean z115 = !z7;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(onClick);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    str5 = str2;
                    boolean z116 = z6;
                    TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip7, z115, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z8, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z6, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122360);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z9 = z7;
                    z4 = z116;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final boolean z117 = z4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.Value2ItemView.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i10) {
                        FormItemKt.Value2ItemView(value, z, z117, z9, str5, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            z5 = z3;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    str2 = str;
                    if (composerStartRestartGroup.changed(str2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i2 & 32) != 0) {
                    if ((458752 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(onClick)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898) {
                        if (i9 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                        if (i4 != 0) {
                            z7 = false;
                        } else {
                            z7 = z5;
                        }
                        if (i6 != 0) {
                            str2 = "";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(165793566, i3, -1, "cn.jianyun.workplan.ui.component.form.Value2ItemView (FormItem.kt:173)");
                        }
                        if (Intrinsics.areEqual(value, "请输入")) {
                            z8 = true;
                        } else {
                            z8 = true;
                        }
                        if (value.length() > 20) {
                            String strSubstring8 = value.substring(0, 12);
                            Intrinsics.checkNotNullExpressionValue(strSubstring8, "substring(...)");
                            str3 = strSubstring8 + "...";
                        } else {
                            str3 = value;
                        }
                        if (z8) {
                            str4 = str3;
                        } else {
                            str4 = str3;
                        }
                        Modifier modifierClip8 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                        boolean z118 = !z7;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(onClick);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        str5 = str2;
                        boolean z119 = z6;
                        TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip8, z118, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z8, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z6, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122360);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z9 = z7;
                        z4 = z119;
                    } else {
                        if (i9 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                        if (i4 != 0) {
                            z7 = false;
                        } else {
                            z7 = z5;
                        }
                        if (i6 != 0) {
                            str2 = "";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(165793566, i3, -1, "cn.jianyun.workplan.ui.component.form.Value2ItemView (FormItem.kt:173)");
                        }
                        if (Intrinsics.areEqual(value, "请输入")) {
                            z8 = true;
                        } else {
                            z8 = true;
                        }
                        if (value.length() > 20) {
                            String strSubstring9 = value.substring(0, 12);
                            Intrinsics.checkNotNullExpressionValue(strSubstring9, "substring(...)");
                            str3 = strSubstring9 + "...";
                        } else {
                            str3 = value;
                        }
                        if (z8) {
                            str4 = str3;
                        } else {
                            str4 = str3;
                        }
                        Modifier modifierClip9 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                        boolean z1110 = !z7;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(onClick);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        str5 = str2;
                        boolean z1111 = z6;
                        TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip9, z1110, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z8, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z6, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122360);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z9 = z7;
                        z4 = z1111;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final boolean z1112 = z4;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.Value2ItemView.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i10) {
                            FormItemKt.Value2ItemView(value, z, z1112, z9, str5, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i8 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i3 |= i8;
                if ((374491 & i3) == 74898) {
                    if (i9 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if (i4 != 0) {
                        z7 = false;
                    } else {
                        z7 = z5;
                    }
                    if (i6 != 0) {
                        str2 = "";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(165793566, i3, -1, "cn.jianyun.workplan.ui.component.form.Value2ItemView (FormItem.kt:173)");
                    }
                    if (Intrinsics.areEqual(value, "请输入")) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    if (value.length() > 20) {
                        String strSubstring10 = value.substring(0, 12);
                        Intrinsics.checkNotNullExpressionValue(strSubstring10, "substring(...)");
                        str3 = strSubstring10 + "...";
                    } else {
                        str3 = value;
                    }
                    if (z8) {
                        str4 = str3;
                    } else {
                        str4 = str3;
                    }
                    Modifier modifierClip10 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                    boolean z1113 = !z7;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(onClick);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    str5 = str2;
                    boolean z1114 = z6;
                    TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip10, z1113, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z8, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z6, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122360);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z9 = z7;
                    z4 = z1114;
                } else {
                    if (i9 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if (i4 != 0) {
                        z7 = false;
                    } else {
                        z7 = z5;
                    }
                    if (i6 != 0) {
                        str2 = "";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(165793566, i3, -1, "cn.jianyun.workplan.ui.component.form.Value2ItemView (FormItem.kt:173)");
                    }
                    if (Intrinsics.areEqual(value, "请输入")) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    if (value.length() > 20) {
                        String strSubstring11 = value.substring(0, 12);
                        Intrinsics.checkNotNullExpressionValue(strSubstring11, "substring(...)");
                        str3 = strSubstring11 + "...";
                    } else {
                        str3 = value;
                    }
                    if (z8) {
                        str4 = str3;
                    } else {
                        str4 = str3;
                    }
                    Modifier modifierClip11 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                    boolean z1115 = !z7;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(onClick);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    str5 = str2;
                    boolean z1116 = z6;
                    TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip11, z1115, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z8, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z6, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122360);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z9 = z7;
                    z4 = z1116;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final boolean z1117 = z4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.Value2ItemView.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i10) {
                        FormItemKt.Value2ItemView(value, z, z1117, z9, str5, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= CpioConstants.C_ISBLK;
            str2 = str;
            if ((i2 & 32) != 0) {
                if ((458752 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(onClick)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                }
                if ((374491 & i3) == 74898) {
                    if (i9 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if (i4 != 0) {
                        z7 = false;
                    } else {
                        z7 = z5;
                    }
                    if (i6 != 0) {
                        str2 = "";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(165793566, i3, -1, "cn.jianyun.workplan.ui.component.form.Value2ItemView (FormItem.kt:173)");
                    }
                    if (Intrinsics.areEqual(value, "请输入")) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    if (value.length() > 20) {
                        String strSubstring12 = value.substring(0, 12);
                        Intrinsics.checkNotNullExpressionValue(strSubstring12, "substring(...)");
                        str3 = strSubstring12 + "...";
                    } else {
                        str3 = value;
                    }
                    if (z8) {
                        str4 = str3;
                    } else {
                        str4 = str3;
                    }
                    Modifier modifierClip12 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                    boolean z1118 = !z7;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(onClick);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    str5 = str2;
                    boolean z1119 = z6;
                    TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip12, z1118, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z8, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z6, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122360);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z9 = z7;
                    z4 = z1119;
                } else {
                    if (i9 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if (i4 != 0) {
                        z7 = false;
                    } else {
                        z7 = z5;
                    }
                    if (i6 != 0) {
                        str2 = "";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(165793566, i3, -1, "cn.jianyun.workplan.ui.component.form.Value2ItemView (FormItem.kt:173)");
                    }
                    if (Intrinsics.areEqual(value, "请输入")) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    if (value.length() > 20) {
                        String strSubstring13 = value.substring(0, 12);
                        Intrinsics.checkNotNullExpressionValue(strSubstring13, "substring(...)");
                        str3 = strSubstring13 + "...";
                    } else {
                        str3 = value;
                    }
                    if (z8) {
                        str4 = str3;
                    } else {
                        str4 = str3;
                    }
                    Modifier modifierClip13 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                    boolean z11110 = !z7;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(onClick);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    str5 = str2;
                    boolean z11111 = z6;
                    TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip13, z11110, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z8, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z6, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122360);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z9 = z7;
                    z4 = z11111;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final boolean z11112 = z4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.Value2ItemView.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i10) {
                        FormItemKt.Value2ItemView(value, z, z11112, z9, str5, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i8 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i3 |= i8;
            if ((374491 & i3) == 74898) {
                if (i9 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if (i4 != 0) {
                    z7 = false;
                } else {
                    z7 = z5;
                }
                if (i6 != 0) {
                    str2 = "";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(165793566, i3, -1, "cn.jianyun.workplan.ui.component.form.Value2ItemView (FormItem.kt:173)");
                }
                if (Intrinsics.areEqual(value, "请输入")) {
                    z8 = true;
                } else {
                    z8 = true;
                }
                if (value.length() > 20) {
                    String strSubstring14 = value.substring(0, 12);
                    Intrinsics.checkNotNullExpressionValue(strSubstring14, "substring(...)");
                    str3 = strSubstring14 + "...";
                } else {
                    str3 = value;
                }
                if (z8) {
                    str4 = str3;
                } else {
                    str4 = str3;
                }
                Modifier modifierClip14 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                boolean z11113 = !z7;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(onClick);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                            onClick.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                            onClick.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                str5 = str2;
                boolean z11114 = z6;
                TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip14, z11113, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z8, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z6, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122360);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z9 = z7;
                z4 = z11114;
            } else {
                if (i9 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if (i4 != 0) {
                    z7 = false;
                } else {
                    z7 = z5;
                }
                if (i6 != 0) {
                    str2 = "";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(165793566, i3, -1, "cn.jianyun.workplan.ui.component.form.Value2ItemView (FormItem.kt:173)");
                }
                if (Intrinsics.areEqual(value, "请输入")) {
                    z8 = true;
                } else {
                    z8 = true;
                }
                if (value.length() > 20) {
                    String strSubstring15 = value.substring(0, 12);
                    Intrinsics.checkNotNullExpressionValue(strSubstring15, "substring(...)");
                    str3 = strSubstring15 + "...";
                } else {
                    str3 = value;
                }
                if (z8) {
                    str4 = str3;
                } else {
                    str4 = str3;
                }
                Modifier modifierClip15 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                boolean z11115 = !z7;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(onClick);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                            onClick.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                            onClick.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                str5 = str2;
                boolean z11116 = z6;
                TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip15, z11115, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z8, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z6, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122360);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z9 = z7;
                z4 = z11116;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final boolean z11117 = z4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.Value2ItemView.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i10) {
                    FormItemKt.Value2ItemView(value, z, z11117, z9, str5, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
        z4 = z2;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                z5 = z3;
                if (composerStartRestartGroup.changed(z5)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    str2 = str;
                    if (composerStartRestartGroup.changed(str2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i2 & 32) != 0) {
                    if ((458752 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(onClick)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898) {
                        if (i9 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                        if (i4 != 0) {
                            z7 = false;
                        } else {
                            z7 = z5;
                        }
                        if (i6 != 0) {
                            str2 = "";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(165793566, i3, -1, "cn.jianyun.workplan.ui.component.form.Value2ItemView (FormItem.kt:173)");
                        }
                        if (Intrinsics.areEqual(value, "请输入")) {
                            z8 = true;
                        } else {
                            z8 = true;
                        }
                        if (value.length() > 20) {
                            String strSubstring16 = value.substring(0, 12);
                            Intrinsics.checkNotNullExpressionValue(strSubstring16, "substring(...)");
                            str3 = strSubstring16 + "...";
                        } else {
                            str3 = value;
                        }
                        if (z8) {
                            str4 = str3;
                        } else {
                            str4 = str3;
                        }
                        Modifier modifierClip16 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                        boolean z11118 = !z7;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(onClick);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        str5 = str2;
                        boolean z11119 = z6;
                        TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip16, z11118, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z8, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z6, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122360);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z9 = z7;
                        z4 = z11119;
                    } else {
                        if (i9 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                        if (i4 != 0) {
                            z7 = false;
                        } else {
                            z7 = z5;
                        }
                        if (i6 != 0) {
                            str2 = "";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(165793566, i3, -1, "cn.jianyun.workplan.ui.component.form.Value2ItemView (FormItem.kt:173)");
                        }
                        if (Intrinsics.areEqual(value, "请输入")) {
                            z8 = true;
                        } else {
                            z8 = true;
                        }
                        if (value.length() > 20) {
                            String strSubstring17 = value.substring(0, 12);
                            Intrinsics.checkNotNullExpressionValue(strSubstring17, "substring(...)");
                            str3 = strSubstring17 + "...";
                        } else {
                            str3 = value;
                        }
                        if (z8) {
                            str4 = str3;
                        } else {
                            str4 = str3;
                        }
                        Modifier modifierClip17 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                        boolean z111110 = !z7;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(onClick);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                    onClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        str5 = str2;
                        boolean z111111 = z6;
                        TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip17, z111110, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z8, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z6, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122360);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z9 = z7;
                        z4 = z111111;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final boolean z111112 = z4;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.Value2ItemView.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i10) {
                            FormItemKt.Value2ItemView(value, z, z111112, z9, str5, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i8 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i3 |= i8;
                if ((374491 & i3) == 74898) {
                    if (i9 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if (i4 != 0) {
                        z7 = false;
                    } else {
                        z7 = z5;
                    }
                    if (i6 != 0) {
                        str2 = "";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(165793566, i3, -1, "cn.jianyun.workplan.ui.component.form.Value2ItemView (FormItem.kt:173)");
                    }
                    if (Intrinsics.areEqual(value, "请输入")) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    if (value.length() > 20) {
                        String strSubstring18 = value.substring(0, 12);
                        Intrinsics.checkNotNullExpressionValue(strSubstring18, "substring(...)");
                        str3 = strSubstring18 + "...";
                    } else {
                        str3 = value;
                    }
                    if (z8) {
                        str4 = str3;
                    } else {
                        str4 = str3;
                    }
                    Modifier modifierClip18 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                    boolean z111113 = !z7;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(onClick);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    str5 = str2;
                    boolean z111114 = z6;
                    TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip18, z111113, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z8, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z6, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122360);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z9 = z7;
                    z4 = z111114;
                } else {
                    if (i9 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if (i4 != 0) {
                        z7 = false;
                    } else {
                        z7 = z5;
                    }
                    if (i6 != 0) {
                        str2 = "";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(165793566, i3, -1, "cn.jianyun.workplan.ui.component.form.Value2ItemView (FormItem.kt:173)");
                    }
                    if (Intrinsics.areEqual(value, "请输入")) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    if (value.length() > 20) {
                        String strSubstring19 = value.substring(0, 12);
                        Intrinsics.checkNotNullExpressionValue(strSubstring19, "substring(...)");
                        str3 = strSubstring19 + "...";
                    } else {
                        str3 = value;
                    }
                    if (z8) {
                        str4 = str3;
                    } else {
                        str4 = str3;
                    }
                    Modifier modifierClip19 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                    boolean z111115 = !z7;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(onClick);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    str5 = str2;
                    boolean z111116 = z6;
                    TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip19, z111115, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z8, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z6, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122360);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z9 = z7;
                    z4 = z111116;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final boolean z111117 = z4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.Value2ItemView.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i10) {
                        FormItemKt.Value2ItemView(value, z, z111117, z9, str5, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= CpioConstants.C_ISBLK;
            str2 = str;
            if ((i2 & 32) != 0) {
                if ((458752 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(onClick)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                }
                if ((374491 & i3) == 74898) {
                    if (i9 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if (i4 != 0) {
                        z7 = false;
                    } else {
                        z7 = z5;
                    }
                    if (i6 != 0) {
                        str2 = "";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(165793566, i3, -1, "cn.jianyun.workplan.ui.component.form.Value2ItemView (FormItem.kt:173)");
                    }
                    if (Intrinsics.areEqual(value, "请输入")) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    if (value.length() > 20) {
                        String strSubstring110 = value.substring(0, 12);
                        Intrinsics.checkNotNullExpressionValue(strSubstring110, "substring(...)");
                        str3 = strSubstring110 + "...";
                    } else {
                        str3 = value;
                    }
                    if (z8) {
                        str4 = str3;
                    } else {
                        str4 = str3;
                    }
                    Modifier modifierClip110 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                    boolean z111118 = !z7;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(onClick);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    str5 = str2;
                    boolean z111119 = z6;
                    TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip110, z111118, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z8, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z6, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122360);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z9 = z7;
                    z4 = z111119;
                } else {
                    if (i9 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if (i4 != 0) {
                        z7 = false;
                    } else {
                        z7 = z5;
                    }
                    if (i6 != 0) {
                        str2 = "";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(165793566, i3, -1, "cn.jianyun.workplan.ui.component.form.Value2ItemView (FormItem.kt:173)");
                    }
                    if (Intrinsics.areEqual(value, "请输入")) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    if (value.length() > 20) {
                        String strSubstring111 = value.substring(0, 12);
                        Intrinsics.checkNotNullExpressionValue(strSubstring111, "substring(...)");
                        str3 = strSubstring111 + "...";
                    } else {
                        str3 = value;
                    }
                    if (z8) {
                        str4 = str3;
                    } else {
                        str4 = str3;
                    }
                    Modifier modifierClip111 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                    boolean z1111110 = !z7;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(onClick);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                                onClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    str5 = str2;
                    boolean z1111111 = z6;
                    TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip111, z1111110, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z8, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z6, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122360);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z9 = z7;
                    z4 = z1111111;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final boolean z1111112 = z4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt.Value2ItemView.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i10) {
                        FormItemKt.Value2ItemView(value, z, z1111112, z9, str5, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i8 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i3 |= i8;
            if ((374491 & i3) == 74898) {
                if (i9 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if (i4 != 0) {
                    z7 = false;
                } else {
                    z7 = z5;
                }
                if (i6 != 0) {
                    str2 = "";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(165793566, i3, -1, "cn.jianyun.workplan.ui.component.form.Value2ItemView (FormItem.kt:173)");
                }
                if (Intrinsics.areEqual(value, "请输入")) {
                    z8 = true;
                } else {
                    z8 = true;
                }
                if (value.length() > 20) {
                    String strSubstring112 = value.substring(0, 12);
                    Intrinsics.checkNotNullExpressionValue(strSubstring112, "substring(...)");
                    str3 = strSubstring112 + "...";
                } else {
                    str3 = value;
                }
                if (z8) {
                    str4 = str3;
                } else {
                    str4 = str3;
                }
                Modifier modifierClip112 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(4)));
                boolean z1111113 = !z7;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(onClick);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                            onClick.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.FormItemKt$Value2ItemView$1$1
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
                            onClick.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                str5 = str2;
                boolean z1111114 = z6;
                TextKt.m2471Text4IGK_g(str4, SizeKt.m623widthInVpY3zN4$default(PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierClip112, z1111113, null, null, (Function0) objRememberedValue, 6, null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(1)), Dp.m6097constructorimpl(30), 0.0f, 2, null), ((Color) CommonToolKt.ifv(z8, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(ColorKt.getThemeColor()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, ((Number) CommonToolKt.ifv(z6, 3, 1)).intValue(), 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 122360);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z9 = z7;
                z4 = z1111114;
            } else {
                if (i9 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if (i4 != 0) {
                    z7 = fa

... [truncated: exceeds 400000 bytes, total 10635722 bytes]