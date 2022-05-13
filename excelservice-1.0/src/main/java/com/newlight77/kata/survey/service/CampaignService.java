package com.newlight77.kata.survey.service;

import com.newlight77.kata.survey.client.CampaignClient;
import com.newlight77.kata.survey.client.SurveyClient;
import com.newlight77.kata.survey.model.Campaign;

import org.springframework.stereotype.Service;

@Service
public class CampaignService {
    private CampaignClient campaignWebService;

    public CampaignService(final CampaignClient campaignWebService, final SurveyClient surveyWebService) {
        this.campaignWebService = campaignWebService;
    }

    public void createCampaign(Campaign campaign) {
        campaignWebService.createCampaign(campaign);
    }

    public Campaign getCampaign(String id) {
        return campaignWebService.getCampaign(id);
    }
}
