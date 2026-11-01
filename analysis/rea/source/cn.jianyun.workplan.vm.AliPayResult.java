package cn.jianyun.workplan.vm;

import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0006\u0010\u000f\u001a\u00020\u000bJ\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcn/jianyun/workplan/vm/AliPayResult;", "", "alipay_trade_app_pay_response", "Lcn/jianyun/workplan/vm/AliPayResultInfo;", "(Lcn/jianyun/workplan/vm/AliPayResultInfo;)V", "getAlipay_trade_app_pay_response", "()Lcn/jianyun/workplan/vm/AliPayResultInfo;", "setAlipay_trade_app_pay_response", "component1", "copy", "equals", "", AdType.TYPE_OTHER, "hashCode", "", "isSuccess", "toString", "", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AliPayResult {
    public static final int $stable = 8;
    private AliPayResultInfo alipay_trade_app_pay_response;

    /* JADX WARN: Multi-variable type inference failed */
    public AliPayResult() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AliPayResult copy$default(AliPayResult aliPayResult, AliPayResultInfo aliPayResultInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            aliPayResultInfo = aliPayResult.alipay_trade_app_pay_response;
        }
        return aliPayResult.copy(aliPayResultInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AliPayResultInfo getAlipay_trade_app_pay_response() {
        return this.alipay_trade_app_pay_response;
    }

    public final AliPayResult copy(AliPayResultInfo alipay_trade_app_pay_response) {
        Intrinsics.checkNotNullParameter(alipay_trade_app_pay_response, "alipay_trade_app_pay_response");
        return new AliPayResult(alipay_trade_app_pay_response);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AliPayResult) && Intrinsics.areEqual(this.alipay_trade_app_pay_response, ((AliPayResult) other).alipay_trade_app_pay_response);
    }

    public int hashCode() {
        return this.alipay_trade_app_pay_response.hashCode();
    }

    public String toString() {
        return "AliPayResult(alipay_trade_app_pay_response=" + this.alipay_trade_app_pay_response + ")";
    }

    public AliPayResult(AliPayResultInfo alipay_trade_app_pay_response) {
        Intrinsics.checkNotNullParameter(alipay_trade_app_pay_response, "alipay_trade_app_pay_response");
        this.alipay_trade_app_pay_response = alipay_trade_app_pay_response;
    }

    public /* synthetic */ AliPayResult(AliPayResultInfo aliPayResultInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AliPayResultInfo(null, null, null, 7, null) : aliPayResultInfo);
    }

    public final AliPayResultInfo getAlipay_trade_app_pay_response() {
        return this.alipay_trade_app_pay_response;
    }

    public final void setAlipay_trade_app_pay_response(AliPayResultInfo aliPayResultInfo) {
        Intrinsics.checkNotNullParameter(aliPayResultInfo, "<set-?>");
        this.alipay_trade_app_pay_response = aliPayResultInfo;
    }

    public final boolean isSuccess() {
        return Intrinsics.areEqual(this.alipay_trade_app_pay_response.getMsg(), "Success") && Intrinsics.areEqual(this.alipay_trade_app_pay_response.getCode(), "10000");
    }
}