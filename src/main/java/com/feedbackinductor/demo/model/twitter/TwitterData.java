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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IngestedData{");
        sb.append("List<Tweet>='" + data);
        sb.append(", MetaData='" + meta);
        sb.append("}");
        return sb.toString();
    }

}

