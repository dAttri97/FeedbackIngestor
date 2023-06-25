package com.feedbackinductor.demo.pojo.discourse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Post {
    private int id;
    private String name;
    private String username;
    private String avatar_template;
    private String created_at;
    private String cooked;
    private int post_number;
    private int post_type;
    private String updated_at;
    private int reply_count;
    private Integer reply_to_post_number;
    private int quote_count;
    private int incoming_link_count;
    private int reads;
    private int readers_count;
    private double score;
    private boolean yours;
    private int topic_id;
    private String topic_slug;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar_template() {
        return avatar_template;
    }

    public void setAvatar_template(String avatar_template) {
        this.avatar_template = avatar_template;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getCooked() {
        return cooked;
    }

    public void setCooked(String cooked) {
        this.cooked = cooked;
    }

    public int getPost_number() {
        return post_number;
    }

    public void setPost_number(int post_number) {
        this.post_number = post_number;
    }

    public int getPost_type() {
        return post_type;
    }

    public void setPost_type(int post_type) {
        this.post_type = post_type;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public int getReply_count() {
        return reply_count;
    }

    public void setReply_count(int reply_count) {
        this.reply_count = reply_count;
    }

    public Integer getReply_to_post_number() {
        return reply_to_post_number;
    }

    public void setReply_to_post_number(Integer reply_to_post_number) {
        this.reply_to_post_number = reply_to_post_number;
    }

    public int getQuote_count() {
        return quote_count;
    }

    public void setQuote_count(int quote_count) {
        this.quote_count = quote_count;
    }

    public int getIncoming_link_count() {
        return incoming_link_count;
    }

    public void setIncoming_link_count(int incoming_link_count) {
        this.incoming_link_count = incoming_link_count;
    }

    public int getReads() {
        return reads;
    }

    public void setReads(int reads) {
        this.reads = reads;
    }

    public int getReaders_count() {
        return readers_count;
    }

    public void setReaders_count(int readers_count) {
        this.readers_count = readers_count;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public boolean isYours() {
        return yours;
    }

    public void setYours(boolean yours) {
        this.yours = yours;
    }

    public int getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(int topic_id) {
        this.topic_id = topic_id;
    }

    public String getTopic_slug() {
        return topic_slug;
    }

    public void setTopic_slug(String topic_slug) {
        this.topic_slug = topic_slug;
    }
}

