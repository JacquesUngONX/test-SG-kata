package com.newlight77.kata.survey.service;

import com.newlight77.kata.survey.client.SurveyClient;
import com.newlight77.kata.survey.model.Survey;

import org.springframework.stereotype.Service;

@Service
public class SurveyService {
    private SurveyClient surveyWebService;

    public SurveyService(final SurveyClient surveyWebService) {
        this.surveyWebService = surveyWebService;
    }

    public void createSurvey(Survey survey) { // create instead of creer
        surveyWebService.createSurvey(survey);
    }

    public Survey getSurvey(String id) {
        return surveyWebService.getSurvey(id);
    }
}
