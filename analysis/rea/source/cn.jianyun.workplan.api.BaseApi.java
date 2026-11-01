package cn.jianyun.workplan.api;

import cn.jianyun.workplan.main.setting.user.User;
import com.alipay.sdk.m.c0.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: compiled from: BaseApi.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J?\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0002\u0010\tJ!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u000b\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\rJ'\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u0012H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\rJ!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\rJ!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u000b\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\rJ!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\rJI\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00042\b\b\u0003\u0010\u0019\u001a\u00020\u001aH§@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u000b\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\rJ!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u000b\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\rJ!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u000b\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcn/jianyun/workplan/api/BaseApi;", "", "checkVip", "Lcn/jianyun/workplan/api/ApiResult;", "", "app", "platform", "uid", "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", d.A, "user", "Lcn/jianyun/workplan/main/setting/user/User;", "(Lcn/jianyun/workplan/main/setting/user/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchHoliday", "", "Lcn/jianyun/workplan/api/FestivalData;", "year", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchUserInfo", "login", "logoff", "regist", "sdkRequest", "testPay", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCloudInfo", "updateInfo", "updatePassword", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface BaseApi {
    @POST("/payApi/vipUser/check")
    Object checkVip(@Query("app") String str, @Query("platform") String str2, @Query("uid") String str3, @Query("type") String str4, Continuation<? super ApiResult<String>> continuation);

    @POST("/api/user/exit")
    Object exit(@Body User user, Continuation<? super ApiResult<Object>> continuation);

    @GET("/api/holiday/fetch")
    Object fetchHoliday(@Query("year") int i, Continuation<? super ApiResult<List<FestivalData>>> continuation);

    @POST("/api/user/fetch")
    Object fetchUserInfo(@Body User user, Continuation<? super ApiResult<User>> continuation);

    @POST("/api/user/login")
    Object login(@Body User user, Continuation<? super ApiResult<User>> continuation);

    @POST("/api/user/logoff")
    Object logoff(@Body User user, Continuation<? super ApiResult<Object>> continuation);

    @POST("/api/user/regist")
    Object regist(@Body User user, Continuation<? super ApiResult<User>> continuation);

    @GET("/payApi/alipay/makeAppPay")
    Object sdkRequest(@Query("app") String str, @Query("platform") String str2, @Query("uid") String str3, @Query("type") String str4, @Query("testPay") boolean z, Continuation<? super ApiResult<String>> continuation);

    @POST("/api/user/updateCloudInfo")
    Object updateCloudInfo(@Body User user, Continuation<? super ApiResult<Object>> continuation);

    @POST("/api/user/updateInfo")
    Object updateInfo(@Body User user, Continuation<? super ApiResult<Object>> continuation);

    @POST("/api/user/updatePassword")
    Object updatePassword(@Body User user, Continuation<? super ApiResult<Object>> continuation);

    /* JADX INFO: compiled from: BaseApi.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object sdkRequest$default(BaseApi baseApi, String str, String str2, String str3, String str4, boolean z, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sdkRequest");
            }
            if ((i & 16) != 0) {
                z = false;
            }
            return baseApi.sdkRequest(str, str2, str3, str4, z, continuation);
        }
    }
}