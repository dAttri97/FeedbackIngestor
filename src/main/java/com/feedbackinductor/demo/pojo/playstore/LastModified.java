package com.feedbackinductor.demo.pojo.playstore;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
class LastModified {
    private String seconds;
    private String nanos;

    public void setSeconds(String seconds) {
        this.seconds = seconds;
    }

    public void setNanos(String nanos) {
        this.nanos = nanos;
    }

    public String getSeconds() {
        return seconds;
    }

    public String getNanos() {
        return nanos;
    }
}
