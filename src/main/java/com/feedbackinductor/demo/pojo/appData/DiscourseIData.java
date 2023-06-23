package com.feedbackinductor.demo.pojo.appData;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DiscourseIData {
    private long id;
    private String userName;
    private Date createdAt;
    private String body;
    private long reads;
    private long readers_count;
    private double score;
    private long reply_count;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public long getReads() {
        return reads;
    }

    public void setReads(long reads) {
        this.reads = reads;
    }

    public long getReaders_count() {
        return readers_count;
    }

    public void setReaders_count(long readers_count) {
        this.readers_count = readers_count;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public long getReply_count() {
        return reply_count;
    }

    public void setReply_count(long reply_count) {
        this.reply_count = reply_count;
    }

}
