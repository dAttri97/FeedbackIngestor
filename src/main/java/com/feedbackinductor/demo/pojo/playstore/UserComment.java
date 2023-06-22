package com.feedbackinductor.demo.pojo.playstore;

import com.feedbackinductor.demo.utils.Language;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserComment {
    private String text;

    private String lastModified;

    private StarRating starRating;

    private String language;


    public String setText() {
        return text;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public void setStarRating(StarRating starRating) {
        this.starRating = starRating;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getText() {
        return text;
    }

    public String getLastModified() {
        return lastModified;
    }

    public StarRating getStarRating() {
        return starRating;
    }

    public String getLanguage() {
        return language;
    }
}
