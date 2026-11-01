package cn.jianyun.workplan.ui.component.model.kt;

import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MenuItem.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcn/jianyun/workplan/ui/component/model/kt/MenuItem;", "", "name", "", "icon", "", "action", "Lkotlin/Function0;", "", "(Ljava/lang/String;ILkotlin/jvm/functions/Function0;)V", "getAction", "()Lkotlin/jvm/functions/Function0;", "setAction", "(Lkotlin/jvm/functions/Function0;)V", "getIcon", "()I", "setIcon", "(I)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", AdType.TYPE_OTHER, "hashCode", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MenuItem {
    public static final int $stable = 8;
    private Function0<Unit> action;
    private int icon;
    private String name;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MenuItem copy$default(MenuItem menuItem, String str, int i, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = menuItem.name;
        }
        if ((i2 & 2) != 0) {
            i = menuItem.icon;
        }
        if ((i2 & 4) != 0) {
            function0 = menuItem.action;
        }
        return menuItem.copy(str, i, function0);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    public final Function0<Unit> component3() {
        return this.action;
    }

    public final MenuItem copy(String name, int icon, Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(action, "action");
        return new MenuItem(name, icon, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuItem)) {
            return false;
        }
        MenuItem menuItem = (MenuItem) other;
        return Intrinsics.areEqual(this.name, menuItem.name) && this.icon == menuItem.icon && Intrinsics.areEqual(this.action, menuItem.action);
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + Integer.hashCode(this.icon)) * 31) + this.action.hashCode();
    }

    public String toString() {
        return "MenuItem(name=" + this.name + ", icon=" + this.icon + ", action=" + this.action + ")";
    }

    public MenuItem(String name, int i, Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(action, "action");
        this.name = name;
        this.icon = i;
        this.action = action;
    }

    public /* synthetic */ MenuItem(String str, int i, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, function0);
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final void setIcon(int i) {
        this.icon = i;
    }

    public final Function0<Unit> getAction() {
        return this.action;
    }

    public final void setAction(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.action = function0;
    }
}