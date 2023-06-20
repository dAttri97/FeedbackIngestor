package com.feedbackinductor.demo.controller;

import com.feedbackinductor.demo.component.ApiCaller;
import com.feedbackinductor.demo.model.IngestedData;
import com.feedbackinductor.demo.model.discourse.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.List;

@RestController
public class UserController {
    ApiCaller apiCaller;
    @Autowired
    UserController(ApiCaller apiCaller) {
        this.apiCaller = apiCaller;
    }
    @GetMapping
    @RequestMapping("/api/discourse")
    public List<IngestedData> getDiscourse() throws ParseException {
        return apiCaller.getDiscoursePosts();
    }

    @GetMapping
    @RequestMapping("/api/tweets")
    public List<IngestedData> getTweets() throws IOException, URISyntaxException, ParseException {
        return apiCaller.getTweets();
    }
}
