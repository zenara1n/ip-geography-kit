package com.ra1n.ipgeographykit.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Location {

    @SerializedName("latitude")
    @Expose
    private Float latitude;
    @SerializedName("longitude")
    @Expose
    private Float longitude;
    @SerializedName("time_zone")
    @Expose
    private String timeZone;
    @SerializedName("weather_code")
    @Expose
    private String weatherCode;

    /**
     * No args constructor for use in serialization
     */
    public Location() {
    }

    /**
     * @param weatherCode
     * @param latitude
     * @param timeZone
     * @param longitude
     */
    public Location(Float latitude, Float longitude, String timeZone, String weatherCode) {
        super();
        this.latitude = latitude;
        this.longitude = longitude;
        this.timeZone = timeZone;
        this.weatherCode = weatherCode;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(String weatherCode) {
        this.weatherCode = weatherCode;
    }

}
