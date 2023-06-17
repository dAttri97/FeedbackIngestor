package com.feedbackinductor.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class DiscourseService {
    private final WebClient webClient;

    public DiscourseService() {
        this.webClient = WebClient.create("https://meta.discourse.org/search.json?page=1&q=after%3A2021-01-01+before%3A2021-02-20");
    }

    public void fetchTopics() {
        webClient.get()
                .uri("/topics.json")
                .retrieve()
                .bodyToMono(String.class)
                .subscribe(responseBody -> {
                    // Handle the response here
                    System.out.println(responseBody);
                });
    }
}
