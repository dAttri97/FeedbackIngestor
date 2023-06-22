package com.feedbackinductor.demo.service;

import com.feedbackinductor.demo.pojo.appData.IData;
import com.feedbackinductor.demo.pojo.playstore.Review;
import com.feedbackinductor.demo.pojo.twitter.TwitterData;
import com.feedbackinductor.demo.utils.Convertor;
import com.google.gson.Gson;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static com.feedbackinductor.demo.utils.Constants.REVIEW_1;
import static com.feedbackinductor.demo.utils.Constants.REVIEW_2;

public class PlaystoreSourceImpl implements IInputSource {
    private Gson gson;
    private List<String> reviewsToProcess;
    @Override
    public void initialize() {
        gson = new Gson();
        reviewsToProcess = new ArrayList<>();
    }

    @Override
    public void pull() {
        reviewsToProcess.add(REVIEW_1);
        reviewsToProcess.add(REVIEW_2);
    }

    @Override
    public List<IData> parseData() throws ParseException {
        List<IData> list = new ArrayList<>();
        for(String review:reviewsToProcess) {
            Review data = gson.fromJson(review, Review.class);
            System.out.println(data);
            list.add(Convertor.getIngestedDataFromReviewData(data));
        }
        return list;
    }
}
