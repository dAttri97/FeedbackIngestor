package com.feedbackinductor.demo.controller;

import com.feedbackinductor.demo.component.ApiCaller;
import com.feedbackinductor.demo.pojo.appData.IData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;

@RestController
public class UserController {
    private final ApiCaller apiCaller;
    @Autowired
    public UserController(ApiCaller apiCaller) {
        this.apiCaller = apiCaller;
    }

    @GetMapping
    @RequestMapping("/api/allData")
    public List<IData> getAllData() throws ParseException {
        return apiCaller.getAllData();
    }

    @GetMapping
    @RequestMapping("/api/discourse")
    public List<IData> getDiscourse() {
        return apiCaller.getAllDiscoursePosts();
    }

    @GetMapping
    @RequestMapping("/api/tweets")
    public List<IData> getTweets() {
        return apiCaller.getAllTweets();
    }
}
