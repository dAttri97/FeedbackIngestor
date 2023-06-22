package com.feedbackinductor.demo.pojo.appData;

import com.feedbackinductor.demo.utils.Language;
import com.feedbackinductor.demo.utils.DataType;

import java.util.Date;

public class IData<T> {
    private Date createdDate;
    DataType source;
    private Language language;
    private long authorID;
    private long postID;
    private String body;
    T metaData;

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public DataType getSource() {
        return source;
    }

    public void setSource(DataType source) {
        this.source = source;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public long getAuthorID() {
        return authorID;
    }

    public void setAuthorID(long authorID) {
        this.authorID = authorID;
    }

    public long getPostID() {
        return postID;
    }

    public void setPostID(long postID) {
        this.postID = postID;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public T getMetaData() {
        return metaData;
    }

    public void setMetaData(T metaData) {
        this.metaData = metaData;
    }
}
