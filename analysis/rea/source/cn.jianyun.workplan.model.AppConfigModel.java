package cn.jianyun.workplan.model;

import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppConfigModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\r\u0010 \u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010!J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006%"}, d2 = {"Lcn/jianyun/workplan/model/AppConfigModel;", "", "needSecret", "", "needSecretApps", "", "secret", "userApps", "appTheme", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppTheme", "()Ljava/lang/String;", "setAppTheme", "(Ljava/lang/String;)V", "getNeedSecret", "()Z", "setNeedSecret", "(Z)V", "getNeedSecretApps", "setNeedSecretApps", "getSecret", "setSecret", "getUserApps", "setUserApps", "component1", "component2", "component3", "component4", "component5", "copy", "equals", AdType.TYPE_OTHER, "getDarkTheme", "(Landroidx/compose/runtime/Composer;I)Z", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AppConfigModel {
    public static final int $stable = 8;
    private String appTheme;
    private boolean needSecret;
    private String needSecretApps;
    private String secret;
    private String userApps;

    public AppConfigModel() {
        this(false, null, null, null, null, 31, null);
    }

    public static /* synthetic */ AppConfigModel copy$default(AppConfigModel appConfigModel, boolean z, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = appConfigModel.needSecret;
        }
        if ((i & 2) != 0) {
            str = appConfigModel.needSecretApps;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = appConfigModel.secret;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = appConfigModel.userApps;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = appConfigModel.appTheme;
        }
        return appConfigModel.copy(z, str5, str6, str7, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getNeedSecret() {
        return this.needSecret;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNeedSecretApps() {
        return this.needSecretApps;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSecret() {
        return this.secret;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserApps() {
        return this.userApps;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAppTheme() {
        return this.appTheme;
    }

    public final AppConfigModel copy(boolean needSecret, String needSecretApps, String secret, String userApps, String appTheme) {
        Intrinsics.checkNotNullParameter(needSecretApps, "needSecretApps");
        Intrinsics.checkNotNullParameter(secret, "secret");
        Intrinsics.checkNotNullParameter(userApps, "userApps");
        Intrinsics.checkNotNullParameter(appTheme, "appTheme");
        return new AppConfigModel(needSecret, needSecretApps, secret, userApps, appTheme);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppConfigModel)) {
            return false;
        }
        AppConfigModel appConfigModel = (AppConfigModel) other;
        return this.needSecret == appConfigModel.needSecret && Intrinsics.areEqual(this.needSecretApps, appConfigModel.needSecretApps) && Intrinsics.areEqual(this.secret, appConfigModel.secret) && Intrinsics.areEqual(this.userApps, appConfigModel.userApps) && Intrinsics.areEqual(this.appTheme, appConfigModel.appTheme);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z = this.needSecret;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((((((r0 * 31) + this.needSecretApps.hashCode()) * 31) + this.secret.hashCode()) * 31) + this.userApps.hashCode()) * 31) + this.appTheme.hashCode();
    }

    public String toString() {
        return "AppConfigModel(needSecret=" + this.needSecret + ", needSecretApps=" + this.needSecretApps + ", secret=" + this.secret + ", userApps=" + this.userApps + ", appTheme=" + this.appTheme + ")";
    }

    public AppConfigModel(boolean z, String needSecretApps, String secret, String userApps, String appTheme) {
        Intrinsics.checkNotNullParameter(needSecretApps, "needSecretApps");
        Intrinsics.checkNotNullParameter(secret, "secret");
        Intrinsics.checkNotNullParameter(userApps, "userApps");
        Intrinsics.checkNotNullParameter(appTheme, "appTheme");
        this.needSecret = z;
        this.needSecretApps = needSecretApps;
        this.secret = secret;
        this.userApps = userApps;
        this.appTheme = appTheme;
    }

    public /* synthetic */ AppConfigModel(boolean z, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? "auto" : str4);
    }

    public final boolean getNeedSecret() {
        return this.needSecret;
    }

    public final void setNeedSecret(boolean z) {
        this.needSecret = z;
    }

    public final String getNeedSecretApps() {
        return this.needSecretApps;
    }

    public final void setNeedSecretApps(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.needSecretApps = str;
    }

    public final String getSecret() {
        return this.secret;
    }

    public final void setSecret(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.secret = str;
    }

    public final String getUserApps() {
        return this.userApps;
    }

    public final void setUserApps(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userApps = str;
    }

    public final String getAppTheme() {
        return this.appTheme;
    }

    public final void setAppTheme(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appTheme = str;
    }

    public final boolean getDarkTheme(Composer composer, int i) {
        composer.startReplaceableGroup(1622430769);
        ComposerKt.sourceInformation(composer, "C(getDarkTheme)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1622430769, i, -1, "cn.jianyun.workplan.model.AppConfigModel.getDarkTheme (AppConfigModel.kt:14)");
        }
        if (Intrinsics.areEqual(this.appTheme, "auto")) {
            boolean zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return zIsSystemInDarkTheme;
        }
        boolean zAreEqual = Intrinsics.areEqual(this.appTheme, "dark");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return zAreEqual;
    }
}