package cn.jianyun.workplan.api;

import com.tianmu.biz.bean.AdType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FeedbackModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b=\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B¿\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u0015¢\u0006\u0002\u0010\u0016J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u000f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00000\u0015HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003JÃ\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u0015HÆ\u0001J\u0013\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010U\u001a\u00020VHÖ\u0001J\u0006\u0010W\u001a\u00020SJ\u0006\u0010X\u001a\u00020SJ\u0006\u0010Y\u001a\u00020\u0003J\u0006\u0010Z\u001a\u00020\u0003J\t\u0010[\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001aR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0018\"\u0004\b4\u0010\u001aR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0018\"\u0004\b6\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0018\"\u0004\b8\u0010\u001aR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0018\"\u0004\b:\u0010\u001aR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0018\"\u0004\b<\u0010\u001aR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0018\"\u0004\b>\u0010\u001a¨\u0006\\"}, d2 = {"Lcn/jianyun/workplan/api/FeedbackModel;", "", "uuid", "", "puuid", "platform", "app", "module", "userId", "nickname", "content", "type", "image", "vip", "root", "answer", "readed", "common", "rootId", "gmtCreate", "children", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAnswer", "()Ljava/lang/String;", "setAnswer", "(Ljava/lang/String;)V", "getApp", "setApp", "getChildren", "()Ljava/util/List;", "setChildren", "(Ljava/util/List;)V", "getCommon", "setCommon", "getContent", "setContent", "getGmtCreate", "setGmtCreate", "getImage", "setImage", "getModule", "setModule", "getNickname", "setNickname", "getPlatform", "setPlatform", "getPuuid", "setPuuid", "getReaded", "setReaded", "getRoot", "setRoot", "getRootId", "setRootId", "getType", "setType", "getUserId", "setUserId", "getUuid", "setUuid", "getVip", "setVip", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", AdType.TYPE_OTHER, "hashCode", "", "isAdd", "isAdmin", "isValid", "shortTime", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FeedbackModel {
    public static final int $stable = 8;
    private String answer;
    private String app;
    private List<FeedbackModel> children;
    private String common;
    private String content;
    private String gmtCreate;
    private String image;
    private String module;
    private String nickname;
    private String platform;
    private String puuid;
    private String readed;
    private String root;
    private String rootId;
    private String type;
    private String userId;
    private String uuid;
    private String vip;

    public FeedbackModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getVip() {
        return this.vip;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getRoot() {
        return this.root;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getAnswer() {
        return this.answer;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getReaded() {
        return this.readed;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getCommon() {
        return this.common;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getRootId() {
        return this.rootId;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getGmtCreate() {
        return this.gmtCreate;
    }

    public final List<FeedbackModel> component18() {
        return this.children;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPuuid() {
        return this.puuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getApp() {
        return this.app;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getModule() {
        return this.module;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final FeedbackModel copy(String uuid, String puuid, String platform, String app, String module, String userId, String nickname, String content, String type, String image, String vip, String root, String answer, String readed, String common, String rootId, String gmtCreate, List<FeedbackModel> children) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(puuid, "puuid");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(vip, "vip");
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(readed, "readed");
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(rootId, "rootId");
        Intrinsics.checkNotNullParameter(gmtCreate, "gmtCreate");
        Intrinsics.checkNotNullParameter(children, "children");
        return new FeedbackModel(uuid, puuid, platform, app, module, userId, nickname, content, type, image, vip, root, answer, readed, common, rootId, gmtCreate, children);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedbackModel)) {
            return false;
        }
        FeedbackModel feedbackModel = (FeedbackModel) other;
        return Intrinsics.areEqual(this.uuid, feedbackModel.uuid) && Intrinsics.areEqual(this.puuid, feedbackModel.puuid) && Intrinsics.areEqual(this.platform, feedbackModel.platform) && Intrinsics.areEqual(this.app, feedbackModel.app) && Intrinsics.areEqual(this.module, feedbackModel.module) && Intrinsics.areEqual(this.userId, feedbackModel.userId) && Intrinsics.areEqual(this.nickname, feedbackModel.nickname) && Intrinsics.areEqual(this.content, feedbackModel.content) && Intrinsics.areEqual(this.type, feedbackModel.type) && Intrinsics.areEqual(this.image, feedbackModel.image) && Intrinsics.areEqual(this.vip, feedbackModel.vip) && Intrinsics.areEqual(this.root, feedbackModel.root) && Intrinsics.areEqual(this.answer, feedbackModel.answer) && Intrinsics.areEqual(this.readed, feedbackModel.readed) && Intrinsics.areEqual(this.common, feedbackModel.common) && Intrinsics.areEqual(this.rootId, feedbackModel.rootId) && Intrinsics.areEqual(this.gmtCreate, feedbackModel.gmtCreate) && Intrinsics.areEqual(this.children, feedbackModel.children);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.uuid.hashCode() * 31) + this.puuid.hashCode()) * 31) + this.platform.hashCode()) * 31) + this.app.hashCode()) * 31) + this.module.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.nickname.hashCode()) * 31) + this.content.hashCode()) * 31) + this.type.hashCode()) * 31) + this.image.hashCode()) * 31) + this.vip.hashCode()) * 31) + this.root.hashCode()) * 31) + this.answer.hashCode()) * 31) + this.readed.hashCode()) * 31) + this.common.hashCode()) * 31) + this.rootId.hashCode()) * 31) + this.gmtCreate.hashCode()) * 31) + this.children.hashCode();
    }

    public String toString() {
        return "FeedbackModel(uuid=" + this.uuid + ", puuid=" + this.puuid + ", platform=" + this.platform + ", app=" + this.app + ", module=" + this.module + ", userId=" + this.userId + ", nickname=" + this.nickname + ", content=" + this.content + ", type=" + this.type + ", image=" + this.image + ", vip=" + this.vip + ", root=" + this.root + ", answer=" + this.answer + ", readed=" + this.readed + ", common=" + this.common + ", rootId=" + this.rootId + ", gmtCreate=" + this.gmtCreate + ", children=" + this.children + ")";
    }

    public FeedbackModel(String uuid, String puuid, String platform, String app, String module, String userId, String nickname, String content, String type, String image, String vip, String root, String answer, String readed, String common, String rootId, String gmtCreate, List<FeedbackModel> children) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(puuid, "puuid");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(vip, "vip");
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(readed, "readed");
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(rootId, "rootId");
        Intrinsics.checkNotNullParameter(gmtCreate, "gmtCreate");
        Intrinsics.checkNotNullParameter(children, "children");
        this.uuid = uuid;
        this.puuid = puuid;
        this.platform = platform;
        this.app = app;
        this.module = module;
        this.userId = userId;
        this.nickname = nickname;
        this.content = content;
        this.type = type;
        this.image = image;
        this.vip = vip;
        this.root = root;
        this.answer = answer;
        this.readed = readed;
        this.common = common;
        this.rootId = rootId;
        this.gmtCreate = gmtCreate;
        this.children = children;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final void setUuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uuid = str;
    }

    public final String getPuuid() {
        return this.puuid;
    }

    public final void setPuuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.puuid = str;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final void setPlatform(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.platform = str;
    }

    public final String getApp() {
        return this.app;
    }

    public final void setApp(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.app = str;
    }

    public final String getModule() {
        return this.module;
    }

    public final void setModule(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.module = str;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final void setUserId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final void setNickname(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nickname = str;
    }

    public final String getContent() {
        return this.content;
    }

    public final void setContent(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.content = str;
    }

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public final String getImage() {
        return this.image;
    }

    public final void setImage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.image = str;
    }

    public final String getVip() {
        return this.vip;
    }

    public final void setVip(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.vip = str;
    }

    public final String getRoot() {
        return this.root;
    }

    public final void setRoot(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.root = str;
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final void setAnswer(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.answer = str;
    }

    public final String getReaded() {
        return this.readed;
    }

    public final void setReaded(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.readed = str;
    }

    public final String getCommon() {
        return this.common;
    }

    public final void setCommon(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.common = str;
    }

    public final String getRootId() {
        return this.rootId;
    }

    public final void setRootId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rootId = str;
    }

    public final String getGmtCreate() {
        return this.gmtCreate;
    }

    public final void setGmtCreate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.gmtCreate = str;
    }

    public /* synthetic */ FeedbackModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<FeedbackModel> getChildren() {
        return this.children;
    }

    public final void setChildren(List<FeedbackModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.children = list;
    }

    public final boolean isAdd() {
        return Intrinsics.areEqual(this.uuid, "");
    }

    public final boolean isAdmin() {
        return Intrinsics.areEqual(this.userId, "admin");
    }

    public final String isValid() {
        if (Intrinsics.areEqual(this.module, "")) {
            return "反馈模块不能为空";
        }
        if (Intrinsics.areEqual(this.type, "")) {
            return "反馈类型不能为空";
        }
        return Intrinsics.areEqual(this.content, "") ? "内容不能为空" : "ok";
    }

    public final String shortTime() {
        if (this.gmtCreate.length() <= 14) {
            return "";
        }
        String strSubstring = this.gmtCreate.substring(5, 16);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }
}