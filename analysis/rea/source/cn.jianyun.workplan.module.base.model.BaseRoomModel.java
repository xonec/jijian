package cn.jianyun.workplan.module.base.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaseRoomModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcn/jianyun/workplan/module/base/model/BaseRoomModel;", "", "uuid", "", "(Ljava/lang/String;)V", "getUuid", "()Ljava/lang/String;", "setUuid", "isAdd", "", "isValid", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class BaseRoomModel {
    public static final int $stable = 8;
    private String uuid;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseRoomModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public BaseRoomModel(String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.uuid = uuid;
    }

    public /* synthetic */ BaseRoomModel(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uuid = str;
    }

    public final boolean isAdd() {
        return Intrinsics.areEqual(getUuid(), "");
    }

    public String isValid() throws Exception {
        throw new Exception("异常");
    }
}