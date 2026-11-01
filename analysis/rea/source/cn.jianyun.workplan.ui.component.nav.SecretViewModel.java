package cn.jianyun.workplan.ui.component.nav;

import android.content.Context;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.model.AppConfigModel;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.ui.theme.ColorKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.MyDateTool;
import com.adgain.sdk.base.models.AdConstants;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: compiled from: SecretCheckView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010I\u001a\u00020JH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010KJ\u001b\u0010L\u001a\u00020J2\b\b\u0002\u0010M\u001a\u00020NH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010OJ\u0011\u0010P\u001a\u00020JH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010KJ\u0014\u0010Q\u001a\u00020J2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020J0SJ\u0011\u0010T\u001a\u00020BH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010KJ\u0006\u0010U\u001a\u00020\u001bJ\u000e\u0010V\u001a\u00020J2\u0006\u0010>\u001a\u00020\u001bJ\u000e\u0010W\u001a\u00020N2\u0006\u0010>\u001a\u00020\u001bJ\u0006\u0010X\u001a\u00020JJ\u001c\u0010Y\u001a\u00020J2\u0006\u0010Z\u001a\u00020\u001b2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020J0SJ\u000e\u0010[\u001a\u00020J2\u0006\u0010\\\u001a\u00020\u001bJ\u0018\u0010]\u001a\u00020^H\u0007ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b_\u0010`J\u0006\u0010a\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR+\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\u001b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0013\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010\"\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u0013\u001a\u0004\b#\u0010\u0017\"\u0004\b$\u0010\u0019R+\u0010&\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\u001b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010\u0013\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R+\u0010*\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010\u0013\u001a\u0004\b+\u0010\u0017\"\u0004\b,\u0010\u0019R \u0010.\u001a\b\u0012\u0004\u0012\u00020\u001b0/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R+\u00104\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\u001b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b7\u0010\u0013\u001a\u0004\b5\u0010\u001e\"\u0004\b6\u0010 R \u00108\u001a\b\u0012\u0004\u0012\u00020\u001b09X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R+\u0010>\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\u001b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010\u0013\u001a\u0004\b?\u0010\u001e\"\u0004\b@\u0010 R+\u0010C\u001a\u00020B2\u0006\u0010\u000b\u001a\u00020B8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010\u0013\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006b"}, d2 = {"Lcn/jianyun/workplan/ui/component/nav/SecretViewModel;", "Landroidx/lifecycle/ViewModel;", "baseRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "context", "Landroid/content/Context;", "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Landroid/content/Context;)V", "getBaseRepository", "()Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "getContext", "()Landroid/content/Context;", "<set-?>", "Lcn/jianyun/workplan/model/FormType;", "formType", "getFormType", "()Lcn/jianyun/workplan/model/FormType;", "setFormType", "(Lcn/jianyun/workplan/model/FormType;)V", "formType$delegate", "Landroidx/compose/runtime/MutableState;", "", Name.LENGTH, "getLength", "()I", "setLength", "(I)V", "length$delegate", "", "lockInfo", "getLockInfo", "()Ljava/lang/String;", "setLockInfo", "(Ljava/lang/String;)V", "lockInfo$delegate", "maxTimes", "getMaxTimes", "setMaxTimes", "maxTimes$delegate", "message", "getMessage", "setMessage", "message$delegate", "missTimes", "getMissTimes", "setMissTimes", "missTimes$delegate", "nums", "", "getNums", "()Ljava/util/List;", "setNums", "(Ljava/util/List;)V", "oldSecret", "getOldSecret", "setOldSecret", "oldSecret$delegate", "secrets", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getSecrets", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "setSecrets", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;)V", "type", "getType", "setType", "type$delegate", "", "unlockTime", "getUnlockTime", "()J", "setUnlockTime", "(J)V", "unlockTime$delegate", "appendMissTimes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearMisstimes", "fix", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearSecrets", "doCheck", "ok", "Lkotlin/Function0;", "getLockTime", "getRestLockTime", "initType", "isForm", "startTimer", "tap", "it", "toast", "msg", "typeColor", "Landroidx/compose/ui/graphics/Color;", "typeColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "typeName", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SecretViewModel extends ViewModel {
    public static final int $stable = 8;
    private final BaseRepository baseRepository;
    private final Context context;

    /* JADX INFO: renamed from: formType$delegate, reason: from kotlin metadata */
    private final MutableState formType;

    /* JADX INFO: renamed from: length$delegate, reason: from kotlin metadata */
    private final MutableState length;

    /* JADX INFO: renamed from: lockInfo$delegate, reason: from kotlin metadata */
    private final MutableState lockInfo;

    /* JADX INFO: renamed from: maxTimes$delegate, reason: from kotlin metadata */
    private final MutableState maxTimes;

    /* JADX INFO: renamed from: message$delegate, reason: from kotlin metadata */
    private final MutableState message;

    /* JADX INFO: renamed from: missTimes$delegate, reason: from kotlin metadata */
    private final MutableState missTimes;
    private List<String> nums;

    /* JADX INFO: renamed from: oldSecret$delegate, reason: from kotlin metadata */
    private final MutableState oldSecret;
    private SnapshotStateList<String> secrets;

    /* JADX INFO: renamed from: type$delegate, reason: from kotlin metadata */
    private final MutableState type;

    /* JADX INFO: renamed from: unlockTime$delegate, reason: from kotlin metadata */
    private final MutableState unlockTime;

    /* JADX INFO: renamed from: cn.jianyun.workplan.ui.component.nav.SecretViewModel$appendMissTimes$1, reason: invalid class name */
    /* JADX INFO: compiled from: SecretCheckView.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.ui.component.nav.SecretViewModel", f = "SecretCheckView.kt", i = {0, 1}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_HURRY_MILLISECOND, MediaPlayer.MEDIA_PLAYER_OPTION_SLOW_PLAY_MILLISECOND, 401}, m = "appendMissTimes", n = {"this", "this"}, s = {"L$0", "L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        long J$0;
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
            return SecretViewModel.this.appendMissTimes(this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.ui.component.nav.SecretViewModel$clearMisstimes$1, reason: invalid class name */
    /* JADX INFO: compiled from: SecretCheckView.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.ui.component.nav.SecretViewModel", f = "SecretCheckView.kt", i = {0, 0, 1, 1}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_SET_FORCE_DECODE_SWITCH, MediaPlayer.MEDIA_PLAYER_OPTION_SET_FORCE_DECODE_MS_GAPS, MediaPlayer.MEDIA_PLAYER_OPTION_SET_AVPH_AUDIO_QUERY, MediaPlayer.MEDIA_PLAYER_OPTION_QUEUE_MAX_FULL, MediaPlayer.MEDIA_PLAYER_OPTION_QUEUE_MAX_FULL}, m = "clearMisstimes", n = {"this", "fix", "this", "fix"}, s = {"L$0", "Z$0", "L$0", "Z$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SecretViewModel.this.clearMisstimes(false, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.ui.component.nav.SecretViewModel$clearSecrets$1, reason: invalid class name */
    /* JADX INFO: compiled from: SecretCheckView.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.ui.component.nav.SecretViewModel", f = "SecretCheckView.kt", i = {0}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_AUDIO_EFFECT_RATIO}, m = "clearSecrets", n = {"this"}, s = {"L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SecretViewModel.this.clearSecrets(this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.ui.component.nav.SecretViewModel$getLockTime$1, reason: invalid class name */
    /* JADX INFO: compiled from: SecretCheckView.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.ui.component.nav.SecretViewModel", f = "SecretCheckView.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_DEMUXER_STALL_500}, m = "getLockTime", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SecretViewModel.this.getLockTime(this);
        }
    }

    public final BaseRepository getBaseRepository() {
        return this.baseRepository;
    }

    public final Context getContext() {
        return this.context;
    }

    @Inject
    public SecretViewModel(BaseRepository baseRepository, @ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(baseRepository, "baseRepository");
        Intrinsics.checkNotNullParameter(context, "context");
        this.baseRepository = baseRepository;
        this.context = context;
        this.type = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("check", null, 2, null);
        this.length = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(4, null, 2, null);
        this.secrets = SnapshotStateKt.mutableStateListOf();
        this.formType = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FormType(null, null, null, 7, null), null, 2, null);
        this.message = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.oldSecret = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.missTimes = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.unlockTime = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
        this.maxTimes = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(5, null, 2, null);
        this.lockInfo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.nums = CollectionsKt.listOf((Object[]) new String[]{"1", "2", ExifInterface.GPS_MEASUREMENT_3D, "4", "5", "6", "7", "8", "9", "<", AdConstants.FAIL, "x"});
        setMessage("");
        this.secrets.clear();
        this.secrets.addAll(CommonToolKt.repeatValue(getLength(), ""));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getType() {
        return (String) this.type.getValue();
    }

    public final void setType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getLength() {
        return ((Number) this.length.getValue()).intValue();
    }

    public final void setLength(int i) {
        this.length.setValue(Integer.valueOf(i));
    }

    public final SnapshotStateList<String> getSecrets() {
        return this.secrets;
    }

    public final void setSecrets(SnapshotStateList<String> snapshotStateList) {
        Intrinsics.checkNotNullParameter(snapshotStateList, "<set-?>");
        this.secrets = snapshotStateList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FormType getFormType() {
        return (FormType) this.formType.getValue();
    }

    public final void setFormType(FormType formType) {
        Intrinsics.checkNotNullParameter(formType, "<set-?>");
        this.formType.setValue(formType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getMessage() {
        return (String) this.message.getValue();
    }

    public final void setMessage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getOldSecret() {
        return (String) this.oldSecret.getValue();
    }

    public final void setOldSecret(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.oldSecret.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getMissTimes() {
        return ((Number) this.missTimes.getValue()).intValue();
    }

    public final void setMissTimes(int i) {
        this.missTimes.setValue(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long getUnlockTime() {
        return ((Number) this.unlockTime.getValue()).longValue();
    }

    public final void setUnlockTime(long j) {
        this.unlockTime.setValue(Long.valueOf(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getMaxTimes() {
        return ((Number) this.maxTimes.getValue()).intValue();
    }

    public final void setMaxTimes(int i) {
        this.maxTimes.setValue(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getLockInfo() {
        return (String) this.lockInfo.getValue();
    }

    public final void setLockInfo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lockInfo.setValue(str);
    }

    public final List<String> getNums() {
        return this.nums;
    }

    public final void setNums(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.nums = list;
    }

    public final void initType(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        setType(type);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.ui.component.nav.SecretViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: SecretCheckView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.ui.component.nav.SecretViewModel$1", f = "SecretCheckView.kt", i = {}, l = {199, 200, 201, MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_ID}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SecretViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0090 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:25:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:27:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:29:0x00c5 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:30:0x00c6  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            SecretViewModel secretViewModel;
            SecretViewModel secretViewModel2;
            SecretViewModel secretViewModel3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                secretViewModel = SecretViewModel.this;
                this.L$0 = secretViewModel;
                this.label = 1;
                obj = secretViewModel.getBaseRepository().intCache("missTimes", this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    secretViewModel = (SecretViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    secretViewModel2 = (SecretViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    secretViewModel2.setUnlockTime(((Number) obj).longValue());
                    secretViewModel3 = SecretViewModel.this;
                    this.L$0 = secretViewModel3;
                    this.label = 3;
                    obj = secretViewModel3.getBaseRepository().intCache("maxTimes", 5, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    secretViewModel3.setMaxTimes(((Number) obj).intValue());
                    if (SecretViewModel.this.getUnlockTime() > 0) {
                        if (SecretViewModel.this.getUnlockTime() < System.currentTimeMillis()) {
                            this.L$0 = null;
                            this.label = 4;
                            if (SecretViewModel.this.clearMisstimes(false, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            SecretViewModel.this.startTimer();
                        }
                    }
                } else if (i == 3) {
                    secretViewModel3 = (SecretViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    secretViewModel3.setMaxTimes(((Number) obj).intValue());
                    if (SecretViewModel.this.getUnlockTime() > 0) {
                        if (SecretViewModel.this.getUnlockTime() < System.currentTimeMillis()) {
                            this.L$0 = null;
                            this.label = 4;
                            if (SecretViewModel.this.clearMisstimes(false, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            SecretViewModel.this.startTimer();
                        }
                    }
                } else {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            secretViewModel.setMissTimes(((Number) obj).intValue());
            secretViewModel2 = SecretViewModel.this;
            this.L$0 = secretViewModel2;
            this.label = 2;
            obj = secretViewModel2.getBaseRepository().longCache("unlockTime", this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            secretViewModel2.setUnlockTime(((Number) obj).longValue());
            secretViewModel3 = SecretViewModel.this;
            this.L$0 = secretViewModel3;
            this.label = 3;
            obj = secretViewModel3.getBaseRepository().intCache("maxTimes", 5, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            secretViewModel3.setMaxTimes(((Number) obj).intValue());
            if (SecretViewModel.this.getUnlockTime() > 0) {
                if (SecretViewModel.this.getUnlockTime() < System.currentTimeMillis()) {
                    this.L$0 = null;
                    this.label = 4;
                    if (SecretViewModel.this.clearMisstimes(false, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    SecretViewModel.this.startTimer();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void startTimer() {
        setLockInfo(getRestLockTime());
        new Timer().scheduleAtFixedRate(new TimerTask() { // from class: cn.jianyun.workplan.ui.component.nav.SecretViewModel$startTimer$1$task$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                SecretViewModel secretViewModel = this.this$0;
                secretViewModel.setLockInfo(secretViewModel.getRestLockTime());
                if (Intrinsics.areEqual(this.this$0.getLockInfo(), "")) {
                    cancel();
                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this.this$0), null, null, new SecretViewModel$startTimer$1$task$1$run$1(this.this$0, null), 3, null);
                }
            }
        }, 1000L, 1000L);
    }

    public final String getRestLockTime() {
        long unlockTime = getUnlockTime() - System.currentTimeMillis();
        if (unlockTime < 0) {
            return "";
        }
        String restTime = MyDateTool.getRestTime(unlockTime);
        Intrinsics.checkNotNullExpressionValue(restTime, "getRestTime(gap)");
        return restTime;
    }

    public final String typeName() {
        CommonToolKt.mlog("secret type", getType());
        String type = getType();
        switch (type.hashCode()) {
            case 108960:
                return !type.equals("new") ? "校验秘钥" : "请输入新秘钥";
            case 113762:
                return !type.equals("set") ? "校验秘钥" : "设置秘钥";
            case 94627080:
                type.equals("check");
                return "校验秘钥";
            case 108404047:
                return !type.equals("reset") ? "校验秘钥" : "请输入旧秘钥";
            case 951117504:
                return !type.equals("confirm") ? "校验秘钥" : "确认秘钥";
            default:
                return "校验秘钥";
        }
    }

    /* JADX INFO: renamed from: typeColor-WaAFU9c, reason: not valid java name */
    public final long m6916typeColorWaAFU9c(Composer composer, int i) {
        composer.startReplaceableGroup(1005872054);
        ComposerKt.sourceInformation(composer, "C(typeColor)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1005872054, i, -1, "cn.jianyun.workplan.ui.component.nav.SecretViewModel.typeColor (SecretCheckView.kt:257)");
        }
        String type = getType();
        if (Intrinsics.areEqual(type, "new")) {
            long themeColor = ColorKt.getThemeColor();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return themeColor;
        }
        if (Intrinsics.areEqual(type, "confirm")) {
            long primaryColor = ColorKt.getPrimaryColor();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return primaryColor;
        }
        long primary = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable | 0).getPrimary();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return primary;
    }

    public final boolean isForm(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return Intrinsics.areEqual(getFormType().getType(), type);
    }

    public final void toast(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.baseRepository.toast(msg);
    }

    public final void tap(String it, Function0<Unit> ok) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter(ok, "ok");
        if (Intrinsics.areEqual(it, "<") || getMissTimes() >= getMaxTimes()) {
            return;
        }
        if (Intrinsics.areEqual(it, "x")) {
            int length = getLength();
            do {
                length--;
                if (-1 >= length) {
                    return;
                }
            } while (Intrinsics.areEqual(this.secrets.get(length), ""));
            this.secrets.set(length, "");
            return;
        }
        int length2 = getLength();
        for (int i = 0; i < length2; i++) {
            if (Intrinsics.areEqual(this.secrets.get(i), "")) {
                this.secrets.set(i, it);
                if (i == getLength() - 1) {
                    doCheck(ok);
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object clearSecrets(Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        SecretViewModel secretViewModel;
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
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            if (DelayKt.delay(100L, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            secretViewModel = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            secretViewModel = (SecretViewModel) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        secretViewModel.secrets.clear();
        secretViewModel.secrets.addAll(CommonToolKt.repeatValue(secretViewModel.getLength(), ""));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.ui.component.nav.SecretViewModel$doCheck$1, reason: invalid class name */
    /* JADX INFO: compiled from: SecretCheckView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.ui.component.nav.SecretViewModel$doCheck$1", f = "SecretCheckView.kt", i = {2, 5, 10}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_CHECK_PACKET_CORRUPT, MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_RENDER_STALL, MediaPlayer.MEDIA_PLAYER_OPTION_SET_AVPH_VIDEO_PROBESIZE, MediaPlayer.MEDIA_PLAYER_OPTION_SET_AVPH_AUDIO_PROBESIZE, MediaPlayer.MEDIA_PLAYER_OPTION_SET_AVPH_AUTO_REOPEN, MediaPlayer.MEDIA_PLAYER_OPTION_GET_STREAM_INFO_FIND_END_TIME, MediaPlayer.MEDIA_PLAYER_OPTION_GET_FIRST_VIDEO_POS, MediaPlayer.MEDIA_PLAYER_OPTION_GET_FIRST_VIDEO_PTS, MediaPlayer.MEDIA_PLAYER_OPTION_AV_NO_SYNC_THRESHOLD, MediaPlayer.MEDIA_PLAYER_OPTION_ALWAYS_DO_AV_SYNC, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_SCFG_ADDRESS, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_INIT_MTU, MediaPlayer.MEDIA_PLAYER_OPTION_SPEEDX_DROP, MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_DECODER_STALL, MediaPlayer.MEDIA_PLAYER_OPTION_DEMUXER_STALL_THRESHOLD}, m = "invokeSuspend", n = {"nowSecret", "nowSecret", "nowSecret"}, s = {"L$0", "L$0", "L$0"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $ok;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ok = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SecretViewModel.this.new AnonymousClass1(this.$ok, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:38:0x0113 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:41:0x013b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:50:0x016c  */
        /* JADX WARN: Code duplicated, block: B:53:0x0185  */
        /* JADX WARN: Code duplicated, block: B:55:0x019c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:58:0x01ac A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:59:0x01ad  */
        /* JADX WARN: Code duplicated, block: B:61:0x01c3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:64:0x01d3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:73:0x0205  */
        /* JADX WARN: Code duplicated, block: B:76:0x021e  */
        /* JADX WARN: Code duplicated, block: B:78:0x0236 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:81:0x0246 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:82:0x0247  */
        /* JADX WARN: Code duplicated, block: B:84:0x0258 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:87:0x0268 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String strJoinToString$default;
            Object objectCache;
            Object objectCache2;
            Object objectCache3;
            AppConfigModel appConfigModel;
            AppConfigModel appConfigModel2;
            AppConfigModel appConfigModel3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    strJoinToString$default = CollectionsKt.joinToString$default(SecretViewModel.this.getSecrets(), "", null, null, 0, null, null, 62, null);
                    if (Intrinsics.areEqual(SecretViewModel.this.getType(), "set") || Intrinsics.areEqual(SecretViewModel.this.getType(), "new")) {
                        SecretViewModel.this.setOldSecret(strJoinToString$default);
                        SecretViewModel.this.setType("confirm");
                        SecretViewModel.this.setMessage("");
                        this.label = 1;
                        if (SecretViewModel.this.clearSecrets(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (Intrinsics.areEqual(SecretViewModel.this.getType(), "confirm")) {
                        if (!Intrinsics.areEqual(strJoinToString$default, SecretViewModel.this.getOldSecret())) {
                            SecretViewModel.this.setMessage("确认秘钥错误");
                            this.label = 2;
                            if (SecretViewModel.this.clearSecrets(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            this.L$0 = strJoinToString$default;
                            this.label = 3;
                            objectCache3 = SecretViewModel.this.getBaseRepository().getObjectCache("appConfig", AppConfigModel.class, this);
                            if (objectCache3 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            appConfigModel = (AppConfigModel) objectCache3;
                            if (appConfigModel == null) {
                                appConfigModel = new AppConfigModel(false, null, null, null, null, 31, null);
                            }
                            appConfigModel.setSecret(strJoinToString$default);
                            this.L$0 = null;
                            this.label = 4;
                            if (SecretViewModel.this.getBaseRepository().cacheJsonValue("appConfig", appConfigModel, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            SecretViewModel.this.getBaseRepository().reload();
                            SecretViewModel.this.setMessage("");
                            SecretViewModel.this.getBaseRepository().toast("设置成功");
                            this.label = 5;
                            if (SecretViewModel.this.clearSecrets(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            this.$ok.invoke();
                        }
                    } else if (Intrinsics.areEqual(SecretViewModel.this.getType(), "reset")) {
                        this.L$0 = strJoinToString$default;
                        this.label = 6;
                        objectCache2 = SecretViewModel.this.getBaseRepository().getObjectCache("appConfig", AppConfigModel.class, this);
                        if (objectCache2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        appConfigModel2 = (AppConfigModel) objectCache2;
                        if (appConfigModel2 == null) {
                            appConfigModel2 = new AppConfigModel(false, null, null, null, null, 31, null);
                        }
                        if (!Intrinsics.areEqual(strJoinToString$default, appConfigModel2.getSecret())) {
                            SecretViewModel.this.setMessage("旧秘钥错误");
                            this.L$0 = null;
                            this.label = 7;
                            if (SecretViewModel.this.clearSecrets(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            this.label = 8;
                            if (SecretViewModel.this.appendMissTimes(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            SecretViewModel.this.setMessage("");
                            this.L$0 = null;
                            this.label = 9;
                            if (SecretViewModel.this.clearSecrets(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            this.label = 10;
                            if (SecretViewModel.clearMisstimes$default(SecretViewModel.this, false, this, 1, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            SecretViewModel.this.setType("new");
                        }
                    } else if (Intrinsics.areEqual(SecretViewModel.this.getType(), "check")) {
                        this.L$0 = strJoinToString$default;
                        this.label = 11;
                        objectCache = SecretViewModel.this.getBaseRepository().getObjectCache("appConfig", AppConfigModel.class, this);
                        if (objectCache == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        appConfigModel3 = (AppConfigModel) objectCache;
                        if (appConfigModel3 == null) {
                            appConfigModel3 = new AppConfigModel(false, null, null, null, null, 31, null);
                        }
                        if (!Intrinsics.areEqual(strJoinToString$default, appConfigModel3.getSecret())) {
                            SecretViewModel.this.setMessage("秘钥错误");
                            this.L$0 = null;
                            this.label = 12;
                            if (SecretViewModel.this.clearSecrets(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            this.label = 13;
                            if (SecretViewModel.this.appendMissTimes(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            this.L$0 = null;
                            this.label = 14;
                            if (SecretViewModel.this.clearSecrets(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            this.label = 15;
                            if (SecretViewModel.clearMisstimes$default(SecretViewModel.this, false, this, 1, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            SecretViewModel.this.setMessage("");
                            this.$ok.invoke();
                        }
                    }
                    return Unit.INSTANCE;
                case 1:
                case 2:
                case 8:
                case 13:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 3:
                    strJoinToString$default = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objectCache3 = obj;
                    appConfigModel = (AppConfigModel) objectCache3;
                    if (appConfigModel == null) {
                        appConfigModel = new AppConfigModel(false, null, null, null, null, 31, null);
                    }
                    appConfigModel.setSecret(strJoinToString$default);
                    this.L$0 = null;
                    this.label = 4;
                    if (SecretViewModel.this.getBaseRepository().cacheJsonValue("appConfig", appConfigModel, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    SecretViewModel.this.getBaseRepository().reload();
                    SecretViewModel.this.setMessage("");
                    SecretViewModel.this.getBaseRepository().toast("设置成功");
                    this.label = 5;
                    if (SecretViewModel.this.clearSecrets(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.$ok.invoke();
                    return Unit.INSTANCE;
                case 4:
                    ResultKt.throwOnFailure(obj);
                    SecretViewModel.this.getBaseRepository().reload();
                    SecretViewModel.this.setMessage("");
                    SecretViewModel.this.getBaseRepository().toast("设置成功");
                    this.label = 5;
                    if (SecretViewModel.this.clearSecrets(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.$ok.invoke();
                    return Unit.INSTANCE;
                case 5:
                    ResultKt.throwOnFailure(obj);
                    this.$ok.invoke();
                    return Unit.INSTANCE;
                case 6:
                    strJoinToString$default = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objectCache2 = obj;
                    appConfigModel2 = (AppConfigModel) objectCache2;
                    if (appConfigModel2 == null) {
                        appConfigModel2 = new AppConfigModel(false, null, null, null, null, 31, null);
                    }
                    if (!Intrinsics.areEqual(strJoinToString$default, appConfigModel2.getSecret())) {
                        SecretViewModel.this.setMessage("旧秘钥错误");
                        this.L$0 = null;
                        this.label = 7;
                        if (SecretViewModel.this.clearSecrets(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        this.label = 8;
                        if (SecretViewModel.this.appendMissTimes(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    SecretViewModel.this.setMessage("");
                    this.L$0 = null;
                    this.label = 9;
                    if (SecretViewModel.this.clearSecrets(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.label = 10;
                    if (SecretViewModel.clearMisstimes$default(SecretViewModel.this, false, this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    SecretViewModel.this.setType("new");
                    return Unit.INSTANCE;
                case 7:
                    ResultKt.throwOnFailure(obj);
                    this.label = 8;
                    if (SecretViewModel.this.appendMissTimes(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 9:
                    ResultKt.throwOnFailure(obj);
                    this.label = 10;
                    if (SecretViewModel.clearMisstimes$default(SecretViewModel.this, false, this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    SecretViewModel.this.setType("new");
                    return Unit.INSTANCE;
                case 10:
                    ResultKt.throwOnFailure(obj);
                    SecretViewModel.this.setType("new");
                    return Unit.INSTANCE;
                case 11:
                    strJoinToString$default = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objectCache = obj;
                    appConfigModel3 = (AppConfigModel) objectCache;
                    if (appConfigModel3 == null) {
                        appConfigModel3 = new AppConfigModel(false, null, null, null, null, 31, null);
                    }
                    if (!Intrinsics.areEqual(strJoinToString$default, appConfigModel3.getSecret())) {
                        SecretViewModel.this.setMessage("秘钥错误");
                        this.L$0 = null;
                        this.label = 12;
                        if (SecretViewModel.this.clearSecrets(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        this.label = 13;
                        if (SecretViewModel.this.appendMissTimes(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    this.L$0 = null;
                    this.label = 14;
                    if (SecretViewModel.this.clearSecrets(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.label = 15;
                    if (SecretViewModel.clearMisstimes$default(SecretViewModel.this, false, this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    SecretViewModel.this.setMessage("");
                    this.$ok.invoke();
                    return Unit.INSTANCE;
                case 12:
                    ResultKt.throwOnFailure(obj);
                    this.label = 13;
                    if (SecretViewModel.this.appendMissTimes(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 14:
                    ResultKt.throwOnFailure(obj);
                    this.label = 15;
                    if (SecretViewModel.clearMisstimes$default(SecretViewModel.this, false, this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    SecretViewModel.this.setMessage("");
                    this.$ok.invoke();
                    return Unit.INSTANCE;
                case 15:
                    ResultKt.throwOnFailure(obj);
                    SecretViewModel.this.setMessage("");
                    this.$ok.invoke();
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void doCheck(Function0<Unit> ok) {
        Intrinsics.checkNotNullParameter(ok, "ok");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(ok, null), 3, null);
    }

    public static /* synthetic */ Object clearMisstimes$default(SecretViewModel secretViewModel, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return secretViewModel.clearMisstimes(z, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object clearMisstimes(boolean z, Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        boolean z2;
        SecretViewModel secretViewModel;
        SecretViewModel secretViewModel2;
        boolean z3;
        BaseRepository baseRepository;
        Object objIntCache;
        String str;
        BaseRepository baseRepository2;
        int iIntValue;
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
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            setMissTimes(0);
            setUnlockTime(0L);
            BaseRepository baseRepository3 = this.baseRepository;
            int missTimes = getMissTimes();
            anonymousClass1.L$0 = this;
            z2 = z;
            anonymousClass1.Z$0 = z2;
            anonymousClass1.label = 1;
            if (baseRepository3.cacheInt("missTimes", missTimes, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            secretViewModel = this;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            str = (String) anonymousClass1.L$1;
                            baseRepository = (BaseRepository) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj);
                            iIntValue = ((Number) obj).intValue() + 1;
                            anonymousClass1.L$0 = null;
                            anonymousClass1.L$1 = null;
                            anonymousClass1.label = 5;
                            if (baseRepository.cacheInt(str, iIntValue, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                z3 = anonymousClass1.Z$0;
                secretViewModel2 = (SecretViewModel) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                if (z3) {
                    baseRepository2 = secretViewModel2.baseRepository;
                    anonymousClass1.L$0 = null;
                    anonymousClass1.label = 3;
                    if (baseRepository2.cacheLong("lockTimes", 0L, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                baseRepository = secretViewModel2.baseRepository;
                anonymousClass1.L$0 = baseRepository;
                anonymousClass1.L$1 = "lockTimes";
                anonymousClass1.label = 4;
                objIntCache = baseRepository.intCache("lockTimes", anonymousClass1);
                if (objIntCache == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = "lockTimes";
                obj = objIntCache;
                iIntValue = ((Number) obj).intValue() + 1;
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 5;
                if (baseRepository.cacheInt(str, iIntValue, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            boolean z4 = anonymousClass1.Z$0;
            SecretViewModel secretViewModel3 = (SecretViewModel) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
            secretViewModel = secretViewModel3;
            z2 = z4;
        }
        BaseRepository baseRepository4 = secretViewModel.baseRepository;
        long unlockTime = secretViewModel.getUnlockTime();
        anonymousClass1.L$0 = secretViewModel;
        anonymousClass1.Z$0 = z2;
        anonymousClass1.label = 2;
        if (baseRepository4.cacheLong("unlockTime", unlockTime, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        secretViewModel2 = secretViewModel;
        z3 = z2;
        if (z3) {
            baseRepository2 = secretViewModel2.baseRepository;
            anonymousClass1.L$0 = null;
            anonymousClass1.label = 3;
            if (baseRepository2.cacheLong("lockTimes", 0L, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        baseRepository = secretViewModel2.baseRepository;
        anonymousClass1.L$0 = baseRepository;
        anonymousClass1.L$1 = "lockTimes";
        anonymousClass1.label = 4;
        objIntCache = baseRepository.intCache("lockTimes", anonymousClass1);
        if (objIntCache == coroutine_suspended) {
            return coroutine_suspended;
        }
        str = "lockTimes";
        obj = objIntCache;
        iIntValue = ((Number) obj).intValue() + 1;
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 5;
        if (baseRepository.cacheInt(str, iIntValue, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object getLockTime(Continuation<? super Long> continuation) throws Throwable {
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
        Object objIntCache = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objIntCache);
            BaseRepository baseRepository = this.baseRepository;
            anonymousClass1.label = 1;
            objIntCache = baseRepository.intCache("lockTimes", anonymousClass1);
            if (objIntCache == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objIntCache);
        }
        int iIntValue = ((Number) objIntCache).intValue();
        List listListOf = CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(1), Boxing.boxInt(5), Boxing.boxInt(30), Boxing.boxInt(120), Boxing.boxInt(300)});
        if (iIntValue > listListOf.size()) {
            return Boxing.boxLong(86400000L);
        }
        return Boxing.boxLong(((long) (((Number) listListOf.get(iIntValue)).intValue() * 1000)) * 60);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object appendMissTimes(Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        SecretViewModel secretViewModel;
        SecretViewModel secretViewModel2;
        long j;
        SecretViewModel secretViewModel3;
        BaseRepository baseRepository;
        int missTimes;
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
        Object lockTime = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(lockTime);
            setMissTimes(getMissTimes() + 1);
            if (getMissTimes() >= getMaxTimes()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = this;
                anonymousClass1.J$0 = jCurrentTimeMillis;
                anonymousClass1.label = 1;
                lockTime = getLockTime(anonymousClass1);
                if (lockTime == coroutine_suspended) {
                    return coroutine_suspended;
                }
                secretViewModel2 = this;
                j = jCurrentTimeMillis;
                secretViewModel3 = secretViewModel2;
            } else {
                secretViewModel = this;
            }
            baseRepository = secretViewModel.baseRepository;
            missTimes = secretViewModel.getMissTimes();
            anonymousClass1.L$0 = null;
            anonymousClass1.label = 3;
            if (baseRepository.cacheInt("missTimes", missTimes, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (i == 1) {
            j = anonymousClass1.J$0;
            secretViewModel2 = (SecretViewModel) anonymousClass1.L$1;
            secretViewModel3 = (SecretViewModel) anonymousClass1.L$0;
            ResultKt.throwOnFailure(lockTime);
        } else if (i == 2) {
            secretViewModel = (SecretViewModel) anonymousClass1.L$0;
            ResultKt.throwOnFailure(lockTime);
            secretViewModel.startTimer();
            baseRepository = secretViewModel.baseRepository;
            missTimes = secretViewModel.getMissTimes();
            anonymousClass1.L$0 = null;
            anonymousClass1.label = 3;
            if (baseRepository.cacheInt("missTimes", missTimes, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(lockTime);
        }
        return Unit.INSTANCE;
        secretViewModel2.setUnlockTime(j + ((Number) lockTime).longValue());
        BaseRepository baseRepository2 = secretViewModel3.baseRepository;
        long unlockTime = secretViewModel3.getUnlockTime();
        anonymousClass1.L$0 = secretViewModel3;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 2;
        if (baseRepository2.cacheLong("unlockTime", unlockTime, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        secretViewModel = secretViewModel3;
        secretViewModel.startTimer();
        baseRepository = secretViewModel.baseRepository;
        missTimes = secretViewModel.getMissTimes();
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 3;
        if (baseRepository.cacheInt("missTimes", missTimes, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}