package com.feedbackinductor.demo.service;

import com.feedbackinductor.demo.model.twitter.TwitterData;
import com.google.gson.Gson;

public class TwitterSourceImpl implements InputSource<TwitterData> {
    private Gson gson = new Gson();
    @Override
    public void initialize() {

    }

    @Override
    public void pull() {

    }

    @Override
    public TwitterData parseData(String inputData) {
        TwitterData myData = gson.fromJson(inputData, TwitterData.class);
        return myData;
    }
}
