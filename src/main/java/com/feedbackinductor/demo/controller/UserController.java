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

/**
 * Controller layer for API mapping.
 * Currently, 5 APIs have been defined.
 * More APIs can be added if we want to fetch data from more sources.
 */
@RestController
public class UserController {
    private final ApiCaller apiCaller;

    /**
     * Injects ApiCaller and initializes the sources we are using.
     * More sources can be added and initialized as per requirement.
     * @param apiCaller
     * @throws ParseException
     */
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

    /**
     * Returns all the data from database. For larger database checks can be added to return latest records.
     * @return List of IData
     * @throws ParseException
     */
    @GetMapping
    @RequestMapping("/api/allData")
    public List<IData> getAllData() throws ParseException {
        return apiCaller.getAllData();
    }

    /**
     * Parses the database to only return records originating form Discourse source.
     * @return List of IData
     */
    @GetMapping
    @RequestMapping("/api/discourse")
    public List<IData> getDiscoursePosts() {
        return apiCaller.getDiscoursePosts();
    }

    /**
     * Parses the database to only return records originating form Discourse source.
     * @return List of IData
     */
    @GetMapping
    @RequestMapping("/api/tweets")
    public List<IData> getTweets() {
        return apiCaller.getTweets();
    }

    /**
     * Parses the database to only return records originating form Discourse source.
     * @return List of IData
     */
    @GetMapping
    @RequestMapping("/api/review")
    public List<IData> getPlayStoreReviews()  {
        return apiCaller.getPlayStoreReviews();
    }

    /**
     * Parses the database to only return records originating form Discourse source.
     * @return List of IData
     */
    @GetMapping
    @RequestMapping("/api/review")
    public List<IData> getIntercomConversation()  {
        return null;
    }
}
