package ru.justai.task.request.receiving;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class ObjectRequest {

    @JsonProperty("message")
    private Message message;

    @JsonProperty("client_info")
    private ClientInfo clientInfo;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public ClientInfo getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(ClientInfo clientInfo) {
        this.clientInfo = clientInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectRequest that = (ObjectRequest) o;
        return Objects.equals(message, that.message) && Objects.equals(clientInfo, that.clientInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, clientInfo);
    }

    @Override
    public String toString() {
        return "ObjectRequest{" +
                "message=" + message +
                ", clientInfo=" + clientInfo +
                '}';
    }
}
