package cn.jianyun.workplan.module.base.router;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: WebDAVRouter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\b¨\u0006\t"}, d2 = {"Lcn/jianyun/workplan/module/base/router/WebDAVRouter;", "", "route", "", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "UserEdit", "Lcn/jianyun/workplan/module/base/router/WebDAVRouter$UserEdit;", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class WebDAVRouter {
    public static final int $stable = 0;
    private final String route;

    public /* synthetic */ WebDAVRouter(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: compiled from: WebDAVRouter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/module/base/router/WebDAVRouter$UserEdit;", "Lcn/jianyun/workplan/module/base/router/WebDAVRouter;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UserEdit extends WebDAVRouter {
        public static final int $stable = 0;
        public static final UserEdit INSTANCE = new UserEdit();

        private UserEdit() {
            super("WebDAVUserEdit", null);
        }
    }

    private WebDAVRouter(String str) {
        this.route = str;
    }

    public String getRoute() {
        return this.route;
    }
}