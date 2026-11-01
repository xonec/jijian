package cn.jianyun.workplan.api;

import androidx.exifinterface.media.ExifInterface;
import com.alipay.sdk.m.y.o;
import com.byazt.dm.PluginConstants;
import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ApiResult.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u000eJ>\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\u000b\u0010\u001a\u001a\u00028\u0000¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcn/jianyun/workplan/api/ApiResult;", ExifInterface.GPS_DIRECTION_TRUE, "", "success", "", PluginConstants.KEY_ERROR_CODE, "", "message", o.f2366c, "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getCode", "()Ljava/lang/String;", "getMessage", "getResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSuccess", "()Z", "component1", "component2", "component3", "component4", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcn/jianyun/workplan/api/ApiResult;", "equals", AdType.TYPE_OTHER, "fetchResult", "hashCode", "", "toString", "Companion", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ApiResult<T> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String code;
    private final String message;
    private final T result;
    private final boolean success;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiResult copy$default(ApiResult apiResult, boolean z, String str, String str2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = apiResult.success;
        }
        if ((i & 2) != 0) {
            str = apiResult.code;
        }
        if ((i & 4) != 0) {
            str2 = apiResult.message;
        }
        if ((i & 8) != 0) {
            obj = apiResult.result;
        }
        return apiResult.copy(z, str, str2, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final T component4() {
        return this.result;
    }

    public final ApiResult<T> copy(boolean success, String code, String message, T result) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        return new ApiResult<>(success, code, message, result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiResult)) {
            return false;
        }
        ApiResult apiResult = (ApiResult) other;
        return this.success == apiResult.success && Intrinsics.areEqual(this.code, apiResult.code) && Intrinsics.areEqual(this.message, apiResult.message) && Intrinsics.areEqual(this.result, apiResult.result);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.success;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = ((((r0 * 31) + this.code.hashCode()) * 31) + this.message.hashCode()) * 31;
        T t = this.result;
        return iHashCode + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return "ApiResult(success=" + this.success + ", code=" + this.code + ", message=" + this.message + ", result=" + this.result + ")";
    }

    public ApiResult(boolean z, String code, String message, T t) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        this.success = z;
        this.code = code;
        this.message = message;
        this.result = t;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final T getResult() {
        return this.result;
    }

    /* JADX INFO: compiled from: ApiResult.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\t\u001a\u0002H\u0005¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcn/jianyun/workplan/api/ApiResult$Companion;", "", "()V", "fail", "Lcn/jianyun/workplan/api/ApiResult;", ExifInterface.GPS_DIRECTION_TRUE, "message", "", "success", o.f2366c, "(Ljava/lang/Object;)Lcn/jianyun/workplan/api/ApiResult;", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T> ApiResult<T> success(T result) {
            return new ApiResult<>(true, "200", "", result);
        }

        public final <T> ApiResult<T> fail(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new ApiResult<>(false, "200", message, null);
        }
    }

    public final T fetchResult() {
        T t = this.result;
        Intrinsics.checkNotNull(t);
        return t;
    }
}