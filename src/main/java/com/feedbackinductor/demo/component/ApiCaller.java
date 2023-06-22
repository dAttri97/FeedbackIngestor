package com.feedbackinductor.demo.component;

import com.feedbackinductor.demo.pojo.appData.IData;
import com.feedbackinductor.demo.service.DiscourseSourceImpl;
import com.feedbackinductor.demo.service.IInputSource;

import com.feedbackinductor.demo.service.TwitterSourceImpl;
import com.feedbackinductor.demo.utils.DataType;
import com.feedbackinductor.demo.utils.Source;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.*;

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

    public void register(IInputSource source) {
        sourceList.add(source);
    }

    public List<IData> getAllData() throws ParseException {
        for(IInputSource source: sourceList) {
            source.pull();
            System.out.println(source.parseData());
            allData.addAll(source.parseData());
        }
        return allData;
    }

    public List<IData> getTweets() throws ParseException {
        getAllData();
        List<IData> twitterData = new ArrayList<>();
        for(IData data:allData) {
            if(Source.TWITTER.equals(data.getSource()))
                twitterData.add(data);
        }
        return twitterData;
    }

    public List<IData> getPlayStoreReviews() throws ParseException {
        getAllData();
        List<IData> twitterData = new ArrayList<>();
        for(IData data:allData) {
            if(Source.PLAYSTORE.equals(data.getSource()))
                twitterData.add(data);
        }
        return twitterData;
    }


}
