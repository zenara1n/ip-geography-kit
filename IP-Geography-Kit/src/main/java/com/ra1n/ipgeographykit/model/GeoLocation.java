package com.ra1n.ipgeographykit.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GeoLocation {
    @SerializedName("city")
    @Expose
    private City city;
    @SerializedName("continent")
    @Expose
    private Continent continent;
    @SerializedName("country")
    @Expose
    private Country country;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("postal")
    @Expose
    private Postal postal;
    @SerializedName("subdivisions")
    @Expose
    private List<Subdivision> subdivisions;
    @SerializedName("traits")
    @Expose
    private Traits traits;

    /**
     * No args constructor for use in serialization
     *
     */
    public GeoLocation() {
    }

    /**
     *
     * @param continent
     * @param country
     * @param traits
     * @param city
     * @param location
     * @param postal
     * @param subdivisions
     */
    public GeoLocation(City city, Continent continent, Country country, Location location, Postal postal, List<Subdivision> subdivisions, Traits traits) {
        super();
        this.city = city;
        this.continent = continent;
        this.country = country;
        this.location = location;
        this.postal = postal;
        this.subdivisions = subdivisions;
        this.traits = traits;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Postal getPostal() {
        return postal;
    }

    public void setPostal(Postal postal) {
        this.postal = postal;
    }

    public List<Subdivision> getSubdivisions() {
        return subdivisions;
    }

    public void setSubdivisions(List<Subdivision> subdivisions) {
        this.subdivisions = subdivisions;
    }

    public Traits getTraits() {
        return traits;
    }

    public void setTraits(Traits traits) {
        this.traits = traits;
    }

}

