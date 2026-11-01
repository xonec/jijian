package cn.jianyun.workplan.api;

import com.alipay.sdk.m.u0.b;
import com.byazt.dm.PluginConstants;
import com.tianmu.biz.bean.AdType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TraceInfo.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J=\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006$"}, d2 = {"Lcn/jianyun/workplan/api/TraceInfo;", "", "type", "", PluginConstants.KEY_ERROR_CODE, "uid", "fields", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "getFields", "()Ljava/util/Map;", "setFields", "(Ljava/util/Map;)V", "getType", "setType", "getUid", "setUid", "addField", "", "key", b.f2259d, "component1", "component2", "component3", "component4", "copy", "equals", "", AdType.TYPE_OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TraceInfo {
    public static final int $stable = 8;
    private String code;
    private Map<String, String> fields;
    private String type;
    private String uid;

    public TraceInfo() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TraceInfo copy$default(TraceInfo traceInfo, String str, String str2, String str3, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = traceInfo.type;
        }
        if ((i & 2) != 0) {
            str2 = traceInfo.code;
        }
        if ((i & 4) != 0) {
            str3 = traceInfo.uid;
        }
        if ((i & 8) != 0) {
            map = traceInfo.fields;
        }
        return traceInfo.copy(str, str2, str3, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    public final Map<String, String> component4() {
        return this.fields;
    }

    public final TraceInfo copy(String type, String code, String uid, Map<String, String> fields) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(fields, "fields");
        return new TraceInfo(type, code, uid, fields);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraceInfo)) {
            return false;
        }
        TraceInfo traceInfo = (TraceInfo) other;
        return Intrinsics.areEqual(this.type, traceInfo.type) && Intrinsics.areEqual(this.code, traceInfo.code) && Intrinsics.areEqual(this.uid, traceInfo.uid) && Intrinsics.areEqual(this.fields, traceInfo.fields);
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.code.hashCode()) * 31) + this.uid.hashCode()) * 31) + this.fields.hashCode();
    }

    public String toString() {
        return "TraceInfo(type=" + this.type + ", code=" + this.code + ", uid=" + this.uid + ", fields=" + this.fields + ")";
    }

    public TraceInfo(String type, String code, String uid, Map<String, String> fields) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.type = type;
        this.code = code;
        this.uid = uid;
        this.fields = fields;
    }

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public final String getCode() {
        return this.code;
    }

    public final void setCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.code = str;
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setUid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uid = str;
    }

    public /* synthetic */ TraceInfo(String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? MapsKt.emptyMap() : map);
    }

    public final Map<String, String> getFields() {
        return this.fields;
    }

    public final void setFields(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.fields = map;
    }

    public final void addField(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Map<String, String> mutableMap = MapsKt.toMutableMap(this.fields);
        mutableMap.put(key, value);
        this.fields = mutableMap;
    }
}