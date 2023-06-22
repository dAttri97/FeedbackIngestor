package com.feedbackinductor.demo.pojo.appData;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class TwitterIData {
    private long postID;
    private String body;
    private long userID;
    private Date createdAt;
    private boolean verified;
    private long retweetCount;
    private long favouriteCount;

    public long getPostID() {
        return postID;
    }

    public void setPostID(long postID) {
        this.postID = postID;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public void setRetweetCount(long retweetCount) {
        this.retweetCount = retweetCount;
    }

    public long getRetweetCount() {
        return retweetCount;
    }

    public void setFavouriteCount(long favouriteCount) {
        this.favouriteCount = favouriteCount;
    }

    public long getFavouriteCount() {
        return favouriteCount;
    }
}

