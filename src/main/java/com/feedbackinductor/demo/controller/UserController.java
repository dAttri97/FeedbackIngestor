package com.feedbackinductor.demo.controller;

import com.feedbackinductor.demo.component.ApiCaller;
import com.feedbackinductor.demo.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    ApiCaller apiCaller;
    @Autowired
    UserController(ApiCaller apiCaller) {
        this.apiCaller = apiCaller;
    }
    @GetMapping
    public List<Post> getUsers() {
        List<Post> postList = apiCaller.getDiscoursePosts();
        return postList;
    }
}
