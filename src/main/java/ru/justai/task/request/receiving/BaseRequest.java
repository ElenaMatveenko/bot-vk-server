package ru.justai.task.request.receiving;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class BaseRequest {

    @JsonProperty("type")
    private String type;

    @JsonProperty("group_id")
    private Long groupId;

    @JsonProperty("secret")
    private String secret;

    @JsonProperty("event_id")
    private String eventId;

    @JsonProperty("object")
    private ObjectRequest object;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public ObjectRequest getObject() {
        return object;
    }

    public void setObject(ObjectRequest object) {
        this.object = object;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseRequest that = (BaseRequest) o;
        return Objects.equals(type, that.type) && Objects.equals(groupId, that.groupId) && Objects.equals(secret, that.secret) && Objects.equals(eventId, that.eventId) && Objects.equals(object, that.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, groupId, secret, eventId, object);
    }

    @Override
    public String toString() {
        return "BaseRequest{" +
                "type='" + type + '\'' +
                ", groupId=" + groupId +
                ", secret='" + secret + '\'' +
                ", eventId='" + eventId + '\'' +
                ", object=" + object +
                '}';
    }
}
