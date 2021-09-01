package com.example.fehandroidapp.model;

import com.google.gson.annotations.SerializedName;

public class Weapon {
    private String name;
    @SerializedName(value = "slot")
    private String weaponType;
    @SerializedName(value = "wRange")
    private int range;
    private int power;
    @SerializedName(value = "desc")
    private String description;
    private int sp;
    @SerializedName(value = "excl")
    private boolean isExcl;
    @SerializedName(value = "isMax")
    private boolean isMax;
    @SerializedName(value = "upgradeable")
    private boolean isUpgradeable;
    private String upgradeType;
    private boolean hasEffect;
    private String upgradeDesc;

    private int hp;
    private int atk;
    private int spd;
    @SerializedName(value = "defense")
    private int def;
    private int res;

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
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

    public boolean isUpgradeable() {
        return isUpgradeable;
    }

    public void setUpgradeable(boolean upgradeable) {
        isUpgradeable = upgradeable;
    }

    public String getUpgradeType() {
        return upgradeType;
    }

    public void setUpgradeType(String upgradeType) {
        this.upgradeType = upgradeType;
    }

    public boolean isHasEffect() {
        return hasEffect;
    }

    public void setHasEffect(boolean hasEffect) {
        this.hasEffect = hasEffect;
    }

    public String getUpgradeDesc() {
        return upgradeDesc;
    }

    public void setUpgradeDesc(String upgradeDesc) {
        this.upgradeDesc = upgradeDesc;
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

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", weaponType='" + weaponType + '\'' +
                ", range=" + range +
                ", power=" + power +
                ", description='" + description + '\'' +
                ", sp=" + sp +
                ", isExcl=" + isExcl +
                ", isMax=" + isMax +
                ", isUpgradeable=" + isUpgradeable +
                ", upgradeType='" + upgradeType + '\'' +
                ", hasEffect=" + hasEffect +
                ", upgradeDesc='" + upgradeDesc + '\'' +
                ", hp=" + hp +
                ", atk=" + atk +
                ", spd=" + spd +
                ", def=" + def +
                ", res=" + res +
                '}';
    }
}
