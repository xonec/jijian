package cn.jianyun.workplan.main;

import android.net.Uri;
import android.os.Bundle;
import androidx.navigation.NavDeepLinkRequest;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Router.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, d2 = {"navigateTo", "", "Landroidx/navigation/NavHostController;", "route", "", "args", "Landroid/os/Bundle;", "navOptions", "Landroidx/navigation/NavOptions;", "navigatorExtras", "Landroidx/navigation/Navigator$Extras;", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RouterKt {
    public static /* synthetic */ void navigateTo$default(NavHostController navHostController, String str, Bundle bundle, NavOptions navOptions, Navigator.Extras extras, int i, Object obj) {
        if ((i & 4) != 0) {
            navOptions = null;
        }
        if ((i & 8) != 0) {
            extras = null;
        }
        navigateTo(navHostController, str, bundle, navOptions, extras);
    }

    public static final void navigateTo(NavHostController navHostController, String route, Bundle args, NavOptions navOptions, Navigator.Extras extras) {
        Intrinsics.checkNotNullParameter(navHostController, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(args, "args");
        NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLink = navHostController.getGraph().matchDeepLink(NavDeepLinkRequest.Builder.INSTANCE.fromUri(Uri.parse(NavDestination.INSTANCE.createRoute(route))).build());
        if (deepLinkMatchMatchDeepLink != null) {
            navHostController.navigate(deepLinkMatchMatchDeepLink.getDestination().getId(), args, navOptions, extras);
        } else {
            navHostController.navigate(route, navOptions, extras);
        }
    }
}