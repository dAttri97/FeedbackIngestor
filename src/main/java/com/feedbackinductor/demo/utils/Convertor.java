package com.feedbackinductor.demo.utils;


import com.feedbackinductor.demo.pojo.appData.DiscourseIData;
import com.feedbackinductor.demo.pojo.appData.IData;
import com.feedbackinductor.demo.pojo.appData.PlayStoreIData;
import com.feedbackinductor.demo.pojo.appData.TwitterIData;
import com.feedbackinductor.demo.pojo.discourse.Post;
import com.feedbackinductor.demo.pojo.discourse.PostData;
import com.feedbackinductor.demo.pojo.playstore.Review;
import com.feedbackinductor.demo.pojo.playstore.UserComment;
import com.feedbackinductor.demo.pojo.twitter.TwitterData;
import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@UtilityClass
public class Convertor {

    private static String DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    private static long iDataID = 1;

    public IData getIDataFromTwitterData(@NonNull TwitterData twitterData) throws ParseException {
        IData iData = new IData();
        iData.setId(iDataID++);
        iData.setCreatedAt(new Date(System.currentTimeMillis()));
        iData.setSource(Source.TWITTER);
        iData.setType(DataType.TWEET);
        iData.setLanguage(Language.valueOf(twitterData.getLanguage()));
        iData.setAuthorID(String.valueOf(twitterData.getUser().getId()));
        iData.setData(getTwitterIDataFromTwitterDate(twitterData));
        return iData;
    }

    public TwitterIData getTwitterIDataFromTwitterDate(@NonNull TwitterData twitterData) throws ParseException {
        TwitterIData data = new TwitterIData();
        data.setCreatedAt(parseStringDate(twitterData.getCreated_at()));
        data.setVerified(twitterData.getUser().isVerified());
        data.setPostID(twitterData.getId());
        data.setRetweetCount(twitterData.getRetweet_count());
        data.setFavouriteCount(twitterData.getFavorite_count());
        data.setUserID(twitterData.getUser().getId());
        data.setBody(twitterData.getText());
        return data;
    }

    public IData getIDataFromReviewData(@NonNull Review review) throws ParseException {
        IData iData = new IData();
        UserComment comment = review.getComments()[0].getUserComment();
        iData.setId(iDataID++);
        iData.setCreatedAt(new Date(System.currentTimeMillis()));
        iData.setSource(Source.PLAYSTORE);
        iData.setType(DataType.REVIEW);
        iData.setLanguage(Language.valueOf(comment.getLanguage()));
        iData.setAuthorID(review.getAuthorName());
        iData.setData(getPlayStoreIDataFromReview(review));
        return iData;
    }

    private PlayStoreIData getPlayStoreIDataFromReview(Review review) throws ParseException {
        UserComment comment = review.getComments()[0].getUserComment();
        PlayStoreIData data = new PlayStoreIData();
        data.setAuthorName(review.getAuthorName());
        data.setBody(comment.getText());
        data.setStarRating(comment.getStarRating());
        data.setReviewId(review.getReviewId());
        data.setLastModified(new Date(comment.getLastModified()*1000));
        return data;
    }

    public IData getIDataFromPostData(@NonNull PostData data) throws ParseException {
        IData iData = new IData();
        iData.setId(iDataID++);
        iData.setCreatedAt(new Date(System.currentTimeMillis()));
        iData.setSource(Source.DISCOURSE);
        iData.setType(DataType.POST);
        iData.setLanguage(Language.EN);
        iData.setAuthorID(data.getPostStream().getPosts().get(0).getUsername());
        iData.setData(getDiscourseIDataFromPostData(data));
        return iData;
    }

    public DiscourseIData getDiscourseIDataFromPostData(@NonNull PostData data) throws ParseException {
        Post post = data.getPostStream().getPosts().get(0);
        DiscourseIData discourseIData = new DiscourseIData();
        discourseIData.setId(post.getId());
        discourseIData.setUserName(post.getUsername());
        discourseIData.setCreatedAt(parseStringDate(post.getCreated_at()));
        discourseIData.setBody(post.getCooked());
        discourseIData.setReads(post.getReads());
        discourseIData.setReaders_count(post.getReaders_count());
        discourseIData.setScore(post.getScore());
        discourseIData.setReply_count(post.getReply_count());
        return discourseIData;
    }

    private Date parseStringDate(String date) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_PATTERN);
        return dateFormat.parse(date);
    }

}
