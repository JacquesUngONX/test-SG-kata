package com.newlight77.kata.survey.model;

import lombok.Data;

import java.util.List;

@Data
public class Campaign {
    private String id ;
    private String surveyId;
    private List<AddressStatus> addressStatuses;

    public String getSurveyId() {
        return this.id;
    }

    public List<AddressStatus> getAddressStatuses() {
        return this.addressStatuses;
    }
}
