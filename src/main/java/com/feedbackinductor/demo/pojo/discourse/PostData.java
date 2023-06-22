package com.feedbackinductor.demo.pojo.discourse;

public class PostData {
    private PostStream postStream;

    private int id;

    // Getters and setters

    public PostStream getPostStream() {
        return postStream;
    }

    public void setPostStream(PostStream postStream) {
        this.postStream = postStream;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PostData: { PostStream: " + postStream + ", id: " + id + "}";
    }
}
