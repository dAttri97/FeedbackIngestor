package com.feedbackinductor.demo.controller;

import com.feedbackinductor.demo.component.ApiCaller;
import com.feedbackinductor.demo.pojo.appData.IData;
import com.feedbackinductor.demo.service.DiscourseSourceImpl;
import com.feedbackinductor.demo.service.IInputSource;
import com.feedbackinductor.demo.service.PlaystoreSourceImpl;
import com.feedbackinductor.demo.service.TwitterSourceImpl;
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
    public UserController(ApiCaller apiCaller) throws ParseException {
        this.apiCaller = apiCaller;
        IInputSource source = new PlaystoreSourceImpl();
        source.initialize();
        this.apiCaller.register(source);
        source = new TwitterSourceImpl();
        source.initialize();
        this.apiCaller.register(source);
        source = new DiscourseSourceImpl();
        source.initialize();
        this.apiCaller.register(source);
    }

    @GetMapping
    @RequestMapping("/api/allData")
    public List<IData> getAllData() throws ParseException {
        return apiCaller.getAllData();
    }

    @GetMapping
    @RequestMapping("/api/discourse")
    public List<IData> getDiscourse() {
        return apiCaller.getDiscoursePosts();
    }

    @GetMapping
    @RequestMapping("/api/tweets")
    public List<IData> getTweets() {
        return apiCaller.getTweets();
    }

    @GetMapping
    @RequestMapping("/api/review")
    public List<IData> getPlayStore()  {
        return apiCaller.getPlayStoreReviews();
    }
}
