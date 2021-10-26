package ru.justai.task.request.sending.parameters;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.util.LinkedMultiValueMap;

import java.util.List;
import java.util.Objects;

public class QuoteRequestParametersSet {

    @JsonProperty("user_id")
    private Integer userId;

    @JsonProperty("random_id")
    private Long randomId;

    @JsonProperty("peer_id")
    private Integer peerId;

    @JsonProperty("peer_ids")
    private List<Integer> peerIds;

    @JsonProperty("domain")
    private String domain;

    @JsonProperty("chat_id")
    private Integer chatId;

    @JsonProperty("message")
    private String message;

    @JsonProperty("lat")
    private Double lat;

    @JsonProperty("long")
    private Double longValue;

    @JsonProperty("attachment")
    private String attachment;

    @JsonProperty("reply_to")
    private Integer replyTo;

    @JsonProperty("forward_messages")
    private Integer forwardMessages;

    @JsonProperty("forward")
    private String forward;

    @JsonProperty("sticker_id")
    private Integer stickerId;

    @JsonProperty("keyboard")
    private String keyboard;

    @JsonProperty("template")
    private String template;

    @JsonProperty("payload")
    private String payload;

    @JsonProperty("content_source")
    private String contentSource;

    @JsonProperty("dont_parse_links")
    private Boolean dontParseLinks;

    @JsonProperty("disable_mentions")
    private Boolean disableMentions;

    @JsonProperty("intent")
    private String intent;

    @JsonProperty("subscribe_id")
    private Integer subscribeId;

    @JsonProperty("group_id")
    private Long groupId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getRandomId() {
        return randomId;
    }

    public void setRandomId(Long randomId) {
        this.randomId = randomId;
    }

    public Integer getPeerId() {
        return peerId;
    }

    public void setPeerId(Integer peerId) {
        this.peerId = peerId;
    }

    public List<Integer> getPeerIds() {
        return peerIds;
    }

    public void setPeerIds(List<Integer> peerIds) {
        this.peerIds = peerIds;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Integer getChatId() {
        return chatId;
    }

    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLongValue() {
        return longValue;
    }

    public void setLongValue(Double longValue) {
        this.longValue = longValue;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public Integer getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(Integer replyTo) {
        this.replyTo = replyTo;
    }

    public Integer getForwardMessages() {
        return forwardMessages;
    }

    public void setForwardMessages(Integer forwardMessages) {
        this.forwardMessages = forwardMessages;
    }

    public String getForward() {
        return forward;
    }

    public void setForward(String forward) {
        this.forward = forward;
    }

    public Integer getStickerId() {
        return stickerId;
    }

    public void setStickerId(Integer stickerId) {
        this.stickerId = stickerId;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getContentSource() {
        return contentSource;
    }

    public void setContentSource(String contentSource) {
        this.contentSource = contentSource;
    }

    public Boolean getDontParseLinks() {
        return dontParseLinks;
    }

    public void setDontParseLinks(Boolean dontParseLinks) {
        this.dontParseLinks = dontParseLinks;
    }

    public Boolean getDisableMentions() {
        return disableMentions;
    }

    public void setDisableMentions(Boolean disableMentions) {
        this.disableMentions = disableMentions;
    }

    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

    public Integer getSubscribeId() {
        return subscribeId;
    }

    public void setSubscribeId(Integer subscribeId) {
        this.subscribeId = subscribeId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuoteRequestParametersSet that = (QuoteRequestParametersSet) o;
        return Objects.equals(userId, that.userId) && Objects.equals(peerId, that.peerId) && Objects.equals(peerIds, that.peerIds) && Objects.equals(domain, that.domain) && Objects.equals(chatId, that.chatId) && Objects.equals(message, that.message) && Objects.equals(lat, that.lat) && Objects.equals(longValue, that.longValue) && Objects.equals(attachment, that.attachment) && Objects.equals(replyTo, that.replyTo) && Objects.equals(forwardMessages, that.forwardMessages) && Objects.equals(forward, that.forward) && Objects.equals(stickerId, that.stickerId) && Objects.equals(keyboard, that.keyboard) && Objects.equals(template, that.template) && Objects.equals(payload, that.payload) && Objects.equals(contentSource, that.contentSource) && Objects.equals(dontParseLinks, that.dontParseLinks) && Objects.equals(disableMentions, that.disableMentions) && Objects.equals(intent, that.intent) && Objects.equals(subscribeId, that.subscribeId) && Objects.equals(groupId, that.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, peerId, peerIds, domain, chatId, message, lat, longValue, attachment, replyTo, forwardMessages, forward, stickerId, keyboard, template, payload, contentSource, dontParseLinks, disableMentions, intent, subscribeId, groupId);
    }

    public QuoteRequestParametersSet clone(QuoteRequestParametersSet requestParametersSet) {
        this.userId = requestParametersSet.userId;
        this.randomId = requestParametersSet.randomId;
        this.peerId = requestParametersSet.peerId;
        this.peerIds = requestParametersSet.peerIds;
        this.domain = requestParametersSet.domain;
        this.chatId = requestParametersSet.chatId;
        this.message = requestParametersSet.message;
        this.lat = requestParametersSet.lat;
        this.longValue = requestParametersSet.longValue;
        this.attachment = requestParametersSet.attachment;
        this.replyTo = requestParametersSet.replyTo;
        this.forwardMessages = requestParametersSet.forwardMessages;
        this.stickerId = requestParametersSet.stickerId;
        this.groupId = requestParametersSet.groupId;
        this.keyboard = requestParametersSet.keyboard;
        this.template = requestParametersSet.template;
        this.payload = requestParametersSet.payload;
        this.contentSource = requestParametersSet.contentSource;
        this.dontParseLinks = requestParametersSet.dontParseLinks;
        this.disableMentions = requestParametersSet.disableMentions;
        this.intent = requestParametersSet.intent;
        this.subscribeId = requestParametersSet.subscribeId;
        return this;
    }

    public LinkedMultiValueMap toMultiValueMap() {
        ObjectMapper mapObject = new ObjectMapper();
        mapObject.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        mapObject.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return mapObject.convertValue(this, LinkedMultiValueMap.class);
    }

    @Override
    public String toString() {
        return "QuoteRequestParametersSet{" +
                "userId=" + userId +
                ", randomId=" + randomId +
                ", peerId=" + peerId +
                ", peerIds=" + peerIds +
                ", domain='" + domain + '\'' +
                ", chatId=" + chatId +
                ", message='" + message + '\'' +
                ", lat=" + lat +
                ", longValue=" + longValue +
                ", attachment='" + attachment + '\'' +
                ", replyTo=" + replyTo +
                ", forwardMessages=" + forwardMessages +
                ", forward='" + forward + '\'' +
                ", stickerId=" + stickerId +
                ", keyboard='" + keyboard + '\'' +
                ", template='" + template + '\'' +
                ", payload='" + payload + '\'' +
                ", contentSource='" + contentSource + '\'' +
                ", dontParseLinks=" + dontParseLinks +
                ", disableMentions=" + disableMentions +
                ", intent='" + intent + '\'' +
                ", subscribeId=" + subscribeId +
                ", groupId=" + groupId +
                '}';
    }
}
