package com.feedbackinductor.demo.model.discourse;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Post {
    private int id;
    private String username;
    private String avatar_template;
    private String created_at;
    private String cooked;
    private int post_number;
    private int post_type;
    private String updated_at;
    private int reply_count;
    private String reply_to_post_number;
    private int quote_count;
    private int incoming_link_count;
    private int reads;
    private int readers_count;
    private Integer score;
    private boolean yours;
    private int topic_id;
    private String topic_slug;
    private String primary_group_name;
    private String flair_name;
    private String flair_url;
    private String flair_bg_color;
    private String flair_color;
    private String flair_group_id;
    private int version;
    private boolean can_edit;
    private boolean can_delete;
    private boolean can_recover;
    private boolean can_see_hidden_post;
    private boolean can_wiki;
    private String user_title;
    private boolean bookmarked;
    private String raw;
    private List<ActionSummary> actions_summary;
    private boolean moderator;
    private boolean admin;
    private boolean staff;
    private int user_id;
    private boolean hidden;
    private int trust_level;
    private String deleted_at;
    private boolean user_deleted;
    private String edit_reason;
    private boolean can_view_edit_history;
    private boolean wiki;
    private String reviewable_id;
    private int reviewable_score_count;
    private int reviewable_score_pending_count;
    private List<Object> mentioned_users;
    private String name;
    private String display_username;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar_template() {
        return avatar_template;
    }

    public void setAvatar_template(String avatar_template) {
        this.avatar_template = avatar_template;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getCooked() {
        return cooked;
    }

    public void setCooked(String cooked) {
        this.cooked = cooked;
    }

    public int getPost_number() {
        return post_number;
    }

    public void setPost_number(int post_number) {
        this.post_number = post_number;
    }

    public int getPost_type() {
        return post_type;
    }

    public void setPost_type(int post_type) {
        this.post_type = post_type;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public int getReply_count() {
        return reply_count;
    }

    public void setReply_count(int reply_count) {
        this.reply_count = reply_count;
    }

    public String getReply_to_post_number() {
        return reply_to_post_number;
    }

    public void setReply_to_post_number(String reply_to_post_number) {
        this.reply_to_post_number = reply_to_post_number;
    }

    public int getQuote_count() {
        return quote_count;
    }

    public void setQuote_count(int quote_count) {
        this.quote_count = quote_count;
    }

    public int getIncoming_link_count() {
        return incoming_link_count;
    }

    public void setIncoming_link_count(int incoming_link_count) {
        this.incoming_link_count = incoming_link_count;
    }

    public int getReads() {
        return reads;
    }

    public void setReads(int reads) {
        this.reads = reads;
    }

    public int getReaders_count() {
        return readers_count;
    }

    public void setReaders_count(int readers_count) {
        this.readers_count = readers_count;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public boolean isYours() {
        return yours;
    }

    public void setYours(boolean yours) {
        this.yours = yours;
    }

    public int getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(int topic_id) {
        this.topic_id = topic_id;
    }

    public String getTopic_slug() {
        return topic_slug;
    }

    public void setTopic_slug(String topic_slug) {
        this.topic_slug = topic_slug;
    }

    public String getPrimary_group_name() {
        return primary_group_name;
    }

    public void setPrimary_group_name(String primary_group_name) {
        this.primary_group_name = primary_group_name;
    }

    public String getFlair_name() {
        return flair_name;
    }

    public void setFlair_name(String flair_name) {
        this.flair_name = flair_name;
    }

    public String getFlair_url() {
        return flair_url;
    }

    public void setFlair_url(String flair_url) {
        this.flair_url = flair_url;
    }

    public String getFlair_bg_color() {
        return flair_bg_color;
    }

    public void setFlair_bg_color(String flair_bg_color) {
        this.flair_bg_color = flair_bg_color;
    }

    public String getFlair_color() {
        return flair_color;
    }

    public void setFlair_color(String flair_color) {
        this.flair_color = flair_color;
    }

    public String getFlair_group_id() {
        return flair_group_id;
    }

    public void setFlair_group_id(String flair_group_id) {
        this.flair_group_id = flair_group_id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public boolean isCan_edit() {
        return can_edit;
    }

    public void setCan_edit(boolean can_edit) {
        this.can_edit = can_edit;
    }

    public boolean isCan_delete() {
        return can_delete;
    }

    public void setCan_delete(boolean can_delete) {
        this.can_delete = can_delete;
    }

    public boolean isCan_recover() {
        return can_recover;
    }

    public void setCan_recover(boolean can_recover) {
        this.can_recover = can_recover;
    }

    public boolean isCan_see_hidden_post() {
        return can_see_hidden_post;
    }

    public void setCan_see_hidden_post(boolean can_see_hidden_post) {
        this.can_see_hidden_post = can_see_hidden_post;
    }

    public boolean isCan_wiki() {
        return can_wiki;
    }

    public void setCan_wiki(boolean can_wiki) {
        this.can_wiki = can_wiki;
    }

    public String getUser_title() {
        return user_title;
    }

    public void setUser_title(String user_title) {
        this.user_title = user_title;
    }

    public boolean isBookmarked() {
        return bookmarked;
    }

    public void setBookmarked(boolean bookmarked) {
        this.bookmarked = bookmarked;
    }

    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }

    public List<ActionSummary> getActions_summary() {
        return actions_summary;
    }

    public void setActions_summary(List<ActionSummary> actions_summary) {
        this.actions_summary = actions_summary;
    }

    public boolean isModerator() {
        return moderator;
    }

    public void setModerator(boolean moderator) {
        this.moderator = moderator;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isStaff() {
        return staff;
    }

    public void setStaff(boolean staff) {
        this.staff = staff;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public int getTrust_level() {
        return trust_level;
    }

    public void setTrust_level(int trust_level) {
        this.trust_level = trust_level;
    }

    public String getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(String deleted_at) {
        this.deleted_at = deleted_at;
    }

    public boolean isUser_deleted() {
        return user_deleted;
    }

    public void setUser_deleted(boolean user_deleted) {
        this.user_deleted = user_deleted;
    }

    public String getEdit_reason() {
        return edit_reason;
    }

    public void setEdit_reason(String edit_reason) {
        this.edit_reason = edit_reason;
    }

    public boolean isCan_view_edit_history() {
        return can_view_edit_history;
    }

    public void setCan_view_edit_history(boolean can_view_edit_history) {
        this.can_view_edit_history = can_view_edit_history;
    }

    public boolean isWiki() {
        return wiki;
    }

    public void setWiki(boolean wiki) {
        this.wiki = wiki;
    }

    public String getReviewable_id() {
        return reviewable_id;
    }

    public void setReviewable_id(String reviewable_id) {
        this.reviewable_id = reviewable_id;
    }

    public int getReviewable_score_count() {
        return reviewable_score_count;
    }

    public void setReviewable_score_count(int reviewable_score_count) {
        this.reviewable_score_count = reviewable_score_count;
    }

    public int getReviewable_score_pending_count() {
        return reviewable_score_pending_count;
    }

    public void setReviewable_score_pending_count(int reviewable_score_pending_count) {
        this.reviewable_score_pending_count = reviewable_score_pending_count;
    }

    public List<Object> getMentioned_users() {
        return mentioned_users;
    }

    public void setMentioned_users(List<Object> mentioned_users) {
        this.mentioned_users = mentioned_users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplay_username() {
        return display_username;
    }

    public void setDisplay_username(String display_username) {
        this.display_username = display_username;
    }
}
