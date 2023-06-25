package com.feedbackinductor.demo.pojo.twitter;

public class Tweet {
    private String id;
    private String text;
    private String author_id;
    private String created_at;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthorId() {
        return author_id;
    }

    public void setAuthorId(String authorId) {
        this.author_id = authorId;
    }

    public String getCreatedAt() {
        return created_at;
    }

    public void setCreatedAt(String createdAt) {
        this.created_at = createdAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IngestedData{");
        sb.append("id='" + id);
        sb.append(", author_id='" + author_id);
        sb.append(", created_at=" + created_at);
        sb.append(", text=" + text);
        sb.append("}");
        return sb.toString();
    }
}
