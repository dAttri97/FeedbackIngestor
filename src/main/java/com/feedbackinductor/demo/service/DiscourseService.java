package com.feedbackinductor.demo.service;

import com.feedbackinductor.demo.model.DiscourseTimeRangeResponse;
import com.feedbackinductor.demo.model.Post;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Date;
import java.util.List;

@Service
public class DiscourseService {
    @Value("${discourse.api.base-url}")
    private String discourseApiBaseUrl;

    public List<Post> getPostsInTimeRange(Date startTime, Date endTime) {
        String url = discourseApiBaseUrl + "/posts.json?start_date=" + startTime.getTime() + "&end_date=" + endTime.getTime();
        ResponseEntity<DiscourseTimeRangeResponse> responseEntity = new RestTemplate().getForEntity(url, DiscourseTimeRangeResponse.class);
        return responseEntity.getBody().getPosts();
    }
}