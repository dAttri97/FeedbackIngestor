package com.feedbackinductor.demo.service;

import com.feedbackinductor.demo.model.IngestedData;

import java.text.ParseException;
import java.util.List;

public interface InputSource {

    void initialize();

    void pull();

    List<IngestedData> parseData(String inputSource) throws ParseException;

}
