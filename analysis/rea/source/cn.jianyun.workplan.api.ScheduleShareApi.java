package cn.jianyun.workplan.api;

import cn.jianyun.workplan.module.schedule.model.ScheduleShareDataKt;
import cn.jianyun.workplan.module.schedule.model.ScheduleSharePostData;
import com.alipay.sdk.m.t.e;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: compiled from: ScheduleShareApi.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\tJ!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcn/jianyun/workplan/api/ScheduleShareApi;", "", "fetchScheduleShareData", "Lcn/jianyun/workplan/api/ApiResult;", "Lcn/jianyun/workplan/module/schedule/model/ScheduleSharePostData;", "shareId", "", "gmtCreate", "appId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postScheduleShareData", e.m, "(Lcn/jianyun/workplan/module/schedule/model/ScheduleSharePostData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ScheduleShareApi {
    @GET("/api/shareData/fetch")
    Object fetchScheduleShareData(@Query("shareId") String str, @Query("gmtCreate") String str2, @Query("appId") String str3, Continuation<? super ApiResult<ScheduleSharePostData>> continuation);

    @POST("/api/shareData/share")
    Object postScheduleShareData(@Body ScheduleSharePostData scheduleSharePostData, Continuation<? super ApiResult<String>> continuation);

    /* JADX INFO: compiled from: ScheduleShareApi.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object fetchScheduleShareData$default(ScheduleShareApi scheduleShareApi, String str, String str2, String str3, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchScheduleShareData");
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            if ((i & 4) != 0) {
                str3 = ScheduleShareDataKt.SCHEDULE_SHARE_APP_ID;
            }
            return scheduleShareApi.fetchScheduleShareData(str, str2, str3, continuation);
        }
    }
}