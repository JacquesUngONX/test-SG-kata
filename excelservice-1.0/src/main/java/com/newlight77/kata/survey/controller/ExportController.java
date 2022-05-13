package com.newlight77.kata.survey.controller;

import com.newlight77.kata.survey.model.Campaign;
import com.newlight77.kata.survey.model.Survey;
import com.newlight77.kata.survey.service.CampaignService;
import com.newlight77.kata.survey.service.ExportCampaignService;
import com.newlight77.kata.survey.service.SurveyService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExportController {
    private SurveyService surveyService;
    private CampaignService campaignService;
    private ExportCampaignService exportCampaignService;
    private static final Logger logger = LoggerFactory.getLogger(SurveyController.class);

    public ExportController(
        final SurveyService surveyService,
        final CampaignService campaignService,
        final ExportCampaignService exportCampaignService
    ) {
        this.surveyService = surveyService;
        this.campaignService = campaignService;
        this.exportCampaignService = exportCampaignService;
    }

    @RequestMapping(value = "/api/survey/campaign/export", method = RequestMethod.POST)
    public void exportCampaign(@RequestParam String campaignId) {
        Campaign campaign = campaignService.getCampaign(campaignId);
        Survey survey = surveyService.getSurvey(campaign.getSurveyId());
        exportCampaignService.sendResults(campaign, survey);
        
    }
}
