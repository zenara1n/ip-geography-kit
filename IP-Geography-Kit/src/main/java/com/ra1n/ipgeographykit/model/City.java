package com.ra1n.ipgeographykit.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class City {

    @SerializedName("geoname_id")
    @Expose
    private Integer geonameId;
    @SerializedName("names")
    @Expose
    private Names names;

    /**
     * No args constructor for use in serialization
     */
    public City() {
    }

    /**
     * @param names
     * @param geonameId
     */
    public City(Integer geonameId, Names names) {
        super();
        this.geonameId = geonameId;
        this.names = names;
    }

    public Integer getGeonameId() {
        return geonameId;
    }

    public void setGeonameId(Integer geonameId) {
        this.geonameId = geonameId;
    }

    public Names getNames() {
        return names;
    }

    public void setNames(Names names) {
        this.names = names;
    }

}
