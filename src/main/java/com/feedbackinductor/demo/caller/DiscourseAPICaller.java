package com.feedbackinductor.demo.caller;

import com.feedbackinductor.demo.model.discourse.PostStream;
import com.feedbackinductor.demo.model.discourse.Post;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class DiscourseAPICaller {
    private static final String API_BASE_URL = "https://meta.discourse.org";

    public List<Post> getPostsInTimeRange(Date startTime, Date endTime) {
//        String url = API_BASE_URL + "/posts.json?start_date=" + startTime.getTime() + "&end_date=" + endTime.getTime();
        final String url = "https://meta.discourse.org/search.json?page=1&q=after%\n" +
                "3A2021-01-01+before%3A2021-02-20";
        ResponseEntity<PostStream> responseEntity = new RestTemplate().getForEntity(url, PostStream.class);
        List<Post> response = responseEntity.getBody().getPosts();
        log.info(response.size()+" ~~~~");
        return response;
    }

    public List<Post> getSpecificPosts(List<Integer> postIds) {
        String url = API_BASE_URL + "/posts/by_ids.json?post_ids=" + postIds.toString();
        ResponseEntity<PostStream> responseEntity = new RestTemplate().getForEntity(url, PostStream.class);
        return responseEntity.getBody().getPosts();
    }
}