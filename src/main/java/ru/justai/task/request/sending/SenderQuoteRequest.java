package ru.justai.task.request.sending;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.justai.task.request.sending.parameters.QuoteRequestParametersSet;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SenderQuoteRequest implements SenderRequest<QuoteRequestParametersSet>{
    private static final int MAX_LENGTH_MESSAGE = 9000;
    private final UriGenerator uriCreator;
    private final RestTemplate restTemplate;
    Logger logger = LoggerFactory.getLogger(SenderQuoteRequest.class);

    public void send(QuoteRequestParametersSet parametersSet) {
        List<QuoteRequestParametersSet> messages = splitMessage(parametersSet);
        messages.forEach(this::sendInternal);
    }

    private void sendInternal(QuoteRequestParametersSet parametersSet) {
        parametersSet.setRandomId((long) Math.abs(parametersSet.hashCode()));
        URI uri = uriCreator.generateMessageResponseUri(parametersSet, "messages.send");
        ResponseEntity<QuoteRequestParametersSet> responseEntity = restTemplate.postForEntity(uri, null, QuoteRequestParametersSet.class);
        logger.info("Try to send request to " + uri + " with parameters " + parametersSet);
        logger.info("Result : " + responseEntity.getStatusCode() + " " + responseEntity);
        if (responseEntity.getStatusCode().isError()) {
            throw new RuntimeException(String.valueOf(responseEntity.getBody()));
        }
    }

    private List<QuoteRequestParametersSet> splitMessage(QuoteRequestParametersSet parametersSet) {
        String originalMessage = parametersSet.getMessage();
        int capacity = originalMessage.length() / MAX_LENGTH_MESSAGE + 1;
        ArrayList<QuoteRequestParametersSet> result = new ArrayList<>();

        for (int i = 0; i < capacity; i++) {
            int beginIndex = i * MAX_LENGTH_MESSAGE;
            int endIndex = Math.min((i + 1) * MAX_LENGTH_MESSAGE, originalMessage.length());
            QuoteRequestParametersSet parametersSetNew =
                    new QuoteRequestParametersSet().clone(parametersSet);
            parametersSetNew.setMessage(originalMessage.substring(beginIndex, endIndex));

            result.add(parametersSetNew);
        }
        return result;
    }
}
