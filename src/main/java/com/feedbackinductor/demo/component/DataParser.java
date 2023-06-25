package com.feedbackinductor.demo.component;

import com.feedbackinductor.demo.pojo.appData.IData;
import com.feedbackinductor.demo.service.IInputSource;
import com.feedbackinductor.demo.utils.Source;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Parser acts as a layer between the individual sources and API controller.
 * sourceList can be updated to add/removes sources.
 * It has one common function to fetch data from all sources and store it in database.
 * For simplifying the solution separate filter functions have be created to fetch particular sources from database.
 * A common filter function can be created if we receive source in our API request.
 */
@Component
public class DataParser {
    /**
     * List to store all the sources we are currently using the fetch data.
     */
    private List<IInputSource> sourceList;

    /**
     * Assumption: The list represents a distributed database.
     */
    private List<IData> allData;

    public DataParser() {
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
