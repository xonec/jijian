package cn.jianyun.workplan.model;

import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: FormType.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001%B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J)\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0006\u0010\u001a\u001a\u00020\u0016J\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0003J\u0006\u0010\u001d\u001a\u00020\u0016J\u0006\u0010\u001e\u001a\u00020\u0016J\u000e\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0003J\u0006\u0010 \u001a\u00020\u0016J\u0006\u0010!\u001a\u00020\u0016J\u0006\u0010\"\u001a\u00020#J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000e¨\u0006&"}, d2 = {"Lcn/jianyun/workplan/model/FormType;", "", "type", "", "editItem", "message", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "getEditItem", "()Ljava/lang/Object;", "setEditItem", "(Ljava/lang/Object;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getType", "setType", "component1", "component2", "component3", "copy", "equals", "", AdType.TYPE_OTHER, "hashCode", "", "isAdd", "isBizForm", "newType", "isClear", "isDelete", "isForm", "isSort", "isUpdate", "reset", "", "toString", "Companion", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FormType {
    private Object editItem;
    private String message;
    private String type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public FormType() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ FormType copy$default(FormType formType, String str, Object obj, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = formType.type;
        }
        if ((i & 2) != 0) {
            obj = formType.editItem;
        }
        if ((i & 4) != 0) {
            str2 = formType.message;
        }
        return formType.copy(str, obj, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getEditItem() {
        return this.editItem;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final FormType copy(String type, Object editItem, String message) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(message, "message");
        return new FormType(type, editItem, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormType)) {
            return false;
        }
        FormType formType = (FormType) other;
        return Intrinsics.areEqual(this.type, formType.type) && Intrinsics.areEqual(this.editItem, formType.editItem) && Intrinsics.areEqual(this.message, formType.message);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Object obj = this.editItem;
        return ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31) + this.message.hashCode();
    }

    public String toString() {
        return "FormType(type=" + this.type + ", editItem=" + this.editItem + ", message=" + this.message + ")";
    }

    public FormType(String type, Object obj, String message) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(message, "message");
        this.type = type;
        this.editItem = obj;
        this.message = message;
    }

    public /* synthetic */ FormType(String str, Object obj, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? "" : str2);
    }

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public final Object getEditItem() {
        return this.editItem;
    }

    public final void setEditItem(Object obj) {
        this.editItem = obj;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    /* JADX INFO: compiled from: FormType.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001J\u001c\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001J\u0012\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001J\u0012\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001J\u0006\u0010\u000f\u001a\u00020\u0004¨\u0006\u0010"}, d2 = {"Lcn/jianyun/workplan/model/FormType$Companion;", "", "()V", "add", "Lcn/jianyun/workplan/model/FormType;", "item", "clear", "message", "", "delete", "deleteOne", "detail", "edit", "longPress", "press", "sort", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ FormType add$default(Companion companion, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = null;
            }
            return companion.add(obj);
        }

        public final FormType add(Object item) {
            return new FormType(FormTypeKt.ADD, item, null, 4, null);
        }

        public static /* synthetic */ FormType edit$default(Companion companion, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = null;
            }
            return companion.edit(obj);
        }

        public final FormType edit(Object item) {
            return new FormType(FormTypeKt.UPDATE, item, null, 4, null);
        }

        public static /* synthetic */ FormType delete$default(Companion companion, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = null;
            }
            return companion.delete(obj);
        }

        public final FormType delete(Object item) {
            return new FormType(FormTypeKt.DELETE, item, null, 4, null);
        }

        public static /* synthetic */ FormType clear$default(Companion companion, String str, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = "确定要清空";
            }
            if ((i & 2) != 0) {
                obj = null;
            }
            return companion.clear(str, obj);
        }

        public final FormType clear(String message, Object item) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new FormType(FormTypeKt.CLEAR, item, message);
        }

        public final FormType detail(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new FormType(FormTypeKt.DETAIL, item, null, 4, null);
        }

        public final FormType deleteOne(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new FormType(FormTypeKt.DELETE_ONE, item, null, 4, null);
        }

        public final FormType longPress(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new FormType(FormTypeKt.LONG_PRESS, item, null, 4, null);
        }

        public final FormType press(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new FormType(FormTypeKt.PRESS, item, null, 4, null);
        }

        public final FormType sort() {
            return new FormType(FormTypeKt.SORT, null, null, 6, null);
        }
    }

    public final void reset() {
        this.type = "";
        this.editItem = null;
    }

    public final boolean isForm(String newType) {
        Intrinsics.checkNotNullParameter(newType, "newType");
        return Intrinsics.areEqual(this.type, newType);
    }

    public final boolean isBizForm(String newType) {
        Intrinsics.checkNotNullParameter(newType, "newType");
        return StringsKt.startsWith$default(this.type, newType, false, 2, (Object) null);
    }

    public final boolean isAdd() {
        return Intrinsics.areEqual(this.type, FormTypeKt.ADD);
    }

    public final boolean isSort() {
        return Intrinsics.areEqual(this.type, FormTypeKt.SORT);
    }

    public final boolean isUpdate() {
        return Intrinsics.areEqual(this.type, FormTypeKt.UPDATE);
    }

    public final boolean isDelete() {
        return Intrinsics.areEqual(this.type, FormTypeKt.DELETE);
    }

    public final boolean isClear() {
        return Intrinsics.areEqual(this.type, FormTypeKt.CLEAR);
    }
}