package com.feedbackinductor.demo.pojo.playstore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeveloperReply {
    private String replyText;

    public String getReplyText() {
        return replyText;
    }

    public void setReplyText(String replyText) {
        this.replyText = replyText;
    }
}
