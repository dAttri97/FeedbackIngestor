package com.feedbackinductor.demo.pojo.appData;

import com.feedbackinductor.demo.utils.Language;
import com.feedbackinductor.demo.utils.DataType;
import com.feedbackinductor.demo.utils.Source;

import java.util.Date;

/**
 * Represents the uniform internal structure, that is being used to store the data.
 * It contains fields that are common to all the sources.
 * @param <T> Source specific data & metadata.
 */
public class IData<T> {
    private long id;
    private Date createdAt;
    private Source source;
    private DataType type;
    private Language language;
    private String authorID;
    private T data;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public DataType getType() {
        return type;
    }

    public void setType(DataType type) {
        this.type = type;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
