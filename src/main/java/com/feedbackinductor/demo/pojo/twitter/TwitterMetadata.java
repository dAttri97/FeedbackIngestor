package com.feedbackinductor.demo.pojo.twitter;

import java.util.Date;
import java.util.List;

public class TwitterMetadata {
    private boolean verified;
    private long favorite_count;
    private List<Hashtag> hashtags;
    private long retweet_count;
    private Date created_at;
    private long postID;
    private long userID;

    public boolean isVerified() {
        return this.verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public long getFavorite_count() {
        return favorite_count;
    }

    public void setFavorite_count(long favorite_count) {
        this.favorite_count = favorite_count;
    }

    public List<Hashtag> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<Hashtag> hashtags) {
        this.hashtags = hashtags;
    }

    public long getRetweet_count() {
        return retweet_count;
    }

    public void setRetweet_count(long retweet_count) {
        this.retweet_count = retweet_count;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public long getPostID() {
        return postID;
    }

    public void setPostID(long postID) {
        this.postID = postID;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IngestedData{");
//        sb.append("newest_id='" + newest_id);
//        sb.append(", oldest_id='" + oldest_id);
//        sb.append(", result_count=" + result_count);
//        sb.append(", next_token=" + next_token);
        sb.append("}");
        return sb.toString();
    }
}
