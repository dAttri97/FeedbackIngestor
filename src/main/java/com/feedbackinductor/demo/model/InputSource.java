package com.feedbackinductor.demo.model;

public interface InputSource {

    void initialize();

    void pull();

    String parseMetadata();

    String parseData();
}
