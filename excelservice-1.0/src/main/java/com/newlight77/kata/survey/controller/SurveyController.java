package com.newlight77.kata.survey.controller;
import com.newlight77.kata.survey.model.Survey;
import com.newlight77.kata.survey.service.SurveyService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class SurveyController {

    private SurveyService surveyService;
    private static final Logger logger = LoggerFactory.getLogger(SurveyController.class);
    
    public SurveyController(
        final SurveyService surveyService
    ) {
        this.surveyService = surveyService;
    }

    @RequestMapping(value = "/api/survey/create", method = RequestMethod.POST)
    public void createSurvey(@RequestBody Survey survey) {
        surveyService.createSurvey(survey);
    }

    @RequestMapping(value = "/api/survey/get", method = RequestMethod.GET)
    public Survey getSurvey(@RequestParam String id) {
        return surveyService.getSurvey(id);
    }
}

