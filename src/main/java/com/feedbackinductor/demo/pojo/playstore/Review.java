package com.feedbackinductor.demo.pojo.playstore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Review {
    private String reviewId;
    private String userName;
    private String userComment;
    private int userRating;
    private String reviewDate;
    private String appVersion;
    private DeveloperReply developerReply;

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserComment() {
        return userComment;
    }

    public void setUserComment(String userComment) {
        this.userComment = userComment;
    }

    public int getUserRating() {
        return userRating;
    }

    public void setUserRating(int userRating) {
        this.userRating = userRating;
    }

    public String getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(String reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public DeveloperReply getDeveloperReply() {
        return developerReply;
    }

    public void setDeveloperReply(DeveloperReply developerReply) {
        this.developerReply = developerReply;
    }
}
