package com.feedbackinductor.demo.pojo.appData;

import com.feedbackinductor.demo.utils.DataType;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class IngestedData {
    private String user_name;
    private String body;
    private Date date;
    DataType dataType = DataType.TWEET;

    public String getUserName() {
        return user_name;
    }

    public void setUserName(String user_name) {
        this.user_name = user_name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IngestedData{");
        sb.append("user_name='" + user_name);
        sb.append(", body='" + body);
        sb.append(", date=" + date);
        sb.append("\n}");
        return sb.toString();
    }

}
