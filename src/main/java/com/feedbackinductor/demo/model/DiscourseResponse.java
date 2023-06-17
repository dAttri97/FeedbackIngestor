package com.feedbackinductor.demo.model;

import java.util.List;

public class DiscourseResponse {
    private List<Post> posts;

    // Getter
    public List<Post> getPosts() {
        return posts;
    }

    // Setter
    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
