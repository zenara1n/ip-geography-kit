package com.ra1n.ipgeographykit.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Names__3 {

    @SerializedName("en")
    @Expose
    private String en;
    @SerializedName("fa")
    @Expose
    private String fa;
    @SerializedName("fr")
    @Expose
    private String fr;
    @SerializedName("ja")
    @Expose
    private String ja;
    @SerializedName("ko")
    @Expose
    private String ko;
    @SerializedName("ru")
    @Expose
    private String ru;
    @SerializedName("zh-CN")
    @Expose
    private String zhCN;

    /**
     * No args constructor for use in serialization
     */
    public Names__3() {
    }

    /**
     * @param zhCN
     * @param ru
     * @param ko
     * @param ja
     * @param en
     * @param fa
     * @param fr
     */
    public Names__3(String en, String fa, String fr, String ja, String ko, String ru, String zhCN) {
        super();
        this.en = en;
        this.fa = fa;
        this.fr = fr;
        this.ja = ja;
        this.ko = ko;
        this.ru = ru;
        this.zhCN = zhCN;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getFa() {
        return fa;
    }

    public void setFa(String fa) {
        this.fa = fa;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getJa() {
        return ja;
    }

    public void setJa(String ja) {
        this.ja = ja;
    }

    public String getKo() {
        return ko;
    }

    public void setKo(String ko) {
        this.ko = ko;
    }

    public String getRu() {
        return ru;
    }

    public void setRu(String ru) {
        this.ru = ru;
    }

    public String getZhCN() {
        return zhCN;
    }

    public void setZhCN(String zhCN) {
        this.zhCN = zhCN;
    }

}
