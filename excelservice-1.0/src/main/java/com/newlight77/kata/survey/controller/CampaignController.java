package com.newlight77.kata.survey.controller;

import com.newlight77.kata.survey.model.Campaign;
import com.newlight77.kata.survey.service.CampaignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CampaignController {
    private CampaignService campaignService;
    private static final Logger logger = LoggerFactory.getLogger(SurveyController.class);

    public CampaignController(final CampaignService campaignService) {
        this.campaignService = campaignService;
    }

    @RequestMapping(value = "/api/survey/campaign/create", method = RequestMethod.POST)
    public void createCampaign(@RequestBody Campaign campaign) {
        campaignService.createCampaign(campaign);
    }

    @RequestMapping(value = "/api/survey/campaign/get", method = RequestMethod.GET)
    public Campaign getCampaign(@RequestParam String id) {
        return campaignService.getCampaign(id);
    }
}
