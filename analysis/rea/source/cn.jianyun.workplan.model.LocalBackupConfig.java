package cn.jianyun.workplan.model;

import com.meishu.sdk.core.MSAdConfig;
import com.tianmu.biz.bean.AdType;
import com.wangmai.permission.androidsupport.FileProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LocalBackupConfig.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcn/jianyun/workplan/model/LocalBackupConfig;", "", FileProvider.ATTR_PATH, "", "autoBackup", "", "autoFile", "(Ljava/lang/String;ZLjava/lang/String;)V", "getAutoBackup", "()Z", "setAutoBackup", "(Z)V", "getAutoFile", "()Ljava/lang/String;", "setAutoFile", "(Ljava/lang/String;)V", "getPath", "setPath", "component1", "component2", "component3", "copy", "equals", AdType.TYPE_OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class LocalBackupConfig {
    public static final int $stable = 8;
    private boolean autoBackup;
    private String autoFile;
    private String path;

    public LocalBackupConfig() {
        this(null, false, null, 7, null);
    }

    public static /* synthetic */ LocalBackupConfig copy$default(LocalBackupConfig localBackupConfig, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localBackupConfig.path;
        }
        if ((i & 2) != 0) {
            z = localBackupConfig.autoBackup;
        }
        if ((i & 4) != 0) {
            str2 = localBackupConfig.autoFile;
        }
        return localBackupConfig.copy(str, z, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getAutoBackup() {
        return this.autoBackup;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAutoFile() {
        return this.autoFile;
    }

    public final LocalBackupConfig copy(String path, boolean autoBackup, String autoFile) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(autoFile, "autoFile");
        return new LocalBackupConfig(path, autoBackup, autoFile);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalBackupConfig)) {
            return false;
        }
        LocalBackupConfig localBackupConfig = (LocalBackupConfig) other;
        return Intrinsics.areEqual(this.path, localBackupConfig.path) && this.autoBackup == localBackupConfig.autoBackup && Intrinsics.areEqual(this.autoFile, localBackupConfig.autoFile);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = this.path.hashCode() * 31;
        boolean z = this.autoBackup;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode + r1) * 31) + this.autoFile.hashCode();
    }

    public String toString() {
        return "LocalBackupConfig(path=" + this.path + ", autoBackup=" + this.autoBackup + ", autoFile=" + this.autoFile + ")";
    }

    public LocalBackupConfig(String path, boolean z, String autoFile) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(autoFile, "autoFile");
        this.path = path;
        this.autoBackup = z;
        this.autoFile = autoFile;
    }

    public /* synthetic */ LocalBackupConfig(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? MSAdConfig.GENDER_FEMALE : str2);
    }

    public final String getPath() {
        return this.path;
    }

    public final void setPath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.path = str;
    }

    public final boolean getAutoBackup() {
        return this.autoBackup;
    }

    public final void setAutoBackup(boolean z) {
        this.autoBackup = z;
    }

    public final String getAutoFile() {
        return this.autoFile;
    }

    public final void setAutoFile(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.autoFile = str;
    }
}