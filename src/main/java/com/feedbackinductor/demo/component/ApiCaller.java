package com.feedbackinductor.demo.component;

import com.feedbackinductor.demo.service.DiscourseService;
import org.springframework.beans.factory.annotation.Autowired;

public class ApiCaller {
    private final DiscourseService discourseService;

    @Autowired
    public ApiCaller(DiscourseService discourseService) {
        this.discourseService = discourseService;
    }

    public void getTopics() {
        discourseService.fetchTopics();
    }
}
