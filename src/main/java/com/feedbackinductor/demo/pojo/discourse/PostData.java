package com.feedbackinductor.demo.pojo.discourse;

public class PostData {
    private PostStream post_stream;

    private int id;

    public PostStream getPostStream() {
        return post_stream;
    }

    public void setPostStream(PostStream postStream) {
        this.post_stream = postStream;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PostData: { PostStream: " + post_stream + ", id: " + id + "}";
    }
}
