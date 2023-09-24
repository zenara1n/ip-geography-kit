package com.ra1n.ipgeographykit.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Subdivision {

    @SerializedName("geoname_id")
    @Expose
    private Integer geonameId;
    @SerializedName("iso_code")
    @Expose
    private String isoCode;
    @SerializedName("names")
    @Expose
    private Names__3 names;

    /**
     * No args constructor for use in serialization
     */
    public Subdivision() {
    }

    /**
     * @param names
     * @param geonameId
     * @param isoCode
     */
    public Subdivision(Integer geonameId, String isoCode, Names__3 names) {
        super();
        this.geonameId = geonameId;
        this.isoCode = isoCode;
        this.names = names;
    }

    public Integer getGeonameId() {
        return geonameId;
    }

    public void setGeonameId(Integer geonameId) {
        this.geonameId = geonameId;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public Names__3 getNames() {
        return names;
    }

    public void setNames(Names__3 names) {
        this.names = names;
    }

}
