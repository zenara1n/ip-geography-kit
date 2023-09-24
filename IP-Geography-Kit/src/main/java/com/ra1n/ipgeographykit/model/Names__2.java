package com.ra1n.ipgeographykit.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Names__2 {

    @SerializedName("de")
    @Expose
    private String de;
    @SerializedName("en")
    @Expose
    private String en;
    @SerializedName("es")
    @Expose
    private String es;
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
    @SerializedName("pt-BR")
    @Expose
    private String ptBR;
    @SerializedName("ru")
    @Expose
    private String ru;
    @SerializedName("zh-CN")
    @Expose
    private String zhCN;

    /**
     * No args constructor for use in serialization
     */
    public Names__2() {
    }

    /**
     * @param ptBR
     * @param zhCN
     * @param de
     * @param ru
     * @param ko
     * @param ja
     * @param en
     * @param fa
     * @param fr
     * @param es
     */
    public Names__2(String de, String en, String es, String fa, String fr, String ja, String ko, String ptBR, String ru, String zhCN) {
        super();
        this.de = de;
        this.en = en;
        this.es = es;
        this.fa = fa;
        this.fr = fr;
        this.ja = ja;
        this.ko = ko;
        this.ptBR = ptBR;
        this.ru = ru;
        this.zhCN = zhCN;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getEs() {
        return es;
    }

    public void setEs(String es) {
        this.es = es;
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

    public String getPtBR() {
        return ptBR;
    }

    public void setPtBR(String ptBR) {
        this.ptBR = ptBR;
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
