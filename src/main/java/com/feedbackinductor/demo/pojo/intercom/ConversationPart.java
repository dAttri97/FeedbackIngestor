package com.feedbackinductor.demo.pojo.intercom;

public class ConversationPart {
    private String part_type;
    private String id;
    private String body;
    private long created_at;
    private User author;

    // Getters and setters

    public String getPartType() {
        return part_type;
    }

    public void setPartType(String part_type) {
        this.part_type = part_type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public long getCreatedAt() {
        return created_at;
    }

    public void setCreatedAt(long created_at) {
        this.created_at = created_at;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
