package com.feedbackinductor.demo.component;

import com.feedbackinductor.demo.pojo.appData.IData;
import com.feedbackinductor.demo.service.DiscourseSourceImpl;
import com.feedbackinductor.demo.service.IInputSource;

import com.feedbackinductor.demo.service.TwitterSourceImpl;
import com.feedbackinductor.demo.utils.DataType;
import com.feedbackinductor.demo.utils.Source;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Component
public class ApiCaller {
    private static Map<Source, IInputSource> sources = new HashMap<>();
    private static List<IData> allData = new ArrayList<>();
    private final DiscourseSourceImpl discourseSource;
    private final TwitterSourceImpl twitterSource;

    @Autowired
    public ApiCaller(DiscourseSourceImpl discourseSource, TwitterSourceImpl twitterSource) {
        this.discourseSource = discourseSource;
        this.twitterSource = twitterSource;
//        sources.put(Source.DISCOURSE, this.discourseSource);
        sources.put(Source.TWITTER, this.twitterSource);
    }

    public List<IData> getAllData() throws ParseException {
        for(Map.Entry<Source, IInputSource> entry: sources.entrySet()) {
            IInputSource source = entry.getValue();
            source.initialize();
            source.pull();
            allData.addAll(source.parseData());
        }
        return allData;
    }

    public List<IData> getAllDiscoursePosts() {
        return null;
    }

    public List<IData> getAllTweets() {
        List<IData> twitterData = new ArrayList<>();
        for(IData data:this.allData) {
            if(DataType.TWEET.equals(data.getSource()))
                twitterData.add(data);
        }
        return twitterData;
    }



//    @GetMapping
//    public List<IngestedData> getDiscoursePosts() throws ParseException {
//        String data = "{\"post\":{\"id\":872227,\"name\":\"\",\"username\":\"taher1\",\"avatar_template\":\"/user_avatar/meta.discourse.org/taher1/{size}/182563_2.png\",\"created_at\":\"2021-01-11T03:24:05.977Z\",\"cooked\":\"<p>I’vesetupemailfeedbackforwardingasdescribedinthepostforSESbutI’mnotgettingbouncenotificationsindiscourse.Doineedtocreateasnswebhook?OrdoIneedtoenableVERP?Pleasehelp.</p>\",\"post_number\":173,\"post_type\":1,\"updated_at\":\"2021-01-11T03:25:21.625Z\",\"reply_count\":1,\"reply_to_post_number\":null,\"quote_count\":0,\"incoming_link_count\":0,\"reads\":31,\"readers_count\":30,\"score\":26.2,\"yours\":false,\"topic_id\":45343,\"topic_slug\":\"handling-bouncing-e-mails\"}}";
//        List<IngestedData> ingestedDataList = discourseSourceImpl.parseData(data);
//        return ingestedDataList;
//    }
//
//    @GetMapping
//    public List<IngestedData> getTweets() throws ParseException {
//        String data = "{\"data\":[{\"id\":\"1405535537980472834\",\"text\":\"Hello,TwitterAPI!\",\"author_id\":\"1234567890\",\"created_at\":\"2021-06-17T10:30:00.000Z\"},{\"id\":\"1405535549920517633\",\"text\":\"Excitedtoannounceournewproduct!\",\"author_id\":\"987654321\",\"created_at\":\"2021-06-17T10:31:00.000Z\"}],\"meta\":{\"newest_id\":\"1405535537980472834\",\"oldest_id\":\"1405535549920517633\",\"result_count\":10,\"next_token\":\"b26v89c19zqg8o3f\"}}";
//        List<IngestedData> ingestedDataList = twitterSourceImpl.parseData(data);
//        return ingestedDataList;
//    }


}
