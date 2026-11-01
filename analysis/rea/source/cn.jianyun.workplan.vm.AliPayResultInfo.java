package cn.jianyun.workplan.vm;

import com.alipay.sdk.m.m.b;
import com.byazt.dm.PluginConstants;
import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcn/jianyun/workplan/vm/AliPayResultInfo;", "", PluginConstants.KEY_ERROR_CODE, "", "msg", b.A0, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "getMsg", "setMsg", "getOut_trade_no", "setOut_trade_no", "component1", "component2", "component3", "copy", "equals", "", AdType.TYPE_OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AliPayResultInfo {
    public static final int $stable = 8;
    private String code;
    private String msg;
    private String out_trade_no;

    public AliPayResultInfo() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ AliPayResultInfo copy$default(AliPayResultInfo aliPayResultInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aliPayResultInfo.code;
        }
        if ((i & 2) != 0) {
            str2 = aliPayResultInfo.msg;
        }
        if ((i & 4) != 0) {
            str3 = aliPayResultInfo.out_trade_no;
        }
        return aliPayResultInfo.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOut_trade_no() {
        return this.out_trade_no;
    }

    public final AliPayResultInfo copy(String code, String msg, String out_trade_no) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(out_trade_no, "out_trade_no");
        return new AliPayResultInfo(code, msg, out_trade_no);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AliPayResultInfo)) {
            return false;
        }
        AliPayResultInfo aliPayResultInfo = (AliPayResultInfo) other;
        return Intrinsics.areEqual(this.code, aliPayResultInfo.code) && Intrinsics.areEqual(this.msg, aliPayResultInfo.msg) && Intrinsics.areEqual(this.out_trade_no, aliPayResultInfo.out_trade_no);
    }

    public int hashCode() {
        return (((this.code.hashCode() * 31) + this.msg.hashCode()) * 31) + this.out_trade_no.hashCode();
    }

    public String toString() {
        return "AliPayResultInfo(code=" + this.code + ", msg=" + this.msg + ", out_trade_no=" + this.out_trade_no + ")";
    }

    public AliPayResultInfo(String code, String msg, String out_trade_no) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(out_trade_no, "out_trade_no");
        this.code = code;
        this.msg = msg;
        this.out_trade_no = out_trade_no;
    }

    public /* synthetic */ AliPayResultInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public final String getCode() {
        return this.code;
    }

    public final void setCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.code = str;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final void setMsg(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.msg = str;
    }

    public final String getOut_trade_no() {
        return this.out_trade_no;
    }

    public final void setOut_trade_no(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.out_trade_no = str;
    }
}