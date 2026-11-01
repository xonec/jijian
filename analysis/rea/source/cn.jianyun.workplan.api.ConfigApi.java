package cn.jianyun.workplan.api;

import cn.jianyun.workplan.api.dto.AppTipInfo;
import cn.jianyun.workplan.module.schedule.model.ScheduleShareDataKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: compiled from: ConfigApi.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J1\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcn/jianyun/workplan/api/ConfigApi;", "", "listConfigs", "Lcn/jianyun/workplan/api/ApiResult;", "", "Lcn/jianyun/workplan/api/dto/AppTipInfo;", "app", "", "platform", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ConfigApi {
    @GET("/api/notify/gets")
    Object listConfigs(@Query("app") String str, @Query("platform") String str2, Continuation<? super ApiResult<List<AppTipInfo>>> continuation);

    /* JADX INFO: compiled from: ConfigApi.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object listConfigs$default(ConfigApi configApi, String str, String str2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listConfigs");
            }
            if ((i & 2) != 0) {
                str2 = ScheduleShareDataKt.SCHEDULE_SHARE_APP_CODE;
            }
            return configApi.listConfigs(str, str2, continuation);
        }
    }
}