package com.feedbackinductor.demo.utils;


import com.feedbackinductor.demo.pojo.appData.IData;
import com.feedbackinductor.demo.pojo.appData.IngestedData;
import com.feedbackinductor.demo.pojo.discourse.Post;
import com.feedbackinductor.demo.pojo.playstore.Comment;
import com.feedbackinductor.demo.pojo.playstore.Review;
import com.feedbackinductor.demo.pojo.playstore.UserComment;
import com.feedbackinductor.demo.pojo.twitter.TwitterData;
import com.feedbackinductor.demo.pojo.twitter.TwitterMetadata;
import lombok.NonNull;
import lombok.experimental.UtilityClass;
import org.yaml.snakeyaml.events.Event;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    public IData getIngestedDataFromTwitterData(@NonNull TwitterData twitterData) throws ParseException {
        IData iData = new IData();
        iData.setLanguage(Language.valueOf(twitterData.getLanguage()));
        iData.setAuthorID(twitterData.getUser().getId());
        iData.setCreatedDate(parseStringDate(twitterData.getCreated_at()));
        iData.setBody(twitterData.getText());
        iData.setPostID(twitterData.getId());
        iData.setMetaData(getTwitterMetaDataFromTwitterDate(twitterData));
        iData.setSource(DataType.TWEET);
        return iData;
    }

    public TwitterMetadata getTwitterMetaDataFromTwitterDate(@NonNull TwitterData twitterData) throws ParseException {
        TwitterMetadata metadata = new TwitterMetadata();
        metadata.setCreated_at(parseStringDate(twitterData.getCreated_at()));
        metadata.setVerified(twitterData.getUser().isVerified());
        metadata.setPostID(twitterData.getId());
        metadata.setRetweet_count(twitterData.getRetweet_count());
        metadata.setFavorite_count(twitterData.getFavorite_count());
        metadata.setUserID(twitterData.getUser().getId());
        return metadata;
    }

    public IData getIngestedDataFromReviewData(@NonNull Review review) throws ParseException {
        IData iData = new IData();
        UserComment comment = review.getComments()[0].getUserComment();
        iData.setLanguage(Language.valueOf(comment.getLanguage()));
//        iData.setAuthorID(twitterData.getUser().getId());
        iData.setCreatedDate(secondsStringDate(comment.getLastModified()));
        iData.setBody(comment.getText());
        iData.setPostID(review.getReviewId());
//        iData.setMetaData(getTwitterMetaDataFromTwitterDate(twitterData));
        iData.setSource(DataType.TWEET);
        return iData;
    }

//    public TwitterMetadata getTwitterMetaDataFromTwitterDate(@NonNull TwitterData twitterData) throws ParseException {
//        TwitterMetadata metadata = new TwitterMetadata();
//        metadata.setCreated_at(parseStringDate(twitterData.getCreated_at()));
//        metadata.setVerified(twitterData.getUser().isVerified());
//        metadata.setPostID(twitterData.getId());
//        metadata.setRetweet_count(twitterData.getRetweet_count());
//        metadata.setFavorite_count(twitterData.getFavorite_count());
//        metadata.setUserID(twitterData.getUser().getId());
//        return metadata;
//    }


    private Date parseStringDate(String date) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_PATTERN);
        return dateFormat.parse(date);
    }

    private Date secondsStringDate(String seconds) throws ParseException {
        final long second = Long.valueOf(seconds);
        final long milliSec = second*1000;
        return new Date(milliSec);
    }

}
