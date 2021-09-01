package com.example.fehandroidapp.model;

import java.util.List;

public class CombinedHero {
    private String fullName;
    private String name;
    private String movement;
    private String weaponType;

    private List<Weapon> weapons;
    private List<Assist> assists;
    private List<Special> specials;

    private List<Passive> a;
    private List<Passive> b;
    private List<Passive> c;

    private List<Integer> hp;
    private List<Integer> atk;
    private List<Integer> spd;
    private List<Integer> def;
    private List<Integer> res;

    private double hpGrowth;
    private double atkGrowth;
    private double spdGrowth;
    private double defGrowth;
    private double resGrowth;

    private int flowers;
    private String imageUrl;

    private Boolean isResplendent;
    private String resplendentUrl;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }

    public List<Assist> getAssists() {
        return assists;
    }

    public void setAssists(List<Assist> assists) {
        this.assists = assists;
    }

    public List<Special> getSpecials() {
        return specials;
    }

    public void setSpecials(List<Special> specials) {
        this.specials = specials;
    }

    public List<Passive> getA() {
        return a;
    }

    public void setA(List<Passive> a) {
        this.a = a;
    }

    public List<Passive> getB() {
        return b;
    }

    public void setB(List<Passive> b) {
        this.b = b;
    }

    public List<Passive> getC() {
        return c;
    }

    public void setC(List<Passive> c) {
        this.c = c;
    }

    public List<Integer> getHp() {
        return hp;
    }

    public void setHp(List<Integer> hp) {
        this.hp = hp;
    }

    public List<Integer> getAtk() {
        return atk;
    }

    public void setAtk(List<Integer> atk) {
        this.atk = atk;
    }

    public List<Integer> getSpd() {
        return spd;
    }

    public void setSpd(List<Integer> spd) {
        this.spd = spd;
    }

    public List<Integer> getDef() {
        return def;
    }

    public void setDef(List<Integer> def) {
        this.def = def;
    }

    public List<Integer> getRes() {
        return res;
    }

    public void setRes(List<Integer> res) {
        this.res = res;
    }

    public double getHpGrowth() {
        return hpGrowth;
    }

    public void setHpGrowth(double hpGrowth) {
        this.hpGrowth = hpGrowth;
    }

    public double getAtkGrowth() {
        return atkGrowth;
    }

    public void setAtkGrowth(double atkGrowth) {
        this.atkGrowth = atkGrowth;
    }

    public double getSpdGrowth() {
        return spdGrowth;
    }

    public void setSpdGrowth(double spdGrowth) {
        this.spdGrowth = spdGrowth;
    }

    public double getDefGrowth() {
        return defGrowth;
    }

    public void setDefGrowth(double defGrowth) {
        this.defGrowth = defGrowth;
    }

    public double getResGrowth() {
        return resGrowth;
    }

    public void setResGrowth(double resGrowth) {
        this.resGrowth = resGrowth;
    }

    public int getFlowers() {
        return flowers;
    }

    public void setFlowers(int flowers) {
        this.flowers = flowers;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Boolean getResplendent() {
        return isResplendent;
    }

    public void setResplendent(Boolean resplendent) {
        isResplendent = resplendent;
    }

    public String getResplendentUrl() {
        return resplendentUrl;
    }

    public void setResplendentUrl(String resplendentUrl) {
        this.resplendentUrl = resplendentUrl;
    }

    @Override
    public String toString() {
        return "CombinedHero{" +
                "fullName='" + fullName + '\'' +
                ", name='" + name + '\'' +
                ", movement='" + movement + '\'' +
                ", weaponType='" + weaponType + '\'' +
                ", weapons=" + weapons +
                ", assists=" + assists +
                ", specials=" + specials +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", hp=" + hp +
                ", atk=" + atk +
                ", spd=" + spd +
                ", def=" + def +
                ", res=" + res +
                ", hpGrowth=" + hpGrowth +
                ", atkGrowth=" + atkGrowth +
                ", spdGrowth=" + spdGrowth +
                ", defGrowth=" + defGrowth +
                ", resGrowth=" + resGrowth +
                ", flowers=" + flowers +
                ", imageUrl='" + imageUrl + '\'' +
                ", isResplendent=" + isResplendent +
                ", resplendentUrl='" + resplendentUrl + '\'' +
                '}';
    }
}
