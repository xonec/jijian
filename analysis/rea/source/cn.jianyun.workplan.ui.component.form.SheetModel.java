package cn.jianyun.workplan.ui.component.form;

import androidx.compose.ui.graphics.Color;
import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DialogView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B2\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u001c\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JD\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR%\u0010\u0004\u001a\u00020\u0005X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Lcn/jianyun/workplan/ui/component/form/SheetModel;", "", "name", "", "color", "Landroidx/compose/ui/graphics/Color;", "shown", "", "action", "Lkotlin/Function0;", "", "(Ljava/lang/String;JZLkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAction", "()Lkotlin/jvm/functions/Function0;", "setAction", "(Lkotlin/jvm/functions/Function0;)V", "getColor-0d7_KjU", "()J", "setColor-8_81llA", "(J)V", "J", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getShown", "()Z", "component1", "component2", "component2-0d7_KjU", "component3", "component4", "copy", "copy-RPmYEkk", "(Ljava/lang/String;JZLkotlin/jvm/functions/Function0;)Lcn/jianyun/workplan/ui/component/form/SheetModel;", "equals", AdType.TYPE_OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SheetModel {
    public static final int $stable = 8;
    private Function0<Unit> action;
    private long color;
    private String name;
    private final boolean shown;

    public /* synthetic */ SheetModel(String str, long j, boolean z, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, z, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-RPmYEkk$default, reason: not valid java name */
    public static /* synthetic */ SheetModel m6855copyRPmYEkk$default(SheetModel sheetModel, String str, long j, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sheetModel.name;
        }
        if ((i & 2) != 0) {
            j = sheetModel.color;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            z = sheetModel.shown;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            function0 = sheetModel.action;
        }
        return sheetModel.m6857copyRPmYEkk(str, j2, z2, function0);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShown() {
        return this.shown;
    }

    public final Function0<Unit> component4() {
        return this.action;
    }

    /* JADX INFO: renamed from: copy-RPmYEkk, reason: not valid java name */
    public final SheetModel m6857copyRPmYEkk(String name, long color, boolean shown, Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(action, "action");
        return new SheetModel(name, color, shown, action, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SheetModel)) {
            return false;
        }
        SheetModel sheetModel = (SheetModel) other;
        return Intrinsics.areEqual(this.name, sheetModel.name) && Color.m3756equalsimpl0(this.color, sheetModel.color) && this.shown == sheetModel.shown && Intrinsics.areEqual(this.action, sheetModel.action);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + Color.m3762hashCodeimpl(this.color)) * 31;
        boolean z = this.shown;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode + r1) * 31) + this.action.hashCode();
    }

    public String toString() {
        return "SheetModel(name=" + this.name + ", color=" + Color.m3763toStringimpl(this.color) + ", shown=" + this.shown + ", action=" + this.action + ")";
    }

    private SheetModel(String str, long j, boolean z, Function0<Unit> function0) {
        this.name = str;
        this.color = j;
        this.shown = z;
        this.action = function0;
    }

    public /* synthetic */ SheetModel(String str, long j, boolean z, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, j, (i & 4) != 0 ? true : z, function0, null);
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m6858getColor0d7_KjU() {
        return this.color;
    }

    /* JADX INFO: renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m6859setColor8_81llA(long j) {
        this.color = j;
    }

    public final boolean getShown() {
        return this.shown;
    }

    public final Function0<Unit> getAction() {
        return this.action;
    }

    public final void setAction(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.action = function0;
    }
}