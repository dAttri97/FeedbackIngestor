package com.feedbackinductor.demo.pojo.playstore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Review {
    private long reviewId;
    private String authorName;
    private Comment[] comments;

    public void setReviewId(long reviewId) {
        this.reviewId = reviewId;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }

    public long getReviewId() {
        return reviewId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public Comment[] getComments() {
        return comments;
    }
}
