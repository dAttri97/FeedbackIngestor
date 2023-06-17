package com.feedbackinductor.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private int id;
    private String username;
    private String name;
    private String avatar_template;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar_template() {
        return avatar_template;
    }

    public void setAvatar_template(String avatar_template) {
        this.avatar_template = avatar_template;
    }
}

