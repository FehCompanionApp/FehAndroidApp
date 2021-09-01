package com.example.fehandroidapp.model;

import com.google.gson.annotations.SerializedName;

public class Passive {
    private String name;
    private String slot;
    @SerializedName(value="desc")
    private String description;
    private int sp;
    @SerializedName(value = "excl")
    private boolean isExcl;
    @SerializedName(value = "isMax")
    private boolean isMax;
    private String cantInherent;
    @SerializedName(value = "isSeal")
    private boolean isSeal;
    private int hp;
    private int atk;
    private int spd;
    private int def;
    private int res;
    private String imageUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
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

    public Boolean getExcl() {
        return isExcl;
    }

    public void setExcl(Boolean excl) {
        this.isExcl = excl;
    }

    public Boolean getMax() {
        return isMax;
    }

    public void setMax(Boolean max) {
        isMax = max;
    }

    public String getCantInherent() {
        return cantInherent;
    }

    public void setCantInherent(String cantInherent) {
        this.cantInherent = cantInherent;
    }

    public Boolean getSeal() {
        return isSeal;
    }

    public void setSeal(Boolean seal) {
        isSeal = seal;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Passive{" +
                "name='" + name + '\'' +
                ", slot='" + slot + '\'' +
                ", description='" + description + '\'' +
                ", sp=" + sp +
                ", isExcl=" + isExcl +
                ", isMax=" + isMax +
                ", cantInherent='" + cantInherent + '\'' +
                ", isSeal=" + isSeal +
                ", hp=" + hp +
                ", atk=" + atk +
                ", spd=" + spd +
                ", def=" + def +
                ", res=" + res +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
