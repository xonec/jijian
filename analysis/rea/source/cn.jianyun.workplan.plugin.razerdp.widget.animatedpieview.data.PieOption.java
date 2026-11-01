package cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.data;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public class PieOption implements Parcelable {
    public static final Parcelable.Creator<PieOption> CREATOR = new Parcelable.Creator<PieOption>() { // from class: cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.data.PieOption.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PieOption createFromParcel(Parcel in) {
            return new PieOption(in);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PieOption[] newArray(int size) {
            return new PieOption[size];
        }
    };
    public static final int FAR_FROM_PIE = 17;
    public static final int NEAR_PIE = 16;
    boolean mDefaultSelected;
    float mIconHeight;
    float mIconScaledHeight;
    float mIconScaledWidth;
    float mIconWidth;
    Bitmap mLabelIcon;
    int mLabelPadding;
    int mLabelPosition;
    Typeface mTypeFace;

    @Retention(RetentionPolicy.SOURCE)
    public @interface LabelPosition {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PieOption() {
        this.mLabelPosition = 17;
        this.mLabelPadding = 10;
    }

    protected PieOption(Parcel in) {
        this.mLabelPosition = 17;
        this.mLabelPadding = 10;
        this.mLabelIcon = (Bitmap) in.readParcelable(Bitmap.class.getClassLoader());
        this.mLabelPosition = in.readInt();
        this.mLabelPadding = in.readInt();
        this.mIconWidth = in.readFloat();
        this.mIconHeight = in.readFloat();
        this.mIconScaledWidth = in.readFloat();
        this.mIconScaledHeight = in.readFloat();
        this.mDefaultSelected = in.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mLabelIcon, i);
        parcel.writeInt(this.mLabelPosition);
        parcel.writeInt(this.mLabelPadding);
        parcel.writeFloat(this.mIconWidth);
        parcel.writeFloat(this.mIconHeight);
        parcel.writeFloat(this.mIconScaledWidth);
        parcel.writeFloat(this.mIconScaledHeight);
        parcel.writeByte(this.mDefaultSelected ? (byte) 1 : (byte) 0);
    }

    public Bitmap getLabelIcon() {
        return this.mLabelIcon;
    }

    public PieOption setLabelIcon(Bitmap labelIcon) {
        this.mLabelIcon = labelIcon;
        return this;
    }

    public int getLabelPosition() {
        return this.mLabelPosition;
    }

    public PieOption setLabelPosition(int labelPosition) {
        this.mLabelPosition = labelPosition;
        return this;
    }

    public int getLabelPadding() {
        return this.mLabelPadding;
    }

    public PieOption setLabelPadding(int labelPadding) {
        this.mLabelPadding = labelPadding;
        return this;
    }

    public boolean isDefaultSelected() {
        return this.mDefaultSelected;
    }

    public PieOption setDefaultSelected(boolean defaultSelected) {
        this.mDefaultSelected = defaultSelected;
        return this;
    }

    public float getIconWidth() {
        return this.mIconWidth;
    }

    public PieOption setIconWidth(float iconWidth) {
        this.mIconWidth = iconWidth;
        return this;
    }

    public float getIconHeight() {
        return this.mIconHeight;
    }

    public PieOption setIconHeight(float iconHeight) {
        this.mIconHeight = iconHeight;
        return this;
    }

    public float getIconScaledWidth() {
        return this.mIconScaledWidth;
    }

    public PieOption setIconScaledWidth(float iconScaledWidth) {
        this.mIconScaledWidth = iconScaledWidth;
        return this;
    }

    public float getIconScaledHeight() {
        return this.mIconScaledHeight;
    }

    public PieOption setIconScaledHeight(float iconScaledHeight) {
        this.mIconScaledHeight = iconScaledHeight;
        return this;
    }

    public Typeface getTypeFace() {
        return this.mTypeFace;
    }

    public PieOption setTypeFace(Typeface mTypeFace) {
        this.mTypeFace = mTypeFace;
        return this;
    }
}