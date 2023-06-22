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
    @JsonProperty("avatar_template")
    private String avatarTemplate;
    @JsonProperty("created_at")
    private String createdAt;
    private String cooked;
    @JsonProperty("post_number")
    private int postNumber;
    @JsonProperty("post_type")
    private int postType;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("reply_count")
    private int replyCount;
    @JsonProperty("reply_to_post_number")
    private Integer replyToPostNumber;
    @JsonProperty("quote_count")
    private int quoteCount;
    @JsonProperty("incoming_link_count")
    private int incomingLinkCount;
    private int reads;
    @JsonProperty("readers_count")
    private int readersCount;
    private Double score;
    private boolean yours;
    @JsonProperty("topic_id")
    private int topicId;
    @JsonProperty("topic_slug")
    private String topicSlug;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCooked() {
        return cooked;
    }

    public void setCooked(String cooked) {
        this.cooked = cooked;
    }

    public int getReads() {
        return reads;
    }

    public void setReads(int reads) {
        this.reads = reads;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public boolean isYours() {
        return yours;
    }

    public void setYours(boolean yours) {
        this.yours = yours;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", avatarTemplate='" + avatarTemplate + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", cooked='" + cooked + '\'' +
                ", postNumber=" + postNumber +
                ", postType=" + postType +
                ", updatedAt='" + updatedAt + '\'' +
                ", replyCount=" + replyCount +
                ", replyToPostNumber=" + replyToPostNumber +
                ", quoteCount=" + quoteCount +
                ", incomingLinkCount=" + incomingLinkCount +
                ", reads=" + reads +
                ", readersCount=" + readersCount +
                ", score=" + score +
                ", yours=" + yours +
                ", topicId=" + topicId +
                ", topicSlug='" + topicSlug + '\'' +
                '}';
    }
}

