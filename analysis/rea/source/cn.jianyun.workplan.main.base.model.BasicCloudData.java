package cn.jianyun.workplan.main.base.model;

import cn.jianyun.workplan.util.CommonDateToolKt;
import cn.jianyun.workplan.util.MyDataTool;
import com.tianmu.biz.bean.AdType;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.logging.log4j.util.ProcessIdUtil;
import org.apache.xmlbeans.XmlErrorCodes;

/* JADX INFO: compiled from: BasicCloudData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u001f\u001a\u00020\u0003J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\u0006\u0010%\u001a\u00020\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006'"}, d2 = {"Lcn/jianyun/workplan/main/base/model/BasicCloudData;", "", "fileName", "", "size", "count", XmlErrorCodes.DATE, "content", "source", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getCount", "setCount", "getDate", "setDate", "getFileName", "setFileName", "getSize", "setSize", "getSource", "setSource", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "dateInfo", "equals", "", AdType.TYPE_OTHER, "hashCode", "", "sizeInfo", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class BasicCloudData {
    public static final int $stable = 8;
    private String content;
    private String count;
    private String date;
    private String fileName;
    private String size;
    private String source;

    public BasicCloudData() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ BasicCloudData copy$default(BasicCloudData basicCloudData, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = basicCloudData.fileName;
        }
        if ((i & 2) != 0) {
            str2 = basicCloudData.size;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = basicCloudData.count;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = basicCloudData.date;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = basicCloudData.content;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = basicCloudData.source;
        }
        return basicCloudData.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final BasicCloudData copy(String fileName, String size, String count, String date, String content, String source) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(count, "count");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(source, "source");
        return new BasicCloudData(fileName, size, count, date, content, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasicCloudData)) {
            return false;
        }
        BasicCloudData basicCloudData = (BasicCloudData) other;
        return Intrinsics.areEqual(this.fileName, basicCloudData.fileName) && Intrinsics.areEqual(this.size, basicCloudData.size) && Intrinsics.areEqual(this.count, basicCloudData.count) && Intrinsics.areEqual(this.date, basicCloudData.date) && Intrinsics.areEqual(this.content, basicCloudData.content) && Intrinsics.areEqual(this.source, basicCloudData.source);
    }

    public int hashCode() {
        return (((((((((this.fileName.hashCode() * 31) + this.size.hashCode()) * 31) + this.count.hashCode()) * 31) + this.date.hashCode()) * 31) + this.content.hashCode()) * 31) + this.source.hashCode();
    }

    public String toString() {
        return "BasicCloudData(fileName=" + this.fileName + ", size=" + this.size + ", count=" + this.count + ", date=" + this.date + ", content=" + this.content + ", source=" + this.source + ")";
    }

    public BasicCloudData(String fileName, String size, String count, String date, String content, String source) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(count, "count");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(source, "source");
        this.fileName = fileName;
        this.size = size;
        this.count = count;
        this.date = date;
        this.content = content;
        this.source = source;
    }

    public /* synthetic */ BasicCloudData(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final void setFileName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fileName = str;
    }

    public final String getSize() {
        return this.size;
    }

    public final void setSize(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.size = str;
    }

    public final String getCount() {
        return this.count;
    }

    public final void setCount(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.count = str;
    }

    public final String getDate() {
        return this.date;
    }

    public final void setDate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.date = str;
    }

    public final String getContent() {
        return this.content;
    }

    public final void setContent(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.content = str;
    }

    public final String getSource() {
        return this.source;
    }

    public final void setSource(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.source = str;
    }

    public final String sizeInfo() {
        String fileSize = MyDataTool.getFileSize(this.size);
        Intrinsics.checkNotNullExpressionValue(fileSize, "getFileSize(size)");
        return fileSize;
    }

    public final String dateInfo() {
        try {
            return CommonDateToolKt.datetimeStr(new Date(Long.parseLong(this.date)));
        } catch (Exception unused) {
            return ProcessIdUtil.DEFAULT_PROCESSID;
        }
    }
}