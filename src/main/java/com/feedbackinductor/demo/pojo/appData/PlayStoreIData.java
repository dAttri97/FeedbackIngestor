package com.feedbackinductor.demo.pojo.appData;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Data and metadata for PlayStore reviews.
 */
@Getter
@Setter
public class PlayStoreIData {
    private String body;
    private Date lastModified;
    private int starRating;
    private String authorName;
    private long reviewId;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public long getReviewId() {
        return reviewId;
    }

    public void setReviewId(long reviewId) {
        this.reviewId = reviewId;
    }
}

