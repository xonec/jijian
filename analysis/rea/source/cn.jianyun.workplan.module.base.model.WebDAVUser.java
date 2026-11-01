package cn.jianyun.workplan.module.base.model;

import androidx.autofill.HintConstants;
import cn.jianyun.workplan.util.MyEncryptTool;
import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: WebDAVUser.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b;\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b¢\u0006\u0002\u0010\u0012J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u000eHÆ\u0003J\t\u00105\u001a\u00020\u000bHÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u000bHÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u000bHÆ\u0003J\t\u0010?\u001a\u00020\u000bHÆ\u0003J\u008b\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u000bHÆ\u0001J\u0013\u0010A\u001a\u00020\u000b2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020\u000eHÖ\u0001J\u0006\u0010D\u001a\u00020\u000bJ\u0006\u0010E\u001a\u00020\u0003J\u0006\u0010F\u001a\u00020\u0003J\u0006\u0010G\u001a\u00020\u0003J\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0011\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR\u001a\u0010\u000f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010\u001cR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u0010\u001c¨\u0006I"}, d2 = {"Lcn/jianyun/workplan/module/base/model/WebDAVUser;", "", "uuid", "", "url", HintConstants.AUTOFILL_HINT_USERNAME, HintConstants.AUTOFILL_HINT_PASSWORD, "platform", "type", "defaultPath", "masterNode", "", "bind", "ordinal", "", "shown", "message", "cloud", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZIZLjava/lang/String;Z)V", "getBind", "()Z", "setBind", "(Z)V", "getCloud", "setCloud", "getDefaultPath", "()Ljava/lang/String;", "setDefaultPath", "(Ljava/lang/String;)V", "getMasterNode", "setMasterNode", "getMessage", "setMessage", "getOrdinal", "()I", "setOrdinal", "(I)V", "getPassword", "setPassword", "getPlatform", "setPlatform", "getShown", "setShown", "getType", "setType", "getUrl", "setUrl", "getUsername", "setUsername", "getUuid", "setUuid", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", AdType.TYPE_OTHER, "hashCode", "isAdd", "isValid", "nodeInfo", "resolvePassword", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WebDAVUser {
    public static final int $stable = 8;
    private boolean bind;
    private boolean cloud;
    private String defaultPath;
    private boolean masterNode;
    private String message;
    private int ordinal;
    private String password;
    private String platform;
    private boolean shown;
    private String type;
    private String url;
    private String username;
    private String uuid;

    public WebDAVUser() {
        this(null, null, null, null, null, null, null, false, false, 0, false, null, false, 8191, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getOrdinal() {
        return this.ordinal;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getShown() {
        return this.shown;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getCloud() {
        return this.cloud;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDefaultPath() {
        return this.defaultPath;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getMasterNode() {
        return this.masterNode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getBind() {
        return this.bind;
    }

    public final WebDAVUser copy(String uuid, String url, String username, String password, String platform, String type, String defaultPath, boolean masterNode, boolean bind, int ordinal, boolean shown, String message, boolean cloud) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(defaultPath, "defaultPath");
        Intrinsics.checkNotNullParameter(message, "message");
        return new WebDAVUser(uuid, url, username, password, platform, type, defaultPath, masterNode, bind, ordinal, shown, message, cloud);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebDAVUser)) {
            return false;
        }
        WebDAVUser webDAVUser = (WebDAVUser) other;
        return Intrinsics.areEqual(this.uuid, webDAVUser.uuid) && Intrinsics.areEqual(this.url, webDAVUser.url) && Intrinsics.areEqual(this.username, webDAVUser.username) && Intrinsics.areEqual(this.password, webDAVUser.password) && Intrinsics.areEqual(this.platform, webDAVUser.platform) && Intrinsics.areEqual(this.type, webDAVUser.type) && Intrinsics.areEqual(this.defaultPath, webDAVUser.defaultPath) && this.masterNode == webDAVUser.masterNode && this.bind == webDAVUser.bind && this.ordinal == webDAVUser.ordinal && this.shown == webDAVUser.shown && Intrinsics.areEqual(this.message, webDAVUser.message) && this.cloud == webDAVUser.cloud;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v25, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((((this.uuid.hashCode() * 31) + this.url.hashCode()) * 31) + this.username.hashCode()) * 31) + this.password.hashCode()) * 31) + this.platform.hashCode()) * 31) + this.type.hashCode()) * 31) + this.defaultPath.hashCode()) * 31;
        boolean z = this.masterNode;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.bind;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int iHashCode2 = (((i + r2) * 31) + Integer.hashCode(this.ordinal)) * 31;
        boolean z3 = this.shown;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int iHashCode3 = (((iHashCode2 + r3) * 31) + this.message.hashCode()) * 31;
        boolean z4 = this.cloud;
        return iHashCode3 + (z4 ? 1 : z4);
    }

    public String toString() {
        return "WebDAVUser(uuid=" + this.uuid + ", url=" + this.url + ", username=" + this.username + ", password=" + this.password + ", platform=" + this.platform + ", type=" + this.type + ", defaultPath=" + this.defaultPath + ", masterNode=" + this.masterNode + ", bind=" + this.bind + ", ordinal=" + this.ordinal + ", shown=" + this.shown + ", message=" + this.message + ", cloud=" + this.cloud + ")";
    }

    public WebDAVUser(String uuid, String url, String username, String password, String platform, String type, String defaultPath, boolean z, boolean z2, int i, boolean z3, String message, boolean z4) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(defaultPath, "defaultPath");
        Intrinsics.checkNotNullParameter(message, "message");
        this.uuid = uuid;
        this.url = url;
        this.username = username;
        this.password = password;
        this.platform = platform;
        this.type = type;
        this.defaultPath = defaultPath;
        this.masterNode = z;
        this.bind = z2;
        this.ordinal = i;
        this.shown = z3;
        this.message = message;
        this.cloud = z4;
    }

    public /* synthetic */ WebDAVUser(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, int i, boolean z3, String str8, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "webDAV" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? false : z, (i2 & 256) != 0 ? false : z2, (i2 & 512) != 0 ? 0 : i, (i2 & 1024) != 0 ? true : z3, (i2 & 2048) == 0 ? str8 : "", (i2 & 4096) == 0 ? z4 : false);
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final void setUuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uuid = str;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    public final String getUsername() {
        return this.username;
    }

    public final void setUsername(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.username = str;
    }

    public final String getPassword() {
        return this.password;
    }

    public final void setPassword(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.password = str;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final void setPlatform(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.platform = str;
    }

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public final String getDefaultPath() {
        return this.defaultPath;
    }

    public final void setDefaultPath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.defaultPath = str;
    }

    public final boolean getMasterNode() {
        return this.masterNode;
    }

    public final void setMasterNode(boolean z) {
        this.masterNode = z;
    }

    public final boolean getBind() {
        return this.bind;
    }

    public final void setBind(boolean z) {
        this.bind = z;
    }

    public final int getOrdinal() {
        return this.ordinal;
    }

    public final void setOrdinal(int i) {
        this.ordinal = i;
    }

    public final boolean getShown() {
        return this.shown;
    }

    public final void setShown(boolean z) {
        this.shown = z;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    public final boolean getCloud() {
        return this.cloud;
    }

    public final void setCloud(boolean z) {
        this.cloud = z;
    }

    public final String nodeInfo() {
        return this.platform + this.username;
    }

    public final boolean isAdd() {
        return Intrinsics.areEqual(this.uuid, "");
    }

    public final String isValid() {
        return (Intrinsics.areEqual(StringsKt.trim((CharSequence) this.username).toString(), "") || Intrinsics.areEqual(StringsKt.trim((CharSequence) this.password).toString(), "")) ? "账号密码均不能为空" : "ok";
    }

    public final String resolvePassword() {
        String str;
        if (Intrinsics.areEqual(this.password, "") || (str = this.password) == null) {
            return "";
        }
        String strDecrypt = MyEncryptTool.decrypt(str);
        Intrinsics.checkNotNullExpressionValue(strDecrypt, "decrypt(password)");
        return strDecrypt;
    }
}