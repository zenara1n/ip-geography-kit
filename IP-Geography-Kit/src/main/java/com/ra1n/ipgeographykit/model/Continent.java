package com.ra1n.ipgeographykit.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Continent {

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("geoname_id")
    @Expose
    private Integer geonameId;
    @SerializedName("names")
    @Expose
    private Names__1 names;

    /**
     * No args constructor for use in serialization
     */
    public Continent() {
    }

    /**
     * @param code
     * @param names
     * @param geonameId
     */
    public Continent(String code, Integer geonameId, Names__1 names) {
        super();
        this.code = code;
        this.geonameId = geonameId;
        this.names = names;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getGeonameId() {
        return geonameId;
    }

    public void setGeonameId(Integer geonameId) {
        this.geonameId = geonameId;
    }

    public Names__1 getNames() {
        return names;
    }

    public void setNames(Names__1 names) {
        this.names = names;
    }

}
