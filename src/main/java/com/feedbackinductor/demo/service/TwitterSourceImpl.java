package com.feedbackinductor.demo.service;

import com.feedbackinductor.demo.pojo.appData.IData;
import com.feedbackinductor.demo.pojo.twitter.TwitterData;
import com.feedbackinductor.demo.utils.Constants;
import com.feedbackinductor.demo.utils.Convertor;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Service
public class TwitterSourceImpl implements IInputSource {
    private Gson gson;
    @Value("${twitter.api.base-url}")
    private String twitterAPIBaseUrl;
    private List<String> tweetsToProcess;
    @Override
    public void initialize() {
        gson = new Gson();
        tweetsToProcess = new ArrayList<>();
    }

    @Override
    public void pull() {
        pullDataFromTwitter();
    }

    @Override
    public List<IData> parseData() throws ParseException {
        List<IData> list = new ArrayList<>();
        for(String tweet:tweetsToProcess) {
            TwitterData data = gson.fromJson(tweet, TwitterData.class);
            System.out.println(data);
            list.add(Convertor.getIngestedDataFromTwitterData(data));
        }
        return list;
    }

    private void pullDataFromTwitter() {
        tweetsToProcess.add(Constants.TWEET_1);
        tweetsToProcess.add(Constants.TWEET_2);
    }

}
