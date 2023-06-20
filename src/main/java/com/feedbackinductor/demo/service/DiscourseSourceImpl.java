package com.feedbackinductor.demo.service;

import com.feedbackinductor.demo.model.IngestedData;
import com.feedbackinductor.demo.model.appData.IngestedPost;
import com.feedbackinductor.demo.model.discourse.Post;
import com.feedbackinductor.demo.model.discourse.PostData;
import com.feedbackinductor.demo.model.discourse.PostStream;
import com.google.gson.Gson;
import com.feedbackinductor.demo.utils.Convertor;

import org.apache.tomcat.util.bcel.Const;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

@Service
public class DiscourseSourceImpl implements IInputSource {
    Gson gson = new Gson();
    
    private String url;
    private List<string> postsToProcess;
    public enum identifier = SOURCE.DISCORD;


    @Override
    public void initialize() {
        this.url = "https://meta.discourse.org/search.json";

        this.postsToProcess = new List<string>();
    }

    @Override
    public void pull() {
        this.pullPost();
        this,pullComments();
       
    }

    public void pullPosts() {
        string samplePost = "{\"post\":{\"id\":872227,\"name\":\"\",\"username\":\"taher1\",\"avatar_template\":\"/user_avatar/meta.discourse.org/taher1/{size}/182563_2.png\",\"created_at\":\"2021-01-11T03:24:05.977Z\",\"cooked\":\"<p>I’vesetupemailfeedbackforwardingasdescribedinthepostforSESbutI’mnotgettingbouncenotificationsindiscourse.Doineedtocreateasnswebhook?OrdoIneedtoenableVERP?Pleasehelp.</p>\",\"post_number\":173,\"post_type\":1,\"updated_at\":\"2021-01-11T03:25:21.625Z\",\"reply_count\":1,\"reply_to_post_number\":null,\"quote_count\":0,\"incoming_link_count\":0,\"reads\":31,\"readers_count\":30,\"score\":26.2,\"yours\":false,\"topic_id\":45343,\"topic_slug\":\"handling-bouncing-e-mails\"}}"

        this.postsToProcess.add(samplePost)
    }

    public void pullComments() {
        String comments = "{\"data\":[{\"id\":\"1405535537980472834\",\"text\":\"Hello,TwitterAPI!\",\"author_id\":\"1234567890\",\"created_at\":\"2021-06-17T10:30:00.000Z\"},{\"id\":\"1405535549920517633\",\"text\":\"Excitedtoannounceournewproduct!\",\"author_id\":\"987654321\",\"created_at\":\"2021-06-17T10:31:00.000Z\"}],\"meta\":{\"newest_id\":\"1405535537980472834\",\"oldest_id\":\"1405535549920517633\",\"result_count\":10,\"next_token\":\"b26v89c19zqg8o3f\"}}";
                List<IngestedData> ingestedDataList = twitterSourceImpl.parseData(data);
                return ingestedDataList;
    }

    @Override
    public List<IngestedData> parseData() throws ParseException {
        
       
    }

    private List<IngestedData> pasePost() throws ParseException {
        IngestedData post = new IngestedData()
        post.type = "Post";

        Post myData = gson.fromJson(inputData, Post.class);
        return Convertor.getIngestedDataFromDiscourseResponse(myData);
    }


}
