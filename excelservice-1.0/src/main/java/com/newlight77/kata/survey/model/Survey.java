package com.newlight77.kata.survey.model;

import java.util.List;

import lombok.Data;

@Data
public class Survey {
    private String id;
    private String sommary;
    private String client;
    private Address clientAddress;
    private List<Question> questions;

    public String getId() {
        return this.id;
    }

    public String getClient() {
        return this.client;
    }

    public Address getClientAddress() {
        return this.clientAddress;
    }
}

