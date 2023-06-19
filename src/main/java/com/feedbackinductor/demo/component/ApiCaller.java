package com.feedbackinductor.demo.component;

import com.feedbackinductor.demo.model.IngestedData;
import com.feedbackinductor.demo.model.discourse.Post;
import com.feedbackinductor.demo.service.impl.DiscourseSourceImpl;
import com.feedbackinductor.demo.service.impl.TwitterSourceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.List;
@Component
public class ApiCaller {
    private final DiscourseSourceImpl discourseSourceImpl;
    private final TwitterSourceImpl twitterSourceImpl;


    @Autowired
    public ApiCaller(DiscourseSourceImpl discourseSourceImpl, TwitterSourceImpl twitterSourceImpl) {
        this.discourseSourceImpl = discourseSourceImpl;
        this.twitterSourceImpl = twitterSourceImpl;
    }

    @GetMapping
    public List<Post> getDiscoursePosts() {
        // Define the time range
//        Date startTime = new Date(2023, 6, 1);
//        Date endTime = new Date(2023, 6, 2);
//
//        // Retrieve the posts within the time range
//        final List<Post> timeRangePostList = discourseService.getPostsInTimeRange(startTime, endTime);
//
//        final List<Post> actualPost = new ArrayList<>();
//        for(Post post:timeRangePostList) {
//            List<Post> specificPost = discourseService.getSpecificPosts(List.of(post.getId()));
//            actualPost.addAll(specificPost);
//        }
//        return actualPost;
        return null;
    }

    @GetMapping
    public List<IngestedData> getTweets() throws IOException, URISyntaxException, ParseException {
        String data = "{\"data\":[{\"id\":\"1405535537980472834\",\"text\":\"Hello,TwitterAPI!\",\"author_id\":\"1234567890\",\"created_at\":\"2021-06-17T10:30:00.000Z\"},{\"id\":\"1405535549920517633\",\"text\":\"Excitedtoannounceournewproduct!\",\"author_id\":\"987654321\",\"created_at\":\"2021-06-17T10:31:00.000Z\"}],\"meta\":{\"newest_id\":\"1405535537980472834\",\"oldest_id\":\"1405535549920517633\",\"result_count\":10,\"next_token\":\"b26v89c19zqg8o3f\"}}";
        // Define the time range
        List<IngestedData> ingestedDataList = twitterSourceImpl.parseData(data);
        System.out.println(ingestedDataList);
        return ingestedDataList;
    }


}
