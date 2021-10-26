package ru.justai.task.request.receiving;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

public class Message {

    @JsonProperty("date")
    private Timestamp date;

    @JsonProperty("from_id")
    private Integer fromId;

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("out")
    private Integer out;

    @JsonProperty("peer_id")
    private Integer peerId;

    @JsonProperty("text")
    private String text;

    @JsonProperty("conversation_message_id")
    private Integer conversationMessageId;

    @JsonProperty("fwd_messages")
    private List<String> fwdMessages;

    @JsonProperty("important")
    private Boolean important;

    @JsonProperty("random_id")
    private Long randomId;

    @JsonProperty("attachments")
    private List<String> attachments;

    @JsonProperty("is_hidden")
    private Boolean isHidden;

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Integer getFromId() {
        return fromId;
    }

    public void setFromId(Integer fromId) {
        this.fromId = fromId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOut() {
        return out;
    }

    public void setOut(Integer out) {
        this.out = out;
    }

    public Integer getPeerId() {
        return peerId;
    }

    public void setPeerId(Integer peerId) {
        this.peerId = peerId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getConversationMessageId() {
        return conversationMessageId;
    }

    public void setConversationMessageId(Integer conversationMessageId) {
        this.conversationMessageId = conversationMessageId;
    }

    public List<String> getFwdMessages() {
        return fwdMessages;
    }

    public void setFwdMessages(List<String> fwdMessages) {
        this.fwdMessages = fwdMessages;
    }

    public Boolean getImportant() {
        return important;
    }

    public void setImportant(Boolean important) {
        this.important = important;
    }

    public Long getRandomId() {
        return randomId;
    }

    public void setRandomId(Long randomId) {
        this.randomId = randomId;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<String> attachments) {
        this.attachments = attachments;
    }

    public Boolean getHidden() {
        return isHidden;
    }

    public void setHidden(Boolean hidden) {
        isHidden = hidden;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(date, message.date) && Objects.equals(fromId, message.fromId) && Objects.equals(id, message.id) && Objects.equals(out, message.out) && Objects.equals(peerId, message.peerId) && Objects.equals(text, message.text) && Objects.equals(conversationMessageId, message.conversationMessageId) && Objects.equals(fwdMessages, message.fwdMessages) && Objects.equals(important, message.important) && Objects.equals(randomId, message.randomId) && Objects.equals(attachments, message.attachments) && Objects.equals(isHidden, message.isHidden);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, fromId, id, out, peerId, text, conversationMessageId, fwdMessages, important, randomId, attachments, isHidden);
    }

    @Override
    public String toString() {
        return "Message{" +
                "date=" + date +
                ", fromId=" + fromId +
                ", id=" + id +
                ", out=" + out +
                ", peerId=" + peerId +
                ", text='" + text + '\'' +
                ", conversationMessageId=" + conversationMessageId +
                ", fwdMessages=" + fwdMessages +
                ", important=" + important +
                ", randomId=" + randomId +
                ", attachments=" + attachments +
                ", isHidden=" + isHidden +
                '}';
    }
}
