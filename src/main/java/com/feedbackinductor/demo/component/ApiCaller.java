package com.feedbackinductor.demo.component;

import com.feedbackinductor.demo.pojo.appData.IData;
import com.feedbackinductor.demo.service.IInputSource;
import com.feedbackinductor.demo.utils.Source;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Component
public class ApiCaller {
    private List<IInputSource> sourceList;
    /**
     * Assumption:
     *
     */
    private List<IData> allData;

    public ApiCaller() {
        this.sourceList = new ArrayList<>();
        this.allData = new ArrayList<>();
    }

    public void register(IInputSource source) throws ParseException {
        sourceList.add(source);
        source.pullData();
        allData.addAll(source.parseData());
    }

    public List<IData> getAllData() {
        return allData;
    }

    public List<IData> getTweets() {
        List<IData> twitterData = new ArrayList<>();
        for(IData data:allData) {
            if(Source.TWITTER.equals(data.getSource()))
                twitterData.add(data);
        }
        return twitterData;
    }

    public List<IData> getPlayStoreReviews() {
        List<IData> playStoreReviews = new ArrayList<>();
        for(IData data:allData) {
            if(Source.PLAYSTORE.equals(data.getSource()))
                playStoreReviews.add(data);
        }
        return playStoreReviews;
    }

    public List<IData> getDiscoursePosts() {
        List<IData> discoursePosts = new ArrayList<>();
        for(IData data:allData) {
            if(Source.DISCOURSE.equals(data.getSource()))
                discoursePosts.add(data);
        }
        return discoursePosts;
    }


}
