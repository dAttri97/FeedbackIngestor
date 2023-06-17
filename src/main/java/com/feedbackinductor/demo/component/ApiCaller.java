package com.feedbackinductor.demo.component;

import com.feedbackinductor.demo.model.Post;
import com.feedbackinductor.demo.service.DiscourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApiCaller {
    private final DiscourseService discourseService;

    private final static Integer POST_ID = 872227;

    @Autowired
    public ApiCaller(DiscourseService discourseService) {
        this.discourseService = discourseService;
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
}
