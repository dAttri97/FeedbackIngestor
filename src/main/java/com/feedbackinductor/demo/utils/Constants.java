package com.feedbackinductor.demo.utils;

public class Constants {
    public final static String TWEET_1 = "{\"created_at\":\"2020-09-18T18:36:15.000Z\",\"id\":140199395325270017,\"text\":\"Just had the most amazing dinner at that new restaurant in town!#foodie#yum\",\"user\":{\"id\":123456789,\"name\":\"JohnDoe\",\"screen_name\":\"johndoe\",\"followers_count\":5000,\"friends_count\":1000,\"verified\":false},\"retweet_count\":10,\"favorite_count\":50,\"language\":\"EN\",\"hashtags\":[{\"text\":\"foodie\",\"indices\":[49,56]},{\"text\":\"yum\",\"indices\":[57,61]}]}";

    public final static String TWEET_2 = "{\"created_at\":\"2020-09-18T18:36:15.000Z\",\"id\":140199395325270017,\"text\":\"Justhadthemostamazingdinneratthatnewrestaurantintown!#foodie#yum\",\"user\":{\"id\":123456789,\"name\":\"JohnDoe\",\"screen_name\":\"johndoe\",\"followers_count\":5000,\"friends_count\":1000,\"verified\":false},\"retweet_count\":10,\"favorite_count\":50,\"language\":\"EN\",\"hashtags\":[{\"text\":\"foodie\",\"indices\":[49,56]},{\"text\":\"yum\",\"indices\":[57,61]}]}";

    public final static String REVIEW_1 = "{\"reviewId\":\"87654321\",\"authorName\":\"JoanSmith\",\"comments\":[{\"userComment\":{\"text\":\"Thisappisawesome!\",\"lastModified\":1452114723,\"starRating\":5,\"language\":\"en\"}}]}";

    public final static String REVIEW_2 = "{\"reviewId\":\"87654321\",\"authorName\":\"JoanSmith\",\"comments\":[{\"userComment\":{\"text\":\"Thisappisawesome!\",\"lastModified\":1452114723,\"starRating\":5,\"language\":\"en\"}}]}";

    public final static String POST_1 = "{\"post_stream\":{\"posts\":[{\"id\":872227,\"name\":\"\",\"username\":\"taher1\",\"avatar_template\":\"/user_avatar/meta.discourse.org/taher1/{size}/182563_2.png\",\"created_at\":\"2021-01-11T03:24:05.977Z\",\"cooked\":\"<p>I’ve setup email feedback forwarding as described in the post for SES but I’m not getting bounce notifications in discourse.Do i need to create a sns webhook? Or do I need to enable VERP? Please help.</p>\",\"post_number\":173,\"post_type\":1,\"updated_at\":\"2021-01-11T03:25:21.625Z\",\"reply_count\":1,\"reply_to_post_number\":null,\"quote_count\":0,\"incoming_link_count\":0,\"reads\":31,\"readers_count\":30,\"score\":26.2,\"yours\":false,\"topic_id\":45343,\"topic_slug\":\"handling-bouncing-e-mails\"}]},\"id\":45343}";
}
