package com.feedbackinductor.demo.service;

public interface InputSource<T> {

    void initialize();

    void pull();

    T parseData(String inputSource);

}
