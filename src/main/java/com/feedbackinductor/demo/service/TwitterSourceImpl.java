package com.feedbackinductor.demo.service.impl;

import com.feedbackinductor.demo.model.IngestedData;
import com.feedbackinductor.demo.model.twitter.TwitterData;
import com.feedbackinductor.demo.service.InputSource;
import com.google.gson.Gson;
import com.feedbackinductor.demo.utils.Convertor;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class TwitterSourceImpl implements InputSource {
    private Gson gson = new Gson();
    @Override
    public void initialize() {

    }

    @Override
    public void pull() {

    }

    @Override
    public List<IngestedData> parseData(String inputData) throws ParseException {
        TwitterData myData = gson.fromJson(inputData, TwitterData.class);
        if(Objects.isNull(myData))
            return new ArrayList<>();
        System.out.println(myData);
        return Convertor.getIngestedDataFromTwitterData(myData);
    }
}
