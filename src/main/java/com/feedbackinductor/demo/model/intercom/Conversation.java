package com.feedbackinductor.demo.model.intercom;

import java.util.List;

public class Conversation {
    private String id;
    private String type;
    private long created_at;
    private long updated_at;
    private User user;
    private User assignee;
    private ConversationMessage conversation_message;
    private List<ConversationPart> conversation_parts;

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getCreatedAt() {
        return created_at;
    }

    public void setCreatedAt(long created_at) {
        this.created_at = created_at;
    }

    public long getUpdatedAt() {
        return updated_at;
    }

    public void setUpdatedAt(long updated_at) {
        this.updated_at = updated_at;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getAssignee() {
        return assignee;
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }

    public ConversationMessage getConversationMessage() {
        return conversation_message;
    }

    public void setConversationMessage(ConversationMessage conversation_message) {
        this.conversation_message = conversation_message;
    }

    public List<ConversationPart> getConversationParts() {
        return conversation_parts;
    }

    public void setConversationParts(List<ConversationPart> conversation_parts) {
        this.conversation_parts = conversation_parts;
    }
}

