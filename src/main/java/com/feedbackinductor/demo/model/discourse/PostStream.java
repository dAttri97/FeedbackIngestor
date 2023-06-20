package com.feedbackinductor.demo.model.discourse;

import java.util.List;

public class PostStream {
    private List<Post> posts;

    // Getter
    public List<Post> getPosts() {
        return posts;
    }

    // Setter
    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "Posts { " + posts + "}";
    }
}
