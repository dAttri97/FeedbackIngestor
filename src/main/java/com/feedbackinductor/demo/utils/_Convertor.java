package com.feedbackinductor.demo.utils;

import com.feedbackinductor.demo.model.IngestedData;
import com.feedbackinductor.demo.model.discourse.PostData;
import com.feedbackinductor.demo.model.discourse.PostStream;
import com.feedbackinductor.demo.model.discourse.Post;
import com.feedbackinductor.demo.model.twitter.Tweet;
import com.feedbackinductor.demo.model.twitter.TwitterData;
import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@UtilityClass
public class Convertor {

    private static String DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    public List<IngestedData> getIngestedDataFromDiscourseResponse(Post post) throws ParseException {
        System.out.println(post);
        List<IngestedData> ingestedDataList = new ArrayList<>();
//        for(Post post:response.getPostStream().getPosts()) {
            IngestedData ingestedData = new IngestedData();
            ingestedData.setBody(post.getCooked());
            ingestedData.setUserName(post.getUsername());
            ingestedData.setDate(parseStringDate(post.getCreatedAt()));
            ingestedDataList.add(ingestedData);
//        }
        return ingestedDataList;
    }

    public List<IngestedData> getIngestedDataFromTwitterData(@NonNull TwitterData twitterData) throws ParseException {
        List<IngestedData> ingestedDataList = new ArrayList<>();
        if(!Objects.isNull(twitterData.getData())) {
            for(Tweet tweet:twitterData.getData()) {
                IngestedData ingestedData = new IngestedData();
                ingestedData.setBody(tweet.getText());
                ingestedData.setUserName(tweet.getAuthorId());
                ingestedData.setDate(parseStringDate(tweet.getCreatedAt()));
                ingestedDataList.add(ingestedData);
            }
        }
        return ingestedDataList;
    }

    private Date parseStringDate(String date) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_PATTERN);
        return dateFormat.parse(date);
    }

}
