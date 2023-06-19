package com.feedbackinductor.demo.model.twitter;

import java.util.List;

public class TwitterData {
    private List<Tweet> data;
    private MetaData meta;

    public List<Tweet> getData() {
        return data;
    }

    public void setData(List<Tweet> data) {
        this.data = data;
    }

    public MetaData getMeta() {
        return meta;
    }

    public void setMeta(MetaData meta) {
        this.meta = meta;
    }

}

