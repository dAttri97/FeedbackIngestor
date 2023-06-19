package com.feedbackinductor.demo.component;

import com.feedbackinductor.demo.model.discourse.Post;
import com.feedbackinductor.demo.caller.DiscourseAPICaller;
import com.feedbackinductor.demo.caller.TwitterAPICaller;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Component
public class ApiCaller {
    private final DiscourseAPICaller discourseService;
    private final TwitterAPICaller twitterService;

    @Autowired
    public ApiCaller(DiscourseAPICaller discourseService, TwitterAPICaller twitterService) {
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
        FileReader fileReader = new FileReader("data.json");

        // Parse JSON using Gson
        JsonParser jsonParser = new JsonParser();
        JsonElement jsonElement = jsonParser.parse(fileReader);
        // Define the time range
        return twitterService.search2("from:TwitterDev OR from:SnowBotDev OR from:DailyNASA");
    }


}
