package com.newlight77.kata.survey.model;

import lombok.Data;

@Data
public class Address {
    private String id;
    private String streetNumber;
    private String streetName;
    private String postalCode;
    private String city;

    public String getStreetName() {
        return this.streetName;
    }

    public String getStreetNumber() {
        return this.streetNumber;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public String getCity() {
        return this.city;
    }
}
