package com.ra1n.ipgeographykit.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Country {

    @SerializedName("geoname_id")
    @Expose
    private Integer geonameId;
    @SerializedName("is_in_european_union")
    @Expose
    private Boolean isInEuropeanUnion;
    @SerializedName("iso_code")
    @Expose
    private String isoCode;
    @SerializedName("names")
    @Expose
    private Names__2 names;

    /**
     * No args constructor for use in serialization
     */
    public Country() {
    }

    /**
     * @param names
     * @param geonameId
     * @param isoCode
     * @param isInEuropeanUnion
     */
    public Country(Integer geonameId, Boolean isInEuropeanUnion, String isoCode, Names__2 names) {
        super();
        this.geonameId = geonameId;
        this.isInEuropeanUnion = isInEuropeanUnion;
        this.isoCode = isoCode;
        this.names = names;
    }

    public Integer getGeonameId() {
        return geonameId;
    }

    public void setGeonameId(Integer geonameId) {
        this.geonameId = geonameId;
    }

    public Boolean getIsInEuropeanUnion() {
        return isInEuropeanUnion;
    }

    public void setIsInEuropeanUnion(Boolean isInEuropeanUnion) {
        this.isInEuropeanUnion = isInEuropeanUnion;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public Names__2 getNames() {
        return names;
    }

    public void setNames(Names__2 names) {
        this.names = names;
    }

}
