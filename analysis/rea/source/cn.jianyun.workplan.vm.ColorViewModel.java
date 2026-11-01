package cn.jianyun.workplan.vm;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.core.text.util.LocalePreferences;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.util.CommonToolKt;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ColorViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\nJ\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\nJ\u000e\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\nJ\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0(J\u000e\u0010)\u001a\u00020#2\u0006\u0010!\u001a\u00020\nJ\u0006\u0010*\u001a\u00020#J\u000e\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R+\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u00188F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006-"}, d2 = {"Lcn/jianyun/workplan/vm/ColorViewModel;", "Landroidx/lifecycle/ViewModel;", "baseRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "context", "Landroid/content/Context;", "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Landroid/content/Context;)V", "getBaseRepository", "()Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "<set-?>", "", "collectColors", "getCollectColors", "()Ljava/lang/String;", "setCollectColors", "(Ljava/lang/String;)V", "collectColors$delegate", "Landroidx/compose/runtime/MutableState;", "getContext", "()Landroid/content/Context;", "defaultColorMode", "getDefaultColorMode", "setDefaultColorMode", "defaultColorMode$delegate", "Lcn/jianyun/workplan/model/FormType;", "formType", "getFormType", "()Lcn/jianyun/workplan/model/FormType;", "setFormType", "(Lcn/jianyun/workplan/model/FormType;)V", "formType$delegate", "addCollectColor", "", "color", "batchAddCollectColor", "", "colors", "isForm", "type", "listColor", "", "removeCollectColor", "reset", "toast", "msg", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ColorViewModel extends ViewModel {
    public static final int $stable = 8;
    private final BaseRepository baseRepository;

    /* JADX INFO: renamed from: collectColors$delegate, reason: from kotlin metadata */
    private final MutableState collectColors;
    private final Context context;

    /* JADX INFO: renamed from: defaultColorMode$delegate, reason: from kotlin metadata */
    private final MutableState defaultColorMode;

    /* JADX INFO: renamed from: formType$delegate, reason: from kotlin metadata */
    private final MutableState formType;

    public final BaseRepository getBaseRepository() {
        return this.baseRepository;
    }

    public final Context getContext() {
        return this.context;
    }

    @Inject
    public ColorViewModel(BaseRepository baseRepository, @ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(baseRepository, "baseRepository");
        Intrinsics.checkNotNullParameter(context, "context");
        this.baseRepository = baseRepository;
        this.context = context;
        this.defaultColorMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.collectColors = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.formType = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FormType(null, null, null, 7, null), null, 2, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getDefaultColorMode() {
        return (String) this.defaultColorMode.getValue();
    }

    public final void setDefaultColorMode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.defaultColorMode.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getCollectColors() {
        return (String) this.collectColors.getValue();
    }

    public final void setCollectColors(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.collectColors.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FormType getFormType() {
        return (FormType) this.formType.getValue();
    }

    public final void setFormType(FormType formType) {
        Intrinsics.checkNotNullParameter(formType, "<set-?>");
        this.formType.setValue(formType);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.vm.ColorViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: ColorViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.vm.ColorViewModel$1", f = "ColorViewModel.kt", i = {}, l = {32, 33}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ColorViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ColorViewModel colorViewModel;
            ColorViewModel colorViewModel2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                colorViewModel = ColorViewModel.this;
                this.L$0 = colorViewModel;
                this.label = 1;
                obj = colorViewModel.getBaseRepository().getCache("defaultColorMode", LocalePreferences.CalendarType.CHINESE, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    colorViewModel = (ColorViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    colorViewModel2 = (ColorViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                colorViewModel2.setCollectColors((String) obj);
                return Unit.INSTANCE;
            }
            colorViewModel.setDefaultColorMode((String) obj);
            ColorViewModel colorViewModel3 = ColorViewModel.this;
            this.L$0 = colorViewModel3;
            this.label = 2;
            Object cache = colorViewModel3.getBaseRepository().getCache("collectColors", "", this);
            if (cache == coroutine_suspended) {
                return coroutine_suspended;
            }
            colorViewModel2 = colorViewModel3;
            obj = cache;
            colorViewModel2.setCollectColors((String) obj);
            return Unit.INSTANCE;
        }
    }

    public final void toast(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.baseRepository.toast(msg);
    }

    public final void batchAddCollectColor(String colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        ArrayList arrayList = new ArrayList();
        for (String str : StringsKt.split$default((CharSequence) StringsKt.replace$default(getCollectColors(), "，", ",", false, 4, (Object) null), new String[]{","}, false, 0, 6, (Object) null)) {
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        for (String str2 : StringsKt.split$default((CharSequence) StringsKt.replace$default(colors, "\n", ",", false, 4, (Object) null), new String[]{","}, false, 0, 6, (Object) null)) {
            if (CommonToolKt.isValidColor(str2) && !arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        setCollectColors(CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null));
    }

    public final boolean addCollectColor(String color) {
        Intrinsics.checkNotNullParameter(color, "color");
        if (StringsKt.contains$default((CharSequence) getCollectColors(), (CharSequence) color, false, 2, (Object) null)) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : StringsKt.split$default((CharSequence) getCollectColors(), new String[]{","}, false, 0, 6, (Object) null)) {
            if (!Intrinsics.areEqual(str, color) && !arrayList.contains(color)) {
                arrayList.add(str);
            }
        }
        arrayList.add(color);
        setCollectColors(CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass2(null), 3, null);
        return true;
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.vm.ColorViewModel$addCollectColor$2, reason: invalid class name */
    /* JADX INFO: compiled from: ColorViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.vm.ColorViewModel$addCollectColor$2", f = "ColorViewModel.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ColorViewModel.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ColorViewModel.this.getBaseRepository().cache("collectColors", ColorViewModel.this.getCollectColors(), this) == coroutine_suspended) {
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

    public final void removeCollectColor(String color) {
        Intrinsics.checkNotNullParameter(color, "color");
        ArrayList arrayList = new ArrayList();
        for (String str : StringsKt.split$default((CharSequence) getCollectColors(), new String[]{","}, false, 0, 6, (Object) null)) {
            if (!Intrinsics.areEqual(color, str)) {
                arrayList.add(str);
            }
        }
        setCollectColors(CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null));
        CommonToolKt.mlog("remove color", color, getCollectColors());
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass2(null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.vm.ColorViewModel$removeCollectColor$2, reason: invalid class name */
    /* JADX INFO: compiled from: ColorViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.vm.ColorViewModel$removeCollectColor$2", f = "ColorViewModel.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ColorViewModel.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ColorViewModel.this.getBaseRepository().cache("collectColors", ColorViewModel.this.getCollectColors(), this) == coroutine_suspended) {
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

    public final List<String> listColor() {
        ArrayList arrayList = new ArrayList();
        for (String str : StringsKt.split$default((CharSequence) getCollectColors(), new String[]{","}, false, 0, 6, (Object) null)) {
            if (!Intrinsics.areEqual(str, "")) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final boolean isForm(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return Intrinsics.areEqual(getFormType().getType(), type);
    }

    public final void reset() {
        setFormType(new FormType(null, null, null, 7, null));
    }
}