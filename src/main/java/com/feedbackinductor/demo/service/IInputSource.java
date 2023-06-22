package com.feedbackinductor.demo.service;


import com.feedbackinductor.demo.pojo.appData.IData;

import java.text.ParseException;
import java.util.List;

public interface IInputSource {

    void initialize();

    void pull();

    List<IData> parseData() throws ParseException;

}
