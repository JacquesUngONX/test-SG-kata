package com.newlight77.kata.survey.model;

import lombok.Data;

@Data
public class AddressStatus {
    private String id;
    private Address address;
    private Status status;

    public Address getAddress() {
        return this.address;
    }

    public Status getStatus() {
        return this.status;
    }
}
