package com.feedbackinductor.demo.model.twitter;

public class MetaData {
    private String newest_id;
    private String oldest_id;
    private int result_count;
    private String next_token;

    public String getNewestId() {
        return newest_id;
    }

    public void setNewestId(String newestId) {
        this.newest_id = newestId;
    }

    public String getOldestId() {
        return oldest_id;
    }

    public void setOldestId(String oldestId) {
        this.oldest_id = oldestId;
    }

    public int getResultCount() {
        return result_count;
    }

    public void setResultCount(int resultCount) {
        this.result_count = resultCount;
    }

    public String getNextToken() {
        return next_token;
    }

    public void setNextToken(String nextToken) {
        this.next_token = nextToken;
    }
}
