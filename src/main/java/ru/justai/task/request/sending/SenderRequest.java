package ru.justai.task.request.sending;

public interface SenderRequest<T> {

    void send(T requestParameters);
}
