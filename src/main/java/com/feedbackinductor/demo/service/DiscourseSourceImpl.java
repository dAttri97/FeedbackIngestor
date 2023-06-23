package com.feedbackinductor.demo.service;

import com.feedbackinductor.demo.pojo.appData.IData;
import com.feedbackinductor.demo.pojo.discourse.PostData;
import com.feedbackinductor.demo.pojo.playstore.Review;
import com.feedbackinductor.demo.utils.Convertor;
import com.google.gson.Gson;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static com.feedbackinductor.demo.utils.Constants.POST_1;

@Service
public class DiscourseSourceImpl implements IInputSource {
    Gson gson;
    private List<String> postsToProcess;


    @Override
    public void initialize() {
        this.postsToProcess = new ArrayList<>();
        gson = new Gson();
    }

    @Override
    public void pullData() {
        postsToProcess.add(POST_1);
    }

    @Override
    public List<IData> parseData() throws ParseException {
        List<IData> list = new ArrayList<>();
        for(String post:postsToProcess) {
            PostData data = gson.fromJson(post, PostData.class);
            list.add(Convertor.getIDataFromPostData(data));
        }
        return list;
    }


}
