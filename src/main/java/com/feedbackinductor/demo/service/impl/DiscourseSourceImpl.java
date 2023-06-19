package com.feedbackinductor.demo.service.impl;

import com.feedbackinductor.demo.model.IngestedData;
import com.feedbackinductor.demo.model.discourse.DiscourseResponse;
import com.feedbackinductor.demo.service.InputSource;
import com.google.gson.Gson;
import com.feedbackinductor.demo.utils.Convertor;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

@Service
public class DiscourseSourceImpl implements InputSource {
    Gson gson = new Gson();
    @Override
    public void initialize() {

    }

    @Override
    public void pull() {

    }

    @Override
    public List<IngestedData> parseData(String inputData) throws ParseException {
        DiscourseResponse myData = gson.fromJson(inputData, DiscourseResponse.class);
        return Convertor.getIngestedDataFromDiscourseResponse(myData);
    }
}
