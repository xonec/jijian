package cn.jianyun.workplan.main.base.model;

import androidx.core.app.NotificationCompat;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.MyDateTool;
import com.alipay.sdk.m.c0.d;
import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NotifyInfo.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003JE\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010'\u001a\u00020(J\t\u0010)\u001a\u00020\nHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0006\u0010+\u001a\u00020\u0003R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017¨\u0006,"}, d2 = {"Lcn/jianyun/workplan/main/base/model/NotifyInfo;", "", "bizName", "", "title", "description", "notifyTime", NotificationCompat.CATEGORY_ALARM, "", "beforeMinute", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V", "getAlarm", "()Z", "setAlarm", "(Z)V", "getBeforeMinute", "()I", "setBeforeMinute", "(I)V", "getBizName", "()Ljava/lang/String;", "setBizName", "(Ljava/lang/String;)V", "getDescription", "setDescription", "getNotifyTime", "setNotifyTime", "getTitle", d.p, "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", AdType.TYPE_OTHER, "getRealTime", "", "hashCode", "toString", "uuid", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class NotifyInfo {
    public static final int $stable = 8;
    private boolean alarm;
    private int beforeMinute;
    private String bizName;
    private String description;
    private String notifyTime;
    private String title;

    public NotifyInfo() {
        this(null, null, null, null, false, 0, 63, null);
    }

    public static /* synthetic */ NotifyInfo copy$default(NotifyInfo notifyInfo, String str, String str2, String str3, String str4, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = notifyInfo.bizName;
        }
        if ((i2 & 2) != 0) {
            str2 = notifyInfo.title;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = notifyInfo.description;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            str4 = notifyInfo.notifyTime;
        }
        String str7 = str4;
        if ((i2 & 16) != 0) {
            z = notifyInfo.alarm;
        }
        boolean z2 = z;
        if ((i2 & 32) != 0) {
            i = notifyInfo.beforeMinute;
        }
        return notifyInfo.copy(str, str5, str6, str7, z2, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBizName() {
        return this.bizName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNotifyTime() {
        return this.notifyTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getAlarm() {
        return this.alarm;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getBeforeMinute() {
        return this.beforeMinute;
    }

    public final NotifyInfo copy(String bizName, String title, String description, String notifyTime, boolean alarm, int beforeMinute) {
        Intrinsics.checkNotNullParameter(bizName, "bizName");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(notifyTime, "notifyTime");
        return new NotifyInfo(bizName, title, description, notifyTime, alarm, beforeMinute);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotifyInfo)) {
            return false;
        }
        NotifyInfo notifyInfo = (NotifyInfo) other;
        return Intrinsics.areEqual(this.bizName, notifyInfo.bizName) && Intrinsics.areEqual(this.title, notifyInfo.title) && Intrinsics.areEqual(this.description, notifyInfo.description) && Intrinsics.areEqual(this.notifyTime, notifyInfo.notifyTime) && this.alarm == notifyInfo.alarm && this.beforeMinute == notifyInfo.beforeMinute;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    public int hashCode() {
        int iHashCode = ((((((this.bizName.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.notifyTime.hashCode()) * 31;
        boolean z = this.alarm;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode + r1) * 31) + Integer.hashCode(this.beforeMinute);
    }

    public String toString() {
        return "NotifyInfo(bizName=" + this.bizName + ", title=" + this.title + ", description=" + this.description + ", notifyTime=" + this.notifyTime + ", alarm=" + this.alarm + ", beforeMinute=" + this.beforeMinute + ")";
    }

    public NotifyInfo(String bizName, String title, String description, String notifyTime, boolean z, int i) {
        Intrinsics.checkNotNullParameter(bizName, "bizName");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(notifyTime, "notifyTime");
        this.bizName = bizName;
        this.title = title;
        this.description = description;
        this.notifyTime = notifyTime;
        this.alarm = z;
        this.beforeMinute = i;
    }

    public /* synthetic */ NotifyInfo(String str, String str2, String str3, String str4, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) == 0 ? str4 : "", (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? 0 : i);
    }

    public final String getBizName() {
        return this.bizName;
    }

    public final void setBizName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bizName = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.description = str;
    }

    public final String getNotifyTime() {
        return this.notifyTime;
    }

    public final void setNotifyTime(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.notifyTime = str;
    }

    public final boolean getAlarm() {
        return this.alarm;
    }

    public final void setAlarm(boolean z) {
        this.alarm = z;
    }

    public final int getBeforeMinute() {
        return this.beforeMinute;
    }

    public final void setBeforeMinute(int i) {
        this.beforeMinute = i;
    }

    public final long getRealTime() {
        long jCurrentTimeMillis = System.currentTimeMillis() - ((long) 100);
        if (this.notifyTime.length() == 10) {
            this.notifyTime += " 12:15:00";
        }
        try {
            if (this.notifyTime.length() != 19 && this.notifyTime.length() != 18 && this.notifyTime.length() != 17) {
                return this.notifyTime.length() == 16 ? MyDateTool.parseShortDateTimeString(this.notifyTime).getTime() : jCurrentTimeMillis;
            }
            return MyDateTool.parseDateTimeString(this.notifyTime).getTime();
        } catch (Exception unused) {
            CommonToolKt.mlog("other time", this.notifyTime);
            return jCurrentTimeMillis;
        }
    }

    public final String uuid() {
        return this.bizName + getRealTime();
    }
}