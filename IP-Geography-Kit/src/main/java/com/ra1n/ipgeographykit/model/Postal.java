package com.ra1n.ipgeographykit.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Postal {

    @SerializedName("code")
    @Expose
    private String code;

    /**
     * No args constructor for use in serialization
     */
    public Postal() {
    }

    /**
     * @param code
     */
    public Postal(String code) {
        super();
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
