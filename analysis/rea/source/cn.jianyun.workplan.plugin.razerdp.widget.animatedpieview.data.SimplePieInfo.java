package cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.data;

import android.graphics.Bitmap;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes2.dex */
public class SimplePieInfo implements IPieInfo {
    private int color;
    private String desc;
    private PieOption mPieOption = new PieOption();
    private String uuid;
    private double value;

    public SimplePieInfo() {
    }

    public SimplePieInfo(String uuid, double value, int color, String desc) {
        this.uuid = uuid;
        this.value = value;
        this.color = color;
        this.desc = desc;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public SimplePieInfo setLabel(Bitmap bm) {
        this.mPieOption.setLabelIcon(bm);
        return this;
    }

    public SimplePieInfo setDefaultSelected(boolean defaultSelected) {
        this.mPieOption.setDefaultSelected(defaultSelected);
        return this;
    }

    @Override // cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.data.IPieInfo
    public double getValue() {
        return this.value;
    }

    @Override // cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.data.IPieInfo
    public int getColor() {
        return this.color;
    }

    @Override // cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.data.IPieInfo
    public String getDesc() {
        return this.desc;
    }

    public SimplePieInfo setIconWidth(float iconWidth) {
        this.mPieOption.setIconWidth(iconWidth);
        return this;
    }

    public SimplePieInfo setIconHeight(float iconHeight) {
        this.mPieOption.setIconHeight(iconHeight);
        return this;
    }

    public SimplePieInfo setIconScaledWidth(float iconScaledWidth) {
        this.mPieOption.setIconScaledWidth(iconScaledWidth);
        return this;
    }

    public SimplePieInfo setIconScaledHeight(float iconScaledHeight) {
        this.mPieOption.setIconScaledHeight(iconScaledHeight);
        return this;
    }

    public SimplePieInfo setTypeFace(Typeface mTypeFace) {
        this.mPieOption.setTypeFace(mTypeFace);
        return this;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override // cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.data.IPieInfo
    public PieOption getPieOption() {
        return this.mPieOption;
    }
}