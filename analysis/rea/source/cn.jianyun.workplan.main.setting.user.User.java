package cn.jianyun.workplan.main.setting.user;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import cn.jianyun.workplan.util.CommonDateToolKt;
import cn.jianyun.workplan.util.MyDateTool;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import com.tianmu.biz.bean.AdType;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: User.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b@\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0016HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003JÇ\u0001\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u0016HÆ\u0001J\u0013\u0010V\u001a\u00020W2\b\u0010X\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010Y\u001a\u00020ZJ\t\u0010[\u001a\u00020ZHÖ\u0001J\u0006\u0010\\\u001a\u00020WJ\u0006\u0010]\u001a\u00020\u0003J\u0006\u0010^\u001a\u00020\u0003J\u0006\u0010_\u001a\u00020WJ\u000e\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020\u0003J\u0006\u0010c\u001a\u00020\u0003J\t\u0010d\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001bR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0019\"\u0004\b/\u0010\u001bR\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0019\"\u0004\b3\u0010\u001bR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0019\"\u0004\b9\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0019\"\u0004\b;\u0010\u001bR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0019\"\u0004\b=\u0010\u001bR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0019\"\u0004\b?\u0010\u001bR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0019\"\u0004\bA\u0010\u001b¨\u0006e"}, d2 = {"Lcn/jianyun/workplan/main/setting/user/User;", "", "uuid", "", HintConstants.AUTOFILL_HINT_USERNAME, "nickname", NotificationCompat.CATEGORY_EMAIL, "avatar", "gmtCreate", "vipName", "vipDate", HintConstants.AUTOFILL_HINT_PASSWORD, "confirmPassword", "wechat", "qq", "city", "mobile", "cloudConfig", "application", "platform", "deviceId", "registTime", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getApplication", "()Ljava/lang/String;", "setApplication", "(Ljava/lang/String;)V", "getAvatar", "setAvatar", "getCity", "setCity", "getCloudConfig", "setCloudConfig", "getConfirmPassword", "setConfirmPassword", "getDeviceId", "setDeviceId", "getEmail", "setEmail", "getGmtCreate", "setGmtCreate", "getMobile", "setMobile", "getNickname", "setNickname", "getPassword", "setPassword", "getPlatform", "setPlatform", "getQq", "setQq", "getRegistTime", "()J", "setRegistTime", "(J)V", "getUsername", "setUsername", "getUuid", "setUuid", "getVipDate", "setVipDate", "getVipName", "setVipName", "getWechat", "setWechat", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", AdType.TYPE_OTHER, "getRegistDay", "", "hashCode", "isLogin", "isLoginValid", "isRegistValid", "isVip", "makeVip", "", "currentMode", "showName", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class User {
    public static final int $stable = 8;
    private String application;
    private String avatar;
    private String city;
    private String cloudConfig;
    private String confirmPassword;
    private String deviceId;
    private String email;
    private String gmtCreate;
    private String mobile;
    private String nickname;
    private String password;
    private String platform;
    private String qq;
    private long registTime;
    private String username;
    private String uuid;
    private String vipDate;
    private String vipName;
    private String wechat;

    public User() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, 524287, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getConfirmPassword() {
        return this.confirmPassword;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getWechat() {
        return this.wechat;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getQq() {
        return this.qq;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getMobile() {
        return this.mobile;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getCloudConfig() {
        return this.cloudConfig;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getApplication() {
        return this.application;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final long getRegistTime() {
        return this.registTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getGmtCreate() {
        return this.gmtCreate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getVipName() {
        return this.vipName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getVipDate() {
        return this.vipDate;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    public final User copy(String uuid, String username, String nickname, String email, String avatar, String gmtCreate, String vipName, String vipDate, String password, String confirmPassword, String wechat, String qq, String city, String mobile, String cloudConfig, String application, String platform, String deviceId, long registTime) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(gmtCreate, "gmtCreate");
        Intrinsics.checkNotNullParameter(vipName, "vipName");
        Intrinsics.checkNotNullParameter(vipDate, "vipDate");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(confirmPassword, "confirmPassword");
        Intrinsics.checkNotNullParameter(wechat, "wechat");
        Intrinsics.checkNotNullParameter(qq, "qq");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(mobile, "mobile");
        Intrinsics.checkNotNullParameter(cloudConfig, "cloudConfig");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        return new User(uuid, username, nickname, email, avatar, gmtCreate, vipName, vipDate, password, confirmPassword, wechat, qq, city, mobile, cloudConfig, application, platform, deviceId, registTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof User)) {
            return false;
        }
        User user = (User) other;
        return Intrinsics.areEqual(this.uuid, user.uuid) && Intrinsics.areEqual(this.username, user.username) && Intrinsics.areEqual(this.nickname, user.nickname) && Intrinsics.areEqual(this.email, user.email) && Intrinsics.areEqual(this.avatar, user.avatar) && Intrinsics.areEqual(this.gmtCreate, user.gmtCreate) && Intrinsics.areEqual(this.vipName, user.vipName) && Intrinsics.areEqual(this.vipDate, user.vipDate) && Intrinsics.areEqual(this.password, user.password) && Intrinsics.areEqual(this.confirmPassword, user.confirmPassword) && Intrinsics.areEqual(this.wechat, user.wechat) && Intrinsics.areEqual(this.qq, user.qq) && Intrinsics.areEqual(this.city, user.city) && Intrinsics.areEqual(this.mobile, user.mobile) && Intrinsics.areEqual(this.cloudConfig, user.cloudConfig) && Intrinsics.areEqual(this.application, user.application) && Intrinsics.areEqual(this.platform, user.platform) && Intrinsics.areEqual(this.deviceId, user.deviceId) && this.registTime == user.registTime;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((this.uuid.hashCode() * 31) + this.username.hashCode()) * 31) + this.nickname.hashCode()) * 31) + this.email.hashCode()) * 31) + this.avatar.hashCode()) * 31) + this.gmtCreate.hashCode()) * 31) + this.vipName.hashCode()) * 31) + this.vipDate.hashCode()) * 31) + this.password.hashCode()) * 31) + this.confirmPassword.hashCode()) * 31) + this.wechat.hashCode()) * 31) + this.qq.hashCode()) * 31) + this.city.hashCode()) * 31) + this.mobile.hashCode()) * 31) + this.cloudConfig.hashCode()) * 31) + this.application.hashCode()) * 31) + this.platform.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + Long.hashCode(this.registTime);
    }

    public String toString() {
        return "User(uuid=" + this.uuid + ", username=" + this.username + ", nickname=" + this.nickname + ", email=" + this.email + ", avatar=" + this.avatar + ", gmtCreate=" + this.gmtCreate + ", vipName=" + this.vipName + ", vipDate=" + this.vipDate + ", password=" + this.password + ", confirmPassword=" + this.confirmPassword + ", wechat=" + this.wechat + ", qq=" + this.qq + ", city=" + this.city + ", mobile=" + this.mobile + ", cloudConfig=" + this.cloudConfig + ", application=" + this.application + ", platform=" + this.platform + ", deviceId=" + this.deviceId + ", registTime=" + this.registTime + ")";
    }

    public User(String uuid, String username, String nickname, String email, String avatar, String gmtCreate, String vipName, String vipDate, String password, String confirmPassword, String wechat, String qq, String city, String mobile, String cloudConfig, String application, String platform, String deviceId, long j) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(gmtCreate, "gmtCreate");
        Intrinsics.checkNotNullParameter(vipName, "vipName");
        Intrinsics.checkNotNullParameter(vipDate, "vipDate");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(confirmPassword, "confirmPassword");
        Intrinsics.checkNotNullParameter(wechat, "wechat");
        Intrinsics.checkNotNullParameter(qq, "qq");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(mobile, "mobile");
        Intrinsics.checkNotNullParameter(cloudConfig, "cloudConfig");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        this.uuid = uuid;
        this.username = username;
        this.nickname = nickname;
        this.email = email;
        this.avatar = avatar;
        this.gmtCreate = gmtCreate;
        this.vipName = vipName;
        this.vipDate = vipDate;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.wechat = wechat;
        this.qq = qq;
        this.city = city;
        this.mobile = mobile;
        this.cloudConfig = cloudConfig;
        this.application = application;
        this.platform = platform;
        this.deviceId = deviceId;
        this.registTime = j;
    }

    public /* synthetic */ User(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? 0L : j);
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final void setUuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uuid = str;
    }

    public final String getUsername() {
        return this.username;
    }

    public final void setUsername(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.username = str;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final void setNickname(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nickname = str;
    }

    public final String getEmail() {
        return this.email;
    }

    public final void setEmail(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email = str;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final void setAvatar(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.avatar = str;
    }

    public final String getGmtCreate() {
        return this.gmtCreate;
    }

    public final void setGmtCreate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.gmtCreate = str;
    }

    public final String getVipName() {
        return this.vipName;
    }

    public final void setVipName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.vipName = str;
    }

    public final String getVipDate() {
        return this.vipDate;
    }

    public final void setVipDate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.vipDate = str;
    }

    public final String getPassword() {
        return this.password;
    }

    public final void setPassword(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.password = str;
    }

    public final String getConfirmPassword() {
        return this.confirmPassword;
    }

    public final void setConfirmPassword(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.confirmPassword = str;
    }

    public final String getWechat() {
        return this.wechat;
    }

    public final void setWechat(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wechat = str;
    }

    public final String getQq() {
        return this.qq;
    }

    public final void setQq(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.qq = str;
    }

    public final String getCity() {
        return this.city;
    }

    public final void setCity(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.city = str;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final void setMobile(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobile = str;
    }

    public final String getCloudConfig() {
        return this.cloudConfig;
    }

    public final void setCloudConfig(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cloudConfig = str;
    }

    public final String getApplication() {
        return this.application;
    }

    public final void setApplication(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.application = str;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final void setPlatform(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.platform = str;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final void setDeviceId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceId = str;
    }

    public final long getRegistTime() {
        return this.registTime;
    }

    public final void setRegistTime(long j) {
        this.registTime = j;
    }

    public final boolean isLogin() {
        return (Intrinsics.areEqual(this.uuid, "") || Intrinsics.areEqual(this.username, "")) ? false : true;
    }

    public final boolean isVip() {
        return (Intrinsics.areEqual(this.vipDate, "永久") || CommonDateToolKt.parseDate(this.vipDate).compareTo(new Date()) > 0) && !Intrinsics.areEqual(this.vipName, "");
    }

    public final String showName() {
        if (!Intrinsics.areEqual(this.nickname, "")) {
            return this.nickname;
        }
        return this.username;
    }

    public final String isLoginValid() {
        if (Intrinsics.areEqual(StringsKt.trim((CharSequence) this.username).toString(), "")) {
            return "账号不能为空";
        }
        return Intrinsics.areEqual(StringsKt.trim((CharSequence) this.password).toString(), "") ? "密码不能为空" : "ok";
    }

    public final int getRegistDay() {
        long time = this.registTime;
        if (time == 0) {
            Date dateTimeString = MyDateTool.parseDateTimeString(this.gmtCreate);
            time = dateTimeString != null ? dateTimeString.getTime() : 0L;
        }
        if (time == 0) {
            return 0;
        }
        return MyDateTool.getBetweenDays(time, System.currentTimeMillis());
    }

    public final String isRegistValid() {
        if (Intrinsics.areEqual(StringsKt.trim((CharSequence) this.username).toString(), "")) {
            return "账号不能为空";
        }
        if (Intrinsics.areEqual(StringsKt.trim((CharSequence) this.password).toString(), "")) {
            return "密码不能为空";
        }
        if (Intrinsics.areEqual(this.confirmPassword, "")) {
            return "确认密码不能为空";
        }
        if (this.password.length() < 6) {
            return "密码长度不能少于6位";
        }
        return !Intrinsics.areEqual(this.password, this.confirmPassword) ? "确认密码不正确" : "ok";
    }

    public final void makeVip(String currentMode) {
        Intrinsics.checkNotNullParameter(currentMode, "currentMode");
        Date date = CommonDateToolKt.parseDate(this.vipDate);
        if (Intrinsics.areEqual(currentMode, "forever")) {
            this.vipName = "永久会员V3";
            this.vipDate = "永久";
        }
        if (Intrinsics.areEqual(currentMode, "year") && !Intrinsics.areEqual(this.vipName, "永久会员V3")) {
            this.vipName = "年度会员V2";
            this.vipDate = CommonDateToolKt.dateStr(CommonDateToolKt.gapDay(date, MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_LOADCONTROL_BUFFERINGTIMEOUT));
        }
        if (!Intrinsics.areEqual(currentMode, "month") || Intrinsics.areEqual(this.vipName, "永久会员V3") || Intrinsics.areEqual(this.vipName, "年度会员V2")) {
            return;
        }
        this.vipName = "月度会员V1";
        this.vipDate = CommonDateToolKt.dateStr(CommonDateToolKt.gapDay(date, 31));
    }
}