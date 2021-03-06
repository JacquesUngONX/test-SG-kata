package com.newlight77.kata.survey.client;
import com.newlight77.kata.survey.model.Survey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class SurveyClient {
    private WebClient webClient;

    public SurveyClient(@Value("${external.url}") String externalUrl, final ClientFactory clientFactory) {
        this.webClient = clientFactory.buildClient();
    }

    public void createSurvey(Survey survey) {
        webClient.post()
                .uri("/surveys")
                .syncBody(survey)
                .retrieve();
    }

    public Survey getSurvey(String id) {
        return webClient.get()
                .uri("/surveys/" + id)
                .retrieve()
                .bodyToMono(Survey.class).block();
    }
}
