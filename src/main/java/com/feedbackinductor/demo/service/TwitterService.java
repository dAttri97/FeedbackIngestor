package com.feedbackinductor.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Base64;
import java.util.*;

@Service
public class TwitterService {
    @Value("${twitter.api.base-url}")
    private String twitterApiBaseUrl;

    @Value("${twitter.api.bearer-token}")
    private String twitterApiBearerToken;

    public List<String> getLatestTweets(String username, int count) throws URISyntaxException {
        String apiUrl = twitterApiBaseUrl + "/2/users/by/username/" + username;
        URI uri = new URI(apiUrl);

        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.AUTHORIZATION, "Bearer " + twitterApiBearerToken);
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);

        RequestEntity<Void> requestEntity = new RequestEntity<>(headers, HttpMethod.GET, uri);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Map<String, Object>> responseEntity = restTemplate.exchange(requestEntity, Map.class);

        if (responseEntity.getStatusCode() == HttpStatus.OK) {
            Map<String, Object> responseBody = responseEntity.getBody();
            if (responseBody != null && responseBody.containsKey("data")) {
                Map<String, Object> userData = (Map<String, Object>) responseBody.get("data");
                String userId = (String) userData.get("id");

                apiUrl = twitterApiBaseUrl + "/2/users/" + userId + "/tweets?tweet.fields=text&max_results=" + count;
                uri = new URI(apiUrl);

                requestEntity = new RequestEntity<>(headers, HttpMethod.GET, uri);
                responseEntity = restTemplate.exchange(requestEntity, Map.class);

                if (responseEntity.getStatusCode() == HttpStatus.OK) {
                    Map<String, Object> tweetsData = responseEntity.getBody();
                    if (tweetsData != null && tweetsData.containsKey("data")) {
                        List<Map<String, Object>> tweets = (List<Map<String, Object>>) tweetsData.get("data");
                        List<String> tweetTexts = new ArrayList<>();
                        for (Map<String, Object> tweet : tweets) {
                            String tweetText = (String) tweet.get("text");
                            tweetTexts.add(tweetText);
                        }
                        return tweetTexts;
                    }
                }
            }
        }

        return Collections.emptyList();
    }
}

