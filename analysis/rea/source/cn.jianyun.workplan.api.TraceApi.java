package cn.jianyun.workplan.api;

import com.alipay.sdk.m.t.e;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: compiled from: TraceApi.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcn/jianyun/workplan/api/TraceApi;", "", "getAppVersion", "Lcn/jianyun/workplan/api/ApiResult;", "", "app", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "post", e.m, "Lcn/jianyun/workplan/api/TraceInfo;", "(Lcn/jianyun/workplan/api/TraceInfo;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface TraceApi {
    @GET("/api/application/version")
    Object getAppVersion(@Query("app") String str, Continuation<? super ApiResult<String>> continuation);

    @POST("/api/event/post")
    Object post(@Body TraceInfo traceInfo, @Header("app") String str, Continuation<? super ApiResult<String>> continuation);

    /* JADX INFO: compiled from: TraceApi.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object post$default(TraceApi traceApi, TraceInfo traceInfo, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: post");
            }
            if ((i & 2) != 0) {
                str = "ajjpb";
            }
            return traceApi.post(traceInfo, str, continuation);
        }
    }
}