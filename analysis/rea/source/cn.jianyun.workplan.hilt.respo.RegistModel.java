package cn.jianyun.workplan.hilt.respo;

import android.os.Parcel;
import android.os.Parcelable;
import cn.jianyun.workplan.util.MyDateTool;
import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RegistModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\u0006\u0010\u0010\u001a\u00020\u000bJ\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0006\u0010\u0012\u001a\u00020\rJ\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000bHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u001a"}, d2 = {"Lcn/jianyun/workplan/hilt/respo/RegistModel;", "Landroid/os/Parcelable;", "registTime", "", "(J)V", "getRegistTime", "()J", "setRegistTime", "component1", "copy", "describeContents", "", "equals", "", AdType.TYPE_OTHER, "", "getRegistDay", "hashCode", "isRegist", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RegistModel implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RegistModel> CREATOR = new Creator();
    private long registTime;

    /* JADX INFO: compiled from: RegistModel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RegistModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RegistModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RegistModel(parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RegistModel[] newArray(int i) {
            return new RegistModel[i];
        }
    }

    public RegistModel() {
        this(0L, 1, null);
    }

    public static /* synthetic */ RegistModel copy$default(RegistModel registModel, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = registModel.registTime;
        }
        return registModel.copy(j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getRegistTime() {
        return this.registTime;
    }

    public final RegistModel copy(long registTime) {
        return new RegistModel(registTime);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RegistModel) && this.registTime == ((RegistModel) other).registTime;
    }

    public int hashCode() {
        return Long.hashCode(this.registTime);
    }

    public String toString() {
        return "RegistModel(registTime=" + this.registTime + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeLong(this.registTime);
    }

    public RegistModel(long j) {
        this.registTime = j;
    }

    public /* synthetic */ RegistModel(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j);
    }

    public final long getRegistTime() {
        return this.registTime;
    }

    public final void setRegistTime(long j) {
        this.registTime = j;
    }

    public final boolean isRegist() {
        return this.registTime > 0;
    }

    public final int getRegistDay() {
        return MyDateTool.getBetweenDays(this.registTime, System.currentTimeMillis());
    }
}