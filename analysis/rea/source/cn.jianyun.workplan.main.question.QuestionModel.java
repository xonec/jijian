package cn.jianyun.workplan.main.question;

import com.alipay.sdk.m.c0.d;
import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: QuestionViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006\u001f"}, d2 = {"Lcn/jianyun/workplan/main/question/QuestionModel;", "", "tag", "", "title", "content", "ordinal", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getOrdinal", "()I", "setOrdinal", "(I)V", "getTag", "setTag", "getTitle", d.p, "component1", "component2", "component3", "component4", "copy", "equals", "", AdType.TYPE_OTHER, "hashCode", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class QuestionModel {
    public static final int $stable = 8;
    private String content;
    private int ordinal;
    private String tag;
    private String title;

    public QuestionModel() {
        this(null, null, null, 0, 15, null);
    }

    public static /* synthetic */ QuestionModel copy$default(QuestionModel questionModel, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = questionModel.tag;
        }
        if ((i2 & 2) != 0) {
            str2 = questionModel.title;
        }
        if ((i2 & 4) != 0) {
            str3 = questionModel.content;
        }
        if ((i2 & 8) != 0) {
            i = questionModel.ordinal;
        }
        return questionModel.copy(str, str2, str3, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOrdinal() {
        return this.ordinal;
    }

    public final QuestionModel copy(String tag, String title, String content, int ordinal) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        return new QuestionModel(tag, title, content, ordinal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuestionModel)) {
            return false;
        }
        QuestionModel questionModel = (QuestionModel) other;
        return Intrinsics.areEqual(this.tag, questionModel.tag) && Intrinsics.areEqual(this.title, questionModel.title) && Intrinsics.areEqual(this.content, questionModel.content) && this.ordinal == questionModel.ordinal;
    }

    public int hashCode() {
        return (((((this.tag.hashCode() * 31) + this.title.hashCode()) * 31) + this.content.hashCode()) * 31) + Integer.hashCode(this.ordinal);
    }

    public String toString() {
        return "QuestionModel(tag=" + this.tag + ", title=" + this.title + ", content=" + this.content + ", ordinal=" + this.ordinal + ")";
    }

    public QuestionModel(String tag, String title, String content, int i) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        this.tag = tag;
        this.title = title;
        this.content = content;
        this.ordinal = i;
    }

    public /* synthetic */ QuestionModel(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i);
    }

    public final String getTag() {
        return this.tag;
    }

    public final void setTag(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tag = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final String getContent() {
        return this.content;
    }

    public final void setContent(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.content = str;
    }

    public final int getOrdinal() {
        return this.ordinal;
    }

    public final void setOrdinal(int i) {
        this.ordinal = i;
    }
}