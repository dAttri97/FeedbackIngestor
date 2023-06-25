package com.feedbackinductor.demo.pojo.playstore;

import com.feedbackinductor.demo.utils.Language;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserComment {
    private String text;

    private long lastModified;

    private int starRating;

    private String language;


    public String setText() {
        return text;
    }

    public void setLastModified(long lastModified) {
        this.lastModified = lastModified;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getText() {
        return text;
    }

    public long getLastModified() {
        return lastModified;
    }

    public int getStarRating() {
        return starRating;
    }

    public String getLanguage() {
        return language;
    }
}
