package com.feedbackinductor.demo.service.impl;

import com.feedbackinductor.demo.model.IngestedData;
import com.feedbackinductor.demo.model.discourse.Post;
import com.feedbackinductor.demo.model.discourse.PostData;
import com.feedbackinductor.demo.model.discourse.PostStream;
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
        Post myData = gson.fromJson(inputData, Post.class);
        return Convertor.getIngestedDataFromDiscourseResponse(myData);
    }
}
