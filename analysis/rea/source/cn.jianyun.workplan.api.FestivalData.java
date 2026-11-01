package cn.jianyun.workplan.api;

import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.xmlbeans.XmlErrorCodes;

/* JADX INFO: compiled from: BaseApi.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcn/jianyun/workplan/api/FestivalData;", "", "holiday", "", "name", "", XmlErrorCodes.DATE, "(ZLjava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "getHoliday", "()Z", "setHoliday", "(Z)V", "getName", "setName", "component1", "component2", "component3", "copy", "equals", AdType.TYPE_OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FestivalData {
    public static final int $stable = 8;
    private String date;
    private boolean holiday;
    private String name;

    public FestivalData() {
        this(false, null, null, 7, null);
    }

    public static /* synthetic */ FestivalData copy$default(FestivalData festivalData, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = festivalData.holiday;
        }
        if ((i & 2) != 0) {
            str = festivalData.name;
        }
        if ((i & 4) != 0) {
            str2 = festivalData.date;
        }
        return festivalData.copy(z, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHoliday() {
        return this.holiday;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    public final FestivalData copy(boolean holiday, String name, String date) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(date, "date");
        return new FestivalData(holiday, name, date);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FestivalData)) {
            return false;
        }
        FestivalData festivalData = (FestivalData) other;
        return this.holiday == festivalData.holiday && Intrinsics.areEqual(this.name, festivalData.name) && Intrinsics.areEqual(this.date, festivalData.date);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.holiday;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + this.name.hashCode()) * 31) + this.date.hashCode();
    }

    public String toString() {
        return "FestivalData(holiday=" + this.holiday + ", name=" + this.name + ", date=" + this.date + ")";
    }

    public FestivalData(boolean z, String name, String date) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(date, "date");
        this.holiday = z;
        this.name = name;
        this.date = date;
    }

    public /* synthetic */ FestivalData(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }

    public final boolean getHoliday() {
        return this.holiday;
    }

    public final void setHoliday(boolean z) {
        this.holiday = z;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final String getDate() {
        return this.date;
    }

    public final void setDate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.date = str;
    }
}