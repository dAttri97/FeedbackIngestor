package com.feedbackinductor.demo.service;

import com.feedbackinductor.demo.model.discourse.DiscourseResponse;
import com.google.gson.Gson;

public class DiscourseSourceImpl implements InputSource<DiscourseResponse> {
    Gson gson = new Gson();
    @Override
    public void initialize() {

    }

    @Override
    public void pull() {

    }

    @Override
    public DiscourseResponse parseData(String inputData) {
        DiscourseResponse myData = gson.fromJson(inputData, DiscourseResponse.class);
        return myData;
    }
}
