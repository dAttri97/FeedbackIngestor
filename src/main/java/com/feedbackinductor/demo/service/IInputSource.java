package com.feedbackinductor.demo.service;


import com.feedbackinductor.demo.pojo.appData.IData;

import java.text.ParseException;
import java.util.List;

/**
 * Defines the structure for initializing, pulling and parsing data from different sources like
 * Twitter, Discourse, PlayStore & Intercom.
 */
public interface IInputSource {
    /**
     * Initializes the datastore and parser.
     */
    void initialize();

    /**
     * Pulls data from the Source. We are assuming that we always receive data from source.
     */
    void pullData();

    /**
     * Parses data w.r.t the specific source. Transforms the data to uniform internal structure IData for
     * further processing.
     * @return List of IData
     * @throws ParseException
     */
    List<IData> parseData() throws ParseException;

}
