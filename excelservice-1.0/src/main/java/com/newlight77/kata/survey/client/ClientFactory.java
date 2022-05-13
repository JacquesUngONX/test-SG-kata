package com.newlight77.kata.survey.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ClientFactory {
    private String clientExternalUrl;
    public ClientFactory(@Value("${external.url}") String externalUrl) {
        this.clientExternalUrl = externalUrl;
    }

    public WebClient buildClient() {
        return WebClient.builder()
            .baseUrl(clientExternalUrl)
            .defaultHeader(HttpHeaders.CONTENT_TYPE, "application/json")
            .build();
    }
}