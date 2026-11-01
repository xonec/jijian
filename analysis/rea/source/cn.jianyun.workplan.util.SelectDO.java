package cn.jianyun.workplan.util;

/* JADX INFO: loaded from: classes2.dex */
public class SelectDO {
    public String backgroundColor;
    public String color;
    public String label;
    public String value;

    public SelectDO(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public SelectDO(String label, String value, String backgroundColor) {
        this.label = label;
        this.value = value;
        this.backgroundColor = backgroundColor;
        this.color = "#ffffffff";
    }

    public SelectDO(String label, String value, String backgroundColor, String color) {
        this.label = label;
        this.value = value;
        this.backgroundColor = backgroundColor;
        this.color = color;
    }

    public SelectDO() {
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}