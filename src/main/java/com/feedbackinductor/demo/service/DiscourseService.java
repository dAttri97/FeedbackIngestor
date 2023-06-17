package com.feedbackinductor.demo.service;

import com.feedbackinductor.demo.model.DiscourseResponse;
import com.feedbackinductor.demo.model.Post;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Date;
import java.util.List;

@Service
public class DiscourseService {
    private static final String API_BASE_URL = "https://your-discourse-api-url.com/api";

    public List<Post> getPostsInTimeRange(Date startTime, Date endTime) {
        String url = API_BASE_URL + "/posts.json?start_date=" + startTime.getTime() + "&end_date=" + endTime.getTime();
        ResponseEntity<DiscourseResponse> responseEntity = new RestTemplate().getForEntity(url, DiscourseResponse.class);
        return responseEntity.getBody().getPosts();
    }

    public List<Post> getSpecificPosts(List<Integer> postIds) {
        String url = API_BASE_URL + "/posts/by_ids.json?post_ids=" + postIds.toString();
        ResponseEntity<DiscourseResponse> responseEntity = new RestTemplate().getForEntity(url, DiscourseResponse.class);
        return responseEntity.getBody().getPosts();
    }
}