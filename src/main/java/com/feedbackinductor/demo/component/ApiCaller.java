package com.feedbackinductor.demo.component;

import com.feedbackinductor.demo.model.discourse.Post;
import com.feedbackinductor.demo.service.DiscourseService;
import com.feedbackinductor.demo.service.TwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Component
public class ApiCaller {
    private final DiscourseService discourseService;
    private final TwitterService twitterService;

    @Autowired
    public ApiCaller(DiscourseService discourseService, TwitterService twitterService) {
        this.discourseService = discourseService;
        this.twitterService = twitterService;
    }

    @GetMapping
    public List<Post> getDiscoursePosts() {
        // Define the time range
        Date startTime = new Date(2023, 6, 1);
        Date endTime = new Date(2023, 6, 2);

        // Retrieve the posts within the time range
        final List<Post> timeRangePostList = discourseService.getPostsInTimeRange(startTime, endTime);

        final List<Post> actualPost = new ArrayList<>();
        for(Post post:timeRangePostList) {
            List<Post> specificPost = discourseService.getSpecificPosts(List.of(post.getId()));
            actualPost.addAll(specificPost);
        }
        return actualPost;
    }

    @GetMapping
    public String getTweets() throws IOException, URISyntaxException {
        // Define the time range
        return twitterService.search("from:TwitterDev OR from:SnowBotDev OR from:DailyNASA");
    }


}
