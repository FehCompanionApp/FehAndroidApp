package com.example.fehandroidapp.model;

import com.google.gson.annotations.SerializedName;

public class Assist {
    private String name;
    @SerializedName(value = "aRange")
    private int range;
    @SerializedName(value = "desc")
    private String description;
    private int sp;
    @SerializedName(value = "excl")
    private boolean isExcl;
    @SerializedName(value = "isMax")
    private boolean isMax;
    private String cantInherent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSp() {
        return sp;
    }

    public void setSp(int sp) {
        this.sp = sp;
    }

    public boolean isExcl() {
        return isExcl;
    }

    public void setExcl(boolean excl) {
        isExcl = excl;
    }

    public boolean isMax() {
        return isMax;
    }

    public void setMax(boolean max) {
        isMax = max;
    }

    public String getCantInherent() {
        return cantInherent;
    }

    public void setCantInherent(String cantInherent) {
        this.cantInherent = cantInherent;
    }

    @Override
    public String toString() {
        return "Assist{" +
                "name='" + name + '\'' +
                ", range=" + range +
                ", description='" + description + '\'' +
                ", sp=" + sp +
                ", isExcl=" + isExcl +
                ", isMax=" + isMax +
                ", cantInherent='" + cantInherent + '\'' +
                '}';
    }
}
