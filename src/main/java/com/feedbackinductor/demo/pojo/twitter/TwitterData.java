package com.feedbackinductor.demo.pojo.twitter;

import com.feedbackinductor.demo.utils.Language;

import java.util.List;

public class TwitterData {
    private String created_at;
    private long id;
    private String text;
    private User user;
    private long retweet_count;
    private String language;
    private long favorite_count;
//    private List<Hashtag> hashtags;

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getRetweet_count() {
        return retweet_count;
    }

    public void setRetweet_count(long retweet_count) {
        this.retweet_count = retweet_count;
    }

    public long getFavorite_count() {
        return favorite_count;
    }

    public void setFavorite_count(long favorite_count) {
        this.favorite_count = favorite_count;
    }

//    public List<Hashtag> getHashtags() {
//        return hashtags;
//    }
//
//    public void setHashtags(List<Hashtag> hashtags) {
//        this.hashtags = hashtags;
//    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TwitterData{");
        sb.append("created_at='" + created_at);
        sb.append(", text='" + text);
        sb.append(", user='" + user);
        sb.append(", retweet_count='" + retweet_count);
        sb.append(", favorite_count='" + favorite_count);
//        sb.append(", Hashtag='" + hashtags);
        sb.append("}");
        return sb.toString();
    }

}

