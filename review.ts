enum DataType { 
    Post=1,
    Review=1
    Feedback=1
}

interface ICommonFields {
    record_lang 
    record_type
    source 
}

class Post extends ICommonFields { 
    data
}

class review extends ICommonFields {
    data
    reviewr 
    comments []
}

class 


interface ISource { 
    this.metadata: (JSON) = {},
    this. 


    initialize() { 

    }

    pull()  {

    }

    parseMetadata() { 

    }

    parseData() { 

    }
}



class Disocrd implements ISource {

}

class APICaller() { 
    
    // instintiate atleast two sources
    // parse atleast two two different types of data from individual soruce
    // store them into one commonData array
    // print them using individual print mechanism 
    
}

function main() { 
    APICaller()
}



test () { 
    discordPost = ""'
    {
        "post_stream": {
        "posts": [
        {
        "id": 872227,
        "name": "",
        "username": "taher1",
        "avatar_template": "/user_avatar/meta.discourse.org/taher1/{size}/182
        563_2.png",
        "created_at": "2021-01-11T03:24:05.977Z",
        "cooked": "<p>I’ve setup email feedback forwarding as described in th
        e post for SES but I’m not getting bounce notifications in discourse. Do i need to cr
        eate a sns webhook? Or do I need to enable VERP? Please help.</p>",
        "post_number": 173,
        "post_type": 1,
        "updated_at": "2021-01-11T03:25:21.625Z",
        "reply_count": 1,
        "reply_to_post_number": null,
        "quote_count": 0,
        "incoming_link_count": 0,
        "reads": 31,
        "readers_count": 30,
        "score": 26.2,
        "yours": false,
        "topic_id": 45343,
        "topic_slug": "handling-bouncing-e-mails"
        }
        ]
        },
        "id": 45343
        }
    """

    twitterPost = """
    {
        "post_stream": {
        "posts": [
        {
        "id": 872227,
        "name": "",
        "username": "taher1",
        "avatar_template": "/user_avatar/meta.discourse.org/taher1/{size}/182
        563_2.png",
        "created_at": "2021-01-11T03:24:05.977Z",
        "cooked": "<p>I’ve setup email feedback forwarding as described in th
        e post for SES but I’m not getting bounce notifications in discourse. Do i need to cr
        eate a sns webhook? Or do I need to enable VERP? Please help.</p>",
        "post_number": 173,
        "post_type": 1,
        "updated_at": "2021-01-11T03:25:21.625Z",
        "reply_count": 1,
        "reply_to_post_number": null,
        "quote_count": 0,
        "incoming_link_count": 0,
        "reads": 31,
        "readers_count": 30,
        "score": 26.2,
        "yours": false,
        "topic_id": 45343,
        "topic_slug": "handling-bouncing-e-mails"
        }
        ]
        },
        "id": 45343
        }
    """
    
        source1= twitter
        source2= discord 

        ICommonData[]

        ICommonData d = twitter.getData(twitterPost)
        ICommonData d2 = discord.getData(discordPost)

        // printAll ICommonData
        if icommondata.type == "COMMENTT"
            ddata.cast into Comment , comment.print()
    }    



    https://updates.cdn-apple.com/2022SpringFCS/fullrestores/002-54009/203B9DC0-AF9B-4371-810A-D5B30B7AD5EE/iBridge2,1,iBridge2,10,iBridge2,12,iBridge2,14,iBridge2,15,iBridge2,16,iBridge2,19,iBridge2,20,iBridge2,21,iBridge2,22,iBridge2,3,iBridge2,4,iBridge2,5,iBridge2,6,iBridge2,7,iBridge2,8_8.5_20P2059_Restore.ipsw   


    https://updates.cdn-apple.com/2023SpringFCS/fullrestores/032-42172/F41836DF-78E0-46A8-904E-5626FBD3BE12/iBridge2,1,iBridge2,10,iBridge2,12,iBridge2,14,iBridge2,15,iBridge2,16,iBridge2,19,iBridge2,20,iBridge2,21,iBridge2,22,iBridge2,3,iBridge2,4,iBridge2,5,iBridge2,6,iBridge2,7,iBridge2,8_7.5_20P5058_Restore.ipsw

    