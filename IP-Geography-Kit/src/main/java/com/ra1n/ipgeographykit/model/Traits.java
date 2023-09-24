package com.ra1n.ipgeographykit.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Traits {
    @SerializedName("autonomous_system_number")
    @Expose
    private Integer autonomousSystemNumber;
    @SerializedName("autonomous_system_organization")
    @Expose
    private String autonomousSystemOrganization;
    @SerializedName("connection_type")
    @Expose
    private String connectionType;
    @SerializedName("isp")
    @Expose
    private String isp;
    @SerializedName("organization")
    @Expose
    private String organization;
    @SerializedName("user_type")
    @Expose
    private String userType;

    /**
     * No args constructor for use in serialization
     */
    public Traits() {
    }

    /**
     * @param isp
     * @param organization
     * @param userType
     * @param autonomousSystemNumber
     * @param autonomousSystemOrganization
     * @param connectionType
     */
    public Traits(Integer autonomousSystemNumber, String autonomousSystemOrganization, String connectionType, String isp, String organization, String userType) {
        super();
        this.autonomousSystemNumber = autonomousSystemNumber;
        this.autonomousSystemOrganization = autonomousSystemOrganization;
        this.connectionType = connectionType;
        this.isp = isp;
        this.organization = organization;
        this.userType = userType;
    }

    public Integer getAutonomousSystemNumber() {
        return autonomousSystemNumber;
    }

    public void setAutonomousSystemNumber(Integer autonomousSystemNumber) {
        this.autonomousSystemNumber = autonomousSystemNumber;
    }

    public String getAutonomousSystemOrganization() {
        return autonomousSystemOrganization;
    }

    public void setAutonomousSystemOrganization(String autonomousSystemOrganization) {
        this.autonomousSystemOrganization = autonomousSystemOrganization;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

}
