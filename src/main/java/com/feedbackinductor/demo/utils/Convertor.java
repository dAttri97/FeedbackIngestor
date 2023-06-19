package com.feedbackinductor.demo.utils;

import com.feedbackinductor.demo.model.IngestedData;
import com.feedbackinductor.demo.model.discourse.DiscourseResponse;
import com.feedbackinductor.demo.model.discourse.Post;
import com.feedbackinductor.demo.model.twitter.Tweet;
import com.feedbackinductor.demo.model.twitter.TwitterData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Convertor {

    private static String DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    public List<IngestedData> getIngestedDataFromDiscourseResponse(DiscourseResponse response) throws ParseException {
        List<IngestedData> ingestedDataList = new ArrayList<>();
        for(Post post:response.getPosts()) {
            IngestedData ingestedData = new IngestedData();
            ingestedData.setBody(post.getCooked());
            ingestedData.setUserName(post.getUsername());
            ingestedData.setDate(parseStringDate(post.getCreated_at()));
        }
        return ingestedDataList;
    }

    public List<IngestedData> getIngestedDataFromTwitterData(TwitterData twitterData) throws ParseException {
        List<IngestedData> ingestedDataList = new ArrayList<>();
        for(Tweet tweet:twitterData.getData()) {
            IngestedData ingestedData = new IngestedData();
            ingestedData.setBody(tweet.getText());
            ingestedData.setUserName(tweet.getAuthorId());
            ingestedData.setDate(parseStringDate(tweet.getCreatedAt()));
        }
        return ingestedDataList;
    }

    private Date parseStringDate(String date) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_PATTERN);
        return dateFormat.parse(date);
    }

}
