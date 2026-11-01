package cn.jianyun.workplan.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.Base64;
import android.util.Log;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.exifinterface.media.ExifInterface;
import androidx.glance.unit.ColorProvider;
import androidx.glance.unit.ColorProviderKt;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import cn.jianyun.workplan.api.ApiResult;
import cn.jianyun.workplan.main.Router;
import com.alibaba.fastjson2.JSON;
import com.alipay.sdk.m.u0.b;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;
import org.apache.xmlbeans.XmlErrorCodes;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: compiled from: CommonTool.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b2\u0006\u0010\u000e\u001a\u0002H\f¢\u0006\u0002\u0010\u000f\u001a\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0011\u001a+\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001b\u001a\"\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010 \u001a\u00020!H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\"\u001a/\u0010#\u001a\u00020\u00112\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010)\u001a\u000e\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u0011\u001a \u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u00020-\u0018\u000101\u001a-\u00102\u001a\u0002H\f\"\b\b\u0000\u0010\f*\u0002032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u00104\u001a\u0002H\f2\u0006\u0010(\u001a\u0002H\f¢\u0006\u0002\u00105\u001a\u0016\u00102\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u0011\u001a\u0016\u00102\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u001b\u001a\u0016\u00102\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0011\u001a\u000e\u00106\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u0011\u001a\u0016\u00107\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00112\u0006\u00108\u001a\u00020\u0011\u001a\u001e\u00109\u001a\b\u0012\u0004\u0012\u00020\u001b0:2\u0006\u0010'\u001a\u00020\u00112\b\b\u0002\u00108\u001a\u00020\u0011\u001a\u001e\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00110:2\u0006\u0010'\u001a\u00020\u00112\b\b\u0002\u00108\u001a\u00020\u0011\u001a#\u0010<\u001a\u00020-2\u0016\u0010=\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001030>\"\u0004\u0018\u000103¢\u0006\u0002\u0010?\u001a\u000e\u0010@\u001a\u00020-2\u0006\u0010=\u001a\u000203\u001a*\u0010A\u001a\u00020-2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020D0C2\u0006\u0010'\u001a\u00020\u00112\u0006\u00104\u001a\u00020D\u001a\u0016\u0010E\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010F\u001a\u00020\u001b\u001a\u0018\u0010G\u001a\u00020\u00072\b\b\u0002\u00104\u001a\u00020\u001bø\u0001\u0000¢\u0006\u0002\u0010H\u001a \u0010I\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010J\u001a\u00020\u00112\u0006\u0010K\u001a\u00020\u0011\u001a\u001e\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010M\u001a\u00020\u001b2\b\b\u0002\u00104\u001a\u00020\u0011\u001a\u0016\u0010N\u001a\u00020\u00072\u0006\u0010O\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0002\u0010P\u001a\u0006\u0010Q\u001a\u00020\u0011\u001a\u000e\u0010R\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d\u001a\u000e\u0010S\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d\u001a\u000e\u0010T\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d\u001a\u000e\u0010U\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d\u001aA\u0010V\u001a\b\u0012\u0004\u0012\u0002H\f0W\"\u0004\b\u0000\u0010\f2\"\u0010X\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0W0Z\u0012\u0006\u0012\u0004\u0018\u0001030YH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010[\u001a\u0018\u0010\\\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u00112\b\b\u0002\u0010]\u001a\u00020\u0011\u001a\u001a\u0010^\u001a\u00020\u0015*\u00020\u00112\u0006\u0010_\u001a\u00020\u00112\u0006\u0010`\u001a\u00020\u0011\u001a\u0012\u0010a\u001a\u00020\u0007*\u00020\u0011ø\u0001\u0000¢\u0006\u0002\u0010b\u001a\f\u0010c\u001a\u0004\u0018\u00010d*\u00020\u001d\u001a\n\u0010e\u001a\u00020\u0015*\u00020\u0011\u001a\n\u0010f\u001a\u00020\u0011*\u00020\u0011\u001a\u0014\u0010g\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010h\u001a\u00020\u0015\u001a\u0017\u0010i\u001a\u00020\u0011*\u00020\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bj\u0010k\u001a\u0017\u0010l\u001a\u00020\u0011*\u00020\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bm\u0010k\u001a\u0014\u0010n\u001a\u00020D*\u00020\u00112\b\b\u0002\u0010o\u001a\u00020\u001b\u001a\u0017\u0010p\u001a\u00020\u001b*\u00020\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bq\u0010r\u001a\u0014\u0010s\u001a\u00020D*\u00020\u00112\b\b\u0002\u0010o\u001a\u00020\u001b\u001a\n\u0010t\u001a\u00020\u001b*\u00020\u0011\u001a\u0010\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b*\u00020\u0011\u001a\n\u0010v\u001a\u00020\u001b*\u00020\u0011\u001a\n\u0010w\u001a\u00020x*\u00020\u0011\u001a\u001c\u0010y\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010o\u001a\u00020\u001b2\u0006\u0010z\u001a\u00020\u0011\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\b\u0010\u0003\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006{"}, d2 = {"lastBack", "", "getLastBack", "()J", "setLastBack", "(J)V", "opacityColor", "Landroidx/compose/ui/graphics/Color;", "getOpacityColor", "J", "append", "", ExifInterface.GPS_DIRECTION_TRUE, XmlErrorCodes.LIST, "newEle", "(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;", "base64", "", "str", "chooseColor", "flag", "", "trueColor", "falseColor", "chooseColor-WkMS-hQ", "(ZJJ)J", "dp2px", "", "context", "Landroid/content/Context;", "dp", "focusColor", "colorScheme", "Landroidx/compose/material3/ColorScheme;", "(ZLandroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;II)J", "getStringValue", "datastore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "key", "defaultValue", "(Landroidx/datastore/core/DataStore;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getToastMessageLength", "msg", "goBack", "", "navHostController", "Landroidx/navigation/NavHostController;", "backAction", "Lkotlin/Function0;", "ifv", "", b.f2259d, "(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "isOk", "makeKey", "module", "makePIKey", "Landroidx/datastore/preferences/core/Preferences$Key;", "makePKey", "mlog", "arg", "", "([Ljava/lang/Object;)V", "mlog2", "pushMapValue", "map", "", "", "px2dp", "px", "randomColor", "(I)J", "readAssetFile", "dir", "file", "repeatValue", Name.LENGTH, "tipColor", "focus", "(Z)J", "uuid", "winHeightWithDp", "winHeightWithPx", "winWidthWithDp", "winWidthWithPx", "withApi", "Lcn/jianyun/workplan/api/ApiResult;", "api", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withPrefix", "prefix", "betweenIn", "beginDate", "endDate", "color", "(Ljava/lang/String;)J", "findAndroidActivity", "Landroid/app/Activity;", "isValidColor", "oneLine", "showTime", "small", "stringify", "stringify-8_81llA", "(J)Ljava/lang/String;", "stringify2", "stringify2-8_81llA", "timeToFloat", XmlErrorCodes.DECIMAL, "toAndroid", "toAndroid-8_81llA", "(J)I", "toFloatData", "toIntData", "toMultiData", "unique", "widgetColor", "Landroidx/glance/unit/ColorProvider;", "withUnit", "unit", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CommonToolKt {
    private static long lastBack;
    private static final long opacityColor = color("#00FFFFFF");

    /* JADX INFO: renamed from: cn.jianyun.workplan.util.CommonToolKt$getStringValue$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonTool.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.util.CommonToolKt", f = "CommonTool.kt", i = {0, 0}, l = {71}, m = "getStringValue", n = {"key", "defaultValue"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonToolKt.getStringValue(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.util.CommonToolKt$withApi$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonTool.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.util.CommonToolKt", f = "CommonTool.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_QUEUE_MAX_FULL}, m = "withApi", n = {}, s = {})
    static final class AnonymousClass1<T> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonToolKt.withApi(null, this);
        }
    }

    /* JADX INFO: renamed from: chooseColor-WkMS-hQ, reason: not valid java name */
    public static final long m6939chooseColorWkMShQ(boolean z, long j, long j2) {
        return z ? j : j2;
    }

    public static final int ifv(int i, int i2) {
        return i < 0 ? i2 : i;
    }

    public static final <T> T ifv(boolean z, T value, T defaultValue) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return z ? value : defaultValue;
    }

    public static final String ifv(boolean z, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return z ? value : "";
    }

    public static /* synthetic */ List repeatValue$default(int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        return repeatValue(i, str);
    }

    public static final List<String> repeatValue(int i, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(value);
        }
        return arrayList;
    }

    public static final <T> List<T> append(List<? extends T> list, T t) {
        Intrinsics.checkNotNullParameter(list, "list");
        List<T> mutableList = CollectionsKt.toMutableList((Collection) list);
        mutableList.add(t);
        return mutableList;
    }

    public static final String uuid() {
        String strUuids = MyRandomTool.uuids();
        Intrinsics.checkNotNullExpressionValue(strUuids, "uuids()");
        return strUuids;
    }

    public static final String makeKey(String key, String module) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(module, "module");
        return key + "_" + module;
    }

    public static /* synthetic */ Preferences.Key makePKey$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return makePKey(str, str2);
    }

    public static final Preferences.Key<String> makePKey(String key, String module) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(module, "module");
        if (Intrinsics.areEqual(module, "")) {
            return PreferencesKeys.stringKey(key);
        }
        return PreferencesKeys.stringKey(makeKey(key, module));
    }

    public static /* synthetic */ Preferences.Key makePIKey$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return makePIKey(str, str2);
    }

    public static final Preferences.Key<Integer> makePIKey(String key, String module) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(module, "module");
        if (Intrinsics.areEqual(module, "")) {
            return PreferencesKeys.intKey(key);
        }
        return PreferencesKeys.intKey(makeKey(key, module));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object getStringValue(DataStore<Preferences> dataStore, String str, String str2, Continuation<? super String> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objFirst = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow<Preferences> data = dataStore.getData();
            anonymousClass1.L$0 = str;
            anonymousClass1.L$1 = str2;
            anonymousClass1.label = 1;
            objFirst = FlowKt.first(data, anonymousClass1);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) anonymousClass1.L$1;
            str = (String) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objFirst);
        }
        String str3 = (String) ((Preferences) objFirst).get(makePKey$default(str, null, 2, null));
        return str3 == null ? str2 : str3;
    }

    public static final void mlog(Object... arg) {
        Intrinsics.checkNotNullParameter(arg, "arg");
        ArrayList arrayList = new ArrayList();
        for (Object obj : arg) {
            if (obj != null) {
                arrayList.add(obj.toString());
            } else {
                arrayList.add("null");
            }
        }
        Log.d("qzLog", CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null));
    }

    public static final long color(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if ((str.length() != 7 && str.length() != 9) || !StringsKt.startsWith$default(str, "#", false, 2, (Object) null)) {
            return Color.INSTANCE.m3785getGray0d7_KjU();
        }
        if (str.length() == 9) {
            str = str.substring(0, 7);
            Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
        }
        try {
            return ColorKt.Color(android.graphics.Color.parseColor(str));
        } catch (Exception unused) {
            return Color.INSTANCE.m3785getGray0d7_KjU();
        }
    }

    public static /* synthetic */ float toFloatData$default(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return toFloatData(str, i);
    }

    public static final float toFloatData(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return MyDataTool.getPriceWithFloat(str, i);
    }

    public static final int toIntData(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (int) MyDataTool.getPriceWithFloat(str, 0);
    }

    public static /* synthetic */ String withUnit$default(String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        return withUnit(str, i, str2);
    }

    public static final String withUnit(String str, int i, String unit) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(unit, "unit");
        String strWithUnit = MyDataTool.withUnit(str, i, unit);
        Intrinsics.checkNotNullExpressionValue(strWithUnit, "withUnit(this, decimal, unit)");
        return strWithUnit;
    }

    public static /* synthetic */ float timeToFloat$default(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return timeToFloat(str, i);
    }

    public static final float timeToFloat(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strTimeToDecimal = MyDataTool.timeToDecimal(str);
        Intrinsics.checkNotNullExpressionValue(strTimeToDecimal, "timeToDecimal(this)");
        return toFloatData(strTimeToDecimal, i);
    }

    public static /* synthetic */ String showTime$default(String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return showTime(str, z);
    }

    public static final String showTime(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String shownTime = MyDataTool.getShownTime(str, z);
        Intrinsics.checkNotNullExpressionValue(shownTime, "getShownTime(this, small)");
        return shownTime;
    }

    public static final boolean betweenIn(String str, String beginDate, String endDate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(beginDate, "beginDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        return MyDateTool.between(str, beginDate, endDate);
    }

    public static final boolean isValidColor(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.length() == 7 || str.length() == 9 || StringsKt.startsWith$default(str, "#", false, 2, (Object) null);
    }

    public static final ColorProvider widgetColor(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return ColorProviderKt.m6643ColorProvider8_81llA(color(str));
    }

    public static final boolean isOk(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return Intrinsics.areEqual(msg, "ok");
    }

    public static final int unique(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        int i = 0;
        for (char c2 : charArray) {
            i += c2;
        }
        return i;
    }

    public static /* synthetic */ long randomColor$default(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return randomColor(i);
    }

    public static final long randomColor(int i) {
        if (i > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("#%02X%02X%02X", Arrays.copyOf(new Object[]{Integer.valueOf(Math.min(20, i - 30) % 255), Integer.valueOf((i + 30) % 255), Integer.valueOf((i + 80) % 255)}, 3));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return color(str);
        }
        int iRandomNumber = MyRandomTool.randomNumber(0, 255);
        int iRandomNumber2 = MyRandomTool.randomNumber(0, 255);
        int iRandomNumber3 = MyRandomTool.randomNumber(0, 255);
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format("#%02X%02X%02X", Arrays.copyOf(new Object[]{Integer.valueOf(iRandomNumber), Integer.valueOf(iRandomNumber2), Integer.valueOf(iRandomNumber3)}, 3));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return color(str2);
    }

    public static final long getOpacityColor() {
        return opacityColor;
    }

    /* JADX INFO: renamed from: toAndroid-8_81llA, reason: not valid java name */
    public static final int m6942toAndroid8_81llA(long j) {
        return android.graphics.Color.parseColor(m6940stringify8_81llA(j));
    }

    /* JADX INFO: renamed from: stringify-8_81llA, reason: not valid java name */
    public static final String m6940stringify8_81llA(long j) {
        float f2 = 255;
        int iM3761getRedimpl = (int) (Color.m3761getRedimpl(j) * f2);
        int iM3760getGreenimpl = (int) (Color.m3760getGreenimpl(j) * f2);
        int iM3758getBlueimpl = (int) (Color.m3758getBlueimpl(j) * f2);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("#%02X%02X%02X", Arrays.copyOf(new Object[]{Integer.valueOf(iM3761getRedimpl), Integer.valueOf(iM3760getGreenimpl), Integer.valueOf(iM3758getBlueimpl)}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: stringify2-8_81llA, reason: not valid java name */
    public static final String m6941stringify28_81llA(long j) {
        float f2 = 255;
        int iM3761getRedimpl = (int) (Color.m3761getRedimpl(j) * f2);
        int iM3760getGreenimpl = (int) (Color.m3760getGreenimpl(j) * f2);
        int iM3758getBlueimpl = (int) (Color.m3758getBlueimpl(j) * f2);
        int iM3757getAlphaimpl = (int) (Color.m3757getAlphaimpl(j) * f2);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("#%02X%02X%02X%02X", Arrays.copyOf(new Object[]{Integer.valueOf(iM3761getRedimpl), Integer.valueOf(iM3760getGreenimpl), Integer.valueOf(iM3758getBlueimpl), Integer.valueOf(iM3757getAlphaimpl)}, 4));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final long focusColor(boolean z, ColorScheme colorScheme, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(90652454);
        ComposerKt.sourceInformation(composer, "C(focusColor)P(1)");
        if ((i2 & 2) != 0) {
            MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable | 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(90652454, i, -1, "cn.jianyun.workplan.util.focusColor (CommonTool.kt:201)");
        }
        long themeColor = z ? cn.jianyun.workplan.ui.theme.ColorKt.getThemeColor() : MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable | 0).getPrimary();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return themeColor;
    }

    public static final long tipColor(boolean z) {
        return z ? cn.jianyun.workplan.ui.theme.ColorKt.getThemeColor() : Color.INSTANCE.m3785getGray0d7_KjU();
    }

    public static final String ifv(String value, String defaultValue) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return "".equals(value) ? defaultValue : value;
    }

    public static /* synthetic */ String withPrefix$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = " ";
        }
        return withPrefix(str, str2);
    }

    public static final String withPrefix(String value, String prefix) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !Intrinsics.areEqual(value, "") ? prefix + value : value;
    }

    public static final int getToastMessageLength(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return msg.length() < 10 ? 0 : 1;
    }

    public static final int px2dp(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) (i / (context.getResources().getDisplayMetrics().densityDpi / 160));
    }

    public static final int dp2px(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) (i * (context.getResources().getDisplayMetrics().densityDpi / 160));
    }

    public static final int winHeightWithDp(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return px2dp(context, winHeightWithPx(context));
    }

    public static final int winHeightWithPx(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static final int winWidthWithDp(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return px2dp(context, winWidthWithPx(context));
    }

    public static final int winWidthWithPx(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static final String readAssetFile(Context context, String dir, String file) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dir, "dir");
        Intrinsics.checkNotNullParameter(file, "file");
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(context.getAssets().open(dir + PackagingURIHelper.FORWARD_SLASH_STRING + file)));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        stringBuffer.append(line);
                        stringBuffer.append("\n");
                    } catch (IOException unused) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        return stringBuffer.toString();
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
                bufferedReader2.close();
            } catch (IOException unused3) {
            }
        } catch (IOException unused4) {
        } catch (Throwable th2) {
            th = th2;
        }
        return stringBuffer.toString();
    }

    public static final String base64(String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        try {
            Charset charsetForName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
            byte[] bytes = str.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            String strEncodeToString = Base64.encodeToString(bytes, 0);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(str.toByt…UTF-8\")), Base64.DEFAULT)");
            return StringsKt.replace$default(strEncodeToString, "\n", " ", false, 4, (Object) null);
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static final long getLastBack() {
        return lastBack;
    }

    public static final void setLastBack(long j) {
        lastBack = j;
    }

    public static /* synthetic */ void goBack$default(NavHostController navHostController, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        goBack(navHostController, function0);
    }

    public static final void goBack(NavHostController navHostController, Function0<Unit> function0) {
        String navigatorName;
        String route;
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        if (System.currentTimeMillis() - lastBack < 1000) {
            mlog("ignore back");
            return;
        }
        lastBack = System.currentTimeMillis();
        if (function0 != null) {
            function0.invoke();
            return;
        }
        if (navHostController.getCurrentBackStackEntry() == null) {
            mlog("toTop", "已经到顶部路由了");
            return;
        }
        NavDestination currentDestination = navHostController.getCurrentDestination();
        if (Intrinsics.areEqual(currentDestination != null ? currentDestination.getRoute() : null, Router.Home.INSTANCE.getRoute())) {
            mlog("toTop", "已经到顶部路由了");
            return;
        }
        Object[] objArr = new Object[3];
        objArr[0] = "回到上一页";
        NavDestination currentDestination2 = navHostController.getCurrentDestination();
        String str = "";
        if (currentDestination2 == null || (navigatorName = currentDestination2.getNavigatorName()) == null) {
            navigatorName = "";
        }
        objArr[1] = navigatorName;
        NavDestination currentDestination3 = navHostController.getCurrentDestination();
        if (currentDestination3 != null && (route = currentDestination3.getRoute()) != null) {
            str = route;
        }
        objArr[2] = str;
        mlog(objArr);
        try {
            navHostController.popBackStack();
        } catch (Exception e2) {
            mlog("go back error", e2);
        }
    }

    public static final void pushMapValue(Map<String, Float> map, String key, float f2) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(key, "key");
        Float f3 = map.get(key);
        map.put(key, Float.valueOf((f3 != null ? f3.floatValue() : 0.0f) + f2));
    }

    public static final String oneLine(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.replace$default(StringsKt.replace$default(SequencesKt.joinToString$default(SequencesKt.map(StringsKt.splitToSequence$default((CharSequence) str, new String[]{"\n"}, false, 0, 6, (Object) null), new Function1<String, String>() { // from class: cn.jianyun.workplan.util.CommonToolKt.oneLine.1
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return StringsKt.trim((CharSequence) it).toString();
            }
        }), "", null, null, 0, null, null, 62, null), "<br>", "\n", false, 4, (Object) null), "<bb>", "    ", false, 4, (Object) null);
    }

    public static final List<String> toMultiData(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.split$default((CharSequence) str, new String[]{"^"}, false, 0, 6, (Object) null);
    }

    public static final Activity findAndroidActivity(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(context, "context.baseContext");
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final <T> Object withApi(Function1<? super Continuation<? super ApiResult<T>>, ? extends Object> function1, Continuation<? super ApiResult<T>> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objInvoke = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(objInvoke);
                anonymousClass1.label = 1;
                objInvoke = function1.invoke(anonymousClass1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objInvoke);
            }
            return objInvoke;
        } catch (Exception e2) {
            mlog(e2);
            return ApiResult.INSTANCE.fail("暂时不可用，请稍后再试");
        }
    }

    public static final void mlog2(Object arg) {
        Intrinsics.checkNotNullParameter(arg, "arg");
        Log.d("qzLog", JSON.toJSONString(arg));
    }
}